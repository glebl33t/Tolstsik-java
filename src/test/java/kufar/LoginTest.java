package kufar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
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
    public void testSingIn() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openSite();
        loginPage.clickButtonCookie();
        loginPage.clickButtonAuth();
        loginPage.clickInputLogin();
        loginPage.clickInputPassword();
    }

    @Test
    public void test2() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openSite();
        loginPage.clickButtonCookie();
        loginPage.clickButtonAuth();
        loginPage.clickInputLogin();
        loginPage.clickInputPassword();
        loginPage.getErrorAuthText();

        Assertions.assertEquals("Введен неверный пароль либо такого профиля не существует", loginPage.getErrorAuthText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
