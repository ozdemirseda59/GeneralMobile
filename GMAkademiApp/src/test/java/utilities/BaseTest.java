package utilities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import screens.*;
import tests.ThreadLocalDriver;

import java.io.IOException;
import java.net.URL;

public class BaseTest {

    public  DesiredCapabilities caps;

    @BeforeMethod
    @Parameters({"url","deviceName", "platformVersion","systemPort","udid"})
    public void setup (String url,String deviceName,String platformVersion,String systemPort, String udid) throws IOException {

        final Runtime rt = Runtime.getRuntime();
        rt.exec("adb shell input keyevent 224");
        caps = new DesiredCapabilities();
        caps.setCapability("deviceName",deviceName);
        caps.setCapability("udid",udid); //DeviceId from "adb devices" command
        caps.setCapability("systemPort",systemPort); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion",platformVersion);
        caps.setCapability("appPackage", "com.generalmobile.app.gmakademi");
        caps.setCapability("appActivity", "com.generalmobile.app.gmakademi.MainActivity");
        caps.setCapability("noReset", "false");
        ThreadLocalDriver.setTLDriver(new AndroidDriver(new URL(url), caps));

    }

   @AfterMethod
    public synchronized void teardown(){
        ThreadLocalDriver.getTLDriver().quit();
    }
}
