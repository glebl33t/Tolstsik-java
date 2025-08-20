package by.nsv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final String USER_LOGIN = "//input[@id='USER_LOGIN_POPUP']";
    private final String USER_PASSWORD = "//input[@id='USER_PASSWORD_POPUP']";
    private final String BUTTON_LOGIN = "//button[@name='Login']";
    private final String HEAD_FORM_TITLE = "//div[@class='form_head']//h2";
    private final String ERROR_AUTH = "//div[@class='alert alert-danger']/p";
    private final String ERROR_USER_PASSWROD = "//label[@id='USER_PASSWORD_POPUP-error']";
    private final String ERROR_USER_LOGIN = "//label[@id='USER_LOGIN_POPUP-error']";
    private WebDriver driver;

    LoginPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void sendKeysUserLogin(String login) {
        driver.findElement(By.xpath(USER_LOGIN)).sendKeys(login);
    }

    public void sendKeysUserPassword(String password) {
        driver.findElement(By.xpath(USER_PASSWORD)).sendKeys(password);
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(BUTTON_LOGIN)).click();
    }

    public String getTextHeaderFormTitle() {
        WebElement textHeaderFormTitle = driver.findElement(By.xpath(HEAD_FORM_TITLE));
        return textHeaderFormTitle.getText();
    }

    public String getTextErrorAuth() {
        WebElement textErrorAuth = driver.findElement(By.xpath(ERROR_AUTH));
        return textErrorAuth.getText();
    }

    public String getTextErrorPassword() {
        WebElement textErrorPassword = driver.findElement(By.xpath(ERROR_USER_PASSWROD));
        return textErrorPassword.getText();
    }

    public String getTextErrorLogin() {
        WebElement textErrorLogin = driver.findElement(By.xpath(ERROR_USER_LOGIN));
        return textErrorLogin.getText();
    }
}
