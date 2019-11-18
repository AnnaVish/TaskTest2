package pages.verticals.autoCredits;

import base.Base;
import org.junit.Assert;
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

public class AutoCreditsPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();
    CommonElementsForAllVerticals common = new CommonElementsForAllVerticals();


    @FindBy(css = ".offers-list-row .offer-online")
    private WebElement getCreditBtn;

    @FindBy(css = ".form-offers-small .form-one")
    private WebElement formOffer;

//    @FindBy(xpath = "//a[contains(text(), 'Частным клиентам')]")
//    private WebElement privateClientsBread;
//
//    @FindBy(xpath = "//li/span[contains(text(), 'Автокредиты')]")
//    private WebElement privateClientsAutoBread;

    public final List<WebElement> elements;
    public final List<WebElement> header;

    public AutoCreditsPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, common);
        elements = Arrays.asList(getCreditBtn, formOffer, common.logo, common.rating, common.title, common.ratePerYear,
                common.payPerMonth, common.time, common.neededRating, common.license);
        header = Arrays.asList(headerPage.logoLink, headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink, headerPage.creditsHeaderLink,
                headerPage.creditCardsHeaderLink, headerPage.autoCreditsHeaderLink, headerPage.ipotekaHeaderLink,
                headerPage.refinanceHeaderLink);
        footerPage.getFooter();
    }

    public void onAutoCreditsPage(){
        driver.get(PagesUrls.privateAutoCreditsPageUrl());
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footerPage.getFooter());
        Header.breadcrumbsAreNotAppear();
    }

    public Boolean offersOnPageMore5(){
        return driver.findElements(By.cssSelector(".offers-list-row .offer-item__wrapper")).size() > 5;
    }

}
