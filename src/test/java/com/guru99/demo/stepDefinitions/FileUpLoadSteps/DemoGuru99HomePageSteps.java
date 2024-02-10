package com.guru99.demo.stepDefinitions.FileUpLoadSteps;

import com.guru99.demo.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class DemoGuru99HomePageSteps extends BasePage {

//    FileUploadDemoPage fileUploadDemoPage = PageFactory.initElements(driver, FileUploadDemoPage.class);
//    BankHomePage bankHomePage = PageFactory.initElements(driver, BankHomePage.class);
//
//    //DemoGuru99HomePage demoGuru99 = PageFactory.initElements(driver, DemoGuru99HomePage.class);
//
//    UserAccessPage userAccessPage = PageFactory.initElements(driver, UserAccessPage.class);
//
//    GtplBankHomePage gtplBankHomePage = PageFactory.initElements(driver, GtplBankHomePage.class);
//    GtplBankManagerHomePage gtplBankManagerHomePage = PageFactory.initElements(driver, GtplBankManagerHomePage.class);
//    Guru99BankHomePagePopup guru99BankHomePagePopup = PageFactory.initElements(driver, Guru99BankHomePagePopup.class);

    DemoGuru99Popup demoGuru99Popup = PageFactory.initElements(driver, DemoGuru99Popup.class);
    DemoGuru99ArticlesPopup demoGuru99ArticlesPopup = PageFactory.initElements(driver, DemoGuru99ArticlesPopup.class);

//    @Given("I navigate to Guru99 home page")
//    public void i_navigate_to_guru99_home_page() {
//            launchUrl();
//    }
//
//    @When("I click on BankProject link")
//    public void i_click_on_bank_project_link() {
//      bankHomePage = fileUploadDemoPage.clickOnBankProjectLink();
//    }
//
//    @When("I click on here link under the Steps To Generate Access header")
//    public void i_click_on_here_link_under_the_steps_to_generate_access_header() {
//      demoGuru99 = bankHomePage.clickOnVisitHere();
//    }
//
//
//    @When("I enter my {string} in to Email ID text box")
//    public void i_enter_my_in_to_email_id_text_box(String EmailID) {
//        demoGuru99.enterUserEmailId(EmailID);
//    }
//    @When("I click on Submit button")
//    public void i_click_on_submit_button() {
//        userAccessPage = demoGuru99.clickOnSubmitButton();
//    }
//
//    @Then("User ID and Password are displayed on Access Page")
//    public void user_id_and_password_are_displayed_on_access_page() {
//        userAccessPage.accessPTitle();
//    }
//
//
//    @When("I enter {string} in to user id text box")
//    public void i_enter_in_to_user_id_text_box(String string) {
//          gtplBankHomePage.enterManagerUserId();
//    }
//
//    @When("I enter {string} in to password field")
//    public void i_enter_in_to_password_field(String string) {
//        gtplBankHomePage.enterManagerPassword();
//    }
//
//    @When("I click on login button")
//    public void i_click_on_login_button() {
//       gtplBankManagerHomePage = gtplBankHomePage.clickOnManagerLoginButton();
//    }

//    @When("I click on Delete Customer link")
//    public void i_click_on_delete_customer_link() {
//
//    }
//
//    @When("I enter {string} in to customer id field")
//    public void i_enter_in_to_customer_id_field(String string) {
//
//    }
//
//    @When("click on submit button")
//    public void click_on_submit_button() {
//
//    }
//


//============Scenario No3:
// Need to discuss

    @Given("I navigate to Guru99Com-popup page")
    public void i_navigate_to_guru99com_popup_page() {
        launchUrl();
        //demoGuru99Popup.managePrivacyOnFrame();
    }

    @When("I click on here link")
    public void iclickonherelink() {

      demoGuru99Popup.clickOnClickHereLink();

    }

    @When("I enter user {string} in to Email ID field")
    public void ienteruserintoemailidfield(String emailId) {
        demoGuru99ArticlesPopup.enterEmailId(emailId);
    }


    @When("I click on SubmitBttn button")
    public void i_click_on_submit_bttn_button() throws InterruptedException {
        demoGuru99ArticlesPopup.clickOnSubmitButton();
    }

    @When("User ID and Password are displayed after few seconds")
    public void user_id_and_password_are_displayed_after_few_seconds() {

    }

    @Then("user closed all open tabs and move back to Bank HomePage.")
    public void user_closed_all_open_tabs_and_move_back_to_bank_home_page() {

    }
//===============================================================================



    }
