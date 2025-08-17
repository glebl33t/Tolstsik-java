package ru.yandex.travel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.travel.yandex.LoginPage;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void testLoginEmail() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openSite();
        loginPage.clickSignIn();
        loginPage.clickLoginEmail();
        loginPage.clickButtonEnterEmail();
    }

    @Test
    public void testLoginPhone() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openSite();
        loginPage.clickSignIn();
        loginPage.clickButtonSwitchToPhone();
        loginPage.clickLoginPhone();
        loginPage.clickButtonEnterPhone();
    }


    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
