package pizzatempo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void testLogin1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.pizzatempo.by/");

        String inputLoginXpath = "//*[@name='astroauth_login']";
        By inputLoginByXpath = By.xpath(inputLoginXpath);
        WebElement inputLoginWebElement = driver.findElement(inputLoginByXpath);
        inputLoginWebElement.sendKeys("John Black");

        WebElement inputPasswordXpath = driver.findElement(By.xpath("//*[@name='astroauth_pass']"));
        inputPasswordXpath.sendKeys("qwerty123456");

        WebElement buttonSubmitXpath = driver.findElement(By.xpath("//*[@name='astroauth_submit']"));
        buttonSubmitXpath.click();

        WebElement massageXpath = driver.findElement(By.xpath("//*[@class='popupContent']"));

        String actual = massageXpath.getText();
        System.out.println(actual);
        Assertions.assertEquals("Неверно указано имя пользователя или пароль.\n" +
                "Ok", actual);
        driver.quit();
    }
}
