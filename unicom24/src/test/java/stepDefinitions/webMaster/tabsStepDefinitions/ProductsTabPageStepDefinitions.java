package stepDefinitions.webMaster.tabsStepDefinitions;

import cucumber.api.java.ru.Тогда;
import pages.PartnerCabinetPage.Tabs.ProductsTabPage;

public class ProductsTabPageStepDefinitions {

    private final ProductsTabPage productsTabPage = new ProductsTabPage();

    @Тогда("^отображается страница Продукты$")
    public void productsPageIsDisplayed() {
        productsTabPage.pageIsDisplayed();
    }
}
