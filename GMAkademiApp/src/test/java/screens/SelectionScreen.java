package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utilities.BaseScreen;

public class SelectionScreen extends BaseScreen {
    public SelectionScreen(AndroidDriver driver) { super(driver); }

    //*********Mobile Elements*******
    By gmUserBy =  By.xpath("//android.widget.FrameLayout//android.view.ViewGroup[3]/android.widget.TextView[2]");
    By selectionScreenBy=By.id("android:id/content");


    //********Screen Methods**********
    public void clickToGMUser(){
        click(gmUserBy);
    }

    public void verifyDisplayedSelectionScreen(){
    waitVisibility(selectionScreenBy);
    }

}
