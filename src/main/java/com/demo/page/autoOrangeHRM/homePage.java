package com.demo.page.autoOrangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.demo.page.autoOrangeHRM.navigationPage;

import com.demo.driver.DriverManager;

import io.qameta.allure.Step;

public class homePage extends navigationPage{
    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement verifyDashboardTitle;

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    private WebElement accountNameTest;

    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement navigateToAdmin;

    @FindBy(xpath = "//h6[text()='User Management']")
    private WebElement verifyUserManagement;

    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),10);

    @Step
    public boolean isDashboardDisplayed() {
        Boolean isDisplayed = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(verifyDashboardTitle));
            return isDisplayed = true;
        } catch (Exception e) {
            return isDisplayed;
        }
    }

    public String getAccountName() {
        return accountNameTest.getText();
    }

    public void clickAdminPage() {
        navigateToAdmin.click();
    }

    public boolean isUserManagementDisplayed() {
        Boolean isManagementDisplayed = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(verifyUserManagement));
            return isManagementDisplayed = true;
        } catch (Exception e) {
            return isManagementDisplayed;
        }
    }
}
