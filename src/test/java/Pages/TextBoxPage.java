package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {

    public TextBoxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "userEmail")
    WebElement email;

    @FindBy(id = "currentAddress")
    WebElement address;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    @FindBy(id = "submit")
    WebElement submitButton;

    @FindBy(id = "output")
    WebElement output;

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getAddress() {
        return address;
    }

    public WebElement getPermanentAddress() {
        return permanentAddress;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getOutput() {
        return output;
    }
}
