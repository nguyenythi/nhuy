package com.demo.example;

import com.demo.utils.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;

import com.demo.page.FormAuthenticationPage;
import com.demo.driver.DriverManager;

public class AccountLoginTest extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger();
    protected FormAuthenticationPage formAuthenticationPage;

    @DataProvider(name = "AccountProvider")
    public Object[][] getDataFromDataProvider(){
      return new Object[][]{
        {"tomsmith", "SuperSecretPassword!"},
        {"tomsmith2", "SuperSecretPassword!"}
      };
    }
    
    @Test(dataProvider="AccountProvider")
    public void loginTest(String username, String password) throws Exception {
        WebDriver driver = DriverManager.getDriver();
        // Launch website
        driver.get("https://the-internet.herokuapp.com/");
        formAuthenticationPage = new FormAuthenticationPage();
        formAuthenticationPage.clickLink("Form Authentication");
        formAuthenticationPage.login(username, password);
        Thread.sleep(1000);
        Boolean display = formAuthenticationPage.isSecureAreaEleDisplay();
        LOGGER.info("Secure Area displayed: " + display);
        Assert.assertTrue(display);
    }

}
