package com.guru99.demo.hook;

import com.guru99.demo.common.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Browser {
    @Before
    public void setUp() {
        launchBrowser("Chrome");
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
