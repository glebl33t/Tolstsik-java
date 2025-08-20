package by.nsv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testHeaderText() {
        HomePage homePage = new HomePage(driver);
        homePage.openSite();
        homePage.clickCloseBanner();
        homePage.clickAcceptCookie();
        homePage.clickPersonalLink();

        LoginPage loginPage = new LoginPage(driver);

        Assertions.assertEquals("Личный кабинет", loginPage.getTextHeaderFormTitle());
    }

    @Test
    public void loginTestWithFullArgs() {
        HomePage homePage = new HomePage(driver);
        homePage.openSite();
        homePage.clickCloseBanner();
        homePage.clickAcceptCookie();
        homePage.clickPersonalLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysUserLogin("admin123456");
        loginPage.sendKeysUserPassword("qwerty123456");
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Неверный логин или пароль", loginPage.getTextErrorAuth());
    }

    @Test
    public void loginTestWithLoginAndEmptyPassword() {
        HomePage homePage = new HomePage(driver);
        homePage.openSite();
        homePage.clickCloseBanner();
        homePage.clickAcceptCookie();
        homePage.clickPersonalLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysUserLogin("admin123456");
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Заполните это поле", loginPage.getTextErrorPassword());
    }

    @Test
    public void loginTestWithEmptyLoginAndPasswordMoreSixSymbols() {
        HomePage homePage = new HomePage(driver);
        homePage.openSite();
        homePage.clickCloseBanner();
        homePage.clickAcceptCookie();
        homePage.clickPersonalLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysUserPassword("qwerty123456");
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Заполните это поле", loginPage.getTextErrorLogin());
    }

    @Test
    public void loginTestWithFullLoginAndPasswordLessSixSymbols() {
        HomePage homePage = new HomePage(driver);
        homePage.openSite();
        homePage.clickCloseBanner();
        homePage.clickAcceptCookie();
        homePage.clickPersonalLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysUserLogin("admin123456");
        loginPage.sendKeysUserPassword("qwe");
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Минимум 6 символов", loginPage.getTextErrorPassword());
    }
}
