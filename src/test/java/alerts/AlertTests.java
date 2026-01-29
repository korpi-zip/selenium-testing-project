package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clicJavascriptAlertPage();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();

        var result = alertsPage.getResult();

        assertEquals(result, "You successfully clicked an alert");
    }
    @Test
    public void testCancelConfirm(){
        var alertsPage = homePage.clicJavascriptAlertPage();
        alertsPage.triggerConfirm();
        var text = alertsPage.alert_GetText();
        assertEquals(text, "I am a JS Confirm");
        alertsPage.alert_clickToDismiss();
        var result = alertsPage.getResult();
        assertEquals(result, "You clicked: Cancel");

    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clicJavascriptAlertPage();
        alertsPage.triggerPromptButton();
        alertsPage.alert_setInput("KORPI");
        alertsPage.alert_clickToAccept();
        var result = alertsPage.getResult();
        assertEquals(result, "You entered: KORPI", "WROONG TEXT");

    }

}
