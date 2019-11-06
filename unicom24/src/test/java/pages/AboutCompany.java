package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;

import java.util.Arrays;
import java.util.List;

public class AboutCompany extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();

    @FindBy(css = ".about-company-top")
    private WebElement aboutImg;

    @FindBy(xpath = "//a[@href=\"/private/ipoteka\" and contains(text(), 'Ипотечные кредиты')]")
    private WebElement ipotekaLink;

    @FindBy(xpath = "//a[@href=\"/private/avtokredity\" and contains(text(), 'Автокредитование')]")
    private WebElement autoCreditLink;

    @FindBy(xpath = "//a[@href=\"/private/mikrozajmy\" and contains(text(), 'Микрозаймы')]")
    private WebElement microCreditsLink;

    @FindBy(xpath = "//a[@href=\"/enterprise/bankovskie-garantii\" and contains(text(), 'Банковские гарантии')]")
    private WebElement bankGarantiesLink;

    @FindBy(xpath = "//a[@href=\"/enterprise/raschetnye-scheta\" and contains(text(), 'Работа с расчетными счетами')]")
    private WebElement sattlementAccountLink;

    @FindBy(xpath = "//a[@href=\"/enterprise/kredity-dlya-malogo-i-srednego-biznesa\" and contains(text(), 'Кредиты малому и среднему бизнесу')]")
    private WebElement creditsForBusiness;

    @FindBy(css = ".about-company-block-yellow")
    private WebElement aboutYellow;

    @FindBy(css = ".about-company-press")
    private WebElement press;

    @FindBy(css = ".about-company-videos-title")
    private WebElement aboutVideo;

    @FindBy(css = ".about-company-contacts")
    private WebElement aboutContacts;

    @FindBy(css = ".about-company-yandex-map")
    private WebElement ymap;

    public final List<WebElement> elements;
    public final List<WebElement> header;
    private final List<WebElement> footer;

    public AboutCompany() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        elements = Arrays.asList(aboutImg, ipotekaLink, autoCreditLink, microCreditsLink, bankGarantiesLink,
                sattlementAccountLink, creditsForBusiness, aboutYellow, press, aboutVideo, aboutContacts, ymap);
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

    public void pageIsDisplayed() {
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footer);
    }
}
