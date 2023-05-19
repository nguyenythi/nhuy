package com.demo.data;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.github.javafaker.Faker;
import java.util.Locale;
import java.util.Random;

import com.demo.config.Constants;
/*** Import modules from Selenium Base ***/
import com.demo.enums.RoomType;
import com.demo.models.Booking;
import com.demo.models.BookingBuilder;

public class BookingDataFactory {

    private final Faker faker;
    private static final Logger logger = LogManager.getLogger(BookingDataFactory.class);

    public BookingDataFactory() {
        faker = new Faker(new Locale(Constants.Faker_Locale));
    }

    public Booking createBookingData() {
        Booking booking = new BookingBuilder().
            email(faker.internet().emailAddress()).
            country(returnRandomCountry()).
            password(faker.internet().password()).
            dailyBudget(returnDailyBudget()).
            newsletter(faker.bool().bool()).
            roomType(RoomType.getRandom()).
            roomDescription(faker.lorem().paragraph()).
            build();

        logger.info(booking.toString());
        return booking;
    }

    private String returnRandomCountry() {
        return returnRandomItemOnArray(new String[]{"Belgium", "Brazil", "Netherlands"});
    }

    private String returnDailyBudget() {
        return returnRandomItemOnArray(new String[]{"$100", "$100 - $499", "$499 - $999", "$999+"});
    }

    private String returnRandomItemOnArray(String[] array) {
        return array[(new Random().nextInt(array.length))];
    }
}
