package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.BaseScreen;

public class    GMUserMainScreen extends BaseScreen {
    //*********Constructor*********
    public GMUserMainScreen(AndroidDriver driver) { super(driver); }

    By myProfileIconBy=By.xpath("//android.view.ViewGroup[@content-desc='Profile']");
    By menuIconBy= By.xpath("/hierarchy/android.widget.FrameLayout//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text='\uE98F']");
    By logoutButtonBy= By.xpath("//android.support.v4.widget.DrawerLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView");

    public void clickToMyProfile(){
        click(myProfileIconBy);
    }

    public void  clickToMenu(){
        click(menuIconBy);
    }

    public void  clickToLogout(){
        click(logoutButtonBy);
    }
}
