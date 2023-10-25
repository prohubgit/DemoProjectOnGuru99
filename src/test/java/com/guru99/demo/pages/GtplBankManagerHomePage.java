package com.guru99.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GtplBankManagerHomePage extends BasePage{
    public GtplBankManagerHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
