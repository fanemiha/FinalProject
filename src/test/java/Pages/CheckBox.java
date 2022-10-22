package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox {
    public CheckBox(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = ".rct-collapse.rct-collapse-btn")
    WebElement arrow;

    @FindBy (css = ".rct-checkbox")
    WebElement box;

    @FindBy(id = "result")
    WebElement checkBoxResult;

    @FindBy(css = ".custom-control-label")
    WebElement radioB;

    @FindBy(css = ".mt-3")
    WebElement radioBText;



    public WebElement getArrow() {
        return arrow;
    }

    public WebElement getBox() {
        return box;
    }

    public WebElement getCheckBoxResult(){
        return checkBoxResult;
    }
}
