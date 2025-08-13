package by.pizzatempo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pizzatempo.LoginPage;

public class LoginTest {
    WebDriver driver;

    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.pizzatempo.by/");
    }

    @Test
    public void test1() {
        WebElement inputLoginWebElement = driver.findElement(By.xpath(LoginPage.INPUT_LOGIN));
        inputLoginWebElement.sendKeys("John Black");

        WebElement inputPasswordXpath = driver.findElement(By.xpath(LoginPage.INPUT_PASSWORD));
        inputPasswordXpath.sendKeys("qwerty123456");

        WebElement buttonSubmitXpath = driver.findElement(By.xpath(LoginPage.BUTTON_SUBMIT));
        buttonSubmitXpath.click();

        WebElement massageXpath = driver.findElement(By.xpath(LoginPage.MESSAGE_PATH));

        String actual = massageXpath.getText();
        System.out.println(actual);

        Assertions.assertEquals("Неверно указано имя пользователя или пароль.\n" +
                "Ok", actual);
    }

    @AfterEach
    public void finish() {
        driver.quit();
    }
}
