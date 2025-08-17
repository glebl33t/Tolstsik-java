package ru.travel.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final String URL = "https://travel.yandex.ru/";
    private final String SIGN_IN = "//a[@class='WvMZr mR5dx jNuum button_width_auto g2AoF']";
    private final String INPUT_LOGIN_OR_EMAIL = "//input[@data-t='field:input-login']";
    private final String BUTTON_ENTER = "//button[@id='passp:sign-in']";
    private WebDriver driver;

    public LoginPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void openSite() {
        driver.get(URL);
    }

    public void clickSignIn() {
        WebElement signIn = driver.findElement(By.xpath(SIGN_IN));
        signIn.click();
    }

    public void clickButtonLogin() {
        WebElement buttonLogin = driver.findElement(By.xpath(INPUT_LOGIN_OR_EMAIL));
        buttonLogin.click();
        buttonLogin.sendKeys("admin@mail.ru");
    }

    public void clickButtonEnter() {
        WebElement buttonEnter = driver.findElement(By.xpath(BUTTON_ENTER));
        buttonEnter.click();
    }
}
