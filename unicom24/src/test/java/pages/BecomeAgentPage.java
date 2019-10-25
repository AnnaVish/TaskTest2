package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;

import java.util.Arrays;
import java.util.List;

public class BecomeAgentPage extends Base {

    private Header headerPage = new Header();
    private Footer footerPage = new Footer();

    @FindBy(css = ".container .become-agent__wrapper")
    private WebElement bacomeAgentBanner;

    @FindBy(css = ".become-agent__wrapper .become-agent__button ")
    private WebElement bacomeAgentBannerBtn;

    @FindBy(css = ".container .result-pay-sum__wrapper")
    private WebElement otherAgentProfit;

    @FindBy(css = ".container .news__wrapper")
    private WebElement news;

    /*
     *Отчеты
     */
    @FindBy(css = ".card-useful-services-rfz .ui-btn ")
    private WebElement financialHealthRatingGetBtn;

    @FindBy(css = ".card-useful-services-fch .ui-btn")
    private WebElement creditReportsGetBtn;

    @FindBy(css = ".card-useful-services-wrapper .card-useful-services-rfz")
    private WebElement rfz;

    @FindBy(css = ".card-useful-services-wrapper .card-useful-services-fch")
    private WebElement fullCreditHistory;

    /*
     *Отчеты окончены
     */

    @FindBy(xpath = "//div[@class='contacts__wrapper'][./div[contains(text(), 'Служба поддержки:')]]")
    private WebElement supportBlock;

    @FindBy(css = ".font__base .about__wrapper")
    private WebElement aboutText;

    @FindBy(css = ".container .footer-contact__wrapper")
    private WebElement supportEmailBlock;

    private final List<WebElement> elements;
    private final List<WebElement> header;
    private final List<WebElement> footer;

    public BecomeAgentPage(){
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, this);
        header = Arrays.asList(headerPage.logoLink, headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink,
                headerPage.creditsHeaderLink, headerPage.creditCardsHeaderLink, headerPage.autoCreditsHeaderLink,
                headerPage.ipotekaHeaderLink, headerPage.refinanceHeaderLink);
        footer = Arrays.asList(footerPage.footerContainer, footerPage.footerLeftSide, footerPage.appleAndGoogle,
                footerPage.footerSeoText, footerPage.becomePartnerLink, footerPage.becomeAgentLink, footerPage.cabinetOfBroker,
                footerPage.cabinetOfBank, footerPage.cabinetOfWebmaster,
                footerPage.copyright, footerPage.copyrightText, footerPage.becomeAgentDown, footerPage.becomePartnerDown,
                footerPage.personalData, footerPage.mail, footerPage.map, footerPage.adress);
        elements = Arrays.asList(bacomeAgentBanner, bacomeAgentBannerBtn, otherAgentProfit, news,
                financialHealthRatingGetBtn, creditReportsGetBtn, rfz, fullCreditHistory, supportBlock, aboutText,
                supportEmailBlock);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footer);
    }


}
