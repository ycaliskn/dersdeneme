package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Logged in as '] ")
    public WebElement loggedIn;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement logout;

    @FindBy(xpath = "//a[text()=' Contact us']")
    public WebElement contactUs;

}
