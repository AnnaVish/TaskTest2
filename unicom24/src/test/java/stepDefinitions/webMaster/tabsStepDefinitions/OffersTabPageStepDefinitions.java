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

    @Когда("^вебмастер кликает по фильтру типа товара \"([^\"]*)\"$")
    public void offersTabPageFiltersOfTypeClick(String nameFilter){
        offersTabPage.filterOfTypeClick(nameFilter);
    }

    @Когда("^вебмастер кликает по фильтру целевое действие \"([^\"]*)\"$")
    public void offersTabPageFiltersOfTargetActionClick(String nameFilter){
        offersTabPage.filterOfTargetActionClick(nameFilter);
    }

    @Когда("^вебмастер кликает по фильтру тип оффера \"([^\"]*)\"$")
    public void offersTabPageFiltersOfOfferClick(String nameFilter){
        offersTabPage.filterOfOfferClick(nameFilter);
    }

    @Тогда("^отображается страница Офферы с активным фильтром по типу оффера \"([^\"]*)\"$")
    public void checkFiltersOfOffersType (String nameFilter){
        offersTabPage.checkFilterOfOffersType(nameFilter);
    }
}
