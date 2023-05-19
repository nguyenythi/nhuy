package com.demo.autoOrangeHRM;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demo.utils.BaseTest;

import com.demo.page.autoOrangeHRM.homePage;
import com.demo.page.autoOrangeHRM.loginPage;

public class NavigateToAdminPage extends BaseTest{

    @Test
    public void navigateToAdminPage() {
        loginPage login = new loginPage();
        login.openOrangeHRMWebsite();
        login.filloutLoginAndSubmit("Admin", "admin123");

        homePage home = new homePage();
        Assert.assertTrue(home.isDashboardDisplayed());

        String usernameAccount = home.getAccountName();
        System.out.println("Account name: " + usernameAccount);

        home.clickAdminPage();

        Assert.assertTrue(home.isUserManagementDisplayed());
    }
    
}
