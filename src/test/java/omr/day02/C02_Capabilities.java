package omr.day02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class C02_Capabilities {


    @Test
    public void testUiAutomator2Options() throws MalformedURLException {

        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
               // .setUdid("emulator-5554")
              //  .setApp("C:\\Users\\Omer\\IdeaProjects\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk")
                .setApp(appUrl)
                .setAvd("pixel_q_img_1")
                .setAvdLaunchTimeout(Duration.ofMinutes(3))
                ;

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, options);
    }


}
