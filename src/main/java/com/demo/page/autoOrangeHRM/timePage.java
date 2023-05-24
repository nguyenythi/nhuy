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

    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    private WebElement selectProject;

    @FindBy(xpath = "//span[text()='Apache Software Foundation - ASF - Phase 1']")
    private WebElement clickAutoComplete;

    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active oxd-select-text--error']")
    private WebElement selectActivity;

    @FindBy(xpath = "//span[text()='Feature Development']")
    private WebElement clickAutoActivity;

    @FindBy(xpath = "//span[text()='Feature Development']")
    private WebElement clickAutoActivity1;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;


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
        clickAutoActivity.click();
    }

    public void clickbtnSave() {
        btnSave.click();
    }

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
}
