package com.guru99.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BankHomePage extends BasePage{

     /*##############################################################################
                    BankHomePage constructor
     ##############################################################################*/
        public BankHomePage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
    //=============================================================================
    @FindBy(css = "body > div:nth-child(29) > ol > li:nth-child(1) > a")
    private WebElement visitHere;
    /*##############################################################################
                   Method for click on hyper link "here"
     ##############################################################################*/
    public DemoGuru99 clickOnVisitHere(){
        visitHere.click();
        return new DemoGuru99(driver);
    }
    //  *******************************************************************************
}
