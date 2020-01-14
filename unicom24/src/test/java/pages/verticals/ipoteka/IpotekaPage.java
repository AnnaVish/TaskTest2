package pages.verticals.ipoteka;

import TestContext.TestContext;
import base.Base;
import cucumber.api.java.bs.A;
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

public class IpotekaPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();
    CommonElementsForAllVerticals common = new CommonElementsForAllVerticals();


    //@FindBy(css = ".offers-list-row .offer-online") - 10.01.2020 элемента нет на странице
    //private WebElement getCreditBtn;

    @FindBy(css = ".form-offers-small .form-one")
    private WebElement formOffer;

    @FindBy(xpath = "//a[contains(text(), 'Частным клиентам')]")
    private WebElement privateClientsBread;

    @FindBy(xpath = "//li/span[contains(text(), 'Ипотека')]")
    private WebElement privateClientsIpotekaBread;

    @FindBy(xpath = "//button[@class='filters-btns__btn filters-btns__reset default medium']")
    private WebElement btnResetToDefault; // Кнопка Сбросить в боди страницы

    // h2 элементы начало
    @FindBy(xpath = "//div[@class='col-12']/h2[contains(text(), 'Ипотека и ее преимущества')]")
    private WebElement h2Seo1;

    @FindBy(xpath = "//div[@class='col-12']/h2[contains(text(), 'Условия получения ипотеки')]")
    private WebElement h2Seo2;

    @FindBy(xpath = "//div[@class='col-12']/h2[contains(text(), 'Как оформить ипотеку на квартиру?')]")
    private WebElement h2Seo3;

    @FindBy(xpath = "//div[@class='col-12']/h2[contains(text(), 'Какие документы нужны при покупке квартиры в ипотеку?')]")
    private WebElement h2Seo4;

    @FindBy(xpath = "//div[@class='col-12']/h2[contains(text(), 'В каком банке лучше взять ипотеку в 2019 году?')]")
    private WebElement h2Seo5;
    // h2 элементы конец

    public final List<WebElement> elements;
    public final List<WebElement> elementsH2;


    public IpotekaPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, common);
        elements = Arrays.asList(//getCreditBtn,
                formOffer, common.logo,
                //common.rating,
                common.title,
                //common.ratePerYear,
                //common.neededPaying, common.license,
                //common.overpayment,
                privateClientsBread, privateClientsIpotekaBread,
                btnResetToDefault);
        elementsH2 = Arrays.asList(h2Seo1, h2Seo2, h2Seo3, h2Seo4, h2Seo5);
        headerPage.getMainHeader();
        footerPage.getFooter();
    }

    public void onIpotekaPage(){
        driver.get(PagesUrls.privateIpotekaPageUrl());
        TestContext.checkRedirectUrl = PagesUrls.privateIpotekaPageUrl();
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(elementsH2);
        allElementsAreVisible(footerPage.getFooter());
        Header.checkBreadCrumbs(3);
    }

    public Boolean offersOnPageMore0(){
        return driver.findElements(By.xpath("//div[@class='offer-item-new wrapper']")).size() >0;
    }
}
