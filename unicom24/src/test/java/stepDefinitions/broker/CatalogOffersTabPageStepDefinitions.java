package stepDefinitions.broker;

import cucumber.api.java.ru.Тогда;
import pages.BrokerCabinet.tabs.CatalogOffersTabPage;

public class CatalogOffersTabPageStepDefinitions {

    private final CatalogOffersTabPage catalogOffersTabPage = new CatalogOffersTabPage();

    @Тогда("^отображается страница каталог офферов$")
    public void catalogOffersPageIsDisplayed() {
        catalogOffersTabPage.pageIsDisplayed();
    }

    @Тогда("^брокер вводит \"([^\"]*)\" в поле ввода поиска$")
    public void brokerFillFieldWithNameOfBank(String nameOfBank) {
        catalogOffersTabPage.searchOffer(nameOfBank);
    }

    @Тогда("^оффер \"([^\"]*)\" отображается в результатах$")
    public void offerIsDisplayed(String nameOfBank) {
        catalogOffersTabPage.isSearchResultIsDisplayed(nameOfBank);
    }
}
