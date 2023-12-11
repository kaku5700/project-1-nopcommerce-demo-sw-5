package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        SoftAssert softAssert = new SoftAssert();
        homePage.setRegisterLink();
        softAssert.assertEquals(registerPage.verifyTextRegister(), "Register");
        softAssert.assertAll();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        SoftAssert softAssert = new SoftAssert();
        homePage.setRegisterLink();
        registerPage.getClickOnRegister();
        softAssert.assertEquals(registerPage.verifyFirstNameRequired(), "First name is required.", "");
        softAssert.assertEquals(registerPage.verifyLastNameRequired(), "Last name is required.", "");
        softAssert.assertEquals(registerPage.verifyEmailFieldRequired(), "Email is required.", "");
        softAssert.assertEquals(registerPage.verifyPasswordRequired(), "Password is required.", "");
        softAssert.assertEquals(registerPage.verifyReconfirmPasswordRequired(), "Password is required.", "");
        softAssert.assertAll();


    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
        homePage.setRegisterLink();
        registerPage.clickOnRadioButton();
        registerPage.getFirstName("Iam");
        registerPage.getLastName("Patel");
        registerPage.setDateOfBirth("10");
        Thread.sleep(1000);
        registerPage.setMonthOfBirth("May");
        registerPage.setYearOfBirth("2000");
        registerPage.getEmailAddress("hellopatel@gmail.com");
        registerPage.getPassword("123456");
        registerPage.getConfirmPassword("123456");
        registerPage.getClickOnRegister();
    }

}
