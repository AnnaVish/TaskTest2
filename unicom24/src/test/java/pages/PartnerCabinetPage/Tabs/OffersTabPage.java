package pages.PartnerCabinetPage.Tabs;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;

import java.util.Arrays;
import java.util.List;

public class OffersTabPage extends Base {

    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

    @FindBy(xpath = "//div[contains(text(), 'Офферы')]")
    private WebElement offersTitle;

    @FindBy(xpath = "//input[@placeholder=\"Поиск по названию оффера\"]")
    private WebElement searchInputField;

    @FindBy(xpath = "//span[contains(text(), 'Скрыть фильтры')]")
    private WebElement hideFiltersBtn;

    @FindBy(xpath = "//span[contains(text(), 'Сбросить фильтры')]")
    private WebElement resetFilters;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип оффера')]]/div/div[contains(text(), 'API')]")
    private WebElement apiFilterBtn;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип оффера')]]/div/div[contains(text(), 'Реферальные ссылки')]")
    private WebElement refFilterBtn;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип продукта')]]/div/div[contains(text(), 'Автокредиты')]")
    private WebElement autoFilterBtn;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип продукта')]]/div/div[contains(text(), 'Кредиты')]")
    private WebElement creditFilterBtn;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип продукта')]]/div/div[contains(text(), 'Кредитные карты')]")
    private WebElement creditCardFilterBtn;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип продукта')]]/div/div[contains(text(), 'Ипотека')]")
    private WebElement ipotekaFilterBtn;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип продукта')]]/div/div[contains(text(), 'Микрозаймы')]")
    private WebElement microcreditsFilterBtn;

    @FindBy(xpath = "//div[./div[contains(text(), 'Целевое действие')]]/div/div[contains(text(), 'Заявка')]")
    private WebElement applicationFilterBtn;

    @FindBy(xpath = "//div[./div[contains(text(), 'Целевое действие')]]/div/div[contains(text(), 'Подтвержденная заявка')]")
    private WebElement confirmApplicationFilterBtn;

    @FindBy(xpath = "//div[./div[contains(text(), 'Целевое действие')]]/div/div[contains(text(), 'Выдача')]")
    private WebElement extraditionFilterBtn;

    @FindBy(xpath = "//div[./div[contains(text(), 'Целевое действие')]]/div/div[contains(text(), 'Одобрение')]")
    private WebElement confirmationFilterBtn;

    @FindBy(xpath = "//div[./div[contains(text(), 'Сортировать')]]/div[2]/div[contains(text(), 'По вознаграждению (больше — меньше)')]")
    private WebElement sortField;

    private final List<WebElement> elements;
    private final List<WebElement> headerPartnerCabinetPage;

    public OffersTabPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, header);
        elements = Arrays.asList(offersTitle, searchInputField, hideFiltersBtn, resetFilters, apiFilterBtn, refFilterBtn,
                autoFilterBtn, creditFilterBtn, creditCardFilterBtn, ipotekaFilterBtn, microcreditsFilterBtn,
                applicationFilterBtn, confirmApplicationFilterBtn, extraditionFilterBtn, confirmationFilterBtn, sortField);
        headerPartnerCabinetPage = Arrays.asList(header.headerContainer, header.logo, header.logoTitle, header.balance,
                header.getMoney, header.patentialMoney, header.moneyOfAllTime, header.getMoneyForAllTime,
                header.logOutBtn, header.ringBtn, header.statisticLinck, header.offersLink, header.lendingsLink,
                header.productsLink, header.postBacksLick, header.helpLink, header.settingsLink,
                header.staticticImg, header.statisticTitle);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
        allElementsAreVisible(headerPartnerCabinetPage);
        Assert.assertTrue(driver.findElements(By.cssSelector(".ui-offers-card-row-inner")).size() > 5);
    }
}
