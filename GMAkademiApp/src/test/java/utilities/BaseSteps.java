package utilities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import screens.*;
import tests.ThreadLocalDriver;

public class BaseSteps {

    protected GMUserLoginScreen gmUserLoginScreen = null;
    protected GMUserMainScreen gmUserMainScreen=null;
    protected WebDriverWait wait;
    protected GMUserRegisterScreen gmUserRegisterScreen=null;
    protected SelectionScreen selectionScreen=null;
    protected GMUserMyProfileScreen gmUserMyProfileScreen =null;

    //Screen Classes Initialization
    protected void setupCucumber () {
        wait = new WebDriverWait(ThreadLocalDriver.getTLDriver(), 10);
        gmUserMainScreen=new GMUserMainScreen(ThreadLocalDriver.getTLDriver());
        gmUserRegisterScreen=new GMUserRegisterScreen(ThreadLocalDriver.getTLDriver());
        selectionScreen= new SelectionScreen(ThreadLocalDriver.getTLDriver());
        gmUserMyProfileScreen =new GMUserMyProfileScreen(ThreadLocalDriver.getTLDriver());
        gmUserLoginScreen=new GMUserLoginScreen(ThreadLocalDriver.getTLDriver());
    }

    protected void teardown(){ ThreadLocalDriver.getTLDriver().quit(); }
}
