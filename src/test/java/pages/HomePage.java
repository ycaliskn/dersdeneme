package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//body")
    public WebElement body;
    @FindBy(partialLinkText = "Login")
    public WebElement signUpLogin;

    @FindBy(xpath = "//a[text()=' Contact us']")
    public WebElement contactUs;


}
