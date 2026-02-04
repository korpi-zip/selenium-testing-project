package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class EventReporter implements WebDriverListener {

   @Override
   public void beforeClick(WebElement element) {
    System.out.println("[DriverEvents] Se hará clic en: " + element);
   }

   @Override
   public void afterClick(WebElement element) {
    System.out.println("[DriverEvents] Click realizado.");
   }

   @Override
   public void beforeGet(WebDriver driver, String url) {

       System.out.println("[DriverEvents] Navegando a: " + url);
   }

   @Override
   public void afterGet(WebDriver driver, String url) {

       System.out.println("[DriverEvents] Se cargó la URL: " + url);
   }
}
