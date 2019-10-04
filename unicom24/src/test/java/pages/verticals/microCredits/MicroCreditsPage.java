package pages.verticals.microCredits;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;

import java.util.Arrays;
import java.util.List;

public class MicroCreditsPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();

    @FindBy(css = ".offers-list-row .offer-online")
    private WebElement getCreditBtn;

    @FindBy(css = ".form-offers-small .form-one")
    private WebElement formOffer;

    @FindBy(xpath = "//a[contains(text(), 'Частным клиентам')]")
    private WebElement privateClientsBread;

    @FindBy(xpath = "//li/span[contains(text(), 'Микрозаймы')]")
    private WebElement privateClientsMFOBread;

    public final List<WebElement> elements;
    public final List<WebElement> header;
    private final List<WebElement> footer;


    public MicroCreditsPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        elements = Arrays.asList(privateClientsMFOBread, privateClientsBread, getCreditBtn, formOffer);
        header = Arrays.asList(headerPage.logoLink, headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink,
                headerPage.creditsHeaderLink, headerPage.creditCardsHeaderLink, headerPage.autoCreditsHeaderLink,
                headerPage.ipotekaHeaderLink, headerPage.refinanceHeaderLink);
        footer = Arrays.asList(footerPage.footerContainer, footerPage.footerLeftSide, footerPage.appleAndGoogle,
                footerPage.footerSeoText, footerPage.becomePartnerLink, footerPage.becomeAgentLink, footerPage.cabinetOfBroker,
                footerPage.cabinetOfBank, footerPage.cabinetOfWebmaster, footerPage.oldCabinetOfBroker);
    }

    public void pageIsDisplyed() {
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footer);
        Assert.assertEquals(3, driver.findElements(By.cssSelector("ul.ui-breadcrumbs-list  li")).size());
    }

    public Boolean offersOnPageMore10(){
        return driver.findElements(By.cssSelector(".offers-list-row .offer-item__wrapper")).size() > 10;
    }
}
