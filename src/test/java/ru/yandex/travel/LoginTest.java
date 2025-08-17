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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openSite();
        loginPage.clickSignIn();
        loginPage.clickButtonLogin();
        loginPage.clickButtonEnter();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
