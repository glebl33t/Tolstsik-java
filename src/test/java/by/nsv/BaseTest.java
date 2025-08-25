package by.nsv;

import by.nsv.pages.HomePage;
import by.nsv.webdriver.WebDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void openSiteAndCloseBannerAndCloseCookie() {
        HomePage homePage = new HomePage();
        homePage.openSite();
        homePage.closeBanner();
        homePage.closeCookie();
    }

    @AfterEach
    public void tearDown() {
        WebDriver.quit();
    }
}
