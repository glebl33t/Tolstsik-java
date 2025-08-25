package by.nsv.pages;

import by.nsv.webdriver.WebDriver;

public class LoginPage {
    private final String USER_LOGIN = "//input[@id='USER_LOGIN_POPUP']";
    private final String USER_PASSWORD = "//input[@id='USER_PASSWORD_POPUP']";
    private final String BUTTON_LOGIN = "//button[@name='Login']";
    private final String HEAD_FORM_TITLE = "//div[@class='form_head']//h2";
    private final String ERROR_AUTH = "//div[@class='alert alert-danger']/p";
    private final String ERROR_USER_PASSWROD = "//label[@id='USER_PASSWORD_POPUP-error']";
    private final String ERROR_USER_LOGIN = "//label[@id='USER_LOGIN_POPUP-error']";
    private org.openqa.selenium.WebDriver driver;

    public LoginPage() {
        driver = WebDriver.getDriver();
    }

    public void sendKeysUserLogin(String login) {
        WebDriver.sandKeysToElement(USER_LOGIN, login);
    }

    public void sendKeysUserPassword(String password) {
        WebDriver.sandKeysToElement(USER_PASSWORD, password);
    }

    public void clickButtonLogin() {
        WebDriver.clickElement(BUTTON_LOGIN);
    }

    public String getTextHeaderFormTitle() {
        return WebDriver.getTextFromElement(HEAD_FORM_TITLE);
    }

    public String getTextErrorAuth() {
        return WebDriver.getTextFromElement(ERROR_AUTH);
    }

    public String getTextErrorPassword() {
        return WebDriver.getTextFromElement(ERROR_USER_PASSWROD);
    }

    public String getTextErrorLogin() {
        return WebDriver.getTextFromElement(ERROR_USER_LOGIN);
    }
}
