package stepDefinitions.webMaster.tabsStepDefinitions;

import cucumber.api.java.ru.Тогда;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.И;
import pages.PartnerCabinetPage.Tabs.OffersTabPage;
import pages.WebMasterOfferFullPage;

public class OffersTabPageStepDefinitions {

    private final OffersTabPage offersTabPage = new OffersTabPage();
    private final WebMasterOfferFullPage webMasterOfferFullPage= new WebMasterOfferFullPage();

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

    @Когда("^вебмастер кликает по не универсальному офферу$")
    public void offerFromListClick(){
        offersTabPage.offerFullPageClick();
    }

    @Тогда("^отображается детальная страница оффера у вебмастера$")
    public void offerFullPageIsDisplayed(){
        webMasterOfferFullPage.pageIsDisplayed();
    }

    @Когда("^вебмастер кликает по вкладке \"([^\"]*)\" на детальной странице оффера$")
    public void tabOnOfferFullPageClick(String tabName){
        webMasterOfferFullPage.tabOnOffersFullPageClick(tabName);
    }

    @Тогда("^отображается вкладка \"([^\"]*)\" на детальной странице оффера$")
    public void tabOnOfferFullPageIsDisplayed(String tabName){
        webMasterOfferFullPage.tabContentIsDisplayed(tabName);
    }

    @И("^вебмастер проверяет вкладки на детальной странице оффера$")
    public void checkTabOnOfferFullPage(){
        webMasterOfferFullPage.checkingTabsOnFullOfferPage();
    }
}
