package com.guru99.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GtplBankHomePage extends BasePage{
    /*####################################################################################
        GtplBankHomePage constructor
    ####################################################################################*/
    public GtplBankHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//======================================================================================

    @FindBy(css="tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]")
    private WebElement managerUserID;

    /*=================================================================================
            Method declaration for enter Manager User ID
     =================================================================================*/
        public void enterManagerUserId(){
            managerUserID.sendKeys("mngr523138");
        }

//======================================================================================


    @FindBy(css = "tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]")
    private WebElement managerPassword;

    /*####################################################################################
     Method declaration for enter Manager Password
     ####################################################################################*/
        public void enterManagerPassword(){
            managerPassword.sendKeys("puqUhap");
        }

    //====================================================================================

    @FindBy(css = "tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)")
    private WebElement managerLoginButton;


    /*####################################################################################
            Method declaration for click on Login button
     ===================================================================================*/
        public GtplBankManagerHomePage clickOnManagerLoginButton(){
            managerLoginButton.click();
            return new GtplBankManagerHomePage(driver);
        }







//======================================================================================
    /*####################################################################################

    ====================================================================================*/


//======================================================================================



}
