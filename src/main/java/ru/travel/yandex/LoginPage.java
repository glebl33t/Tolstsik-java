package ru.travel.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final String URL = "https://travel.yandex.ru/";
    private final String SIGN_IN = "//a[@class='WvMZr mR5dx jNuum button_width_auto g2AoF']";
    private final String INPUT_LOGIN_EMAIL = "//input[@data-t='field:input-login']";
    private final String BUTTON_SWITCH_TO_PHONE = "//button[@class='Button2 Button2_size_l Button2_view_clear']";
    private final String INPUT_LOGIN_PHONE = "//input[@id='passp-field-phone']";
    private final String BUTTON_ENTER = "//button[@id='passp:sign-in']";
    private final String INPUT_ENTER_PHONE = "//input[@id='passp-field-phone']";

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

    public void clickButtonSwitchToPhone() {
        WebElement buttonLogin = driver.findElement(By.xpath(BUTTON_SWITCH_TO_PHONE));
        buttonLogin.click();
    }

    public void clickLoginEmail() {
        WebElement buttonLogin = driver.findElement(By.xpath(INPUT_LOGIN_EMAIL));
        buttonLogin.click();
        buttonLogin.sendKeys("admin@mail.ru");
    }

    public void clickLoginPhone() {
        WebElement buttonLogin = driver.findElement(By.xpath(INPUT_LOGIN_PHONE));
        buttonLogin.click();
        buttonLogin.sendKeys("445556677");
    }

    public void clickButtonEnterEmail() {
        WebElement buttonEnter = driver.findElement(By.xpath(BUTTON_ENTER));
        buttonEnter.click();
    }

    public void clickButtonEnterPhone() {
        WebElement buttonEnter = driver.findElement(By.xpath(INPUT_ENTER_PHONE));
        buttonEnter.click();
    }

}
