package pages;

import api.AdminBalance;
import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pagesUrls.PagesUrls;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MainPage extends Base {

    private Header headerPage = new Header();
    private Footer footerPage = new Footer();

    @FindBy(xpath = "//div[@class='offers-compare-block']/div[contains(text(), 'Сравнение')]")
    public WebElement compareBtn;

    @FindBy(xpath = "//div[contains(text(), 'Кредиты')]")
    private WebElement credits;

    @FindBy(xpath = "//div[contains(text(), 'Кредитные карты')]")
    private WebElement creditCards;

    @FindBy(xpath = "//div[contains(text(), 'Автокредиты')]")
    private WebElement autoCredits;

    @FindBy(xpath = "//div[contains(text(), 'Ипотека')]")
    private WebElement ipoteka;

    @FindBy(xpath = "//div[contains(text(), 'Микрозаймы')]")
    private WebElement microCredits;

    @FindBy(className = "ui-card-banks-block__more-text")
    private WebElement seeAllBanks;

    //@FindBy(xpath = "//div[contains(text(), 'Кредитные отчеты')]")
    //private WebElement creditReports;

    @FindBy(xpath = "//div[contains(text(), 'Защита от мошенников')]")
    private WebElement protectAndOther;
    /*
    *Отчеты
     */
    @FindBy(css = ".card-useful-services-rfz .ui-btn ")
    private WebElement financialHealthRatingGetBtn;

    @FindBy(css = ".card-useful-services-fch .ui-btn")
    private WebElement creditReportsGetBtn;

    @FindBy(css = ".card-useful-services-wrapper .card-useful-services-rfz")
    private WebElement rfz;

    @FindBy(css = ".card-useful-services-wrapper .card-useful-services-fch")
    private WebElement fullCreditHistory;

    /*
    *Отчеты окончены
     */

    @FindBy(className = "ui-credit-with-us-wrapper")
    private WebElement banner;

    @FindBy(xpath = "//div[contains(text(), 'Вы сможете сравнить банковские предложения и выбрать лучшие')]")
    private WebElement bannerText1;

    @FindBy(xpath = "//div[contains(text(), 'Наш сервис абсолютно бесплатен для Вас (никаких скрытых платежей')]")
    private WebElement bannerText2;

    @FindBy(xpath = "//div[contains(text(), 'Вы можете отправить заявку сразу в несколько банков')]")
    private WebElement bannerText3;

    @FindBy(xpath = "//div[contains(text(), 'Вы получите предварительное решение банков на основе кредитного рейтинга за 3 минуты!')]")
    private WebElement bannerText4;

    @FindBy(xpath = "//div[contains(text(), 'Ваши данные в безопасности. Мы не передаем их сторонним организациям. Вы сами выбираете в какие банки отправить заявку.')]")
    private WebElement bannerText5;

    @FindBy(className = "ui-card-credit-with-us-right__girl-image")
    private WebElement bannerImage;

    @FindBy(className = "ui-credit-news-wrapper")
    private WebElement newsBlock;

    @FindBy(css = ".header-site-right .ui-btn")
    private WebElement entranceInAccountBtn;

    @FindBy(xpath = "//div[contains(text(), 'Ваш баланс')]")
    private WebElement yourBalanceField;

    @FindBy(xpath = "//div[contains(text(), 'Ваш рейтинг')]")
    private WebElement ratingField;

    @FindBy(xpath = "//div[contains(text(), 'Рейтинг бесплатно')]")
    private WebElement ratingFreeLink;

    //Количетсов денег на счету в хедере
    @FindBy(css = ".ui-dropdown-rating-data-balance-value__value.font__base-small")
    private WebElement moneyValue;

    /*
     *Панель активации
     */
    @FindBy(css = "section.activate-panel")
    private WebElement activatePanelContainer;

    @FindBy(xpath = "//div[contains(text(), 'Чтобы пользоваться всеми функциями сервиса, активируйте личный кабинет')]")
    private WebElement activateText;

    @FindBy(xpath = "//button[./span[contains(text(), 'Активировать кабинет')]]")
    private WebElement activateBtn;
    /*
     *Панель активации окончена
     */

    private final List<WebElement> elements;
    private List<WebElement> activatePanel;

    public MainPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        elements = Arrays.asList(credits, creditCards, autoCredits,
                ipoteka, microCredits, protectAndOther, financialHealthRatingGetBtn, creditReportsGetBtn,
                rfz, fullCreditHistory);
        headerPage.getMainHeader();
        footerPage.getFooter();
    }

    public void onMainPage() {
        driver.get(PagesUrls.mainPage);
    }

    private Boolean countOfImageVertical(){
        return driver.findElements(By.cssSelector(".ui-card-offers-wrap a")).size() == 6;
    }

    public void mainPageIsDisplayed() {
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(footerPage.getFooter());
        Assert.assertTrue(countOfImageVertical());
        //allElementsAreVisible(bannerArray);
    }

    /*
     *клики в хэдэре
     */
    public void logoLinkClick(){
        headerPage.logoLink.click();
    }

    public void privateCustomersLinkClick(){
        headerPage.privateCustomersLink.click();
    }

    public void forBusinessLinkClick(){
        headerPage.forBusinessLink.click();
    }

    public void othersLinkClick(){
        headerPage.othersLink.click();
    }

    public void servicesLinkClick(){
        headerPage.servicesLink.click();
    }

    public void creditsHeaderLinkClick(){
        headerPage.creditsHeaderLink.click();
    }

    public void creditCardsHeaderLinkClick(){
        headerPage.creditCardsHeaderLink.click();
    }

    public void autoCreditsHeaderLinkClick(){
        headerPage.autoCreditsHeaderLink.click();
    }

    public void ipotekaHeaderLinkClick(){
        headerPage.ipotekaHeaderLink.click();
    }

    public void microCreditsHeaderLinkClick(){
        headerPage.microCreditsHeaderLink.click();
    }

    public void refinanceHeaderLinkClick(){
        headerPage.refinanceHeaderLink.click();
    }

    public void bankiAndMfoAreDisplayedInHeader(){
        allElementsAreVisible(headerPage.othersHeaderLinks());
    }
    /*
     *клики в хэдэре окончены
     */


    /*
    *клики по вертикалям
     */
    public void creditClick() {
        waitForVisibility(credits);
        credits.click();
    }

    public void creditCardsClicks() {
        waitForVisibility(creditCards);
        creditCards.click();
    }

    public void autoCreditsClicks() {
        waitForVisibility(autoCredits);
        autoCredits.click();
    }

    public void ipotekaClicks() {
        waitForVisibility(ipoteka);
        ipoteka.click();
    }

    public void microCreditsClicks() {
        waitForVisibility(microCredits);
        microCredits.click();
    }

    /*
    public void creditReportscClicks() {
        waitForVisibility(creditReports);
        creditReports.click();
    } */

    public void protectClick(){
        waitForVisibility(protectAndOther);
        protectAndOther.click();
    }

    /*
     *клики по вертикалям окончены
     */


    public void financialHealthRatingGetBtnClick() {
        waitForVisibility(financialHealthRatingGetBtn);
        financialHealthRatingGetBtn.click();
    }

    public void creditReportsGetBtnClicks() {
        waitForVisibility(creditReportsGetBtn);
        creditReportsGetBtn.click();
    }

