package com.demo.example;

import org.testng.annotations.Test;
import org.testng.Assert;

/*** Import modules from Selenium Base ***/
import com.demo.utils.BaseTest;
import com.demo.data.BookingDataFactory;
import com.demo.models.Booking;
import com.demo.page.booking.AccountPage;
import com.demo.page.booking.DetailPage;
import com.demo.page.booking.RoomPage;
import com.demo.driver.DriverManager;

public class BookRoomWebTest extends BaseTest {

    @Test
    public void bookARoom() {
        Booking bookingInformation = new BookingDataFactory().createBookingData();

        AccountPage accountPage = new AccountPage();
        accountPage.openHomepage();
        accountPage.fillEmail(bookingInformation.getEmail());
        accountPage.fillPassword(bookingInformation.getPassword());
        accountPage.selectCountry(bookingInformation.getCountry());
        accountPage.selectBudget(bookingInformation.getDailyBudget());
        accountPage.clickNewsletter();
        accountPage.next();

        RoomPage roomPage = new RoomPage();
        roomPage.selectRoomType(bookingInformation.getRoomType());
        roomPage.next();

        DetailPage detailPage = new DetailPage();
        detailPage.fillRoomDescription(bookingInformation.getRoomDescription());
        detailPage.finish();

        Assert.assertEquals(detailPage.getAlertMessage(), "Your reservation has been made and we will contact you shortly");
                
    }
}
