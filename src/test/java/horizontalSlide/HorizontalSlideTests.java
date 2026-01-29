package horizontalSlide;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSlideTests extends BaseTests {

    @Test
    public void testSlideLeft(){
        var horizontalSlidePage = homePage.clickSlidePage() ;

        horizontalSlidePage.pressRight(8);
        assertEquals(horizontalSlidePage.getResult(), "4");
    }
}
