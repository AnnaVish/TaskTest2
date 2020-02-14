package pages.PartnerCabinetPage.Tabs;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;

import java.util.Arrays;
import java.util.List;

public class OffersTabPage extends Base {

    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

    String nameOfTypeProductTitle = "//div[./div[contains(text(), 'Тип продукта')]]";
    String nameOfTargetActionTitle = "//div[./div[contains(text(), 'Целевое действие')]]";
    String nameOfTypeOfferTitle= "//div[./div[contains(text(), 'Тип оффера')]]";
    String anyButton = "//div[@class='ng-scope ui-offers-header-filters-button']";

    String nameOfTypeOffer= "//div[./div[contains(text(), 'Тип оффера')]]//div[@class='ng-binding']";
    String nameOfTypeOfferForCheck= "//div[@class='ui-offers-card-row-absolute-type-label ng-scope']";
    String nameOfTypeOfferForCheckActive= "//div[@class='ng-scope ui-offers-header-filters-button active']";

    String wayForTargetOffer = "//div[@class='ui-offers-card-row-inner ng-scope']//a";

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

    @FindBys(
            @FindBy(xpath = "//div[@class='ui-offers-card-row-inner ng-scope']")
    )
    private List <WebElement>  countForAllNonUniversalOffer; // число всех блоков с офферами на странице

    @FindBys(
            @FindBy(xpath = "//div[@class='ui-offers-card-row-inner ng-scope']//a")
    )
    private List <WebElement> titleForAllNonUniversalOffer; // названия всех (титульники) всех офферов (организаций)

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
        Assert.assertEquals(7, driver.findElements(By.xpath(nameOfTypeProductTitle+anyButton)).size()); // 7 если будет 7 фильтров, на момент написания кода их 5
        Assert.assertEquals(4, driver.findElements(By.xpath(nameOfTargetActionTitle+anyButton)).size());
        Assert.assertEquals(2, driver.findElements(By.xpath(nameOfTypeOffer)).size());
    }

    public void filterOfTypeClick(String nameFilter){
        String nameOfFilter = String.format(nameOfTypeProductTitle+"//div[contains(text(), '%s')]", nameFilter);
        driver.findElement(By.xpath(nameOfFilter)).click();
    }

    public void filterOfTargetActionClick(String nameFilter){
        String nameOfFilter = String.format(nameOfTargetActionTitle+"//div[contains(text(), '%s')]", nameFilter);
        driver.findElement(By.xpath(nameOfFilter)).click();
    }

    public void filterOfOfferClick(String nameFilter){
        String nameOfFilter = String.format(nameOfTypeOfferTitle+"//div[contains(text(), '%s')]", nameFilter);
        driver.findElement(By.xpath(nameOfFilter)).click();
    }

    public void checkFilterOfOffersType(String nameFilter){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String notSelectedFilterName;
        String notSelectedNameOfFilter;

        String correctFilterName;// для манипуляций в коде
        String nameFilterForDisable; // для понимания какой фильтр отключать
        if (nameFilter.equals("Реферальные ссылки")){
            correctFilterName = "REF";
            nameFilterForDisable = "API";}
        else{
            correctFilterName = "API";
            nameFilterForDisable = "REF";
        }

        String nameOfFilter = String.format(nameOfTypeOfferForCheckActive+"/div[contains(text(), '%s')]", nameFilterForDisable); //запоминаем xpath нажатой кнопки
        int countOfOffersWithThisType = driver.findElements(By.xpath(nameOfFilter)).size(); // вносим в переменную наличие нажатой кнопки

        if (correctFilterName.equals("API") && countOfOffersWithThisType>0) { // если тестер писал API
            correctFilterName = "Реферальные ссылки"; // корректируем название
            nameOfFilter = String.format(nameOfTypeOfferForCheckActive+"/div[contains(text(), '%s')]", correctFilterName); //ищем путь
            driver.findElement(By.xpath(nameOfFilter)).click();
        }
        if (nameFilter.equals("Реферальные ссылки") && countOfOffersWithThisType>0) {
            correctFilterName = "API";
            nameOfFilter = String.format(nameOfTypeOfferForCheckActive+"/div[contains(text(), '%s')]", correctFilterName); //ищем путь
            driver.findElement(By.xpath(nameOfFilter)).click();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (nameFilter.equals("Реферальные ссылки")) {
            correctFilterName = "REF";
            notSelectedFilterName = "API";}
        else {correctFilterName = "API";
            notSelectedFilterName = "REF";}


        nameOfFilter = String.format(nameOfTypeOfferForCheck+"/div[contains(text(), '%s')]", correctFilterName);
        notSelectedNameOfFilter = String.format(nameOfTypeOfferForCheck+"/div[contains(text(), '%s')]", notSelectedFilterName);
        countOfOffersWithThisType = driver.findElements(By.xpath(nameOfFilter)).size();
         int countOfOffersWithoutThisType = driver.findElements(By.xpath(notSelectedNameOfFilter)).size();
        if (nameFilter.equals("API")){
                // код1
                Assert.assertTrue(countOfOffersWithThisType > 3);
                Assert.assertTrue(countOfOffersWithoutThisType < 1);
        }
        if (nameFilter.equals("REF")){
                // код2
                Assert.assertTrue(countOfOffersWithThisType > 4);
                Assert.assertTrue(countOfOffersWithoutThisType < 2); //Потому что 1 будет всегда хоть ты тресни
        }

    }

    public void offerFullPageClick(){ // клик по офферу
        titleForAllNonUniversalOffer.get(1).click();
    }

    public void targetNameOfferClick(String targetNameOffer){  /// клик на наиманованию конкретного оффера для перехода на страницу подробной инфы о нем
        String targetOffer = String.format(wayForTargetOffer+"[contains(text(), '%s')]", targetNameOffer);
        driver.findElement(By.xpath(targetOffer)).click();
    }

    public void searchOffer(String targetNameOffer){   /// поиск конкретного офера с помощью поля поиска
        typeIntoField(targetNameOffer, searchInputField);
        String targetOffer = String.format(wayForTargetOffer+"[contains(text(), '%s')]", targetNameOffer);
        WebElement element = waitForAjaxElementIsVisible(By.xpath(targetOffer));
        waitForVisibility(element);
    }
}
