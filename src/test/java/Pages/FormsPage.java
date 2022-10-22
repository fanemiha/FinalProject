package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage {


    public FormsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li")
    WebElement practiceForm;

    @FindBy(id = "firstName")
    WebElement userName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/label")
    WebElement maleGender;

    @FindBy(id = "userNumber")
    WebElement userNumber;

    @FindBy(id = "submit")
    WebElement submitBtn;

    public WebElement getPracticeForm() {
        return practiceForm;
    }

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getUserEmail() {
        return userEmail;
    }

    public WebElement getMaleGender() {
        return maleGender;
    }

    public WebElement getUserNumber() {
        return userNumber;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }

}
