package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement maleRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement nameRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement reconfirmPasswordRequired;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastname;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement dateOfBirth;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement monthOfBirth;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement yearOfBirth;

    @CacheLookup
    @FindBy(xpath = "//input[@type='email' and @name='Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement clickRegister;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement actualMessage1;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement clickContinue;


    public String verifyTextRegister() {
        Reporter.log("getting register text from " + register.toString() + "<br>");
        return getTextFromElement(register);
    }

    public void clickOnRadioButton() {

        Reporter.log("Clicking on Radio Button" + maleRadio.toString() + "<br>");
        clickOnElement(maleRadio);
    }

    public void getFirstName(String text) {
        Reporter.log("Enter first name " + text + " to first name field " + firstName.toString() + "<br>");
        sendTextToElement(firstName, text);
    }

    public String verifyFirstNameRequired() {
        Reporter.log("checking first name required " + nameRequired.toString() + "<br>");
        return getTextFromElement(nameRequired);
    }

    public String verifyLastNameRequired() {
        Reporter.log("checking last name required " + lastNameRequired.toString() + "<br>");
        return getTextFromElement(lastNameRequired);
    }


    public String verifyEmailFieldRequired() {
        Reporter.log("checking email required " + emailRequired.toString() + "<br>");
        return getTextFromElement(emailRequired);
    }


    public String verifyPasswordRequired() {
        Reporter.log("checking password required " + passwordRequired.toString() + "<br>");
        return getTextFromElement(passwordRequired);
    }

    public String verifyReconfirmPasswordRequired() {
        Reporter.log("Checking Reconfirm Password required " + reconfirmPasswordRequired.toString() + "<br>");
        return getTextFromElement(reconfirmPasswordRequired);
    }

    public void getLastName(String text) {
        Reporter.log("enter last name " + lastname.toString() + "<br>");
        sendTextToElement(lastname, text);
    }

    public void setDateOfBirth(String text) {
        Reporter.log("set date of birth " + dateOfBirth.toString() + "<br>");
        selectByVisibleTextFromDropDown(dateOfBirth, text);
    }

    public void setMonthOfBirth(String text) {
        Reporter.log("set month of birth " + monthOfBirth.toString() + "<br>");
        selectByVisibleTextFromDropDown(monthOfBirth, text);
    }

    public void setYearOfBirth(String text) {
        Reporter.log("set year of birth " + yearOfBirth.toString() + "<br>");
        selectByVisibleTextFromDropDown(yearOfBirth, text);
    }

    public void getEmailAddress(String text) {
        Reporter.log("enter email " + email.toString() + "<br>");
        sendTextToElement(email, text);
    }


    public void getPassword(String text) {
        Reporter.log("enter password " + password.toString() + "<br>");
        sendTextToElement(password, text);
    }

    public void getConfirmPassword(String text) {
        Reporter.log("enter confirm password " + confirmPassword.toString() + "<br>");
        sendTextToElement(confirmPassword, text);
    }

    public void getClickOnRegister() {
        Reporter.log("click on register " + clickRegister.toString() + "<br>");
        clickOnElement(clickRegister);
    }

    public String verifyRegistrationComplete() {
        return getTextFromElement(actualMessage1);
    }

    public void setClickContinue() {
        clickOnElement(clickContinue);
    }
}
