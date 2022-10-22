package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {
    public RadioButtonPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".custom-control-label")
    WebElement radioB;

    @FindBy(css = ".mt-3")
    WebElement radioBText;


    public WebElement getRadioB() {
        return radioB;
    }

    public WebElement getRadioBText() {
        return radioBText;
    }
}

