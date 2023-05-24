package com.demo.autoOrangeHRM;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadExecutionException;

import com.demo.page.autoOrangeHRM.homePage;
import com.demo.page.autoOrangeHRM.loginPage;
import com.demo.page.autoOrangeHRM.timePage;
import com.demo.utils.BaseTest;

public class EditTimeSheet extends BaseTest{
    @Test
    public void editTimeSheet() throws InterruptedException {
        loginPage loginPage = new loginPage();
        loginPage.login("Admin", "admin123");

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.isDashboardDisplayed());

        String usernameAccount = homePage.getAccountName();
        System.out.println("Account name: " + usernameAccount);

        timePage timePage = new timePage();

        //navigate to time
        timePage.naviToTime();

        //navigate tab time sheet
        timePage.navTabTimesheets();

        //navigate to my timesheet
        timePage.navTabMyTimesheets();

        //click button Eidt
        timePage.btnEdit();

        //enter select project
        timePage.enterSelectProject("ac");

        // click auto complete of select project
        timePage.clickAuto();

        // click select activity
        timePage.clickSelectActivity();

        // click auto complete activity
        timePage.clickAutoActivity();

        // click button save
        timePage.clickbtnSave();

        //verify Apache Software Foundation - ASF - Phase 1
        Assert.assertTrue(timePage.isSelectProjectDisplayed());

        //get name project
        String getNamePrj = timePage.getProjectName();
        System.out.println("Project name: " + getNamePrj);

        //verify Feature Development
        Assert.assertTrue(timePage.isSelectActivityDisplayed());

        String getNameAct = timePage.getActivityName();
        System.out.println("Activity name: " + getNameAct);
     
    }
}
