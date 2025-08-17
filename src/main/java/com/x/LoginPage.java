package com.x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final String URL = "https://x.com/";
    private final String SING_IN = "//a[@data-testid=\"loginButton\"]";
    private final String INPUT_LOGIN = "//input[@autocomplete=\"username\"]";
    private final String ENTER_LOGIN = "//button[@class=\"css-175oi2r r-sdzlij r-1phboty r-rs99b7 r-lrvibr r-ywje51 r-184id4b r-13qz1uu r-2yi16 r-1qi8awa r-3pj75a r-1loqt21 r-o7ynqc r-6416eg r-1ny4l3l\"]";
    private final String ERROR_MESSAGE = "//div[@data-testid=\"toast\"]";
    private WebDriver driver;

    public LoginPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void openSite() {
        driver.get(URL);
    }

    public void clickSignIn() {
        WebElement signIn = driver.findElement(By.xpath(SING_IN));
        signIn.click();
    }

    public void clickInputLogin() {
        WebElement inputLogin = driver.findElement(By.xpath(INPUT_LOGIN));
        inputLogin.click();
        inputLogin.sendKeys("375331234567");
    }

    public void clickEnterLogin() {
        WebElement enterLogin = driver.findElement(By.xpath(ENTER_LOGIN));
        enterLogin.click();
    }

    public String getTextError() {
        WebElement error = driver.findElement(By.xpath(ERROR_MESSAGE));
        return error.getText();
    }
}
