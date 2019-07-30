package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utilities.BaseScreen;
import utilities.BaseSteps;

public class GMUserMyProfileScreen extends BaseScreen {
    public GMUserMyProfileScreen(AndroidDriver driver) { super(driver); }

    By emailTextBy= By.xpath("//android.view.ViewGroup[1]/android.widget.TextView[2]");


    //Verify Email Condition
    public void verifyLoginUserName (String expectedText) {
        assertEquals(emailTextBy, expectedText);
    }
}
