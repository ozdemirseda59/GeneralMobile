package tests.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utilities.BaseSteps;

public class RegisterSteps extends BaseSteps {

    @And("^I click Uye Ol text$")
    public void iClickUyeOlText() {
        setupCucumber();
        gmUserLoginScreen.clickToSignUp();
    }

    @And("^I fill Name field with \"([^\"]*)\" and Last name field with \"([^\"]*)\" and Mobile phone field with \"([^\"]*)\"  and Password field with \"([^\"]*)\" and Password Again field with \"([^\"]*)\" and click Sign in on Register Page$")
    public void iFillNameFieldWithAndLastNameFieldWithAndMobilePhoneFieldWithAndPasswordFieldWithAndPasswordAgainFieldWithAndClickSignInOnRegisterPage(String arg0, String arg1, String arg2, String arg3, String arg4) throws Throwable {
        gmUserRegisterScreen.enterRegisterInfo(arg0,arg1,arg2,arg3);
        gmUserRegisterScreen.clickToSignUp();
    }
}
