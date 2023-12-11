package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//input[@id='Email']")
    WebElement email;

    @CacheLookup
    @FindBy (xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy (xpath = "//button[contains(text(),'Log in')]")
    WebElement login;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Log in']")
    WebElement verifyLogin;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcome;


    public void setEmail(String text){
        Reporter.log("Enter email"+text+ " to email field "+email.toString() + "<br>");
        sendTextToElement(email,text);
    }

    public void setPassword(String text) {
        Reporter.log("Enter email"+text+ " to email field "+password.toString() + "<br>");
        sendTextToElement(password,text);
    }

    public void clickOnLogin() {
        Reporter.log("Clicking on login"+ login.toString()+ "<br>");
        clickOnElement(login);
    }

    public String verifyLoginText() {
        Reporter.log("getting Login text from "+ verifyLogin.toString()+"<br>");
        return getTextFromElement(verifyLogin);
    }

    public String verifyWelcomeTextMessage() {
        Reporter.log("getting Welcome text from "+verifyWelcome.toString()+"<br>");
        return getTextFromElement(verifyWelcome);
    }

}
