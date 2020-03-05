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

public class ReportsTabPage extends Base {

    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

    String wayForMainFilter = "//div[@class='reports-toolbar-navigation-list']";

//    @FindBy(xpath = "//div[contains(text(), 'Отчеты')]")
//    private WebElement reportsTitle;

    @FindBy(xpath = "//div[@href=\"/partners/office/statistics/total\" and contains(text(), 'Трафик')]")
    private WebElement traficBtn;

    @FindBy(xpath = "//div[@href=\"/partners/office/statistics/landings/forms\" and contains(text(), 'Лендинги и API')]")
    private WebElement landingsAndApiBtn;

    @FindBy(xpath = "//div[@href=\"/partners/office/statistics/wallet/total\" and contains(text(), 'Изменения баланса')]")
    private WebElement changeBalanceBtn;

    @FindBy(xpath = "//div[@href=\"/partners/office/statistics/products/rfz\" and contains(text(), 'Продукты')]")
    private WebElement productsBtn;

    @FindBy(xpath = "//div[@href=\"/partners/office/statistics/dynamic/total\" and contains(text(), 'Динамический лендинг')]")
    private WebElement dynamicLandingBtn;

    @FindBy(css = ".reports-toolbar-navigation")
    private WebElement navigation;

    @FindBy(xpath = "//div[contains(text(), 'Показать')]")
    private WebElement showBtn;

    @FindBy(xpath = "//div[contains(text(), 'Очистить')]")
    private WebElement clearBtn;

    @FindBy(css = ".ui-report-total")
    private WebElement statisticTable;

    @FindBy(css = ".reports-toolbar-dates")
    private WebElement dataMainFilters;

    ///

    @FindBy(css = ".reports-toolbar-controls")
    private WebElement filtersToolBarControls;

    @FindBy(css = ".reports-toolbar-filters")
    private WebElement filtersToolBarFilters;

    @FindBy (css = ".ui-report-total-period-lable")
    private WebElement filterPeriod;

    // таблицы для проверки правильности отображения фильтров
    // Сводный

    @FindBy(css = ".ui-report-total")
    private WebElement trafficTotalTable;

    @FindBy(css = ".ui-detail-report-table-forms")
    private WebElement trafficDetailedTable;

    @FindBy(css = ".ui-report-total__wrap")
    private WebElement trafficUnionOfferTable;

    //Массивы элементов Сводного

    @FindBy (css = ".reports-toolbar-filters-input")
    private List<WebElement> mainFiltersToolBarInputs;

    @FindBy (xpath = "//div[@class='ui-report-total-table-grouping-block']/div")
    private List<WebElement> mainFilterTotalControlsButtons;

    private final List<WebElement> elements;
    private final List<WebElement> elementsForCheckMainFilterTotal;
    private final List<WebElement> elementsForCheckMainFilterDetailed;
    private final List<WebElement> elementsForCheckMainFilterUnion;

    public ReportsTabPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(traficBtn, landingsAndApiBtn, changeBalanceBtn, productsBtn, dynamicLandingBtn,
                navigation, showBtn, statisticTable, dataMainFilters);
        elementsForCheckMainFilterTotal = Arrays.asList(filtersToolBarControls, filtersToolBarFilters, showBtn, trafficTotalTable, filterPeriod);
        elementsForCheckMainFilterDetailed = Arrays.asList(filtersToolBarControls, showBtn, clearBtn, trafficDetailedTable);
        elementsForCheckMainFilterUnion = Arrays.asList(filtersToolBarControls, showBtn, clearBtn, trafficUnionOfferTable);
    }

    public void pageIsDisplayed() {
        header.headerIsDisplayed();
        allElementsAreVisible(elements);
    }

    public void selectMainFilter(String nameMainFilter){
        String xPath = String.format(wayForMainFilter + "/div[contains(text(), '%s')]", nameMainFilter);
        driver.findElement(By.xpath(xPath)).click();

        /// Новый метод клика по кнопкам
    }

    public void mainFilterIsDisplayed(String nameMainFilter){
        switch (nameMainFilter){
            case ("Единый оффер"):
                allElementsAreVisible(elementsForCheckMainFilterUnion);
                break;
            case ("Детализированный"):
                allElementsAreVisible(elementsForCheckMainFilterDetailed);
                break;
            case ("Сводный"):
                allElementsAreVisible(elementsForCheckMainFilterTotal);
                Assert.assertEquals(mainFiltersToolBarInputs.size(), 3);
                Assert.assertEquals(mainFilterTotalControlsButtons.size(), 4);
                break;
        }
    }
}
