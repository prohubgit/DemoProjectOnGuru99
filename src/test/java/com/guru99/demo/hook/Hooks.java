package com.guru99.demo.hook;

import com.guru99.demo.common.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.sql.DriverManager;

public class Hooks extends Browser {
    public Scenario scenario;
    @Before
    public void setUp(Scenario scenario) {
        this.scenario = scenario;
        launchBrowser("Chrome");
    }

    @After
    public void tearDown() {
        //call screenshot()
        System.out.println("After Site");
        try{
            if (scenario.isFailed()){

                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        closeBrowser();
    }
}
