package stepDefinitions.broker;

import base.Base;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pages.BrokerCabinet.BrokerCabinetPage;

public class BrokerCabinetPageStepDefinitions extends Base {

    private final BrokerCabinetPage brokerCabinetPage = new BrokerCabinetPage();

    @Тогда("^отображается Личный кабинет Брокера$")
    public void cabinetOfBrokerIsDisplayed(){
        brokerCabinetPage.pageIsDisplayed();
    }

    @Тогда("^брокер кликает на каталог офферов$")
    public void brokerClickCatalogOfOffers() {
        brokerCabinetPage.catalogOffersLinkClick();
    }

    @Тогда("^брокер кликает на Мои клиенты$")
    public void brokerClickMyClients() {
        brokerCabinetPage.myClientsClick();
    }

    @Тогда("^брокер наводит мышь на Все услуги$")
    public void brokerMouseOverAllServices() {
        brokerCabinetPage.mouseOverAllServicesLink();
    }

    @Тогда("^отображается меню Все услуги$")
    public void allServicesIsDisplayed() {
        brokerCabinetPage.allServicesMenuIsDisplayed();
    }

    @Тогда("^брокер наводит мышь на Финансовый рейтинг клиента$")
    public void brokerMouseOverFinRatingOfClient() {
        brokerCabinetPage.mouseOverFinancialRating();
    }

    @Тогда("^отображается меню Финансовый рейтинг клиента$")
    public void finRatingSubMenuIsDisplayed() {
        brokerCabinetPage.finRatingSubMenuIsDisplayed();
    }

    @Тогда("^брокер наводит мышь на Авто$")
    public void brokerMouseOverAutoLink() {
        brokerCabinetPage.mouseOverAuto();
    }

    @Тогда("^отображается меню Авто$")
    public void autoSubMenuIsDisplayed() {
        brokerCabinetPage.autoSubMenuIsDisplayed();
    }

    @Тогда("^брокер наводит мышь на Скоринг$")
    public void brokerMouseIverScoringLink() {
        brokerCabinetPage.mouseOverScoring();
    }

    @Тогда("^отображается меню Скоринг$")
    public void scoringSubMenuIsDisplayed() {
        brokerCabinetPage.scoringMenuIsDisplayed();
    }

    @Когда("^брокер кликает на Рейтинг финансового здоровья$")
    public void brokerClicksRFZLink() {
        brokerCabinetPage.rfzSubMenuClick();
    }

    @Когда("^брокер кликает на Кредитный рейтинг$")
    public void brokerClicksCreditRating() {
        brokerCabinetPage.creditRatingSubMenuClick();

    }

    @Когда("^брокер кликает на Кредитный отчет$")
    public void brokerClicksCreditReport() {
        brokerCabinetPage.creditReportSubMenuClick();
    }

    @Когда("^брокер кликает на отчет FICO$")
    public void brokerClicksFicoReport() {
        brokerCabinetPage.ficoReportSubmenuClick();
    }

    @Когда("^брокер кликает на Проверка автомобиля$")
    public void brokerClicksVehicleVerification() {
        brokerCabinetPage.vehicleVerificationSubmenuClick();
    }

    @Когда("^брокер кликает на Скоринг по номеру телефона$")
    public void brokerClicksPhoneNumberScoring() {
        brokerCabinetPage.phoneNumberScoringSubmenuClick();
    }

    @Когда("^брокер кликает на Скоринг по соц.сетям$")
    public void  brokerClicksSocialNetworksScoring() {
        brokerCabinetPage.socialNetworksScoringSubmenuClick();
    }

}
