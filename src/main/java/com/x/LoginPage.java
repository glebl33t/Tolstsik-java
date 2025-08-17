package com.x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final String URL = "https://x.com/";
    private final String SING_IN = "//body/div/div/div/div[2]/main/div/div/div[1]/div[1]/div/div[3]/div[4]/a/div/span/span";
    private final String INPUT_LOGIN = "//a[@data-testid='loginButton']]";
    private final String ENTER_LOGIN = "//body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/button[2]/div";
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
}
