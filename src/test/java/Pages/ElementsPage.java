package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ElementsPage {

    public ElementsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "item-0")
    WebElement textBox;

    @FindBy(id = "item-1")
    WebElement checkBox;

    @FindBy(id = "item-2")
    WebElement radioButton;



    public WebElement getTextBox() {
        return textBox;
    }

    public WebElement getCheckBox() {
        return checkBox;
    }

    public WebElement getRadioButton() {
        return radioButton;
    }

}
