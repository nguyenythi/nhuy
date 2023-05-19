package com.demo.autoOrangeHRM;

import org.testng.annotations.Test;

import org.testng.Assert;

import com.demo.page.autoOrangeHRM.homePage;
import com.demo.page.autoOrangeHRM.loginPage;
import com.demo.utils.BaseTest;

public class LoginAccount extends BaseTest{
    /**
     * @throws InterruptedException
     */
    @Test
    public void loginAccountTest() throws InterruptedException {
        //open page
        loginPage login = new loginPage();
        login.openOrangeHRMWebsite();

         //input username
         login.enterUsername("Admin");

         //input password
         login.enterPassword("admin123");

         //click buton to login
        login.clickLoginButton();

        //verify login success
        homePage home = new homePage();
        Assert.assertTrue(home.isDashboardDisplayed());

    }
}
