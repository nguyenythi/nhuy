package com.demo.automationexercise;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.github.javafaker.Faker;
import java.util.Locale;

import com.demo.utils.BasicTest;

public class TC01_RegisterUser extends BasicTest{
    private static final Logger log = LogManager.getLogger();
    
    @Test
    public void registerUserTest() throws InterruptedException{
        Faker faker = new Faker(new Locale("us"));
        //Test data
        String name = faker.name().username();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();
        String firtName = faker.name().firstName();;
        String lastName = faker.name().lastName();
        String company = faker.company().name();
        String address = faker.address().streetName();
        String state = faker.address().state();
        String city = faker.address().city();
        String zipCode = faker.address().zipCode();
        String mobileNumber = faker.phoneNumber().phoneNumber();


        log.info("1. Launch browser");
        log.info("2. Navigate to url 'http://automationexercise.com'");
        driver.get("https://automationexercise.com");
        Assert.assertEquals(driver.getTitle(), "Automation Exercise");

        log.info("3. Verify that home page is visible successfully");
        driver.findElement(By.xpath("//a[contains(text(), 'Home')]")).isDisplayed();

        log.info("4. Click on 'Signup / Login' button");
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        log.info("5. Verify 'New User Signup!' is visible");
        driver.findElement(By.xpath("//h2[contains(text(),'New User Signup!')]")).isDisplayed();

        log.info("6. Enter name and email address");
        WebElement iptName = driver.findElement(By.xpath("//input[@name='name']"));
        iptName.sendKeys(name);

        WebElement iptEmail = driver.findElement(By.xpath("//div[@class='signup-form']//input[@name='email']"));
        iptEmail.sendKeys(email);

        log.info("7. Click 'Signup' button");
        driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();

        log.info("8. Verify that 'ENTER ACCOUNT INFORMATION' is visible");
        WebElement enterAccInfoText = driver.findElement(By.xpath("//b[contains(text(),'Enter Account Information')]"));
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(enterAccInfoText));
        enterAccInfoText.isDisplayed();

        log.info("9. Fill details: Title, Name, Email, Password, Date of birth");
        driver.findElement(By.id("id_gender2")).click();

        Select dayDateOfBirth = new Select(driver.findElement(By.id("days")));
        dayDateOfBirth.selectByVisibleText("4");

        Select monthDateOfBirth = new Select(driver.findElement(By.id("months")));
        monthDateOfBirth.selectByVisibleText("December");

        Select yearDateOfBirth = new Select(driver.findElement(By.id("years")));
        yearDateOfBirth.selectByVisibleText("1999");

        driver.findElement(By.id("password")).sendKeys(password);

        log.info("10. Select checkbox 'Sign up for our newsletter!'");
        driver.findElement(By.id("newsletter")).click();

        log.info("11. Select checkbox 'Receive special offers from our partners!'");
        driver.findElement(By.id("optin")).click();

        log.info("12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number");
        driver.findElement(By.id("first_name")).sendKeys(firtName);
        driver.findElement(By.id("last_name")).sendKeys(lastName);
        driver.findElement(By.id("company")).sendKeys(company);
        driver.findElement(By.id("address1")).sendKeys(address);
        driver.findElement(By.id("state")).sendKeys(state);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("zipcode")).sendKeys(zipCode);
        driver.findElement(By.id("mobile_number")).sendKeys(mobileNumber);

        log.info("13. Click 'Create Account button'");
        driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();

        log.info("14. Verify that 'ACCOUNT CREATED!' is visible");
        driver.findElement(By.xpath("//b[contains(text(),'Account Created!')]")).isDisplayed();

        log.info("15. Click 'Continue' button");
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();

        /*
         * After click Continue, website is displayed advertising
         * So need to turn of advertising to continue testing
         * Waitting research for handle this case ....
         */

        // log.info("16. Verify that 'Logged in as username' is visible");
        // String loggedUser = driver.findElement(By.xpath("//i[@class='fa fa-user']/../b")).getText();
        // Assert.assertEquals(loggedUser, name);
        

        // log.info("17. Click 'Delete Account' button");
        // driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]")).click();

        // log.info("18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button");
        // driver.findElement(By.xpath("//b[contains(text(),'Account Deleted!')]")).isDisplayed();
    }
}
