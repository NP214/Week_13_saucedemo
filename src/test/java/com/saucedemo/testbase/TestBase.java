package com.saucedemo.testbase;


import com.saucedemo.PropertyReader.PropertyReader;
import com.saucedemo.Utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();

    }
}
