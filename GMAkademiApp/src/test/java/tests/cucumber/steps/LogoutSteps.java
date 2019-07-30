package tests.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseSteps;

public class LogoutSteps extends BaseSteps {

    @When("^I click Menu on Main Screen$")
    public void iClickMenuOnMainScreen() {
        setupCucumber();
        gmUserMainScreen.clickToMenu();}

    @And("^I click Cıkıs Yap button$")
    public void iClickCıkısYapButton() {gmUserMainScreen.clickToLogout(); }

    @Then("^I should see User Selection Screen$")
    public void iShouldSeeUserSelectionScreen() { selectionScreen.verifyDisplayedSelectionScreen();}
}
