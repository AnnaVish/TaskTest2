package pages.banki;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class BankList extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();

    @FindBy(xpath = "//h1[contains(text(), 'Список банков России')]")
    private WebElement pageTitle;

    @FindBy(css = ".ui-request-filter input")
    private WebElement seacrchField;

    @FindBy(className = "ui-filter-search__block-button")
    private WebElement searchBtn;

    @FindBys({
            @FindBy(className = "ui-list-bank-item"),
            @FindBy(className = "ui-list-bank-item__content-top-image"),
            @FindBy(className = "ui-list-bank-item__content-name font__base"),
            @FindBy(className = "ui-list-bank-item__content-bottom"),
            @FindBy(className = "vue-star-rating"),
            @FindBy(className = "ui-list-bank-item__content-top-feedback")
    })
    private List<WebElement>bank;

    @FindBy(xpath = "//a[@class='ui-list-bank-item']")
    private List<WebElement> banks;

    @FindBy(css = ".ui-list-bank-item__content-name a")
    private WebElement nameOfBank;

    @FindBy(xpath = "//div[@class='ui-list-sidebar-item-name']")
    private List<WebElement> bankListFilters;

    @FindBy(xpath = "//button[./span[contains(text(), 'Показать еще')]]")
    private WebElement bankListMoreResults;

    @FindBy(xpath = "//div[@class='ui-list-bank-item__content-bottom']//div")
    private List<WebElement> bankContentForCheckFilter;

    public final List<WebElement>elements;

    public BankList() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(pageTitle, seacrchField, searchBtn);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(bank);
        waitForVisibility(nameOfBank);
        allElementsAreVisible(bankListFilters);
        allElementsAreVisible(footerPage.getFooter());
    }

    public Boolean banksOnPageEqual5(){
        return driver.findElements(By.cssSelector(".container .ui-list-bank-item")).size() == 5;
    }

    public void onAllBanksPage() {
        driver.get(PagesUrls.bankListPage);
        waitForPageLoaded(PagesUrls.bankListPage);
    }

    public void fillSearchInput(String nameOfBank) {
        typeIntoField(nameOfBank, seacrchField);
    }

    public void searchBtnClick() {
        searchBtn.click();
    }

    public Boolean seeBankNameLink(String nameOfBank) {
        String xPath = String.format("//a[contains(text(), '%s')]", nameOfBank);
        WebElement link = driver.findElement(By.xpath(xPath));
        return isElementVisible(link);
    }

    public void clickNameOfBank() {
        waitToBeClickable(nameOfBank);
        nameOfBank.click();
    }

    public void bankListFiltersClick(String nameFilter){
        allElementsAreVisible(bankListFilters);
        for (WebElement element : bankListFilters) {
            if (element.getText().equals(nameFilter)) {
                element.click();
                break;
            }
        }
    }

    public void bankListSelectedFilterChecking(String nameFilter){
        waitForAllAjaxElementIsVisible(bank);
        if (isElementVisible(bankListMoreResults)){
        bankListMoreResults.click();
        waitForAllAjaxElementIsVisible(bank);
        waitForAllAjaxElementIsVisible(bankContentForCheckFilter);}
        int countBanksWithFilterContent = 0;
        for (WebElement element : bankContentForCheckFilter) {
            if (element.getText().equals(nameFilter))
                countBanksWithFilterContent++;
        }
        Assert.assertEquals(countBanksWithFilterContent, banks.size());

    }
}
