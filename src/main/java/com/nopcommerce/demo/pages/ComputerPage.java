package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    //computer text
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;

    // Desktop
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement desktop;

    //Notebook
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]")
    WebElement notebook;

    //software
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/h2[1]/a[1]")
    WebElement software;


    public String verifyTextComputer() {
        Reporter.log("verify computer text "+ computerText.toString()+"<br>");
        return getTextFromElement(computerText);
    }

    public void clickOnDesktop() {
        Reporter.log("Clicking on Desktop"+ desktop.toString()+ "<br>");
        clickOnElement(desktop);
    }

    public void clickOnNoteBook() {
        Reporter.log("Clicking on noteBook"+ notebook.toString()+ "<br>");
        clickOnElement(notebook);
    }

    public void clickOnSoftware() {
        Reporter.log("Clicking on Software"+ software.toString()+ "<br>");
        clickOnElement(software);
    }
}
