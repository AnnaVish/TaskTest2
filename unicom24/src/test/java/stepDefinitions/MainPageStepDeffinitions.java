package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pages.*;


public class MainPageStepDeffinitions extends Base {

    private final MainPage mainPage = new MainPage();

    @Дано("^пользователь нахоидится на главной странице$")
    public void onMainPage() {
        mainPage.onMainPage();
    }

    @Тогда("^пользователь закрывает вкладку$")
    public void userCloseTab() {
        driver.close();
        switchToTheFirstTab();
    }

    @Тогда("^все элементы главной страницы видны$")
    public void mainPageIsDisplayed() {
        mainPage.mainPageIsDisplayed();
    }

    @Когда("^пользователь кликает на Кредиты$")
    public void creditsClicks(){
        mainPage.creditClick();
    }

    /*
    *Методы хэдэра
     */

    @Когда("^пользователь нажимает на Логотип$")
    public void userLogoLinkClick(){
        mainPage.logoLinkClick();
    }

    @Когда("^пользователь нажимает Частным клиентам в Хэдэре$")
    public void userPrivateCustomersLinkClick(){
        mainPage.privateCustomersLinkClick();
    }

    @Когда("^пользователь нажимает Малому и среднему бизнесу в Хэдэре$")
    public void userForBusinessLinkClick(){
        mainPage.forBusinessLinkClick();
    }

    @Когда("^пользователь нажимает Сервисы в Хэдэре$")
    public void userServicesLinkClick(){
        mainPage.servicesLinkClick();
    }

    @Когда("^пользователь нажимает Прочее в Хэдэре$")
    public void userOthersLinkClick(){
        mainPage.othersLinkClick();
    }

    @Когда("^пользователь нажимает Кредиты в Хэдэре$")
    public void userCreditsHeaderLinkClick(){
        mainPage.creditsHeaderLinkClick();
    }

    @Когда("^пользователь нажимает Кредитные карты в Хэдэре$")
    public void userCreditCardsHeaderLinkClick(){
        mainPage.creditCardsHeaderLinkClick();
    }

    @Когда("^пользователь нажимает Автокредиты в Хэдэре$")
    public void userAutoCreditsHeaderLinkClick(){
        mainPage.autoCreditsHeaderLinkClick();
    }

    @Когда("^пользователь нажимает Ипотека в Хэдэре$")
    public void userIpotekaHeaderLinkClick(){
        mainPage.ipotekaHeaderLinkClick();
    }

    @Когда("^пользователь нажимает Микрокредиты в Хэдэре$")
    public void userMicroCreditsHeaderLinkClick(){
        mainPage.microCreditsHeaderLinkClick();
    }

    @Когда("^пользователь нажимает Рефинансирование в Хэдэре$")
    public void userRefinanceHeaderLinkClick(){
        mainPage.refinanceHeaderLinkClick();
    }

    @Когда("^в хэдэре видно - банки и МФО$")
    public void userSeeBankiAndMFOInHeader(){
        mainPage.bankiAndMfoAreDisplayedInHeader();
    }
    /*
     *Методы хэдэра окончены
     */


    @Когда("^пользователь кликает на Кредитные карты$")
    public void creditCardsClicks() {
        mainPage.onMainPage();
        mainPage.creditCardsClicks();
    }


    @Когда("^пользователь кликает на Автокредиты$")
    public void autoCreditsClicks() {
        mainPage.onMainPage();
        mainPage.autoCreditsClicks();
    }



    @Когда("^пользователь кликает на Ипотека$")
    public void ipotekaClicks() {
        mainPage.onMainPage();
        mainPage.ipotekaClicks();
    }


    @Когда("^пользователь кликает на Микрозаймы$")
    public void microCreditsClick() {
        mainPage.onMainPage();
        mainPage.microCreditsClicks();
    }



    @Когда("^пользователь кликает на Кредитные отчеты$")
    public void creditsReportsClicks() {
        mainPage.onMainPage();
        mainPage.creditReportscClicks();
    }


    @Когда("^пользователь кликает получить рейтинг финансового здоровья$")
    public void getFinancialHealth() {
        mainPage.financialHealthRatingGetBtnClick();
    }


    @Когда("^пользователь кликает получить Кредитный отчет$")
    public void getCrefitReport() {
        mainPage.onMainPage();
        mainPage.creditReportsGetBtnClicks();
    }

//    @Когда("^пользователь кликает получить FICIO$")
//    public void getFICIO() {
//        mainPage.onMainPage();
//        mainPage.ficioGetBtnClicks();

//    }

    @Тогда("^пользователь кликает Посмотреть все банки и МФО$")
    public void seeAllBanksClicks(){
        mainPage.seeAllBanksClicks();
    }

    @И("^пользователь нажимает на кнопку войти$")
    public void logIn(){
        mainPage.entranceInAccountBtnClick();
    }

    @Тогда("^в шапке сайта видно Ваш баланс и Ваш тейтинг$")
    public void checkBalanceAndRating(){
        mainPage.checkBalanceAndRating();
    }

    /*
    *методы футэра
     */

    @Тогда("^пользователь кликает Стать партнером в футере$")
    public void userClickBecomePartnerInFooter(){
        mainPage.becomePartnerInFooterClick();
    }

    @Тогда("^пользователь кликает Стать агентом в футере$")
    public void userClickBecomeAgentInFooter(){
        mainPage.becomeAgentInFooterClick();
    }

    @Тогда("^пользователь кликает Кабинет вебмастера в футере$")
    public void userClickCabinetOfWebMaster(){
        mainPage.cabinetOfWebmasterClick();
    }

    @Тогда("^пользователь кликает Личный кабинет Банков и Рекламодателей в футере$")
    public void userClickCabinetOfBankClick(){
        mainPage.cabinetOfBankClick();
    }

    @Тогда("^пользователь кликает Личный кабинет Брокера и Агента в футере$")
    public void userClickAuthPageOfBroker(){
        mainPage.cabinetOfBrokerClick();
    }

    @Тогда("^пользователь кликает Старый кабинет брокера и агента в футере$")
    public void userClickOldCabinetOfBroker() {
        mainPage.oldCabinetOfBrokerClick();
    }

    @Тогда("^пользователь кликает О компании в футере$")
    public void userClickAboutCompanyInFooter() {
        mainPage.aboutCompanyFooterClick();
    }

    @Тогда("^пользователь кликает Карта сайта в футере$")
    public void userClickSiteMapInFooter() {
        mainPage.siteMapClick();
    }

    @Тогда("пользователь делает скролл в футэру")
    public void userScrollToFooter() {
        mainPage.scrollToFooter();
    }

    @Тогда("хэдэр уменьшается")
    public void headerBecomeSmall() {
        mainPage.headerBecomeSmall();
    }
    /*
     *методы футэра окончены
     */

    @Тогда("^пользователь обновляет страницу$")
    public void userRefreshPage(){
        Base.refreshPage();
    }

    @Тогда("^отображается панель активации$")
    public void activationPanelIsDisplayed() {
        mainPage.activatePanelIsDisplayed();
    }

    @Тогда("^пользователь нажимает Активировать кабинет$")
    public void activateBtnClick() {
        mainPage.activateBtnClick();
    }

    @Когда("^пользователь кликает Сравнение$")
    public void comparePageClick() {
        mainPage.comparePageClick();
    }
}
