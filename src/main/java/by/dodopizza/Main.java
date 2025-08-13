package by.dodopizza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dodopizza.by");

        String xpath = "//*[@data-testid='header_login']";
        By byXpath = By.xpath(xpath);
        WebElement element = driver.findElement(byXpath);
        element.click();

    }
}
