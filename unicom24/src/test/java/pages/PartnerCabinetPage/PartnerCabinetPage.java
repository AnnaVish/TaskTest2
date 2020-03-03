package pages.PartnerCabinetPage;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;
import pages.PartnerCabinetPage.Tabs.*;

import java.util.Arrays;
import java.util.List;

public class PartnerCabinetPage extends Base {

    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();
    private final SettingsTabPage settingsTabPage = new SettingsTabPage();
    private final ReferenceTabPage referenceTabPage = new ReferenceTabPage();
    private final PostbackTabPage postbackTabPage = new PostbackTabPage();
    private final ProductsTabPage productsTabPage = new ProductsTabPage();
    private final LandingsTabPage landingsTabPage = new LandingsTabPage();
    private final OffersTabPage offersTabPage = new OffersTabPage();
    private final StatisticTabPage statisticTabPage = new StatisticTabPage();

    /*
     * Верхний блок
     */
    @FindBy(xpath = "//div[contains(@class, 'ui-app-main-header')][./div[contains(text(), 'Статистика')]]")
    private WebElement statisticTitle;

    @FindBy(xpath = "//div[contains(@class, 'ui-statistics-questionnaires-left')]/div[contains(text(), 'Анкеты')]")
    private WebElement anketyTitle;

    @FindBy(xpath = "//div[./span[contains(text(), 'от')]]/div/input")
    private WebElement anketyDateFrom;

    @FindBy(xpath = "//div[./span[contains(text(), 'до')]]/div/input")
    private WebElement anketyDateTo;

    @FindBy(xpath = "//div[contains(text(), 'Кол-во сконвертившихся анкет')]")
    private WebElement countOfAnket;

    @FindBy(xpath = "//div[contains(text(), 'Средняя доходность анкеты')]")
    private WebElement middleSaldo;
    /*
    * Статистика окончена
     */

    @FindBy(css = ".ui-cabinet-stat-blocks-left")
    private WebElement leftBlock;

    @FindBy(xpath = "//div[contains(text(), 'Входящие')]")
    private WebElement inputTitle;

    @FindBy(css = ".ui-cabinet-stat-blocks-right ")
    private WebElement rightBlock;

    @FindBy(xpath = "//div[contains(text(), 'Конверсия за текущий месяц')]")
    private WebElement currentYearTitle;

    @FindBy(xpath = "//span[contains(text(), 'Доход')]")
    private WebElement incomeTab;

    @FindBy(xpath = "//span[contains(text(), 'Заявки')]")
    private WebElement applicationsTab;

    @FindBy(xpath = "//div[contains(text(), 'Рекомендуемые офферы')]")
    private WebElement recomendOffer;

    @FindBy(xpath = "//a[@href=\"/partners/office/offers\"][contains(text(), 'Все офферы')]")
    private WebElement allOffersLink;

    @FindBy(css = ".ui-offers-card-row-inner")
    private WebElement offer;

    @FindBy(xpath = "//div[contains(text(), 'Рекомендуемые лендинги')]")
    private WebElement recomendLandings;

    @FindBy(xpath = "//a[@href=\"/partners/office/landings\"][contains(text(), 'Все лендинги')]")
    private WebElement allLandingsLink;

    @FindBy(css = ".ui-landings-container-item")
    private WebElement landing;

    @FindBy(xpath = "//div[contains(text(), 'Подключение') and contains(@class, 'ui-cabinet-offer-tab')]")
    private WebElement connectLanding;

    @FindBy(xpath = "//div[contains(text(), 'Описание') and contains(@class, 'ui-cabinet-offer-tab')]")
    private WebElement landingDescriptionTab;

    @FindBy(xpath = "//div[contains(text(), 'Настройка') and contains(@class, 'ui-cabinet-offer-tab')]")
    private WebElement landingSettingsTab;

    @FindBy(xpath = "//button[contains(text(), 'Привязать')]")
    private WebElement connectLandingTab;

    private final List<WebElement>elements;

    public PartnerCabinetPage(){
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(statisticTitle, anketyTitle, anketyDateFrom, anketyDateTo, countOfAnket, middleSaldo,
                leftBlock, inputTitle, rightBlock, currentYearTitle, incomeTab, applicationsTab, recomendOffer,
                allOffersLink, offer, recomendLandings, allLandingsLink, landing, connectLanding, landingDescriptionTab,
                landingSettingsTab, connectLandingTab);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(header.getHeaderPartnerCabinetPage());
        allElementsAreVisible(elements);
    }

    public void logOutBtnClick() {
        waitForVisibility(header.logOutBtn);
        header.logOutBtn.click();
    }

    public void giveMoneyModalClick(){
        waitForVisibility(header.getMoney);
        header.getMoney.click();
    }

    public void tabClick(String tabName){
        String xPath = String.format("//div[@class=\"ui-app-header__nav-navigation\"]/a[contains(text(), '%s')]", tabName);
        WebElement element = driver.findElement(By.xpath(xPath));
        waitForVisibility(element);
        element.click();

    }

    public void tabIsDisplayed(String tabName){
        switch (tabName){
            case ("Настройки"):
                settingsTabPage.pageIsDisplayed();
                break;
            case ("Справка"):
                referenceTabPage.pageIsDisplayed();
                break;
            case ("Постбек"):
                postbackTabPage.pageIsDisplayed();
                break;
            case ("Продукты"):
                productsTabPage.pageIsDisplayed();
                break;
            case ("Лендинги"):
                landingsTabPage.pageIsDisplayed();
                break;
            case ("Офферы"):
                offersTabPage.pageIsDisplayed();
                offersTabPage.checkCountFilters();
                break;
            case ("Статистика"):
                statisticTabPage.pageIsDisplayed();
                break;
        }
    }
}
