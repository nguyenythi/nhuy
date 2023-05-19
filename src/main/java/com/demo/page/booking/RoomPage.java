package com.demo.page.booking;

import org.openqa.selenium.By;
import io.qameta.allure.Step;

/*** Import modules from Selenium Base ***/
import com.demo.enums.RoomType;
import com.demo.page.booking.common.NavigationPage;
import com.demo.driver.DriverManager;

public class RoomPage extends NavigationPage {

    @Step
    public void selectRoomType(RoomType room) {
        DriverManager.getDriver().findElement(By.xpath("//h6[text()='" + room + "']")).click();
    }
}
