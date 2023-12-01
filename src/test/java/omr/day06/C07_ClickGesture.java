package omr.day06;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import omr.basetest.ApiDemosBaseTest;
import omr.utilities.ReusableMethods;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class C07_ClickGesture extends ApiDemosBaseTest {

    @Test
    public void testClickGesture() throws InterruptedException {

        WebElement os = driver.findElement(AppiumBy.accessibilityId("OS"));


        //   driver.executeScript("mobile: clickGesture", ImmutableMap.of(
        //           "elementId", ((RemoteWebElement) os).getId()
        //   ));

        // ReusableMethods.clickGesture(driver, os);
        clickGesture(driver, os);

        Thread.sleep(3000);
    }

    @Test
    public void testClickGestureCoordinate() {
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 740,
                "y", 1088

        ));

    }


}
