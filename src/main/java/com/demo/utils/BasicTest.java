package com.demo.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;

import com.demo.driver.LaunchBrowser;
import com.demo.config.Constants;

public abstract class BasicTest {
    protected static WebDriver driver;

    @BeforeMethod
    @Parameters(value={"browser"})
    public void preCondition(@Optional(Constants.BROWSER_TYPE) String browser){
        driver = LaunchBrowser.getDriver(browser);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void postCondition(){
        driver.quit();
    }
}
