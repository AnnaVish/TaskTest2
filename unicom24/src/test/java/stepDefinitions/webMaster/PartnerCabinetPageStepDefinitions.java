package stepDefinitions.webMaster;

import TestContext.TestContext;
import base.Base;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.То;
import cucumber.api.java.ru.Тогда;
import cucumber.api.java.ru.И;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;
import pages.PartnerCabinetPage.PartnerCabinetPage;
import pages.PartnerCabinetPage.Tabs.PostbackTabPage;
import pages.PartnerCabinetPage.modalPages.GiveMoney;

public class PartnerCabinetPageStepDefinitions extends Base {

    private final PartnerCabinetPage partnerCabinetPage = new PartnerCabinetPage();
    private final PostbackTabPage postbackTabPage = new PostbackTabPage();
    private final HeaderPartnerCabinetPage headerPartnerCabinetPage = new HeaderPartnerCabinetPage();
    private final GiveMoney giveMoneyModal = new GiveMoney();

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

    @Когда("^вебмастер кликает на Вывести деньги$")
    public void webMasterWithdrawMoneyClick(){
        partnerCabinetPage.giveMoneyModalClick();
    }

    @Тогда("^отображается модальное окно вывода денег$")
    public void webMasterGiveMoneyModalPageIsDisplayed(){
        giveMoneyModal.modalPageIsDisplayed();
    }

    @И("^вебмастер увеличивает сумму вывода в модальном окне$")
    public void webMasterGiveMoneyModalPagePlusClick(){
        giveMoneyModal.modalPagePlusBTNClick();
    }
    @Когда("^вебмастер кликает далее в модальном окне$")
    public void webMasterGiveMoneyModalPageNextStepClick(){
        giveMoneyModal.modalPageNextStepBTNClick();
    }

    @Тогда("^отображается вторая часть модального окна$")
    public void webMasterGiveMoneyModalPageNextStepIsDisplayed(){
        giveMoneyModal.modalPageNextStepIsDisplayed();
    }
    @И("^вебмастер выбирает расчетный способ вывода в модальном окне$")
    public void webMasterGiveMoneyModalPageFirstMethodClick(){
        giveMoneyModal.modalPageFirstMethodBTNClick();
    }
    @Когда("^вебмастер кликает вывести деньги в модальном окне$")
    public void webMasterGiveMoneyModalPageGiveClick(){
        giveMoneyModal.modalPageGiveMoneyBTNClick();
    }

    @Тогда("^отображается оповещение об успешном выводе денег в модальном окне$")
    public void webMasterGiveMoneyModalPageSuccessfulIsDisplayed(){
        giveMoneyModal.checkAlert();
        if (TestContext.messageBlockToGiveMoney == 0)
        giveMoneyModal.modalPageSuccessfulTextIsDisplayed();
    }

    @И("^вебмастер закрывает модальное окно вывода денег$")
    public void webMasterGiveMoneyModalPageCloseClick(){
        if (TestContext.messageBlockToGiveMoney == 0)
        giveMoneyModal.modalPageClose();
    }
}
