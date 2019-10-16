package pages;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class MainPage extends Base {

    private Header headerPage = new Header();
    private Footer footerPage = new Footer();

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

    @FindBy(xpath = "//div[contains(text(), 'Кредитные отчеты')]")
    private WebElement creditReports;

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

    private final List<WebElement> elements;
    private final List<WebElement> header;
    private final List<WebElement> bannerArray;
    private final List<WebElement> footer;

    public MainPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        elements = Arrays.asList(credits, creditCards, autoCredits,
                ipoteka, microCredits, creditReports, financialHealthRatingGetBtn, creditReportsGetBtn,
                rfz, fullCreditHistory);
        bannerArray = Arrays.asList(banner, bannerText1, bannerText2, bannerText3, bannerText4, bannerText5,
                bannerImage);
        header = Arrays.asList(headerPage.logoLink, headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink,
                headerPage.creditsHeaderLink, headerPage.creditCardsHeaderLink, headerPage.autoCreditsHeaderLink,
                headerPage.ipotekaHeaderLink, headerPage.refinanceHeaderLink);
        footer = Arrays.asList(footerPage.footerContainer, footerPage.footerLeftSide, footerPage.appleAndGoogle,
                footerPage.footerSeoText, footerPage.becomePartnerLink, footerPage.becomeAgentLink, footerPage.cabinetOfBroker,
                footerPage.cabinetOfBank, footerPage.cabinetOfWebmaster, footerPage.oldCabinetOfBroker,
                footerPage.copyright, footerPage.copyrightText, footerPage.becomeAgentDown, footerPage.becomePartnerDown,
                footerPage.personalData, footerPage.mail, footerPage.map, footerPage.adress);
    }

    public void onMainPage() {
        driver.get(PagesUrls.mainPage);
    }

    private Boolean countOfImageVertical(){
        return driver.findElements(By.cssSelector(".ui-card-offers-wrap a")).size() == 6;
    }

    public void mainPageIsDisplayed() {
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footer);
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
        waitForVisibility(headerPage.bankiHeaderLink);
        waitForVisibility(headerPage.mfoHeaderLink);
    }
    /*
     *клики в хэдэре окончены
     */


    /*
    *клики по вертикалям
     */
    public void creditClick() {
        credits.click();
    }

    public void creditCardsClicks() {
        creditCards.click();
    }

    public void autoCreditsClicks() {
        autoCredits.click();
    }

    public void ipotekaClicks() {
        ipoteka.click();
    }

    public void microCreditsClicks() {
        microCredits.click();
    }

    public void creditReportscClicks() {
        creditReports.click();
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
        waitForVisibility(ratingField);
        waitForVisibility(yourBalanceField);
    }

    public void becomePartnerInFooterClick(){
        footerPage.becomePartnerLink.click();
    }

    public void becomeAgentInFooterClick(){
        footerPage.becomeAgentLink.click();
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
        footerPage.cabinetOfBroker.click();
        switchToTheSecondTab();
    }

    public void oldCabinetOfBrokerClick(){
        footerPage.oldCabinetOfBroker.click();
        switchToTheSecondTab();
    }

    public void scrollToFooter(){
        scrollTo(footerPage.map);
    }

    public void headerBecomeSmall(){
        waitForInvisibility(headerPage.privateCustomersLink);
        waitForInvisibility(headerPage.forBusinessLink);
        waitForInvisibility(headerPage.othersLink);
        waitForVisibility(headerPage.creditsHeaderLink);
        waitForVisibility(headerPage.creditCardsHeaderLink);
        waitForVisibility(headerPage.autoCreditsHeaderLink);
        waitForVisibility(headerPage.ipotekaHeaderLink);
        waitForVisibility(headerPage.microCreditsHeaderLink);
        waitForVisibility(headerPage.refinanceHeaderLink);
    }
}
