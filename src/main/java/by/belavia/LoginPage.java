package by.belavia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private final String URL = "https://belavia.by";
    private final String LINK_ACCOUNT = "//a[@id='ffp-account']";
    private final String TITLE_ACCOUNT_FORM = "//div[@class='title-2IBhr']";
    private final String TEXT_ACCOUNT_FORM = "//div[@class='text-3uUxD']";
    private WebDriver driver;

    public LoginPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void clickLinkAccount() {
        WebElement linkAccount = driver.findElement(By.xpath(LINK_ACCOUNT));
        linkAccount.click();
    }

    public String getTitleAccountFormText() {
        WebElement titleAccountForm = driver.findElement(By.xpath(TITLE_ACCOUNT_FORM));
        return titleAccountForm.getText();
    }

    public String getTextAccountFormText() {
        WebElement textAccountFrom = driver.findElement(By.xpath(TEXT_ACCOUNT_FORM));
        return textAccountFrom.getText();
    }

    public void openSite(){
        driver.get(URL);
    }
}
