package forgotPassword;


import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword(){
        var loginPage = homePage.clickForgotPassword();
        loginPage.setEmail("abc@example.com");
        var emailSentPage = loginPage.clickRetrieveButton();
        var alert = emailSentPage.getAlertText();

        assertEquals(alert, "Your e-mail's been sent!");
    }
}
