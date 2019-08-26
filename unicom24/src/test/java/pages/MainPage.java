package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class MainPage extends Base {

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

    @FindBy(css = ".ui-card-services-block.ui-card-services-block-big__padding button")
    private WebElement financialHealthRatingGetBtn;

    @FindBy(css = ".ui-card-services-block-middle__pay .ui-btn.font__base.btn-middle-with-border")
    private WebElement creditReportsGetBtn;

    @FindBy(css = ".ui-card-services-block-middle__pay .ui-btn.font__base.btn-middle-white")
    private WebElement ficioGetBtn;

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

    public final List<WebElement> elements;
    public final List<WebElement> bannerArray;

    public MainPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(credits, creditCards, autoCredits,
                ipoteka, microCredits, creditReports, financialHealthRatingGetBtn, creditReportsGetBtn, ficioGetBtn,
                newsBlock);
        bannerArray = Arrays.asList(banner, bannerText1, bannerText2, bannerText3, bannerText4, bannerText5,
                bannerImage);
    }

    public static String mainPage = baseUrl();

    public static String baseUrl(){
        String base = System.getenv("TESTING_HOST");
        return "https://" + base;
    }

    public void onMainPage() {
        System.out.println(mainPage);
        driver.get("https://develop-39.vuaro.ru");
    }

    public void mainPageIsDisplayed() {
        allElementsAreVisible(elements);
        allElementsAreVisible(bannerArray);
    }

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

    public void financialHealthRatingGetBtnClick() {
        financialHealthRatingGetBtn.click();
    }

    public void creditReportsGetBtnClicks() {
        creditReportsGetBtn.click();
    }

    public void ficioGetBtnClicks() {
        ficioGetBtn.click();
    }

    public void seeAllBanksClicks() {
        seeAllBanks.click();
    }
}
