package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {


    private WebDriver driver;
    private WebDriverListener listener = new EventReporter();

    protected HomePage homePage;

    @BeforeClass
    public void setUp(){

        WebDriver rawDriver = new ChromeDriver();

        driver = new EventFiringDecorator(new EventReporter()).decorate(rawDriver);

        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/"+ result.getName() +".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}
