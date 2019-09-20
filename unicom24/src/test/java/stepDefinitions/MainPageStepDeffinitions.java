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


    @Когда("^пользователь заполняет кликает на Автокредиты$")
    public void autoCreditsClicks() {
        mainPage.onMainPage();
        mainPage.autoCreditsClicks();
    }



    @Когда("^пользователь заполняет кликает на Ипотека$")
    public void ipotekaClicks() {
        mainPage.onMainPage();
        mainPage.ipotekaClicks();
    }


    @Когда("^пользователь заполняет кликает на Микрозаймы$")
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

    @Тогда("^пользователь кликает Стать партнером в футере$")
    public void userClickBecomePartnerInFooter(){
        mainPage.becomePartnerInFooterClick();
    }

    @Тогда("^пользователь кликает Стать агентом в футере$")
    public void userClickBecomeAgentInFooter(){
        mainPage.becomeAgentInFooterClick();
    }
}
