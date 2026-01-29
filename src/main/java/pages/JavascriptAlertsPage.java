package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavascriptAlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.cssSelector("button[onclick='jsAlert()']");
    private By result = By.id("result");
    private By triggerConfirmButton = By.cssSelector("button[onclick='jsConfirm()']");
    private By triggerPromptButton= By.cssSelector("button[onclick='jsPrompt()']");

    public JavascriptAlertsPage(WebDriver driver){
        this.driver=driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPromptButton(){
        driver.findElement(triggerPromptButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

    public String alert_GetText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

}
