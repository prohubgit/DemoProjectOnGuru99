package com.guru99.demo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/com/guru99/demo/features"},
        glue = {"com/guru99/demo/hook", "com/guru99/demo/stepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@newUserCredential"
        )

public class TestRunner {
}
