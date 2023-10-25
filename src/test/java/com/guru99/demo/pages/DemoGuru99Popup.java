package com.guru99.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoGuru99Popup extends BasePage{

    /*===============================================================================
        Constructor for DemoGuru99Popup
     ==============================================================================*/
        public DemoGuru99Popup(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
    //===============================================================================




    @FindBy(css = "body > p > a")
    private WebElement clickHereLink;

    /*===============================================================================
        Method for clickHere link
     ==============================================================================*/
        public void clickOnClickHereLink(){
            clickHereLink.click();
        }
    //===============================================================================

    @FindBy(css = "button[id='save'] div[class='action-wrapper']")
    private WebElement acceptAllButton;

    @FindBy(css = "#gdpr-consent-notice")
    private WebElement frameForAccepAll;
    /*=================================================================================
        Manage Privacy On IFrame Alert
    ================================================================================= */
    public void managePrivacyOnFrame(){
        managePrivacyBP(frameForAccepAll, acceptAllButton);
    }



    /*===============================================================================
        Method for
     ==============================================================================*/


    //===============================================================================
}
