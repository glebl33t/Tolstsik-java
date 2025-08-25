package by.nsv.pages;

import by.nsv.webdriver.WebDriver;

public class HomePage {
    private final String URL = "https://nsv.by/";
    private final String PERSONAL_LINK = "//header//a[@data-name='auth']";
    private final String CLOSE_COOKIE = "//a[@id='paloma_cookie-accept']";
    private final String CLOSE_BANNER = "//div[@class='modal_game_width_close']";
    private final org.openqa.selenium.WebDriver driver;

    public HomePage() {
        driver = WebDriver.getDriver();
    }

    public void openSite() {
        WebDriver.getDriver().get(URL);
    }

    public HomePage closeCookie() {
        WebDriver.clickElement(CLOSE_COOKIE);
        return this;
    }

    public HomePage closeBanner() {
        WebDriver.clickElement(CLOSE_BANNER);
        return this;
    }

    public void clickPersonalLink() {
        try {
            WebDriver.clickElement(PERSONAL_LINK);
        } catch (Exception e) {
            System.out.println("Banner not found");
        }
    }
}
