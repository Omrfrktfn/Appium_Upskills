package omr.day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class C01_SetupDriver {


    @Test
    public void testDesiredCapabilities() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("app", "C:\\Users\\Omer\\IdeaProjects\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk");
        //   capabilities.setCapability("appPackage", "io.appium.android.apis");
        //acik olan uygulama hangisi ise appPackge kisminin karsina onun degeri alinacak
        // adb shell dumpsys window | find "mCurrentFocus" bunu yazarak bulabirliz
        // capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, capabilities);
    }

    @Test
    public void testUiAutomator2Options() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setApp("C:\\Users\\Omer\\IdeaProjects\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk");
        //  .setAppPackage("io.appium.android.apis")
        //.setAppActivity("io.appium.android.apis.ApiDemos");
        //.setPlatformName("android")
        //.setAutomationName("uiautomator2");

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, options);

    }

    //com.android.calculator2/com.android.calculator2.Calculator

}
