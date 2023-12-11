package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;

    @CacheLookup
    @FindBy(xpath = "//select[@name='product_attribute_2']")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//input[@value='7']")
    WebElement hardDrive;

    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_5' and @value='12']")
    WebElement software;

    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_5' and @value='12']")
    WebElement operatingSystem;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Build your own computer']")
    WebElement verifyBuildYourComputer;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 add-to-cart-button']")
    WebElement addtocart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyTheShoppingText;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement VistaPremium;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement VistaHome1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement TotalCommander1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement MicrosoftOffice1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement AcrobatReader1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hardDrive1;

    public void selectProcessor(String intel) {
        Reporter.log("Enter email" + intel + " to email field " + processor.toString() + "<br>");
        selectByVisibleTextFromDropDown(processor, intel);
    }

    public void selectRam(String text) {
        Reporter.log("Selecting RAM " + text + " from dropdown " + ram.toString() + "<br>");
        selectByVisibleTextFromDropDown(ram, text);
    }

    public void setOperatingSystem() {
        Reporter.log("Clicking on operating system" + operatingSystem.toString() + "<br>");
        clickOnElement(operatingSystem);
    }


    public void setSoftware() {
        Reporter.log("Clicking on software" + software.toString() + "<br>");
        clickOnElement(software);
    }


    public String verifyTextBuiltYourComputer() {
        Reporter.log("getting Build your own computer text from " + verifyBuildYourComputer.toString() + "<br>");
        return getTextFromElement(verifyBuildYourComputer);
    }

    public String verifyTheShoppingCartText() {
        Reporter.log("verify the text shopping cart" + verifyTheShoppingText.toString() + "<br>");
        return getTextFromElement(verifyTheShoppingText);
    }

    public void clickOnCloseButton() {
        Reporter.log("Clicking on Close Button" + closeButton.toString() + "<br>");
        clickOnElement(closeButton);
    }

    public void getOsRadio(String radio) {
        if (radio == "VistaHome") {
            Reporter.log("Clicking on Vista Home" + VistaHome1.toString() + "<br>");
            clickOnElement(VistaHome1);
        } else {
            Reporter.log("Clicking on Vista Premium" + VistaPremium.toString() + "<br>");
            clickOnElement(VistaPremium);

        }
    }

    public void clickOnSoftwareCheckBox(String software) {
        if (software == "MicrosoftOffice") {
            Reporter.log("Clicking on Microsoft office" + MicrosoftOffice1.toString() + "<br>");
            clickOnElement(MicrosoftOffice1);
        }
        if (software == "TotalCommander") {
            Reporter.log("Clicking on Total Commander" + TotalCommander1.toString() + "<br>");
            clickOnElement(TotalCommander1);
        }
        if (software == "AcrobatReader") {
            Reporter.log("Clicking on Acrobat Reader" + AcrobatReader1.toString() + "<br>");
            clickOnElement(AcrobatReader1);
        }
    }

    public void clickOnHardware(String HDD) {
        if (HDD == "320GB") {
            Reporter.log("Clicking on Hard drive" + hardDrive.toString() + "<br>");
            clickOnElement(hardDrive);
        } else {
            Reporter.log("Clicking on Hard drive" + hardDrive1.toString() + "<br>");
            clickOnElement(hardDrive1);
        }
    }
}
