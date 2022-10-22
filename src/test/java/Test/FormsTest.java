package Test;


import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class FormsTest extends BasePage {


    @BeforeMethod
    public void setUpPage() throws InterruptedException {

        List<WebElement> elementsList = driver.findElements(By.className("card-up"));

        elementsList.get(1).click();

        Thread.sleep(2000);


    }

    @Test
    public void verifyStudentRegistrationFormIsDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        formsPage.getPracticeForm().click();

        WebElement h5text = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/h5"));
        Assert.assertEquals(h5text.getText(),"Student Registration Form");
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/automation-practice-form");

    }

    @Test
    public void verifySuccessfulSubmit() throws InterruptedException, AWTException {
        zoomOut();
        formsPage.getPracticeForm().click();
        formsPage.getUserName().sendKeys("Stefan");
        formsPage.getLastName().sendKeys("Mihailovic");
        formsPage.getUserEmail().sendKeys("neki@mejl.io");
        formsPage.getMaleGender().click();
        formsPage.getUserNumber().sendKeys("0123456789");
        formsPage.getSubmitBtn().click();


        WebElement popUpWindow = driver.findElement(By.id("example-modal-sizes-title-lg"));
        Assert.assertEquals(popUpWindow.getText(), "Thanks for submitting the form");
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
