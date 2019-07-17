package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class BankList extends TestBase {

    @FindBy(xpath = "//div[contains(text(), 'Список банков')]")
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

    public final List<WebElement>elements;

    public BankList() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(pageTitle, seacrchField, searchBtn);
    }

    public void bankListPageIsDisplayed() {
        allElementsAreVisible(elements);
        allElementsAreVisible(bank);
    }

    public void onAllBanksPage() {
        driver.get("https://develop-39.vuaro.ru/banki");
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
}
