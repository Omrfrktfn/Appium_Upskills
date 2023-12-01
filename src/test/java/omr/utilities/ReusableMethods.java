package omr.utilities;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class ReusableMethods {


    public void clickGesture(AndroidDriver driver, WebElement element) {
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
    }

    @Test
    public void testClickGestureCoordinate() throws InterruptedException {

//        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//                "x", 740,
//                "y", 1088
//        ));

     //  clickGesture(driver, 740, 1088);
    }

}
