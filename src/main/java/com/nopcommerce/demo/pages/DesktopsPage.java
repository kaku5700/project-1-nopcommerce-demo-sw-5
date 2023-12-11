package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    //desktop text
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildYourComputer;

    // sort by
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Sort by')]")
    WebElement sortBy;

    // display
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Display')]")
    WebElement display;

    //list product
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listProduct;

    public String verifyTextDesktop() {
        Reporter.log("getting DeskTop text from " + desktopText.toString() + "<br>");
        return getTextFromElement(desktopText);
    }

    public void setBuildYourComputer() {
        Reporter.log("Clicking on Built your computer" + buildYourComputer.toString() + "<br>");
        clickOnElement(buildYourComputer);
    }

    public void clickOnSortBy() {
        Reporter.log("Clicking on Sort By" + sortBy.toString() + "<br>");
        clickOnElement(sortBy);
    }

    public void clickOnDisplay() {
        Reporter.log("Clicking on Display" + display.toString() + "<br>");
        clickOnElement(display);
    }

    public void clickOnListProduct() {
        Reporter.log("Clicking on List product" + listProduct.toString() + "<br>");
        clickOnElement(listProduct);
    }
}
