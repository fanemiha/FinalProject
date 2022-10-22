package Test;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class ElementsTest extends BasePage {


    @BeforeMethod
    public void setUpPage() throws InterruptedException {

        List<WebElement> elementsList = driver.findElements(By.className("card-up"));

        elementsList.get(0).click();

        Thread.sleep(2000);

    }

    @Test
    public void verifyTextBoxIsOpened()  {
        elementsPage.getTextBox().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/text-box");
    }

    @Test
    public void verifyCheckBoxIsOpened()  {
        elementsPage.getCheckBox().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/checkbox");
    }

    @Test
    public void verifyThatDynamicIsOpended(){
        WebElement dyn = driver.findElement(By.id("item-8"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dyn);

        dyn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/dynamic-properties");
    }
    @Test
    public void verifyTextBoxAcceptInput() throws AWTException {
        verifyTextBoxIsOpened();

        textBoxPage.getUserName().sendKeys("stefan");
        textBoxPage.getEmail().sendKeys("neki@mejl.com");
        textBoxPage.getAddress().sendKeys("beogradska");
        textBoxPage.getPermanentAddress().sendKeys("bulevar kralja aleksandra");

        WebElement dugme = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dugme);

        dugme.click();

        boolean prikaz = textBoxPage.getOutput().isDisplayed();
        Assert.assertTrue(prikaz);

    }
    @Test
    public void verifyListCanBeExpanded(){
        verifyCheckBoxIsOpened();
        checkBox.getArrow().click();

    }
    @Test
    public void verifyListMemberIsClickable() {
        verifyListCanBeExpanded();
        checkBox.getBox().click();

        Assert.assertTrue(checkBox.getCheckBoxResult().isDisplayed());
    }
    @Test
    public void verifyRadioButtonIsClicked(){
        elementsPage.getRadioButton().click();
        radioButtonPage.getRadioB().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");

        WebElement we = radioButtonPage.getRadioBText();
        Assert.assertTrue(we.isDisplayed());

        Assert.assertEquals(we.getText(), "You have selected Yes");
    }
    @AfterMethod
    public void back() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("https://demoqa.com/");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }

}
