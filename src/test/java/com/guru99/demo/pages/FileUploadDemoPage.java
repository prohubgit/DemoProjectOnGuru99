package com.guru99.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FileUploadDemoPage extends BasePage {

//**************************************************************************
// Constructor for FileUploadDemoPage
//**************************************************************************
    public FileUploadDemoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//==========================================================================

    // Object Declaration for AcceptAll button on Privacy Message frame
    @FindBy(css = "button[id='save'] span[class='mat-button-wrapper'] span")
    private WebElement acceptAllButton;

    // Object Declaration for Privacy Message frame
    @FindBy(id = "gdpr-consent-notice")
    private WebElement messageFrame;

    //**************************************************************************
    // Method for clicking on Accept All button on Privacy Frame
    //**************************************************************************
        public void clickOnAcceptAllButton(){
            driver.switchTo().frame(messageFrame);
            //driver.switchTo().frame("gdpr-consent-notice"); for direct passing teh frame's argument
            acceptAllButton.click();
        }
    //==========================================================================

    // Object Declaration for Choose File  button
    @FindBy (id = "uploadfile_0")
    private WebElement chooseFileButton;

    //**************************************************************************
     // Method for clicking on Browse button
     //**************************************************************************
         public void clickOnChooseFileButton(){

         chooseFileButton.sendKeys("/Users/sheikhgeeuk/Desktop/FileUloadTest.pdf");

        }
     //==========================================================================


    // Object Declaration for term of services checkbox
        @FindBy (id = "terms")
        private WebElement termOfSercices;

    //**************************************************************************
    // Method for clicking on Term of Services check box
    //**************************************************************************
        public void clickOnTermOfServicesBox(){

        termOfSercices.click();
        }
    //==========================================================================

    // Object Declaration for SubmitFileButton
    @FindBy (id = "submitbutton")
    private WebElement SubmitFile;

    //**************************************************************************
    // Method for clicking on Term of Services check box
    //**************************************************************************
    public void clickOnSubmitFileButton(){

        SubmitFile.click();
    }
    //==========================================================================

    // Object Declaration for varification lable
    @FindBy(xpath = "//center[normalize-space()='1 file has been successfully uploaded.']")
    private WebElement verificationLabel;


    //**************************************************************************
    // Method for File Successfully Upload lable
    //**************************************************************************
    public void fileUploadConfirmation(){
    String conformationLabel = verificationLabel.getText();
        System.out.println("Message   "+conformationLabel);

    }
    //==========================================================================


    @FindBy(css = "a[href='http://demo.guru99.com/V1/index.php']")
    private WebElement bankProjectLink;


    public BankHomePage clickOnBankProjectLink(){
        bankProjectLink.click();
        return new BankHomePage(driver);
    }


}
