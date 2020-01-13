package pages.verticals.ipoteka;

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

    public final List<WebElement> elements;


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
        allElementsAreVisible(footerPage.getFooter());
        Header.checkBreadCrumbs(3);
    }

    public Boolean offersOnPageEqual5(){
        return driver.findElements(By.cssSelector(".offers-list-row .offer-item__wrapper")).size() >= 5;
    }
}
