package tests.cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.GMUserLoginScreen;
import tests.ThreadLocalDriver;
import utilities.BaseSteps;

public class LoginSteps extends BaseSteps {

    @Before
    public void setup(){
        System.out.println("Cucumber Before-login-test-cucumber");
        setupCucumber();
    }

    @Given("^I am on the user selection screen$")
    public void iAmOnTheUserSelectionScreen() { }

    @When("^I click General Mobile Kullanicisiyim text$")
    public void iClickGeneralMobileKullanicisiyimText() { selectionScreen.clickToGMUser();}

    @And("^I fill Email field with \"([^\"]*)\" and Password field with \"([^\"]*)\" and click Sign in on Login Screen$")
    public void iFillEmailFieldWithAndPasswordFieldWithAndClickSignInOnLoginScreen(String arg0, String arg1) throws Throwable {
        gmUserLoginScreen.enterLoginInfo(arg0,arg1);
        gmUserLoginScreen.clickToSignIn();
    }

    @Then("^I should see \"([^\"]*)\" on my profile screen$")
    public void iShouldSeeOnMyProfileScreen(String arg0) throws Throwable {
        gmUserMainScreen.clickToMyProfile();
        gmUserMyProfileScreen.verifyLoginUserName(arg0);
    }

    @After
    public void tearDown(){
        ThreadLocalDriver.getTLDriver().quit();
    }
}
