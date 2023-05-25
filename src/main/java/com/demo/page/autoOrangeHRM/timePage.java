package com.demo.page.autoOrangeHRM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.driver.DriverManager;


public class timePage extends navigationPage{
    @FindBy(xpath = "//span[text()='Time']")
    private WebElement navigateToTime;

    @FindBy(xpath = "//span[text()='Timesheets ']")
    private WebElement naviTabTimesheets;

    @FindBy(xpath = "//a[text()='My Timesheets']")
    private WebElement naviTabMyTimesheets;

    @FindBy(xpath = "//button[text()=' Edit ']")
    private WebElement btnEdit;

    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])")
    private WebElement selectProject;

    @FindBy(xpath = "//span[text()='Apache Software Foundation - ASF - Phase 1']")
    private WebElement clickAutoComplete;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    private WebElement selectActivity;

    //div[contains(@class,'oxd-select-text oxd-select-text')]

    

    @FindBy(xpath = "//span[text()='QA Testing']")
    private WebElement clickAutoActivity;

    //begin - input timesheets

    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input')])[2]")
    private WebElement inputTime1;

    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input')])[3]")
    private WebElement inputTime2;

    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input')])[4]")
    private WebElement inputTime3;

    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input')])[5]")
    private WebElement inputTime4;

    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input')])[6]")
    private WebElement inputTime5;

    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input')])[7]")
    private WebElement inputTime6;

    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input')])[8]")
    private WebElement inputTime7;

    //Verify time
    @FindBy(xpath = "//span[text()='02:00']")
    private WebElement getTimeSheet1;

    @FindBy(xpath = "//span[text()='05:00']")
    private WebElement getTimeSheet2;

    @FindBy(xpath = "//span[text()='07:00']")
    private WebElement getTimeSheet3;

    @FindBy(xpath = "//span[text()='01:00']")
    private WebElement getTimeSheet4;

    @FindBy(xpath = "//span[text()='04:00']")
    private WebElement getTimeSheet5;

    @FindBy(xpath = "//span[text()='00:00']")
    private WebElement getTimeSheet6;

    @FindBy(xpath = "//span[text()='08:00']")
    private WebElement getTimeSheet7;


    //end - input timesheets

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;

    @FindBy(xpath = "//p[text()='Successfully Saved']")
    private WebElement verifySuccess;

    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),10);

    public void naviToTime() {
        navigateToTime.click();
    }

    public void navTabTimesheets() {
        wait.until(ExpectedConditions.elementToBeClickable(naviTabTimesheets));
        naviTabTimesheets.click();
    }

    public void navTabMyTimesheets() {
        wait.until(ExpectedConditions.elementToBeClickable(naviTabMyTimesheets));
        naviTabMyTimesheets.click();
    }

    public void btnEdit() {
        wait.until(ExpectedConditions.elementToBeClickable(btnEdit));
        btnEdit.click();
    }

    public void enterSelectProject(String selectPrj) {
        wait.until(ExpectedConditions.elementToBeClickable(selectProject));
        selectProject.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        // selectProject.clear();
        selectProject.sendKeys(selectPrj);
    }

    public void clickAuto() {
        wait.until(ExpectedConditions.elementToBeClickable(clickAutoComplete));
        clickAutoComplete.click();
    }

    public void clickSelectActivity() {
        wait.until(ExpectedConditions.elementToBeClickable(selectActivity));
        selectActivity.click();
    }

    public void clickAutoActivity() {
        wait.until(ExpectedConditions.elementToBeClickable(clickAutoActivity));
        clickAutoActivity.click();
    }

    //begin - enter timesheets

    public void enterTime1(Integer enter1) {
        wait.until(ExpectedConditions.elementToBeClickable(inputTime1));
        inputTime1.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        //inputTime1.click();
        inputTime1.sendKeys(Integer.toString(enter1));
    }

    public void enterTime2(Integer enter2) {
        wait.until(ExpectedConditions.elementToBeClickable(inputTime2));
        inputTime2.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        // inputTime2.clear();
        inputTime2.sendKeys(Integer.toString(enter2));
    }

    public void enterTime3(Integer enter3) {
        wait.until(ExpectedConditions.elementToBeClickable(inputTime3));
        inputTime3.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        // inputTime3.clear();
        inputTime3.sendKeys(Integer.toString(enter3));
    }

    public void enterTime4(Integer enter4) {
        wait.until(ExpectedConditions.elementToBeClickable(inputTime4));
        inputTime4.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        // inputTime4.clear();
        inputTime4.sendKeys(Integer.toString(enter4));
    }

    public void enterTime5(Integer enter5) {
        wait.until(ExpectedConditions.elementToBeClickable(inputTime5));
        inputTime5.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        // inputTime5.clear();
        inputTime5.sendKeys(Integer.toString(enter5));
    }

    public void enterTime6(Integer enter6) {
        wait.until(ExpectedConditions.elementToBeClickable(inputTime6));
        inputTime6.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        // inputTime6.clear();
        inputTime6.sendKeys(Integer.toString(enter6));
    }

    public void enterTime7(Integer enter7) {
        wait.until(ExpectedConditions.elementToBeClickable(inputTime7));
        inputTime7.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        // inputTime7.clear();
        inputTime7.sendKeys(Integer.toString(enter7));
    }

    public void enterAllColumnTime(Integer enter1, Integer enter2, Integer enter3, Integer enter4, Integer enter5, 
    Integer enter6, Integer enter7) {
        this.enterTime1(enter1);
        this.enterTime2(enter2);
        this.enterTime3(enter3);
        this.enterTime4(enter4);
        this.enterTime5(enter5);
        this.enterTime6(enter6);
        this.enterTime7(enter7);
    }

    //end - enter timesheets

    public void clickbtnSave() {
        wait.until(ExpectedConditions.elementToBeClickable(btnSave));
        btnSave.click();
    }

    
    //verify success
    public boolean isSuccessDisplayed() {
        Boolean isSuccessDisplayed = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(verifySuccess));
            return isSuccessDisplayed = true;
        } catch (Exception e) {
            return isSuccessDisplayed;
        }
    }

    public String getSuccess() {
        return verifySuccess.getText();
    }

    //verify select project

    public boolean isSelectProjectDisplayed() {
        Boolean isSelectProjectDisplayed = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(clickAutoComplete));
            return isSelectProjectDisplayed = true;
        } catch (Exception e) {
            return isSelectProjectDisplayed;
        }
    }

    public String getProjectName() {
        return clickAutoComplete.getText();
    }

    //verify select activity
    public boolean isSelectActivityDisplayed() {
        Boolean isSelectActivityDisplayed = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(clickAutoActivity));
            return isSelectActivityDisplayed = true;
        } catch (Exception e) {
            return isSelectActivityDisplayed;
        }
    }

    public String getActivityName() {
        return clickAutoActivity.getText();
    }

    //time 1
    public boolean isTime1Displayed() {
        Boolean isTime1Displayed = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(getTimeSheet1));
            return isTime1Displayed = true;
        } catch (Exception e) {
            return isTime1Displayed;
        }
    }

    public String getTime1() {
        return getTimeSheet1.getText();
    }

    //time2
    public boolean isTime2Displayed() {
        Boolean isTime2Displayed = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(getTimeSheet2));
            return isTime2Displayed = true;
        } catch (Exception e) {
            return isTime2Displayed;
        }
    }

    public String getTime2() {
        return getTimeSheet2.getText();
    }

    //time3
    public boolean isTime3Displayed() {
        Boolean isTime3Displayed = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(getTimeSheet3));
            return isTime3Displayed = true;
        } catch (Exception e) {
            return isTime3Displayed;
        }
    }

    public String getTime3() {
        return getTimeSheet3.getText();
    }

    //time4
    public boolean isTime4Displayed() {
        Boolean isTime4Displayed = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(getTimeSheet4));
            return isTime4Displayed = true;
        } catch (Exception e) {
            return isTime4Displayed;
        }
    }


    public String getTime4() {
        return getTimeSheet4.getText();
    }

        //time5
    public boolean isTime5Displayed() {
        Boolean isTime5Displayed = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(getTimeSheet5));
            return isTime5Displayed = true;
        } catch (Exception e) {
            return isTime5Displayed;
        }
    }

    public String getTime5() {
        return getTimeSheet5.getText();
    }

    //time6
    public boolean isTime6Displayed() {
        Boolean isTime6Displayed = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(getTimeSheet6));
            return isTime6Displayed = true;
        } catch (Exception e) {
            return isTime6Displayed;
        }
    }

    public String getTime6() {
        return getTimeSheet6.getText();
    }

    //time7
    public boolean isTime7Displayed() {
        Boolean isTime7Displayed = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(getTimeSheet2));
            return isTime7Displayed = true;
        } catch (Exception e) {
            return isTime7Displayed;
        }
    }

    public String getTime7() {
        return getTimeSheet7.getText();
    }

}
