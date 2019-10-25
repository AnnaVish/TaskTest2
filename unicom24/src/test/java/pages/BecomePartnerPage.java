package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class BecomePartnerPage extends Base {

    private Header headerPage = new Header();
    private Footer footerPage = new Footer();

    @FindBy(css = ".container .become-partner-top")
    private WebElement bannerPage;

    @FindBy(css = ".for-block.become-partner-for-web")
    private WebElement leftSideOfPage;

    @FindBy(css = ".become-partner-for-web .for-footer__button")
    private WebElement leftSidePageBtn;

    @FindBy(css = ".for-block.become-partner-for-advertiser")
    private WebElement rightSideOfPage;

    @FindBy(css = ".for-block.become-partner-for-advertiser .for-footer__button")
    private WebElement rightSideOfPageBtn;

    @FindBy(xpath = "//div[@class='contacts__wrapper'][./div[contains(text(), 'Служба поддержки:')]]")
    private WebElement supportBlock;

    @FindBy(css = ".font__base .about__wrapper")
    private WebElement aboutText;

    @FindBy(css = ".font__base .become-partner-partners")
    private WebElement ourPartnersBlock;

    @FindBy(css = ".container .footer-contact__wrapper")
    private WebElement supportEmailBlock;

    private final List<WebElement> elements;
    private final List<WebElement> header;
    private final List<WebElement> footer;

    public BecomePartnerPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        header = Arrays.asList(headerPage.logoLink, headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink,
                headerPage.creditsHeaderLink, headerPage.creditCardsHeaderLink, headerPage.autoCreditsHeaderLink,
                headerPage.ipotekaHeaderLink, headerPage.refinanceHeaderLink);
        footer = Arrays.asList(footerPage.footerContainer, footerPage.footerLeftSide, footerPage.appleAndGoogle,
                footerPage.footerSeoText, footerPage.becomePartnerLink, footerPage.becomeAgentLink, footerPage.cabinetOfBroker,
                footerPage.cabinetOfBank, footerPage.cabinetOfWebmaster,
                footerPage.copyright, footerPage.copyrightText, footerPage.becomeAgentDown, footerPage.becomePartnerDown,
                footerPage.personalData, footerPage.mail, footerPage.map, footerPage.adress);
        elements = Arrays.asList(bannerPage, leftSideOfPage, leftSidePageBtn, rightSideOfPage, rightSideOfPageBtn,
                supportBlock, aboutText, ourPartnersBlock, supportEmailBlock);
    }

    public void onBecomePartnerPage(){
        driver.get(PagesUrls.becomePartnerPage());
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footer);
    }

    public void getMoneyNowClick(){
        leftSidePageBtn.click();
        switchToTheSecondTab();
    }

    public void clickApplications(){
        rightSideOfPageBtn.click();
        switchToTheSecondTab();
    }
}
