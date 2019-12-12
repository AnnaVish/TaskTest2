package stepDefinitions.broker;

import base.Base;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pages.BrokerCabinet.BrokerCabinetPage;

public class BrokerCabinetPageStepDefinitions extends Base {

    private final BrokerCabinetPage brokerCabinetPage = new BrokerCabinetPage();

    @Тогда("^брокер находится в Кабинете брокера$")
    public void onBrokerCabinetPage() {
        brokerCabinetPage.onPage();
    }

    @Тогда("^отображается Личный кабинет Брокера$")
    public void cabinetOfBrokerIsDisplayed() {
        brokerCabinetPage.pageIsDisplayed();
    }

    @Тогда("^брокер кликает на \"([^\"]*)\" в хэдэре$")
    public void brokerClickTabMenuHeader(String nameOfTab) {
        brokerCabinetPage.tabMenuHeaderClick(nameOfTab);
    }

    @Тогда("^брокер наводит мышь на \"([^\"]*)\" в хэдэре$")
    public void brokerMouseOverTabMenuHeader(String nameOfTab) {
        brokerCabinetPage.tabMenuHeaderMouseOver(nameOfTab);
    }

    @Тогда("^отображается меню Все услуги$")
    public void allServicesIsDisplayed() {
        brokerCabinetPage.allServicesMenuIsDisplayed();
    }

    @Тогда("^отображается меню Финансовый рейтинг клиента$")
    public void finRatingSubMenuIsDisplayed() {
        brokerCabinetPage.finRatingSubMenuIsDisplayed();
    }

    @Тогда("^отображается меню Авто$")
    public void autoSubMenuIsDisplayed() {
        brokerCabinetPage.autoSubMenuIsDisplayed();
    }

    @Тогда("^отображается меню Скоринг$")
    public void scoringSubMenuIsDisplayed() {
        brokerCabinetPage.scoringMenuIsDisplayed();
    }

    @Тогда("^брокер нажимает на кнопку Пополнить счет$")
    public void brokerGiveMoneyClick() {
        brokerCabinetPage.giveMoneyBtnClick();
    }

    @Тогда("^отображается панель Пополнить счет$")
    public void addMoneyPanelIsDisplayed() {
        brokerCabinetPage.giveMoneyPanelIsDisplayed();
    }

    @Тогда("^панель Пополнить счет не отображается$")
    public void addMoneyPanelIsNotDisplayed() {
        brokerCabinetPage.giveMoneyPanelIsNotDisplayed();
    }

    @Тогда("^брокер разлогинивается$")
    public void brokerLogOut() {
        brokerCabinetPage.dropMenuClick();
        brokerCabinetPage.logOutClick();
    }

    @Тогда("^брокер заходит в профиль$")
    public void brokerGoToProfile() {
        brokerCabinetPage.dropMenuClick();
        brokerCabinetPage.profileClick();
    }

    @Тогда("^брокер кликает на \"([^\"]*)\" в подменю$")
    public void brokerClickSubmenuElement(String nameOfItem) {
        brokerCabinetPage.submenuItemClick(nameOfItem);
    }
}