//    public void ficioGetBtnClicks() {
//        ficioGetBtn.click();
//    }

    public void seeAllBanksClicks() {
        seeAllBanks.click();
    }

    public void entranceInAccountBtnClick(){
        waitForVisibility(entranceInAccountBtn);
        entranceInAccountBtn.click();
    }

    public void checkBalanceAndRating(){
        try {
            waitForVisibility(ratingField);
        } catch (Exception E) {
            waitForVisibility(ratingFreeLink);
        }
        waitForVisibility(yourBalanceField);

        String valueMoney = moneyValue.getText();
        valueMoney = valueMoney.replaceAll("\\s", "");
        if(Integer.parseInt(valueMoney) < 5000) {
            try {
                AdminBalance.runClass();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void becomePartnerInFooterClick(){
        waitForVisibility(footerPage.becomePartnerLink);
        waitToBeClickable(footerPage.becomePartnerLink);
        footerPage.becomePartnerLink.click();
    }

    public void becomeAgentInFooterClick(){
        scrollTo(footerPage.becomeAgentLink);
        waitToBeClickable(footerPage.becomeAgentLink);
        footerPage.becomeAgentLink.click();
    }

    public void aboutCompanyFooterClick() {
        footerPage.aboutCompany.click();
    }

    public void cabinetOfWebmasterClick(){
        footerPage.cabinetOfWebmaster.click();
        switchToTheSecondTab();
    }

    public void cabinetOfBankClick(){
        footerPage.cabinetOfBank.click();
        switchToTheSecondTab();
    }

    public void cabinetOfBrokerClick(){
        waitForVisibility(footerPage.cabinetOfBroker);
        footerPage.cabinetOfBroker.click();
        switchToTheSecondTab();
    }

    public void oldCabinetOfBrokerClick(){
        footerPage.oldCabinetOfBroker.click();
        switchToTheSecondTab();
    }

    public void scrollToFooter(){
        scrollTo(footerPage.siteMap);
    }

    public void headerBecomeSmall(){
        //waitForInvisibility(headerPage.privateCustomersLink); //- на период 10.01.2020 хедер теперь не так уменьшается
        //waitForInvisibility(headerPage.forBusinessLink); //- на период 10.01.2020 хедер теперь не так уменьшается
        waitForInvisibility(headerPage.othersLink);
        waitForVisibility(headerPage.creditsHeaderLink);
        waitForVisibility(headerPage.creditCardsHeaderLink);
        waitForVisibility(headerPage.autoCreditsHeaderLink);
        waitForVisibility(headerPage.ipotekaHeaderLink);
        waitForVisibility(headerPage.microCreditsHeaderLink);
        waitForVisibility(headerPage.refinanceHeaderLink);
    }

    public void activatePanelIsDisplayed() {
        activatePanel = Arrays.asList(activatePanelContainer, activateText, activateBtn);
        allElementsAreVisible(activatePanel);
    }

    public void activateBtnClick() {
        activateBtn.click();
    }

    public void siteMapClick() {
        waitForVisibility(footerPage.siteMap);
        scrollToFooter();
        waitForVisibility(footerPage.siteMap);
        footerPage.siteMap.click();
    }

    public void comparePageClick() { compareBtn.click(); }
}
