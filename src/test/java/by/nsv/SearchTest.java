package by.nsv;

import by.nsv.pages.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {

    @Test
    @DisplayName("Поиск конкретного товара")
    public void searchSpecificProduct() {
        SearchPage searchPage = new SearchPage();
        String searchText = "Мотоцикл Benda LFC 700 (серый)";

        searchPage.sendKeysSearch(searchText);
        searchPage.startSearch();
        searchPage.getSearchResultFirstItemTitleText();

        Assertions.assertEquals(searchText, searchPage.getSearchResultFirstItemTitleText());
    }

    @Test
    @DisplayName("Поиск по слову мотоцикл")
    public void searchAllProductsByName() {
        SearchPage searchPage = new SearchPage();
        String searchText = "мотоцикл";

        searchPage.sendKeysSearch(searchText);
        searchPage.startSearch();
        searchPage.getSearchResultItemsTitleText();

        for (String elementTitle : searchPage.getSearchResultItemsTitleText()) {
            Assertions.assertTrue(elementTitle.contains(searchText), "Не содержит: " + elementTitle);
        }
    }

    @Test
    @DisplayName("Проверка, если ничего не найдено")
    public void searchReturnsNoResults() {
        SearchPage searchPage = new SearchPage();
        String searchText = "lclclclclcl";

        searchPage.sendKeysSearch(searchText);
        searchPage.startSearch();
        searchPage.getNotFoundTitle();

        Assertions.assertEquals(" \nСожалеем, но ничего не найдено.", searchPage.getNotFoundTitle());
    }
}
