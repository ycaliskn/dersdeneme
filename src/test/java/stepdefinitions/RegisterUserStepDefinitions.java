package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class RegisterUserStepDefinitions {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();
    Faker faker = new Faker();
    Select select;
    AccountCreatedOrDeleted accountCreatedOrDeleted = new AccountCreatedOrDeleted();
    DashboardPage dashboardPage = new DashboardPage();


    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        assert homePage.body.isDisplayed();
    }

    @Then("Click on Signup \\/ Login button")
    public void click_on_signup_login_button() {
        Driver.clickWithJS(homePage.signUpLogin);
    }

    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        assert loginPage.newUserText.isDisplayed();
    }

    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        loginPage.name.sendKeys(ConfigReader.getProperty("name"));
        loginPage.newEmail.sendKeys(ConfigReader.getProperty("mail"));
    }

    @Then("Click Signup button")
    public void click_signup_button() {
        loginPage.signUp.click();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {
        assert signUpPage.verifyText.isDisplayed();
    }

    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        signUpPage.cinsiyet.click();
        signUpPage.password.sendKeys(ConfigReader.getProperty("password"));
        signUpPage.day.sendKeys("7");
        signUpPage.month.sendKeys("May");
        signUpPage.year.sendKeys("1991");
    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        signUpPage.newsletterCheckBox.click();
    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        signUpPage.receiveCheckBox.click();
    }

    @Then("Fill details: First name, Last name, Company, Address, AddressTwo, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address_country_state_city_zipcode_mobile_number() {
        signUpPage.firstName.sendKeys(ConfigReader.getProperty("name"));
        signUpPage.lastName.sendKeys(faker.name().lastName());
        signUpPage.address1.sendKeys(faker.address().fullAddress());
        select = new Select(signUpPage.country);
        select.selectByIndex(2);
        signUpPage.state.sendKeys(faker.address().state());
        signUpPage.city.sendKeys(faker.address().city());
        signUpPage.zipcode.sendKeys(faker.address().zipCode());
        signUpPage.mobileNumber.sendKeys(faker.phoneNumber().phoneNumber());
    }

    @Then("Click Create Account button")
    public void click_create_account_button() {
        Driver.clickWithJS(signUpPage.createAccount);
    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        assert accountCreatedOrDeleted.accountCreateMsg.isDisplayed();
    }

    @Then("Click Continue button")
    public void click_continue_button() {
        accountCreatedOrDeleted.continueButton.click();
        Driver.getDriver().navigate().back();
        accountCreatedOrDeleted.continueButton.click();
    }

    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {

        assert dashboardPage.loggedIn.isDisplayed();
    }

    @Then("Click Delete Account button")
    public void click_delete_account_button() {
        dashboardPage.deleteAccount.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {

        assert accountCreatedOrDeleted.accountDeletedMsg.isDisplayed();
        accountCreatedOrDeleted.continueButton.click();
    }

}
