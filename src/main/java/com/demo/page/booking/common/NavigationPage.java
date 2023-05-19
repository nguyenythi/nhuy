package com.demo.page.booking.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

/*** Import modules from Selenium Base ***/
import com.demo.page.AbstractPageObject;
import com.demo.config.Constants;
import com.demo.driver.DriverManager;

public class NavigationPage extends AbstractPageObject {

    @FindBy(name = "next")
    private WebElement next;

    @FindBy(name = "previous")
    private WebElement previous;

    @FindBy(name = "finish")
    private WebElement finish;

    @Step
    public void next() {
        next.click();
    }

    @Step
    public void previous() {
        previous.click();
    }

    @Step
    public void finish() {
        finish.click();
    }
    
    @Step
    public void openHomepage() {
        DriverManager.getDriver().get(Constants.Url_Base);
    }

}
