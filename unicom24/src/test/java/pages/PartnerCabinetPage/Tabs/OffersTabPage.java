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

    String nameOfTypeProduct = "//div[./div[contains(text(), 'Тип продукта')]]/div/div";
    String nameOfTargetAction = "//div[./div[contains(text(), 'Целевое действие')]]/div/div";
    String nameOfTypeOffer= "//div[./div[contains(text(), 'Тип оффера')]]/div/div[@class='ng-binding']";

    @FindBy(xpath = "//div[contains(text(), 'Офферы')]")
    private WebElement offersTitle;

    @FindBy(xpath = "//input[@placeholder=\"Поиск по названию оффера\"]")
    private WebElement searchInputField;

    @FindBy(xpath = "//span[contains(text(), 'Скрыть фильтры')]")
    private WebElement hideFiltersBtn;

    @FindBy(xpath = "//span[contains(text(), 'Сбросить фильтры')]")
    private WebElement resetFilters;

    @FindBy(xpath = "//div[./div[contains(text(), 'Сортировать')]]/div[2]/div[contains(text(), 'По вознаграждению (больше — меньше)')]")
    private WebElement sortField;

    private final List<WebElement> elements;
    private final List<WebElement> headerPartnerCabinetPage;

    public OffersTabPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, header);
        elements = Arrays.asList(offersTitle, searchInputField, hideFiltersBtn, resetFilters,
                sortField);
        headerPartnerCabinetPage = Arrays.asList(header.headerContainer, header.logo, header.logoTitle, header.balance,
                header.getMoney, header.patentialMoney, header.moneyOfAllTime, header.getMoneyForAllTime,
                header.logOutBtn, header.ringBtn, header.statisticLink, header.offersLink, header.landingsLink,
                header.productsLink, header.postBacksLink, header.helpLink, header.settingsLink,
                header.staticticImg, header.statisticTitle);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
        allElementsAreVisible(headerPartnerCabinetPage);
        Assert.assertTrue(driver.findElements(By.cssSelector(".ui-offers-card-row-inner")).size() > 0);
    }

    public void checkCountFilters(){
        Assert.assertEquals(7, driver.findElements(By.xpath(nameOfTypeProduct)).size()); // 7 если будет 7 фильтров, на момент написания кода их 5
        Assert.assertEquals(4, driver.findElements(By.xpath(nameOfTargetAction)).size());
        Assert.assertEquals(2, driver.findElements(By.xpath(nameOfTypeOffer)).size());
    }

    public void filterOfTypeClick(String nameFilter){
        String nameOfFilter = String.format(nameOfTypeProduct+"[contains(text(), %s)]", nameFilter);
        driver.findElement(By.xpath(nameOfFilter)).click();
    }

    public void filterOfTargetActionClick(String nameFilter){
        String nameOfFilter = String.format(nameOfTargetAction+"[contains(text(), %s)]", nameFilter);
        driver.findElement(By.xpath(nameOfFilter)).click();
    }

    public void filterOfOfferClick(String nameFilter){
        String nameOfFilter = String.format(nameOfTypeOffer+"//div[contains(text(), %s)]", nameFilter);
        driver.findElement(By.xpath(nameOfFilter)).click();
    }
}
