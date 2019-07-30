package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utilities.BaseScreen;

import java.util.Random;

public class GMUserRegisterScreen extends BaseScreen {
    public GMUserRegisterScreen(AndroidDriver driver) { super(driver); }

    //*********Mobile Elements*********
    By nameBy =  By.xpath("/hierarchy/android.widget.FrameLayout//android.view.ViewGroup[1]/android.widget.EditText");
    By lastNameBy=By.xpath("/hierarchy/android.widget.FrameLayout//android.view.ViewGroup[2]/android.widget.EditText");
    By emailBy=By.xpath("/hierarchy/android.widget.FrameLayout//android.view.ViewGroup[3]/android.widget.EditText");
    By mobilePhoneBy=By.xpath("/hierarchy/android.widget.FrameLayout//android.view.ViewGroup[4]/android.widget.EditText");
    By passwordBy= By.xpath("/hierarchy/android.widget.FrameLayout//android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.EditText");
    By passwordAgainBy=By.xpath("/hierarchy/android.widget.FrameLayout//android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.EditText");
    By signUpButtonBy=By.xpath("/hierarchy/android.widget.FrameLayout//android.view.ViewGroup[4]/android.widget.TextView");

    String email ="";
    public String generateRandomEmail(){

        Random rnd = new Random();
        for(int i=0; i<4; i++){
            email = email + rnd.nextInt(150);
        }
        this.email = "Test" + email + "@gmail.com";
        return email;
    }

    public void enterRegisterInfo(String name, String lastName, String mobilePhone, String password){
        sendText(nameBy,name);
        sendText(lastNameBy,lastName);
        sendText(emailBy,generateRandomEmail());
        sendText(mobilePhoneBy,mobilePhone);
        sendText(passwordBy,password);
        sendText(passwordAgainBy,password);
    }

    public void clickToSignUp(){
        click(signUpButtonBy);
    }
}
