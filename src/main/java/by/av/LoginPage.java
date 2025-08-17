package by.av;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private final String URL = "https://av.by/";
    private final String LOGOUT = "//a[@href='/logout']";
    private final String AUTH_PHONE = "//input[@id='authPhone']";
    private final String PASSWORD_PHONE = "//input[@id='passwordPhone']";
    private final String ENTER = "//button[@class='button button--action']";
    private final String ERROR_MESSAGE = "//div[@class='error-message']";
    private WebDriver driver;

    public LoginPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void openSite() {
        driver.get(URL);
    }

    public void clickLogOut() {
        WebElement logOut = driver.findElement(By.xpath(LOGOUT));
        logOut.click();
    }

    public void clickAuthPhone() {
        WebElement authPhone = driver.findElement(By.xpath(AUTH_PHONE));
        authPhone.click();
        authPhone.sendKeys("445556677");
    }

    public void clickPasswordPhone() {
        WebElement passwordPhone = driver.findElement(By.xpath(PASSWORD_PHONE));
        passwordPhone.click();
        passwordPhone.sendKeys("qwerty12345");
    }

    public String getTextErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath(ERROR_MESSAGE));
        return errorMessage.getText();
    }

    public void clickEnter() {
        WebElement enter = driver.findElement(By.xpath(ENTER));
        enter.click();
    }
}
