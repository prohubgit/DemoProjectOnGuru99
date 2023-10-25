package com.guru99.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class DemoGuru99ArticlesPopup extends BasePage{

    /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        Constructor for DemoGuru99ArticlesPopup
     ================================================================*/
        public DemoGuru99ArticlesPopup(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
    //================================================================

    @FindBy(css = "body > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=text]")
    private WebElement emailIdOnTab;
        @FindBy(css = "body > form > table > tbody > tr:nth-child(6) > td:nth-child(2) > input[type=submit]")
    private WebElement submitButtonTab;
        /*==============================================================
        Returning back to patent Window from child window
         ==============================================================*/
            public void enterEmailId(String emailId){
                windowsHandler(emailIdOnTab, emailId);

            }
    //==================================================================

    /*==============================================================
        Returning back to patent Window from child window
         ==============================================================*/
    public DemoGuru99Popup clickOnSubmitButton() throws InterruptedException {
            submitButtonTab.click();
            Thread.sleep(5000);
            driver.close();
        return new DemoGuru99Popup(driver);
    }
    //==================================================================




}
