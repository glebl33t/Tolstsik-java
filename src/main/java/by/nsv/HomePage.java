package by.nsv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final String URL = "https://nsv.by/";
    private final String PERSONAL_LINK = "//header//a[@data-name='auth']";
    private final String COOKIE_ACCEPT = "//a[@id='paloma_cookie-accept']";
    private final String CLOSE_BANNER = "//div[@class='modal_game_width_close']";
    private final WebDriver driver;

    HomePage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void openSite() {
        driver.get(URL);
    }

    public void clickAcceptCookie() {
        driver.findElement(By.xpath(COOKIE_ACCEPT)).click();
    }

    public void clickCloseBanner() {
        driver.findElement(By.xpath(CLOSE_BANNER)).click();
    }

    public void clickPersonalLink() {
        try {
            driver.findElement(By.xpath(PERSONAL_LINK)).click();
        } catch (Exception e) {
            System.out.println("Banner not found");
        }
    }
}
