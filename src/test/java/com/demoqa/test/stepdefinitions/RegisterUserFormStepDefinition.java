package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.RetoPomUserStepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterUserFormStepDefinition {

    @Steps
    RetoPomUserStepDefinitions retoPomUserStepDefinitions;

    @Given("^that a web user needs to fill form for makea challenge in demoqa$")
    public void registerForm() {
        retoPomUserStepDefinitions.openBrowser();
    }

    @When("^the web user fiil all text box required$")
    public void fillAllTextBoxRequested() throws InterruptedException {
        retoPomUserStepDefinitions.fillAllFieldsForm();
    }

    @Then("^he should look him data in a modal show$")
    public void lookHimDatainModalShow() throws InterruptedException {
        retoPomUserStepDefinitions.validationSubmittingSuccessful();

    }
}
