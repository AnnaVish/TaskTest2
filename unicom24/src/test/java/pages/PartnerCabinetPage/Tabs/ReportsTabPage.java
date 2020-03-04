package pages.PartnerCabinetPage.Tabs;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;

import java.util.Arrays;
import java.util.List;

public class ReportsTabPage extends Base {

    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

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

    private final List<WebElement> elements;

    public ReportsTabPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(traficBtn, landingsAndApiBtn, changeBalanceBtn, productsBtn, dynamicLandingBtn,
                navigation, showBtn, statisticTable);
    }

    public void pageIsDisplayed() {
        header.headerIsDisplayed();
        allElementsAreVisible(elements);
    }
}
