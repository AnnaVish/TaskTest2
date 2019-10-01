package pages.verticals.creditCards;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.verticals.common.CommonElements;

import java.util.Arrays;
import java.util.List;

public class CreditCardsDetailedPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();
    CommonElements commonElements = new CommonElements();

    @FindBy(css = ".wrapper-credit-card .main-logo")
    private WebElement logo;

    @FindBy(xpath = "//div[@class='main-info']/div/div/div[contains(text(), 'Ставка')]")
    private WebElement cardBet;

    @FindBy(xpath = "//div[@class='main-info']/div/div/div[contains(text(), 'Кредитный лимит')]")
    private WebElement creditLimit;

    @FindBy(xpath = "//div[@class='main-info']/div/div/div[contains(text(), 'Льготный период')]")
    private WebElement freePeriod;

    @FindBy(xpath = "//div[@class='main-info']/div/div/div[contains(text(), 'Стоимость обслуживания')]")
    private WebElement price;

    @FindBy(xpath = "//div[@class='main-info']/div/div/div[contains(text(), 'Кешбек')]")
    private WebElement cashBack;

    @FindBy(xpath = "//button/span[contains(text(), 'Получить карту')]")
    private WebElement getCard;

    public final List<WebElement> elements;
    public final List<WebElement> header;
    private final List<WebElement> footer;

    public CreditCardsDetailedPage(){
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, commonElements);
        elements = Arrays.asList(commonElements.bankBlock, commonElements.headerOfBank, commonElements.rating, logo,
                cardBet, creditLimit, freePeriod, price, cashBack, getCard, commonElements.offersTab,
                commonElements.conditionsTab, commonElements.documentsTab,
                commonElements.commentsTab, commonElements.aboutOrgTab, commonElements.bet, commonElements.sum,
                commonElements.time, commonElements.age, commonElements.beforeApproved);
        header = Arrays.asList(headerPage.logoLink, headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink,
                headerPage.creditsHeaderLink, headerPage.creditCardsHeaderLink, headerPage.autoCreditsHeaderLink,
                headerPage.ipotekaHeaderLink, headerPage.refinanceHeaderLink);
        footer = Arrays.asList(footerPage.footerContainer, footerPage.footerLeftSide, footerPage.appleAndGoogle,
                footerPage.footerSeoText, footerPage.becomePartnerLink, footerPage.becomeAgentLink, footerPage.cabinetOfBroker,
                footerPage.cabinetOfBank, footerPage.cabinetOfWebmaster, footerPage.oldCabinetOfBroker,
                footerPage.copyright, footerPage.copyrightText, footerPage.becomeAgentDown, footerPage.becomePartnerDown,
                footerPage.personalData, footerPage.mail, footerPage.map, footerPage.adress);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footer);
    }
}
