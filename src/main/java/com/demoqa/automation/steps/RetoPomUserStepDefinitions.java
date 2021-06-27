package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.RegisterUserFieldsStep;
import com.demoqa.automation.utils.JavaScript;
import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.Step;
import java.util.concurrent.TimeUnit;

public class RetoPomUserStepDefinitions {
   RegisterUserFieldsStep registerUserFieldsStep = new RegisterUserFieldsStep();
   DataInjection dataInjection = new DataInjection();

    @Step
    public void openBrowser(){
        registerUserFieldsStep.open();
    }

    @Step
    public void fillAllFieldsForm() throws InterruptedException {
        registerUserFieldsStep.closePublicity();
        registerUserFieldsStep.getDriver().manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        Times.waitFor(2000);
        registerUserFieldsStep.sendFirstName(dataInjection.getFirstName());
        registerUserFieldsStep.sendLastName(dataInjection.getLastName());
        registerUserFieldsStep.sendUserEmail(dataInjection.getEmail());
        registerUserFieldsStep.sendGenderSelector();
        registerUserFieldsStep.sendUserNumber(dataInjection.getMobileNumber());
        registerUserFieldsStep.DateOfBirthSelector();
        registerUserFieldsStep.openMonthList();
        registerUserFieldsStep.SelectMonth();
        registerUserFieldsStep.openYearList();
        registerUserFieldsStep.selectYear();
        registerUserFieldsStep.selectDay();
        registerUserFieldsStep.findSubjects(dataInjection.getSubjects());
        registerUserFieldsStep.selectSubject();
        Times.waitFor(2000);
        registerUserFieldsStep.selectHobbies();
        registerUserFieldsStep.selectUploadPicture(dataInjection.getUploadPicture());
        registerUserFieldsStep.sendCurrentAddress(dataInjection.getCurrentAddress());
        registerUserFieldsStep.findState(dataInjection.getState());
        registerUserFieldsStep.selectState();
        registerUserFieldsStep.findCity(dataInjection.getCity());
        registerUserFieldsStep.selectCity();
        Times.waitFor(3000);
        JavaScript.clickJS(registerUserFieldsStep.getDriver(), registerUserFieldsStep.submitClick);
    }

    @Step
    public void validationSubmittingSuccessful() throws InterruptedException {
        Times.waitFor(3000);
        registerUserFieldsStep.registerValidations(dataInjection.getSubmitRegister());
        JavaScript.clickJS(registerUserFieldsStep.getDriver(), registerUserFieldsStep.closeClick);
        Times.waitFor(2000);
    }

}
