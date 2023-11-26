package omr.day01;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class C01_Exercise {

    @Test
    public void testDesiredCapabilities() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("app", "C:\\Users\\Omer\\IdeaProjects\\Appium_Upskills\\src\\test\\resources\\com.google.android.calculator.apk");

      //  capabilities.setCapability("appPackage", "com.android.calculator2");
      //  capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, capabilities);

    }

}
