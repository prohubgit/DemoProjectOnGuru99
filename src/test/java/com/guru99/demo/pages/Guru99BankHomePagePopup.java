package com.guru99.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99BankHomePagePopup extends BasePage{


    /***************************************************************************************
            Constructer for Guru99BankHomePagePopup
     ****************************************************************************************/
        public Guru99BankHomePagePopup (WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

    /***************************************************************************************/

    @FindBy(css ="p:nth-child(7) > a")
    private WebElement clickHere;


    /***************************************************************************************
        Method to click on ClickHere
     ****************************************************************************************/
        public void ClickHereLink(){
            clickHere.click();
        }

    /***************************************************************************************/

    /***************************************************************************************
     *
     ****************************************************************************************/


    /***************************************************************************************/
}
