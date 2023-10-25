package com.guru99.demo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccessPage extends BasePage{

    /*##################################################################################
               UserAccesPage Contructor
    ##################################################################################*/
        public UserAccessPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
    //  *******************************************************************************

        @FindBy(css = "body > table > tbody > tr:nth-child(4) > td:nth-child(2)")
        private WebElement userIdVeri;
        @FindBy(css = "body > table > tbody > tr:nth-child(5) > td:nth-child(2)")
        private WebElement userPasswordVeri;
    /*##################################################################################
               Method for Access Page Title
    ##################################################################################*/
        public void verifyUserId (){
           String uIdVeri = userIdVeri.getText();
            String uPassVeri = userPasswordVeri.getText();
            System.out.println("Uer id  =   "+uIdVeri);
            System.out.println("Uer Password  =   "+uPassVeri);
        }
    //  *******************************************************************************
        @FindBy(css = "body > div:nth-child(6) > h2")
        private WebElement accessPageTitle;
    /*##################################################################################
           Method for Access Page Title
    //##################################################################################*/

        public void accessPTitle(){
       String pageTitle = accessPageTitle.getText();
       String PageT = "Guru99 Bank";
           if( PageT.equals(pageTitle))
            { verifyUserId();
        }else {
               System.out.println("User credential are not displayed");
               System.out.println(PageT);
               System.out.println(pageTitle);
           }
        }

    //  *******************************************************************************


}
