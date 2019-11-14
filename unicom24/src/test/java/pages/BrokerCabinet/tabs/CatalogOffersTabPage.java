package pages.BrokerCabinet.tabs;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BrokerCabinet.footer.FooterBrokerCabinetPage;
import pages.BrokerCabinet.header.HeaderBrokerCabinetPage;

import java.util.Arrays;
import java.util.List;

public class CatalogOffersTabPage extends Base {

    private final HeaderBrokerCabinetPage header = new HeaderBrokerCabinetPage();
    private final FooterBrokerCabinetPage footer = new FooterBrokerCabinetPage();

    @FindBy(xpath = "//div[contains(text(), 'Офферы')]")
    private WebElement offersTitle;

    @FindBy(xpath = "//input[@placeholder=\"Поиск по названию компании\"]")
    private WebElement searchField;

    @FindBy(xpath = "//span[contains(text(),'Скрыть фильтры')]")
    private WebElement hideFilters;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип продукта')]]/div/div[contains(text(), 'Микрозаймы')]")
    private WebElement microcreditsType;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип продукта')]]/div/div[contains(text(), 'Кредиты')]")
    private WebElement creditsType;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип продукта')]]/div/div[contains(text(), 'Кредитные карты')]")
    private WebElement creditCardsType;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип продукта')]]/div/div[contains(text(), 'Автокредиты')]")
    private WebElement autocreditsType;

    @FindBy(xpath = "//div[./div[contains(text(), 'Тип продукта')]]/div/div[contains(text(), 'Ипотека')]")
    private WebElement ipotekaType;

    private final List<WebElement> elements;
    private final List<WebElement> headerBrokerCabinetPage;
    private final List<WebElement> footerBrokerCabinetPage;

    public CatalogOffersTabPage() {
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, footer);
        headerBrokerCabinetPage = Arrays.asList(header.logo, header.logoTitle, header.currentMoney, header.giveMoneyBtn,
                header.dropMenu, header.catalogOffersLink, header.myClientsLink, header.allServicesLink,
                header.finRatingOfClientLink, header.autoLink, header.scoringLink);
        elements = Arrays.asList(offersTitle, searchField, hideFilters, microcreditsType, creditsType, creditCardsType,
                autocreditsType, ipotekaType);
        footerBrokerCabinetPage = Arrays.asList(footer.footerContainer, footer.footerTitle, footer.rfzLink,
                footer.creditRatingLink, footer.creditReportLink, footer.bigCreditRatingLink, footer.ficioLink,
                footer.middleSideOfFooterTitle, footer.scoringTelephoneNumberLink, footer.scoringSocialMediaLink,
                footer.rightSideOfFooterTitle, footer.checkAutoLink, footer.supportTitle, footer.supportLink,
                footer.footerIcons, footer.copyRight, footer.doneBy, footer.dataProtectedBy);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(headerBrokerCabinetPage);
        allElementsAreVisible(elements);
        allElementsAreVisible(footerBrokerCabinetPage);
        int countOfOffers = driver.findElements(By.cssSelector(".wrapper.application-item")).size();
        Assert.assertTrue(countOfOffers > 10);
    }

    public void searchOffer(String nameOfBank) {
        waitForVisibility(searchField);
        typeIntoField(nameOfBank, searchField);
    }

    public void isSearchResultIsDisplayed(String nameOfBank) {
        String xPath = String.format("//div[contains(@class, 'application-item')]/div/div[2]/div[contains(text(), '%s')]", nameOfBank);
        waitForAjaxElementIsVisible(By.xpath(xPath));
    }
}
