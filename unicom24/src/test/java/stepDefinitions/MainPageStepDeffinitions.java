package stepDefinitions;

import base.TestBase;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pages.*;


public class MainPageStepDeffinitions extends TestBase {

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



    @Когда("^пользователь заполняет кликает на Кредитные отчеты$")
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

    @Когда("^пользователь кликает получить FICIO$")
    public void getFICIO() {
        mainPage.onMainPage();
        mainPage.ficioGetBtnClicks();
    }

    @Тогда("^пользователь кликает Посмотреть все банки и МФО$")
    public void seeAllBanksClicks(){
        mainPage.seeAllBanksClicks();
    }
}
