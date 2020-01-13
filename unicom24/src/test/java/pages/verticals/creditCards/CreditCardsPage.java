package pages.verticals.creditCards;

import TestContext.TestContext;
import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.verticals.common.CommonElementsForAllVerticals;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class CreditCardsPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();
    CommonElementsForAllVerticals common = new CommonElementsForAllVerticals();


    //@FindBy(css = ".offers-list-row .offer-online") - отсутствует на странице на период 10.01.2020
    //private WebElement getCreditBtn;

    @FindBy(css = ".form-offers-small .form-one")
    private WebElement formOffer;

    @FindBy(xpath = "//a[contains(text(), 'Частным клиентам')]")
    private WebElement privateClientsBread;

    @FindBy(xpath = "//li/span[contains(text(), 'Кредитные карты')]")
    private WebElement privateClientsCreditsCardBread;

    @FindBy(xpath = "//button[@class='filters-btns__btn filters-btns__reset default medium']")
    private WebElement btnResetToDefault; // Кнопка Сбросить в боди страницы

    // h2 элементы начало
    @FindBy(xpath = "//div[@class='col-12']/h2[contains(text(), 'Кредитные карты банков России')]")
    private WebElement h2Seo1;

    @FindBy(xpath = "//div[@class='col-12']/h2[contains(text(), 'Условия кредитных карт')]")
    private WebElement h2Seo2;

    @FindBy(xpath = "//div[@class='col-12']/h2[contains(text(), 'Особенности кредитных карт')]")
    private WebElement h2Seo3;

    @FindBy(xpath = "//div[@class='col-12']/h2[contains(text(), 'Плюсы и минусы кредитных карт')]")
    private WebElement h2Seo4;

    @FindBy(xpath = "//div[@class='col-12']/h2[contains(text(), 'Как оформить кредитную карту онлайн?')]")
    private WebElement h2Seo5;
    // h2 элементы конец

    public final List<WebElement> elements;
    public final List<WebElement> elementsH2;

    public CreditCardsPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, common);
        elements = Arrays.asList(//getCreditBtn, - отсутствует на странице на период 10.01.2020
                formOffer, common.logo,
                //common.rating,
                common.title,
                //common.ratePerYear,
                //common.license,
                //common.creditLimit,
                //common.cost,
                btnResetToDefault,
                privateClientsBread, privateClientsCreditsCardBread);
        elementsH2 = Arrays.asList(h2Seo1, h2Seo2, h2Seo3, h2Seo4, h2Seo5);
        headerPage.getMainHeader();
        footerPage.getFooter();
    }

    public void onCreditCardsPage(){
        driver.get(PagesUrls.privateCreditsCardPageUrl());
        TestContext.checkRedirectUrl = PagesUrls.privateCreditsCardPageUrl();
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(elementsH2);
        allElementsAreVisible(footerPage.getFooter());
        Header.checkBreadCrumbs(3);
    }

    public Boolean offersOnPageMore5(){
        return driver.findElements(By.cssSelector(".offers-list-row .offer-item__wrapper")).size() > 5;
    }
}
