package pages;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesUrls.PagesUrls;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainPage extends Base {

    /*
    *Хэдэр
     */
    @FindBy(css = "a.ui-app-header-logo-wrapper ")
    private WebElement logoLink;

    @FindBy(xpath = "//span[contains(text(), 'Частным клиентам')]")
    private WebElement privateCustomersLink;

    @FindBy(xpath = "//span[contains(text(), 'Малому и среднему бизнесу')]")
    private WebElement forBusinessLink;

    @FindBy(xpath = "//span[contains(text(), 'Сервисы')]")
    private WebElement servicesLink;

    @FindBy(xpath = "//span[contains(text(), 'Прочее')]")
    private WebElement othersLink;

    @FindBy(xpath = "//span[contains(text(), 'Кредиты')]")
    private WebElement creditsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Кредитные карты')]")
    private WebElement creditCardsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Автокредиты')]")
    private WebElement autoCreditsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Ипотека')]")
    private WebElement ipotekaHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Микрозаймы')]")
    private WebElement microCreditsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Рефинансирование')]")
    private WebElement refinanceHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Банки')]")
    private WebElement bankiHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'МФО')]")
    private WebElement mfoHeaderLink;

    /*
    *Хэдэр окончен
     */

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

    @FindBy(css = ".card-useful-services-rfz .ui-btn ")
    private WebElement financialHealthRatingGetBtn;

    @FindBy(css = ".card-useful-services-fch .ui-btn")
    private WebElement creditReportsGetBtn;

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

    public final List<WebElement> elements;
    public final List<WebElement> header;
    public final List<WebElement> bannerArray;

    public MainPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(credits, creditCards, autoCredits,
                ipoteka, microCredits, creditReports, financialHealthRatingGetBtn, creditReportsGetBtn);
        header = Arrays.asList(logoLink, privateCustomersLink, forBusinessLink, othersLink, servicesLink,
                creditsHeaderLink, creditCardsHeaderLink, autoCreditsHeaderLink, ipotekaHeaderLink, refinanceHeaderLink);
        bannerArray = Arrays.asList(banner, bannerText1, bannerText2, bannerText3, bannerText4, bannerText5,
                bannerImage);
    }

    public void onMainPage() {
        driver.get(PagesUrls.mainPage);
        Assert.assertTrue(countOfImageVertical());
    }

    private Boolean countOfImageVertical(){
        return driver.findElements(By.cssSelector(".ui-card-offers-wrap a")).size() == 6;
    }

    public void mainPageIsDisplayed() {
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        //allElementsAreVisible(bannerArray);
    }

    /*
     *клики в хэдэре
     */
    public void logoLinkClick(){
        logoLink.click();
    }

    public void privateCustomersLinkClick(){
        privateCustomersLink.click();
    }

    public void forBusinessLinkClick(){
        forBusinessLink.click();
    }

    public void othersLinkClick(){
        othersLink.click();
    }

    public void servicesLinkClick(){
        servicesLink.click();
    }

    public void creditsHeaderLinkClick(){
        creditsHeaderLink.click();
    }

    public void creditCardsHeaderLinkClick(){
        creditCardsHeaderLink.click();
    }

    public void autoCreditsHeaderLinkClick(){
        autoCreditsHeaderLink.click();
    }

    public void ipotekaHeaderLinkClick(){
        ipotekaHeaderLink.click();
    }

    public void microCreditsHeaderLinkClick(){
        microCreditsHeaderLink.click();
    }

    public void refinanceHeaderLinkClick(){
        refinanceHeaderLink.click();
    }

    public void bankiAndMfoAreDisplayedInHeader(){
        waitForVisibility(bankiHeaderLink);
        waitForVisibility(mfoHeaderLink);
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
}
