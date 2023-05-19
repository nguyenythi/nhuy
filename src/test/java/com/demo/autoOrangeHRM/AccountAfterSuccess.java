package com.demo.autoOrangeHRM;

import org.testng.annotations.Test;

import com.demo.page.autoOrangeHRM.homePage;
import com.demo.page.autoOrangeHRM.loginPage;
import com.demo.utils.BaseTest;
import org.testng.Assert;

public class AccountAfterSuccess extends BaseTest{

    @Test
    public void loginAccountAfetrSuccess() {
        loginPage login = new loginPage();
        login.openOrangeHRMWebsite();
        login.filloutLoginAndSubmit("Admin", "admin123");

        homePage home = new homePage();
        Assert.assertTrue(home.isDashboardDisplayed());

        String usernameAccount = home.getAccountName();
        System.out.println("Account name: " + usernameAccount);
    }
}
