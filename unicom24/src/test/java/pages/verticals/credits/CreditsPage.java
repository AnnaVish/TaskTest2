package pages.verticals.credits;

import TestContext.TestContext;
import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.Adminka.AdminkaRedirects;
import pages.Adminka.admAuth.AdmAuth;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.verticals.common.CommonElementsForAllVerticals;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class CreditsPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();
    CommonElementsForAllVerticals common = new CommonElementsForAllVerticals();
    AdminkaRedirects adminkaRedirects = new AdminkaRedirects();
    TestContext testContext = new TestContext();
    AdmAuth admAuth = new AdmAuth();

    @FindBy(css = ".offers-list-row .offer-online")
    private WebElement getCreditBtn;

    @FindBy(css = ".form-offers-small .form-one")
    private WebElement formOffer;


    @FindBy(xpath = "//a[contains(text(), 'Частным клиентам')]")
    private WebElement privateClientsBread;

    @FindBy(xpath = "//li/span[contains(text(), 'Кредиты')]")
    private WebElement privateClientsCreditsBread;

    @FindBy(xpath = "//div[@class='clear_wrapper']/i[contains(text(), 'close')]")
    private WebElement closeModalBtn;

    public final List<WebElement> elements;
    public final List<WebElement> header;
    private final List<WebElement> footer;

    public CreditsPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, common);
        PageFactory.initElements(driver, adminkaRedirects);
        elements = Arrays.asList(getCreditBtn, formOffer, privateClientsBread, privateClientsCreditsBread,
                common.logo, common.rating, common.title, common.ratePerYear, common.payPerMonth, common.time,
                common.neededRating, common.license);
        header = Arrays.asList(headerPage.logoLink, headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink,
                headerPage.creditsHeaderLink, headerPage.creditCardsHeaderLink, headerPage.autoCreditsHeaderLink,
                headerPage.ipotekaHeaderLink, headerPage.refinanceHeaderLink);
        footer = Arrays.asList(footerPage.footerContainer, footerPage.footerLeftSide, footerPage.appleAndGoogle,
                footerPage.footerSeoText, footerPage.becomePartnerLink, footerPage.becomeAgentLink, footerPage.cabinetOfBroker,
                footerPage.cabinetOfBank, footerPage.cabinetOfWebmaster,
                footerPage.copyright, footerPage.copyrightText, footerPage.becomeAgentDown, footerPage.becomePartnerDown,
                footerPage.personalData, footerPage.mail, footerPage.map, footerPage.adress);
    }

    public void onCreditsPage() {
        driver.get(PagesUrls.privateCreditsPageUrl());
        TestContext.checkRedirectUrl = PagesUrls.privateCreditsPageUrl();
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footer);
        Assert.assertEquals(3, driver.findElements(By.cssSelector("ul.ui-breadcrumbs-list  li")).size());
    }

    public Boolean offersOnPageMore5() {
        return driver.findElements(By.cssSelector(".offers-list-row .offer-item__wrapper")).size() > 5;
    }

    public void titleOfBankClick() {
        common.title.click();
    }

    public Boolean checkRedirects() {
        js.executeScript("let ifr = document.getElementById('launcher'); ifr.remove();");
        List<WebElement> elements = driver.findElements(By.cssSelector(".offers-list-row .offer-online button"));
        for (int i = 0; i < elements.size(); i++) {
            if (isElementVisible(closeModalBtn)) {
                closeModalBtn.click();
            }
            waitForVisibility(elements.get(i));
            if (i == 0) {
                System.out.println(driver.findElement(By.xpath("(//div[@class='offer-online']/button/../../../../div[2]/div/a)")).getText());
            } else {
                int k = i + 1;
                System.out.println(driver.findElement(By.xpath("(//div[@class='offer-online']/button/../../../../div[2]/div/a)[" + k + "]")).getText());
            }
            getIdOfOffer(elements.get(i));
            elements.get(i).click();
            switchToTheSecondTab();
            for (int j = 0; j < 10; j++) {
                if (driver.getCurrentUrl().contains(PagesUrls.mainPage)) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (driver.getCurrentUrl().contains(PagesUrls.mainPage))
                return false;
            adminkaRedirects.onAdminkaRedirectsPage();
            if (admAuth.isPageDisplayed()) {
                admAuth.pageIsDisplayed();
                admAuth.logIn();
            }
            adminkaRedirects.pageIsDisplayed();
            adminkaRedirects.checkVerticalsRedirect();
            closeTab();
            switchToTheFirstTab();
        }
        return true;
    }

    private void getIdOfOffer(WebElement element) {
        adminkaRedirects.offerId = element.getAttribute("id");
        adminkaRedirects.offerId = adminkaRedirects.offerId.replaceAll("[^0-9]", "");
    }
}
