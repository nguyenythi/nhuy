package com.demo.autoOrangeHRM;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demo.utils.BaseTest;

import com.demo.page.autoOrangeHRM.homePage;
import com.demo.page.autoOrangeHRM.loginPage;

public class NavigateToAdminPage extends BaseTest{

    @Test
    public void navigateToAdminPage() {
        loginPage loginPage = new loginPage();
        loginPage.login("Admin", "admin123");

        homePage homepage = new homePage();
        Assert.assertTrue(homepage.isDashboardDisplayed());

        String usernameAccount = homepage.getAccountName();
        System.out.println("Account name: " + usernameAccount);

        homepage.navigateToAdmin();
        
        Assert.assertTrue(homepage.isUserManagementDisplayed());
    }
    
}
