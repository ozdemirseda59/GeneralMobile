package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utilities.BaseScreen;

public class GMUserLoginScreen extends BaseScreen {
    public GMUserLoginScreen(AndroidDriver driver) { super(driver); }

    //*********Mobile Elements*********
    By emailBy =  By.xpath("/hierarchy/android.widget.FrameLayout//android.view.ViewGroup[1]/android.widget.EditText");
    By passwordBy=By.xpath("/hierarchy/android.widget.FrameLayout//android.view.ViewGroup[2]/android.widget.EditText");
    By signInBy=By.xpath("/hierarchy/android.widget.FrameLayout//android.view.ViewGroup[3]/android.widget.TextView");
    By signUpBy=By.xpath("/hierarchy/android.widget.FrameLayout//android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.TextView[2]");

    public void enterLoginInfo(String email, String password){
        sendText(emailBy,email);
        sendText(passwordBy,password);
    }
    public  void clickToSignIn(){
        click(signInBy);
    }

    public void clickToSignUp(){click(signUpBy);}
}
