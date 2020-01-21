package stepDefinitions.webMaster.tabsStepDefinitions;

import cucumber.api.java.ru.Тогда;
import cucumber.api.java.ru.Когда;
import pages.PartnerCabinetPage.Tabs.OffersTabPage;

public class OffersTabPageStepDefinitions {

    private final OffersTabPage offersTabPage = new OffersTabPage();

    @Тогда("^отображается страница Офферы$")
    public void offersTabPageIsDisplayed() {
        offersTabPage.pageIsDisplayed();
        offersTabPage.checkCountFilters();
    }

    @Когда("^пользователь кликает по фильтру типа товара \"([^\"]*)\"$")
    public void offersTabPageFiltersOfTypeClick(String nameFilter){
        offersTabPage.filterOfTypeClick(nameFilter);
    }

    @Когда("^пользователь кликает по фильтру целевое действие \"([^\"]*)\"$")
    public void offersTabPageFiltersOfTargetActionClick(String nameFilter){
        offersTabPage.filterOfTargetActionClick(nameFilter);
    }

    @Когда("^пользователь кликает по фильтру тип оффера \"([^\"]*)\"$")
    public void offersTabPageFiltersOfOfferClick(String nameFilter){
        offersTabPage.filterOfOfferClick(nameFilter);
    }
}
