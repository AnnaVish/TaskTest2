package pages;

import base.Base;
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

    public final List<WebElement>elements;
    public final List<WebElement> header;
    private final List<WebElement> footer;

    public BankList() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        elements = Arrays.asList(pageTitle, seacrchField, searchBtn);
        header = Arrays.asList(headerPage.logoLink, headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink,
                headerPage.creditsHeaderLink, headerPage.creditCardsHeaderLink, headerPage.autoCreditsHeaderLink,
                headerPage.ipotekaHeaderLink, headerPage.refinanceHeaderLink);
        footer = Arrays.asList(footerPage.footerContainer, footerPage.footerLeftSide, footerPage.appleAndGoogle,
                footerPage.footerSeoText, footerPage.becomePartnerLink, footerPage.becomeAgentLink, footerPage.cabinetOfBroker,
                footerPage.cabinetOfBank, footerPage.cabinetOfWebmaster, footerPage.oldCabinetOfBroker);
    }

    public void bankListPageIsDisplayed() {
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(bank);
        allElementsAreVisible(footer);
    }

    public Boolean banksOnPageEqual5(){
        return driver.findElements(By.cssSelector(".container .ui-list-bank-item")).size() == 5;
    }

    public void onAllBanksPage() {
        driver.get(PagesUrls.bankListPage);
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
