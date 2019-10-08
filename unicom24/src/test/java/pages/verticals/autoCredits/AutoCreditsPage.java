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

    @FindBy(xpath = "//a[contains(text(), 'Частным клиентам')]")
    private WebElement privateClientsBread;

    @FindBy(xpath = "//li/span[contains(text(), 'Автокредиты')]")
    private WebElement privateClientsAutoBread;

    public final List<WebElement> elements;
    public final List<WebElement> header;
    private final List<WebElement> footer;


    public AutoCreditsPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, common);
        elements = Arrays.asList(getCreditBtn, formOffer, common.logo, common.rating, common.title, common.ratePerYear,
                common.payPerMonth, common.time, common.neededRating, common.license);
        header = Arrays.asList(privateClientsBread, privateClientsAutoBread, headerPage.logoLink,
                headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink,
                headerPage.creditsHeaderLink, headerPage.creditCardsHeaderLink, headerPage.autoCreditsHeaderLink,
                headerPage.ipotekaHeaderLink, headerPage.refinanceHeaderLink);
        footer = Arrays.asList(footerPage.footerContainer, footerPage.footerLeftSide, footerPage.appleAndGoogle,
                footerPage.footerSeoText, footerPage.becomePartnerLink, footerPage.becomeAgentLink, footerPage.cabinetOfBroker,
                footerPage.cabinetOfBank, footerPage.cabinetOfWebmaster, footerPage.oldCabinetOfBroker,
                footerPage.copyright, footerPage.copyrightText, footerPage.becomeAgentDown, footerPage.becomePartnerDown,
                footerPage.personalData, footerPage.mail, footerPage.map, footerPage.adress);
    }

    public void onAutoCreditsPage(){
        driver.get(PagesUrls.privateAutoCreditsPageUrl());
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footer);
        Assert.assertEquals(3, driver.findElements(By.cssSelector("ul.ui-breadcrumbs-list  li")).size());
    }

    public Boolean offersOnPageMore5(){
        return driver.findElements(By.cssSelector(".offers-list-row .offer-item__wrapper")).size() > 5;
    }

}
