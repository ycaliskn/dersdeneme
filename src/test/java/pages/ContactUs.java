package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUs {

    public ContactUs() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Get In Touch']")
    public WebElement getInTouchText;

    @FindBy (xpath = "//*[@data-qa='name']")
    public WebElement name;
    @FindBy (xpath = "//*[@data-qa='email']")
    public WebElement email;
    @FindBy (xpath = "//*[@data-qa='subject']")
    public WebElement subject;
    @FindBy (xpath = "//*[@data-qa='message']")
    public WebElement message;
    @FindBy (name = "upload_file")
    public WebElement upload_file;
    @FindBy (name = "submit-button")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@class='status alert alert-success']")
    public WebElement successMsg;
    @FindBy(xpath = "//*[@class='fa fa-home']")
    public WebElement homeButton;
}
