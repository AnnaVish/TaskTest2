package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class WebMasterOfferFullPage extends Base {

    @FindBy(css = ".ui-offers-card-row-wrapper")
    private WebElement offerWrapper; //основной блок оффера

    @FindBy(css = ".ui-offers-detail-container-wrapper")
    private WebElement offerContainerWrapper; //содержание вкладки

    @FindBy(css = ".ui-offer-base-header-breadcrumbs")
    private WebElement offerFullPageBreadcrumbs; // хлебные крошки

    @FindBy(xpath = "//div[@class='ui-offers-detail-container-wrapper']/div[@class='ui-offers-detail-description-wrapper']")
    private  WebElement offerContentProfile;

    @FindBy(xpath = "//div[@class='ui-offers-detail-container-wrapper']//div[@class='ng-binding ng-scope']")
    private WebElement offerContentAboutCompany;

    @FindBy(css = ".ui-offers-detail-connection-content")
    private WebElement offerContentConnectREF;

    @FindBy(css = ".ui-offers-detail-connection-wrapper")
    private WebElement offerContentConnectAPI;

    @FindBy(css = ".ui-offers-detail-tariffs-content")
    private WebElement offerContentTariff;

    @FindBy(css =".ui-offers-detail-traffic-content")
    private WebElement offerContentTraffic;

    @FindBy(css = ".ui-offers-detail-regions-content")
    private WebElement offerContentRegions;

    @FindBy(css = ".ui-offers-detail-feedback-content")
    private WebElement offerContentFeedback;

    @FindBys(
        @FindBy(xpath = "//div[@class='ui-offers-card-row-absolute-type']//div[contains(text(), 'REF')]")
    )
    private List <WebElement> offerOfREF;

    @FindBys(
            @FindBy(xpath = "//div[@class='ui-offers-card-row-inner-footer']//span")
    )
    private List <WebElement> tabsOnOfferFullPage;

    private final List<WebElement> elements;

    public WebMasterOfferFullPage(){
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(offerWrapper,offerContainerWrapper, offerFullPageBreadcrumbs);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
    }

    public void tabOnOffersFullPageClick(String tabName){ // клик по вкладке с названием из переменной
        String xPath = String.format(tabsOnOfferFullPage+"[contains(text(), '%s')]", tabName);
        WebElement element = driver.findElement(By.xpath(xPath));
        element.click();
    }

    public void tabContentIsDisplayed(String tabName){ //ожидание отображение вкладки с названием из переменной
        switch (tabName){
            case ("Об анкете"):
                waitForVisibility(offerContentProfile);
                break;
            case("О компании"):
                waitForVisibility(offerContentAboutCompany);
                break;
            case("Подключение"):
            if (offerOfREF.size()>0) {
                waitForVisibility(offerContentConnectREF);
            }
             else{
                waitForVisibility(offerContentConnectAPI);
            }
                break;
            case("Тарифы и изменения"):
                waitForVisibility(offerContentTariff);
                break;
            case("Виды трафика"):
                waitForVisibility(offerContentTraffic);
                break;
            case("Регионы"):
                waitForVisibility(offerContentRegions);
                break;
            case("Отзывы"):
                waitForVisibility(offerContentFeedback);
                break;
            default:
                waitForVisibility(offerContainerWrapper);
                break;
        }
    }

    public void checkingTabsOnFullOfferPage(){ // проверка вкладок
        String tabName;
        int tabCount = tabsOnOfferFullPage.size();
        for ( int i = 1; i<tabCount; i++) {
                tabName = tabsOnOfferFullPage.get(i).getText();
                tabsOnOfferFullPage.get(i).click();
                tabContentIsDisplayed(tabName);
        }
    }

}