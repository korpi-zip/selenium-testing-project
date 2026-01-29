package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clicFileUploadPage();
        uploadPage.uploadFile("C:/Users/santi/Desktop/Automation/automation/resources/foto.png");
        assertEquals(uploadPage.getUploadedFiles(), "foto.png", "Texto incorrecto");
    }
}
