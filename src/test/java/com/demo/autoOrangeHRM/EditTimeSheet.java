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

        //begin - input timesheet

        timePage.enterAllColumnTime(2, 5, 7, 1, 4, 0, 8);
        // Thread.sleep(10000);

        //end - input timesheet

        // click button save
        timePage.clickbtnSave();
        // Thread.sleep(10000);

        //Verify success
        Assert.assertTrue(timePage.isSuccessDisplayed());

        String getSuccess = timePage.getSuccess();
        System.out.println("Verify: " + getSuccess); 

        //verify Apache Software Foundation - ASF - Phase 1
        Assert.assertTrue(timePage.isSelectProjectDisplayed());

        //get name project
        String getNamePrj = timePage.getProjectName();
        System.out.println("Project name: " + getNamePrj);

        //verify Feature Development
        Assert.assertTrue(timePage.isSelectActivityDisplayed());

        String getNameAct = timePage.getActivityName();
        System.out.println("Activity name: " + getNameAct);

        //Verify Time 1
        Assert.assertTrue(timePage.isTime1Displayed());

        String getTime1 = timePage.getTime1();
        System.out.println("Time 1: " + getTime1);

        //Verify Time 2
        Assert.assertTrue(timePage.isTime2Displayed());

        String getTime2 = timePage.getTime2();
        System.out.println("Time 2: " + getTime2);

        //Verify Time 3
        Assert.assertTrue(timePage.isTime3Displayed());

        String getTime3 = timePage.getTime3();
        System.out.println("Time 1: " + getTime3);

        //Verify Time 4
        Assert.assertTrue(timePage.isTime4Displayed());

        String getTime4 = timePage.getTime4();
        System.out.println("Time 4: " + getTime4);

        //Verify Time 5
        Assert.assertTrue(timePage.isTime5Displayed());

        String getTime5 = timePage.getTime5();
        System.out.println("Time 5: " + getTime5);

        //Verify Time 6
        Assert.assertTrue(timePage.isTime6Displayed());

        String getTime6 = timePage.getTime6();
        System.out.println("Time 6: " + getTime6);

        //Verify Time 7
        Assert.assertTrue(timePage.isTime7Displayed());

        String getTime7 = timePage.getTime7();
        System.out.println("Time 7: " + getTime7);


   
    }
}
