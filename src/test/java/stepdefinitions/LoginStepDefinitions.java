package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;

public class LoginStepDefinitions {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();
    Faker faker = new Faker();
    Select select;
    AccountCreatedOrDeleted accountCreatedOrDeleted = new AccountCreatedOrDeleted();
    DashboardPage dashboardPage = new DashboardPage();


    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        assert loginPage.loginToText.isDisplayed();
    }

    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        loginPage.loginMail.sendKeys(ConfigReader.getProperty("mail"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));

    }

    @Then("Click login button")
    public void click_login_button() {
        loginPage.loginButton.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
        assert accountCreatedOrDeleted.accountDeletedMsg.isDisplayed();
    }

    @Then("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        loginPage.loginMail.sendKeys(Faker.instance().internet().emailAddress());
        loginPage.loginMail.sendKeys(Faker.instance().internet().password());
    }

    @Then("Verify error Your email or password is incorrect! is visible")
    public void verify_error_your_email_or_password_is_incorrect_is_visible() {
        assert loginPage.incorrectError.isDisplayed();
    }


}
