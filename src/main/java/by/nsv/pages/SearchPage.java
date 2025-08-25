package by.nsv.pages;

import by.nsv.webdriver.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchPage {
    private final String INPUT_SEARCH = "//input[@id='title-search-input_fixed']";
    private final String BUTTON_SEARCH = "//div[@class='col-md-4 search_wrap']//button[@id='subserch']";
    private final String ITEM_TITLE = " //div[@class='item-title']//span[@itemprop='name']";
    private final String NOT_FOUND_TITLE = "//div[@class='middle']";
    private org.openqa.selenium.WebDriver driver;


    public SearchPage() {
        driver = WebDriver.getDriver();
    }

    public void sendKeysSearch(String search) {
        WebDriver.sandKeysToElement(INPUT_SEARCH, search);
    }

    public void startSearch() {
        WebDriver.clickElement(BUTTON_SEARCH);
    }

    public String getSearchResultFirstItemTitleText() {
        return WebDriver.getTextFromElement(ITEM_TITLE);
    }

    public List<String> getSearchResultItemsTitleText() {
        List<WebElement> listOfWebElements = Collections.singletonList(WebDriver.findElement(ITEM_TITLE));
        List<String> listOfSearchItems = new ArrayList<>();

        for (WebElement element : listOfWebElements) {
            listOfSearchItems.add(element.getText().toLowerCase());
        }
        return listOfSearchItems;
    }

    public String getNotFoundTitle() {
        return WebDriver.getTextFromElement(NOT_FOUND_TITLE);
    }
}
