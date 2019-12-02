package stepDefinitions.webMaster;

import base.Base;
import cucumber.api.java.ru.То;
import cucumber.api.java.ru.Тогда;
import pages.PartnerCabinetPage.PartnerCabinetPage;
import pages.PartnerCabinetPage.Tabs.PostbackTabPage;

public class PartnerCabinetPageStepDefinitions extends Base {

    private final PartnerCabinetPage partnerCabinetPage = new PartnerCabinetPage();
    private final PostbackTabPage postbackTabPage = new PostbackTabPage();

    @Тогда("^отображается личный кабинет Вебмастера$")
    public void cabinetOfWebMasterIsDisplayed(){
        partnerCabinetPage.pageIsDisplayed();
    }

    @То("^вебмастер кликает на вкладку Постбек$")
    public void webMasterClickPostbackTab(){
        partnerCabinetPage.postBackClick();
    }

    @Тогда("^вебмастер кликает на вкладку Справка$")
    public void webMasterClickReferenceTab() {
        partnerCabinetPage.referenceClick();
    }

    @Тогда("^вебмастер кликает на вкладку Продукты$")
    public void webMasterClickProductsTab() {
        partnerCabinetPage.productsClick();
    }

    @То("^отображается страница Постбек$")
    public void postbakPageIsDisplayed(){
        postbackTabPage.pageIsDisplayed();
    }

    @Тогда("^вебмастер кликает на вкладку Лендинги$")
    public void webMasterLandingsClick() {
        partnerCabinetPage.landingsClick();
    }

    @Тогда("^вебмастер кликает на вкладку Офферы$")
    public void webMasterOffersClick() {
        partnerCabinetPage.offersClick();
    }

    @Тогда("^вебмастер кликает на вкладку Статистика$")
    public void webMasterStatisticClick() {
        partnerCabinetPage.statisticClick();
    }

    @То("^вебмастер подготавливает параметры для постбека$")
    public void prepareParameters(){
            postbackTabPage.fillFields();
    }

    @То("на странице постбека отображаются данные из параметров")
    public void checkPostBackData() {
        postbackTabPage.checkIsPostbackDone();
    }

    @Тогда("^вебмастер кликает на вкладку Настройки$")
    public void webMasterSettingsClick() {
        partnerCabinetPage.settingsClick();
    }

    @Тогда("^вебмастер разлогинивается$")
    public void webMasterLogOut() {
        partnerCabinetPage.logOutBtnClick();
    }
}
