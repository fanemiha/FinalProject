package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public WebDriver driver;
    public WebDriverWait webDriverWait;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "card-up")
    WebElement elements;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]")
    WebElement forms;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[3]/div/div[1]")
    WebElement windows;


    public WebElement getElements() {
        return elements;
    }

    public WebElement getForms() {
        return forms;
    }

    public WebElement getWindows() {
        return windows;
    }


}
