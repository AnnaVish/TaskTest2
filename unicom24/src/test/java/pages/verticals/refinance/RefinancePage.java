package pages.verticals.refinance;

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

public class RefinancePage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();
    CommonElementsForAllVerticals common = new CommonElementsForAllVerticals();

    @FindBy(css = ".offers-list-row .offer-online")
    private WebElement getCreditBtn;

    @FindBy(css = ".form-offers-small .form-one")
    private WebElement formOffer;

    @FindBy(xpath = "//a[contains(text(), 'Частным клиентам')]")
    private WebElement privateClientsBread;

    @FindBy(xpath = "//li/span[contains(text(), 'Рефинансирование')]")
    private WebElement privateClientsRefinanceBread;

    public final List<WebElement> elements;

    public RefinancePage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, common);
        elements = Arrays.asList(getCreditBtn, formOffer, common.logo, common.rating, common.title, common.ratePerYear,
                common.payPerMonth, common.time, common.neededPaying, common.license);
        headerPage.getMainHeader();
        footerPage.getFooter();
    }

    public void oneRefinancePage(){
        driver.get(PagesUrls.privateRefinancePageUrl());
        TestContext.checkRedirectUrl = PagesUrls.privateRefinancePageUrl();
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(footerPage.getFooter());
        Header.checkBreadCrumbs(3);
    }

    public Boolean offersOnPageMoreOrEqual2(){
        return driver.findElements(By.cssSelector(".offers-list-row .offer-item__wrapper")).size() >= 2;
    }
}
