package pages.BrokerCabinet;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BrokerCabinet.footer.FooterBrokerCabinetPage;
import pages.BrokerCabinet.header.HeaderBrokerCabinetPage;

import java.util.Arrays;
import java.util.List;

/*Что такое "extends Base"?*/
public class BrokerRFZPage extends Base {

    private final HeaderBrokerCabinetPage header = new HeaderBrokerCabinetPage();
    private final FooterBrokerCabinetPage footer = new FooterBrokerCabinetPage();

    @FindBy(xpath = "//h1[contains(text(), 'Рейтинг финансового здоровья')]")
    private WebElement rfzMainTitle;

    @FindBy (xpath = "//div[contains(text(), 'Получите мгновенный отчет по потенциальному заемщику')]")
    private WebElement commentOfFrzMainTitle;

    @FindBy (css = ".ui-financial-health-header_price-round")
    private WebElement rfzPrice;

    @FindBy (css = ".ui-financial-health-header_preview-img")
    private WebElement rfzPreview;

    @FindBy (xpath = "//a[contains(text(), 'Скачать пример отчета')]")
    private WebElement rfzDownloadReport;

    @FindBy (xpath = "//div[contains(text(), 'Заявка на рейтинг финансового здоровья')]")
    private WebElement rfzFormTitle;

    @FindBy (xpath = "//div[./div/span[contains(text(), 'Фамилия')]]/div/input")
    private WebElement rfzLastNameInput;

    @FindBy (xpath = "//div[./div/span[contains(text(), 'Имя')]]/div/input")
    private WebElement rfzNameInput;

    @FindBy (xpath = "//div[./div/span[contains(text(), 'Отчество')]]/div/input")
    private WebElement rfzЗatronymicNameInput;

    @FindBy (xpath = "//div[./div/span[contains(text(), 'Дата рождения')]]/div/input")
    private WebElement rfzDataInput;

    @FindBy (xpath = "//div[./div/span[contains(text(), 'Номер и серия паспорта')]]/div/input")
    private WebElement rfzPasswordInput;

    @FindBy (xpath = "//div[./div/span[contains(text(), 'Дата выдачи паспорта')]]/div/input")
    private WebElement rfzPasswordDataOfIssue;

    @FindBy (xpath = "//div[contains(text(), 'Я проверяю кредитную историю другого человека, от которого получил согласие на обработку персональных данных установленного образца')]")
    private WebElement rfzAuthorizedAgentAnswer;

    @FindBy (xpath = "//div[contains(text(), 'Я проверяю свою кредитную историю и даю согласие на обработку своих персональных данных')]")
    private WebElement rfzUserAnswer;

    @FindBy (xpath = "//div[contains(text(), 'Для проведения проверки требуется предоставить подписанный бланк запроса (для этого нужно скачать бланк, заполнить его, подписать и загрузить скан).')]")
    private  WebElement rfzImportantNote;

    @FindBy (xpath = "//a[contains(text(), 'Скачать бланк')]")
    private  WebElement rfzDownloadForm;

    @FindBy (xpath = "//p[contains(text(), 'Оплата')]")
    private  WebElement rfzPpaymentTitle;

    @FindBy (xpath = "//label[./div/div/div[contains(text(), 'Счет Юником24')]]")
    private  WebElement rfzUserWalletDot;

    @FindBy (xpath = "//div[contains(text(), 'Счет Юником24')]")
    private WebElement rfzUserWalletTitle;

    @FindBy (xpath = "//label[./div/div/div[contains (text(), 'Робокасса')]]")
    private  WebElement rfzRobokassaDot;

    @FindBy (xpath = "//div[contains (text(), 'Робокасса')]")
    private WebElement rfzRobokassaTitle;

    @FindBy (xpath = "//label[./div/div/div[contains (text(), 'Payture')]]")
    private WebElement rfzPaytureDot;

    @FindBy (xpath = "//div[contains (text(), 'Payture')]")
    private WebElement rfzPaytureTitle;

    @FindBy (xpath = "//button[./span[contains (text(), 'Получить отчет')]]")
    private WebElement rfzGetReportButton;

    @FindBy (css = "div .ui-form-requests_history_credit_report")
    private WebElement rfzQueryHistory;

    @FindBy (xpath = "//div[contains (text(), 'История запросов на рейтинг финансового здоровья')]")
    private  WebElement rfzQueryHistoryTitle;

    @FindBy (xpath = "//div[./div/div[contains (text(), 'Период')]]")
    private WebElement rfzPeriodTab;

    @FindBy (css = ".ui-form-requests-history-credit_report__filter-search-form-input")
    private WebElement rfzSearchInput;

    @FindBy (xpath = "//button[./span[contains(text(), 'Поиск')]]")
    private WebElement rfzSearchButton;

    @FindBy (xpath = "//span[contains(text(), 'Поиск')]")
    private WebElement rfzSearchButtonTitle;

    private final List<WebElement>elements;



    public BrokerRFZPage() {
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, footer);
        elements = Arrays.asList(rfzMainTitle, commentOfFrzMainTitle, rfzPrice, rfzPreview, rfzDownloadReport, rfzFormTitle,
                rfzLastNameInput, rfzNameInput, rfzЗatronymicNameInput, rfzDataInput, rfzPasswordInput, rfzPasswordDataOfIssue,
                rfzAuthorizedAgentAnswer, rfzUserAnswer, rfzImportantNote, rfzDownloadForm, rfzPpaymentTitle,
                rfzUserWalletDot, rfzUserWalletTitle, rfzRobokassaDot, rfzRobokassaTitle, rfzPaytureDot,
                rfzPaytureTitle, rfzGetReportButton, rfzQueryHistory, rfzQueryHistoryTitle, rfzPeriodTab, rfzSearchInput,
                rfzSearchButton, rfzSearchButtonTitle);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
        allElementsAreVisible(header.getHeader());
        allElementsAreVisible(footer.getFooter());
    }

}
