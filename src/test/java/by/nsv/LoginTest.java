package by.nsv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testHeaderText() {
        LoginPage loginPage = new LoginPage(driver);

        Assertions.assertEquals("Личный кабинет", loginPage.getTextHeaderFormTitle());
    }

    @Test
    public void loginTestWithFullArgs() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysUserLogin("admin123456");
        loginPage.sendKeysUserPassword("qwerty123456");
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Неверный логин или пароль", loginPage.getTextErrorAuth());
    }

    @Test
    public void loginTestWithLoginAndEmptyPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysUserLogin("admin123456");
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Заполните это поле", loginPage.getTextErrorPassword());
    }

    @Test
    public void loginTestWithEmptyLoginAndPasswordMoreSixSymbols() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysUserPassword("qwerty123456");
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Заполните это поле", loginPage.getTextErrorLogin());
    }

    @Test
    public void loginTestWithFullLoginAndPasswordLessSixSymbols() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysUserLogin("admin123456");
        loginPage.sendKeysUserPassword(Passwords.generateRandomPassword(5));
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Минимум 6 символов", loginPage.getTextErrorPassword());
    }
}
