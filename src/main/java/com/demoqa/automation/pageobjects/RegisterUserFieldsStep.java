package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@DefaultUrl("https://www.demoqa.com/automation-practice-form")
public class RegisterUserFieldsStep extends PageObject {

   public By firstNameInput = By.id("firstName");
   public By lastNameInput = By.id("lastName");
   public By userEmailInput = By.id("userEmail");
   public By genderSelector = By.xpath("//label[@for='gender-radio-3']");
   public By userNumberInput = By.id("userNumber");
   public By dateOfBirthInput = By.id("dateOfBirthInput");
   public By monthListOpen = By.xpath("//select[@class='react-datepicker__month-select']");
   public By monthSelector = By.xpath("//option[@value='4']");
   public By yearListOpen = By.xpath("//*[@class='react-datepicker__year-select']");
   public By yearSelector = By.xpath("//option[@value=1994]");
   public By daySelector = By.xpath("//div[@aria-label='Choose Sunday, May 1st, 1994']");
   public By subjectsInput = By.id("subjectsInput");
   public By hobbiesSelector = By.xpath("//label[@for='hobbies-checkbox-3']");
   public By uploadPicture = By.id("uploadPicture");
   public By currentAddressInput = By.id("currentAddress");
   public By stateSelector = By.id("react-select-3-input");
   public By citySelector = By.id("react-select-4-input");
   public By submitClick = By.id("submit");
   public By registerValidation = By.id("example-modal-sizes-title-lg");
   public By closeClick = By.id("closeLargeModal");
   public By closePublicity = By.xpath("//img[@src='https://ad.plus/adplus-advertising.svg']");


   public void sendFirstName(String string){
      getDriver().findElement(firstNameInput).sendKeys(string);
   }
   public void sendLastName(String string){

      getDriver().findElement(lastNameInput).sendKeys(string);
   }
   public void sendUserEmail(String string){

      getDriver().findElement(userEmailInput).sendKeys(string);
   }
   public void sendGenderSelector(){

      getDriver().findElement(genderSelector).click();
   }
   public void sendUserNumber(String string){

      getDriver().findElement(userNumberInput).sendKeys(string);
   }
   public void DateOfBirthSelector(){

      getDriver().findElement(dateOfBirthInput).click();
   }
   public void openMonthList(){

      getDriver().findElement(monthListOpen).click();
   }
   public void SelectMonth(){

      getDriver().findElement(monthSelector).click();
   }
   public void openYearList(){

      getDriver().findElement(yearListOpen).click();
   }
   public void selectYear(){

      getDriver().findElement(yearSelector).click();
   }
   public void selectDay(){

      getDriver().findElement(daySelector).click();
   }
   public void findSubjects(String string){

      getDriver().findElement(subjectsInput).sendKeys(string);
   }
   public void selectSubject() {

      getDriver().findElement(subjectsInput).sendKeys(Keys.ENTER);
   }
   public void selectHobbies(){

      getDriver().findElement(hobbiesSelector).click();
   }
   public void selectUploadPicture(String string){
      getDriver().findElement(uploadPicture).sendKeys(string);
   }

   public void sendCurrentAddress(String string){

      getDriver().findElement(currentAddressInput).sendKeys(string);
   }
   public void findState(String string){

      getDriver().findElement(stateSelector).sendKeys(string);
   }
   public void selectState(){

      getDriver().findElement(stateSelector).sendKeys(Keys.ENTER);
   }
   public void findCity(String string){

      getDriver().findElement(citySelector).sendKeys(string);
   }
   public void selectCity(){

      getDriver().findElement(citySelector).sendKeys(Keys.ENTER);
   }
   public void registerValidations(String compareDataFields){

      assertEquals(getDriver().findElement(registerValidation).getText(), compareDataFields);
   }
   public void closePublicity(){
      getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      if (getDriver().findElement(closePublicity).isEnabled()){
         getDriver().findElement(closePublicity).click();
      }
   }
}

