package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    public WebDriverWait webDriverWait;
    public HomePage homePage;
    public FormsPage formsPage;
    public ElementsPage elementsPage;
    public TextBoxPage textBoxPage;
    public CheckBox checkBox;
    public RadioButtonPage radioButtonPage;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        homePage = new HomePage(driver);
        formsPage = new FormsPage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
        checkBox = new CheckBox(driver);
        radioButtonPage= new RadioButtonPage(driver);


        ExcelReader excelReader = new ExcelReader("C:\\Users\\fane9\\OneDrive\\Desktop\\TestData1.xlsx");
        driver.manage().window().maximize();
        driver.navigate().to(new String(excelReader.getStringData("URLs",1,0)));
    }
    public void zoomOut () throws InterruptedException, AWTException {
        Thread.sleep(2000);
        System.out.println("About to zoom out");
        Robot robot = new Robot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        Thread.sleep(2000);
    }

    public void visibilityWait(WebElement element) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickabilityWait(WebElement element){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
