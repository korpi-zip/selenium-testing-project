package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSlidePage {

    private WebDriver driver;

    private By slideBar = By.tagName("input");
    private By resultText = By.id("range");


    public HorizontalSlidePage(WebDriver driver) {
        this.driver=driver;
    }


    public void pressRight(int times) {
        for (int i = 0; i < times; i++) {
            driver.findElement(slideBar).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }

}
