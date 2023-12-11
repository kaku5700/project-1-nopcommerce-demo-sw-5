package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {
        homePage.clickOnLoginLink();
    }

    @Test(groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.setEmail("hellopatel123@gmail.com");
        loginPage.setPassword("456789");
        loginPage.clickOnLogin();

    }

    @Test(groups = {"regression"}, priority = 1)
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
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
        homePage.clickOnLoginLink();
        loginPage.setEmail("hellopatel@gmail.com");
        loginPage.setPassword("123456");
        loginPage.clickOnLogin();
        softAssert.assertEquals(homePage.verifyLogout(),"Log out","Error");
        softAssert.assertAll();
    }
    @Test(groups = {"regression"}, priority = 2)
    public void VerifyThatUserShouldLogOutSuccessFully() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLoginLink();
        loginPage.setEmail("hellopatel@gmail.com");
        loginPage.setPassword("123456");
        loginPage.clickOnLogin();
        homePage.clickOnLogout();
        softAssert.assertEquals(homePage.verifyLoginText(),"https://demo.nopcommerce.com/","");
        softAssert.assertAll();
    }

}
