package by.nsv;

import by.nsv.pages.HomePage;
import by.nsv.pages.LoginPage;
import by.nsv.utils.Passwords;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testHeaderText() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();

        homePage.openSite();
        homePage.closeBanner()
                .closeCookie()
                .clickPersonalLink();

        Assertions.assertEquals("Личный кабинет", loginPage.getTextHeaderFormTitle());
    }

    @Test
    @DisplayName("Авторизация со всеми параметрами")
    public void loginTestWithFullArgs() {
        HomePage homePage = new HomePage();
        homePage.openSite();
        homePage.closeBanner()
                .closeCookie()
                .clickPersonalLink();

        LoginPage loginPage = new LoginPage();
        loginPage.sendKeysUserLogin("admin123456");
        loginPage.sendKeysUserPassword("qwerty123456");
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Неверный логин или пароль", loginPage.getTextErrorAuth());
    }

    @Test
    @DisplayName("Авторизация с логином и пустым паролем")
    public void loginTestWithLoginAndEmptyPassword() {
        HomePage homePage = new HomePage();
        homePage.openSite();
        homePage.closeBanner()
                .closeCookie()
                .clickPersonalLink();

        LoginPage loginPage = new LoginPage();
        loginPage.sendKeysUserLogin("admin123456");
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Заполните это поле", loginPage.getTextErrorPassword());
    }

    @Test
    @DisplayName("Авторизация без логина и паролем больше 6 символов")
    public void loginTestWithEmptyLoginAndPasswordMoreSixSymbols() {
        HomePage homePage = new HomePage();
        homePage.openSite();
        homePage.closeBanner()
                .closeCookie()
                .clickPersonalLink();

        LoginPage loginPage = new LoginPage();
        loginPage.sendKeysUserPassword("qwerty123456");
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Заполните это поле", loginPage.getTextErrorLogin());
    }

    @Test
    @DisplayName("Авторизация с логином и паролем меньше 6 символов")
    public void loginTestWithFullLoginAndPasswordLessSixSymbols() {
        HomePage homePage = new HomePage();
        homePage.openSite();
        homePage.closeBanner()
                .closeCookie()
                .clickPersonalLink();

        LoginPage loginPage = new LoginPage();
        loginPage.sendKeysUserLogin("admin123456");
        loginPage.sendKeysUserPassword(Passwords.generateRandomPassword(5));
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Минимум 6 символов", loginPage.getTextErrorPassword());
    }
}
