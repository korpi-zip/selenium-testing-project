package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);

    }

    public KeyPressesPage clickPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSlidePage clickSlidePage() {
        clickLink("Horizontal Slider");
        return new HorizontalSlidePage(driver);
    }

    public JavascriptAlertsPage clicJavascriptAlertPage() {
        clickLink("JavaScript Alerts");
        return new JavascriptAlertsPage(driver);
    }

    public ContextMenuPage clickContextMenuPage(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public FileUploadPage clicFileUploadPage() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }


}
