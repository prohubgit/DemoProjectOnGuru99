package com.guru99.demo.stepDefinitions.FileUpLoadSteps;

import com.guru99.demo.pages.BasePage;
import com.guru99.demo.pages.FileUploadDemoPage;
import com.guru99.demo.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class FileUploadSteps extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    FileUploadDemoPage fileUploadDemoPage = PageFactory.initElements(driver, FileUploadDemoPage.class);
    @Given("I navigate to file Upload page")
    public void i_navigate_to_file_upload_page() {
        launchUrl();
    }

    @Given("I click on AcceptAll button on Manage your Privacy")
    public void i_click_on_accept_all_button_on_manage_your_privacy() {
        fileUploadDemoPage.clickOnAcceptAllButton();
    }

    @When("I click on Browse button")
    public void i_click_on_browse_button() {
        fileUploadDemoPage.clickOnChooseFileButton();
    }

    @When("I click on terms of service checkbox")
    public void i_click_on_terms_of_service_checkbox() {
        fileUploadDemoPage.clickOnTermOfServicesBox();
    }

    @When("I click on Submit File button")
    public void i_click_on_submit_file_button() {
        fileUploadDemoPage.clickOnSubmitFileButton();
    }

    @Then("file is successfully uploaded")
    public void file_is_successfully_uploaded() {
        fileUploadDemoPage.fileUploadConfirmation();
    }
}
