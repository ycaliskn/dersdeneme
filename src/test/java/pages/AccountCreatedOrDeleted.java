package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountCreatedOrDeleted {

    public AccountCreatedOrDeleted() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//h2)[1]")
    public WebElement accountCreateMsg;

    @FindBy(xpath = "//*[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy (xpath = "//*[text()='Account Deleted!'] ")
    public WebElement accountDeletedMsg;
}
