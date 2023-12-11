package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement computersLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement electronicsLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")
    WebElement apparelLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")
    WebElement digitalDownloadsLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement booksLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
    WebElement jewelryLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]")
    WebElement giftCardsLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLink;

    public String verifyLoginText(){
        return driver.getCurrentUrl();
    }

    public void clickOnLoginLink(){
        Reporter.log("Clicking on Login" + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink(){
        Reporter.log("Clicking on RegisterLink" + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
    }

    public void setRegisterLink() {
        Reporter.log("Clicking on RegisterLink" + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
    }


    public void clickOnComputer() {
        Reporter.log("Clicking on Computers" + computersLink.toString() + "<br>");
        clickOnElement(computersLink);
    }

    public void clickOnLogout() {
        Reporter.log("Clicking on login"+ logoutLink.toString()+ "<br>");
        clickOnElement(logoutLink);
    }

    public String verifyLogout() {
        Reporter.log("getting Logout text from " + logout.toString() + "<br>");
        return getTextFromElement(logout);
    }

    public void selectMenu(String menu) {
        if (menu.equalsIgnoreCase("Computers"))
            clickOnElement(computersLink);
        if (menu.equalsIgnoreCase("Electronics"))
            clickOnElement(electronicsLink);
        if (menu.equalsIgnoreCase("Apparel"))
            clickOnElement(apparelLink);
        if (menu.equalsIgnoreCase("Digital downloads"))
            clickOnElement(digitalDownloadsLink);
        if (menu.equalsIgnoreCase("Books"))
            clickOnElement(booksLink);
        if (menu.equalsIgnoreCase("Jewelry"))
            clickOnElement(jewelryLink);
        if (menu.equalsIgnoreCase("Gift Cards"))
            clickOnElement(giftCardsLink);
    }

}
