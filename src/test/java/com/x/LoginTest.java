package com.x;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    public void test1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openSite();
        loginPage.clickSignIn();
        loginPage.clickInputLogin();
        loginPage.clickEnterLogin();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
