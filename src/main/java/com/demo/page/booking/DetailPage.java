package com.demo.page.booking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

/*** Import modules from Selenium Base ***/
import com.demo.page.booking.common.NavigationPage;
import com.demo.driver.DriverManager;

public class DetailPage extends NavigationPage {

    @FindBy(id = "description")
    private WebElement roomDescription;

    @FindBy(css = "#message > p")
    private WebElement message;

    @Step
    public void fillRoomDescription(String description) {
        new Actions(DriverManager.getDriver()).sendKeys(roomDescription, description);
    }

    @Step
    public String getAlertMessage() {
        return message.getText();
    }
}
