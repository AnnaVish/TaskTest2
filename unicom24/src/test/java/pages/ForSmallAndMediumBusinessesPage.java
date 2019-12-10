package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;

import java.util.Arrays;
import java.util.List;

public class ForSmallAndMediumBusinessesPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();

    @FindBy(css = ".container .ui-description")
    private WebElement seoTextUnderFooter;

    /*
     *Вертикали
     */
    @FindBy(xpath = "//div[contains(text(), 'Банковские гарантии')]")
    private WebElement credits;

    @FindBy(xpath = "//div[contains(text(), 'Рассчетные счета')]")
    private WebElement creditCards;

    @FindBy(xpath = "//div[contains(text(), 'Кредиты малому и среднему бизнесу')]")
    private WebElement autoCredits;
    /*
     *Вертикали окончены
     */

    /*
     *отчеты
     */

    @FindBy(css = ".card-useful-services-wrapper .card-useful-services-rfz")
    private WebElement rfz;

    @FindBy(css = ".card-useful-services-wrapper .card-useful-services-fch")
    private WebElement fullCreditHistory;

    @FindBy(css = ".card-useful-services-rfz .ui-btn ")
    private WebElement financialHealthRatingGetBtn;

    @FindBy(css = ".card-useful-services-fch .ui-btn")
    private WebElement creditReportsGetBtn;
    /*
     *отчеты окончены
     */

    public final List<WebElement> elements;
    public final List<WebElement> header;
    private final List<WebElement> footer;

    public ForSmallAndMediumBusinessesPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        elements = Arrays.asList(seoTextUnderFooter, credits, creditCards, autoCredits, financialHealthRatingGetBtn,
                creditReportsGetBtn, rfz, fullCreditHistory);
        header = Arrays.asList(headerPage.logoLink, headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink, headerPage.bankGuaranteesLink,
                headerPage.settlementAccountLink, headerPage.businessLoansLink);
        footer = Arrays.asList(footerPage.footerContainer, footerPage.footerLeftSide, footerPage.appleAndGoogle,
                footerPage.footerSeoText, footerPage.becomePartnerLink, footerPage.becomeAgentLink, footerPage.cabinetOfBroker,
                footerPage.cabinetOfBank, footerPage.cabinetOfWebmaster,
                footerPage.copyright, footerPage.copyrightText, footerPage.becomeAgentDown, footerPage.becomePartnerDown,
                footerPage.personalData, footerPage.mail, footerPage.siteMap, footerPage.adress);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footer);

    }
}
