package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pages.*;
import pages.verticals.common.CommonMethodsForAllVerticals;


public class MainPageStepDeffinitions extends Base {

    private final MainPage mainPage = new MainPage();
    private final CommonMethodsForAllVerticals commonMethodsForAllVerticals = new CommonMethodsForAllVerticals();

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

    /*
     *Методы хэдэра
     */

    @Когда("^пользователь нажимает на Логотип$")
    public void userLogoLinkClick() {
        mainPage.logoLinkClick();
    }

    @Когда("^пользователь нажимает Частным клиентам в Хэдэре$")
    public void userPrivateCustomersLinkClick() {
        mainPage.privateCustomersLinkClick();
    }

    @Когда("^пользователь нажимает Малому и среднему бизнесу в Хэдэре$")
    public void userForBusinessLinkClick() {
        mainPage.forBusinessLinkClick();
    }

    @Когда("^пользователь нажимает Сервисы в Хэдэре$")
    public void userServicesLinkClick() {
        mainPage.servicesLinkClick();
    }

    @Когда("^пользователь нажимает Прочее в Хэдэре$")
    public void userOthersLinkClick() {
        mainPage.othersLinkClick();
    }

    @Когда("^пользователь нажимает Кредиты в Хэдэре$")
    public void userCreditsHeaderLinkClick() {
        mainPage.creditsHeaderLinkClick();
    }

    @Когда("^пользователь нажимает Кредитные карты в Хэдэре$")
    public void userCreditCardsHeaderLinkClick() {
        mainPage.creditCardsHeaderLinkClick();
    }

    @Когда("^пользователь нажимает Автокредиты в Хэдэре$")
    public void userAutoCreditsHeaderLinkClick() {
        mainPage.autoCreditsHeaderLinkClick();
    }

    @Когда("^пользователь нажимает Ипотека в Хэдэре$")
    public void userIpotekaHeaderLinkClick() {
        mainPage.ipotekaHeaderLinkClick();
    }

    @Когда("^пользователь нажимает Микрокредиты в Хэдэре$")
    public void userMicroCreditsHeaderLinkClick() {
        mainPage.microCreditsHeaderLinkClick();
    }

    @Когда("^пользователь нажимает Рефинансирование в Хэдэре$")
    public void userRefinanceHeaderLinkClick() {
        mainPage.refinanceHeaderLinkClick();
    }

    @Когда("^в хэдэре видно - банки и МФО$")
    public void userSeeBankiAndMFOInHeader() {
        mainPage.bankiAndMfoAreDisplayedInHeader();
    }
    /*
     *Методы хэдэра окончены
     */


    @Когда("^пользователь кликает на вертикаль с именем \"([^\"]*)\"$")
    public void creditCardsClicks(String nameOfVertical) {
        mainPage.verticalsClick(nameOfVertical);
    }


    @Когда("^пользователь кликает получить \"([^\"]*)\"$")
    public void getFinancialHealth(String nameOfRating) {
        mainPage.ratingReportClick(nameOfRating);
    }

    @И("^пользователь нажимает на кнопку войти$")
    public void logIn() {
        mainPage.entranceInAccountBtnClick();
    }

    @Тогда("^в шапке сайта видно Ваш баланс и Ваш тейтинг$")
    public void checkBalanceAndRating() {
        mainPage.checkBalanceAndRating();
    }

    /*
     *методы футэра
     */

    @Тогда("^пользователь кликает Стать партнером в футере$")
    public void userClickBecomePartnerInFooter() {
        mainPage.becomePartnerInFooterClick();
        switchToTheSecondTab();
    }

    @Тогда("^пользователь кликает Стать агентом в футере$")
    public void userClickBecomeAgentInFooter() {
        mainPage.becomeAgentInFooterClick();
        switchToTheSecondTab();
    }

    @Тогда("^пользователь кликает \"([^\"]*)\" в нижней части футера$")
    public void userInFooterProductsClick(String nameProducts) {
        if (nameProducts.equals("Карта сайта")) {
            mainPage.clickDownProductsInFooter(nameProducts);
        } else {
            mainPage.clickDownProductsInFooter(nameProducts);
            switchToTheSecondTab();
        }

    }

    @Тогда("^пользователь кликает \"([^\"]*)\" в верхней части футера$")
    public void userClickTopLinksInFooter(String nameLinks) {
        mainPage.clickTopLinkInFooter(nameLinks);
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
    public void userRefreshPage() {
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

    @И("^пользователь заходит в свой профиль$")
    public void userGoToMyProfile() {
        commonMethodsForAllVerticals.userEnterToProFilePage();
    }
}
