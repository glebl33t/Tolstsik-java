package by.av;

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void test1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openSite();
        loginPage.clickLogOut();
        loginPage.clickAuthPhone();
        loginPage.clickPasswordPhone();
        loginPage.clickEnter();
        loginPage.getTextErrorMessage();

        Assertions.assertEquals("Неверный телефон или пароль. Если забыли пароль, восстановите его",loginPage.getTextErrorMessage());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
