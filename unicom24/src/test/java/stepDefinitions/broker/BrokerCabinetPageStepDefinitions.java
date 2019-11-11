package stepDefinitions.broker;

import base.Base;
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
}
