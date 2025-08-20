package by.nsv;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setup() {
        LoginPage loginPage = new LoginPage(driver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        HomePage homePage = new HomePage(driver);
        homePage.openSite();
        homePage.clickCloseBanner();
        homePage.clickAcceptCookie();
        homePage.clickPersonalLink();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
