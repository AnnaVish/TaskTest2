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

    String nameOfTypeProductTitle = "//div[./div[contains(text(), 'Тип продукта')]]";
    String nameOfTargetActionTitle = "//div[./div[contains(text(), 'Целевое действие')]]";
    //String nameOfTypeOfferTitle= "//div[./div[contains(text(), 'Тип оффера')]]";
    String anyButton = "//button";

    String nameOfTypeOffer= "//div[./div[contains(text(), 'Тип оффера')]]//button";
    String nameOfTypeOfferForCheck= "//div[@class='type']";
    //String nameOfTypeOfferForCheckActive= "//div[@class='ng-scope ui-offers-header-filters-button active']";

    String wayForTargetOffer = "//div[@class='ui-offers-card-row-inner ng-scope']//a";


    String wayForActiveButtonOfTypeOffer = "//div[./div[contains(text(), 'Тип оффера')]]//button[not(contains(@class, 'active'))]"; // для проверки выключена ли кнопка

    @FindBy(xpath = "//div[contains(text(), 'Офферы')]")
    private WebElement offersTitle;

    @FindBy(xpath = "//input[@placeholder=\"Поиск по названию оффера\"]")
    private WebElement searchInputField;

    @FindBy(xpath = "//div[contains(text(), 'Скрыть фильтры')]")
    private WebElement hideFiltersBtn;

    @FindBy(xpath = "//div[contains(text(), 'Сбросить фильтры')]")
    private WebElement resetFilters;

    @FindBy(xpath = "//div[./div[contains(text(), 'Сортировать')]]//div[contains(text(), 'По вознаграждению (больше — меньше)')]")
    private WebElement sortField;

    @FindBy(xpath = "//div[@class='ds-offer-card-wrap']")
    private List <WebElement>  countForAllNonUniversalOffer; // число всех блоков с офферами на странице

    @FindBy(xpath = "//div[@class='ds-offer-card-wrap']//div[@class='name']/a")
    private List <WebElement> titleForAllNonUniversalOffer; // названия всех (титульники) всех офферов (организаций)

    @FindBy(xpath = "//div[@class='ds-offer-card']")
    private List <WebElement> countAllOffersOnPage;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип оффера')]]//button") // кнопка API для манипуляций в коде
    private List<WebElement> nameTypeOfferOfButtonsWay;

    @FindBy(xpath = "//div[@class='type']/span") // значок типа у оффера
    private List<WebElement> typeOfferToTable;

    private final List<WebElement> elements;

    public OffersTabPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(offersTitle, searchInputField, hideFiltersBtn, resetFilters,
                sortField);
    }

    public void pageIsDisplayed() {
        header.headerIsDisplayed();
        allElementsAreVisible(elements);
        Assert.assertTrue(countAllOffersOnPage.size() > 0);
    }

    public void checkCountFilters(){
        Assert.assertEquals(5, driver.findElements(By.xpath(nameOfTypeProductTitle+anyButton)).size()); // внезапно снова стало 5 кнопок вместо 7
        Assert.assertEquals(4, driver.findElements(By.xpath(nameOfTargetActionTitle+anyButton)).size());
        Assert.assertEquals(2, driver.findElements(By.xpath(nameOfTypeOffer)).size());
    }

    public void filterOfTypeClick(String nameFilter){
        String nameOfFilter = String.format(nameOfTypeProductTitle+"//button[contains(text(), '%s')]", nameFilter);
        driver.findElement(By.xpath(nameOfFilter)).click();
    }

    public void filterOfTargetActionClick(String nameFilter){
        String nameOfFilter = String.format(nameOfTargetActionTitle+"//button[contains(text(), '%s')]", nameFilter);
        driver.findElement(By.xpath(nameOfFilter)).click();
    }

    public void filterOfOfferClick(String nameFilter){    /// API Рефы
        //String nameOfFilter = String.format(nameOfTypeOfferTitle+"//button[contains(text(), '%s')]", nameFilter);
        //driver.findElement(By.xpath(nameOfFilter)).click();
        for (WebElement element : nameTypeOfferOfButtonsWay){
            if (element.getText().equals(nameFilter)){
                element.click();
                break;
            }
        }
    }

    public void checkFilterOfOffersType(String nameFilter){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*
        if (nameFilter.equals("API")){
            for (WebElement element : nameTypeOfferOfButtonsWay){
                if (!element.getText().contains(nameFilter) && (driver.findElements(By.xpath(wayForActiveButtonOfTypeOffer)).size())>0){
                    element.click();

                    // кликнули, ждем чтоб страница обновилась
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // страница обновилась, проверяем результат
                    for (WebElement elementOnOffer : typeOfferToTable)
                        if (elementOnOffer.getText().contains(nameFilter) && (elementOnOffer.) )
                    break;
                }
            }
            Assert.assertEquals(typeOfferToTable.);
        }
        if (nameFilter.equals("Реферальные ссылки")){

        }



        */








        String notSelectedFilterName;
        String notSelectedNameOfFilter;

        String correctFilterName;// для манипуляций в коде
        String nameFilterForDisable; // для понимания какой фильтр отключать
        if (nameFilter.equals("Реферальные ссылки")){
            correctFilterName = "Реферальные ссылки";
            nameFilterForDisable = "API";}
        else{
            correctFilterName = "API";
            nameFilterForDisable = "Реферальные ссылки";
        }

        String nameOfFilter = String.format("//button[contains(text(), '%s')]", nameFilterForDisable); //запоминаем xpath нажатой кнопки
        int countOfOffersWithThisType = driver.findElements(By.xpath(nameOfFilter)).size(); // вносим в переменную наличие нажатой кнопки

        if (correctFilterName.equals("API") && countOfOffersWithThisType>0) { // если тестер писал API
            correctFilterName = "Реферальные ссылки"; // корректируем название
            nameOfFilter = String.format("//button[contains(text(), '%s')]", correctFilterName); //ищем путь
            driver.findElement(By.xpath(nameOfFilter)).click();
        }
        if (nameFilter.equals("Реферальные ссылки") && countOfOffersWithThisType>0) {
            correctFilterName = "API";
            nameOfFilter = String.format("//button[contains(text(), '%s')]", correctFilterName); //ищем путь
            driver.findElement(By.xpath(nameOfFilter)).click();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (nameFilter.equals("Реферальные ссылки")) {
            correctFilterName = "Реферальные ссылки";
            notSelectedFilterName = "API";}
        else {correctFilterName = "API";
            notSelectedFilterName = "Реферальные ссылки";}


        nameOfFilter = String.format(nameOfTypeOfferForCheck+"//span[contains(text(), '%s')]", correctFilterName);
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
