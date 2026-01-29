package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwigEditorPage {

    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreseIndentButton = By.cssSelector("#mceu_12 button");
    public WysiwigEditorPage(WebDriver driver){
        this.driver = driver;

    }


    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchtoMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys("text");
        switchtoMainArea();
    }

    public void decreaseIndention(){
        driver.findElement(decreseIndentButton).click();
    }

    public  String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchtoMainArea();
        return text;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    private void switchtoMainArea(){
        driver.switchTo().parentFrame();
    }
}
