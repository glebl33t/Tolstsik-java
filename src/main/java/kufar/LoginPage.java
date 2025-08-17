package kufar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private final String URL = "https://www.kufar.by/";
    private final String COOKIE = "//div[@class='Politics_styles_buttons__LWXq2']";
    private final String BUTTON_AUTH = "//button [@class='styles_button__oKUgO styles_outline__maWFU styles_size-m__NgAcw']";
    private final String INPUT_LOGIN = "//input[@id='login']";
    private final String INPUT_PASSWORD = "//input[@id='password']";
    private WebDriver driver;

    public LoginPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void clickButtonCookie() {
        WebElement buttonCookie = driver.findElement(By.xpath(COOKIE));
        buttonCookie.click();
    }

    public void clickButtonAuth() {
        WebElement buttonAuth = driver.findElement(By.xpath(BUTTON_AUTH));
        buttonAuth.click();
    }

    public void clickInputLogin() {
        WebElement inputLogin = driver.findElement(By.xpath(INPUT_LOGIN));
        inputLogin.click();
        inputLogin.sendKeys("375444444444");
    }

    public void clickInputPassword() {
        WebElement inputPassword = driver.findElement(By.xpath(INPUT_PASSWORD));
        inputPassword.click();
        inputPassword.sendKeys("qwerty12345");
    }

    public void openSite() {
        driver.get(URL);
    }

    public String getErrorAuthText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(normalize-space(text()), 'Введен неверный пароль')]"))
        );
        return errorElement.getText();
    }

}
