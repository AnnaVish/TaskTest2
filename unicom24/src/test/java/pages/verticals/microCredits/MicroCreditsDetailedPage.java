package pages.verticals.microCredits;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.verticals.common.CommonElements;

import java.util.Arrays;
import java.util.List;

public class MicroCreditsDetailedPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();
    CommonElements commonElements = new CommonElements();

    @FindBy(xpath = "//div[contains(text(), 'Лицезния ЦБ')]")
    private WebElement licenseOfCB;

    @FindBy(xpath = "//span[contains(text(), 'Расчет кредита')]")
    private WebElement countCreditTitle;

    @FindBy(xpath = "//div[contains(text(), 'Какая сумма вам нужна')]")
    private WebElement howMuchMoneyYouNeed;

    @FindBy(xpath = "//label[./div[contains(text(), 'Какая сумма вам нужна')]]/div/input")
    private WebElement howMuchYouNeedInput;

    @FindBy(xpath = "//div[contains(text(), 'На какой срок')]")
    private WebElement howMuchTimeYouNeed;

    @FindBy(xpath = "//label[./div[contains(text(), 'На какой срок')]]/div/input")
    private WebElement howMuchTimeInput;

    @FindBy(xpath = "//div[@class='rate']/div[contains(text(), 'Ставка')]")
    private WebElement percent;

    @FindBy(xpath = "//div[contains(text(), 'Ежемесячный платеж')]")
    private WebElement paymentPerMonth;

    @FindBy(xpath = "//button[./span[contains(text(), 'Получить кредит')]]")
    private WebElement getCreditBtn;

    @FindBy(xpath = "//a[contains(text(), 'График платежей')]")
    private WebElement schedualOfPayment;

    @FindBy(xpath = "//a[contains(text(), 'Частным клиентам')]")
    private WebElement privateClientsBread;

//    @FindBy(xpath = "//li/span[contains(text(), 'Займы онлайн')]")
//    private WebElement privateClientsMFOBread;

    @FindBy(xpath = "//a[contains(text(), 'Займы онлайн')]")
    private WebElement privateClientsMFOBread;

    public final List<WebElement> elements;

    public MicroCreditsDetailedPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, commonElements);
        elements = Arrays.asList(privateClientsMFOBread, privateClientsBread, commonElements.bankBlock,
                commonElements.headerOfBank, commonElements.rating, countCreditTitle, licenseOfCB, howMuchMoneyYouNeed,
                howMuchYouNeedInput, howMuchTimeYouNeed, howMuchTimeInput, percent, paymentPerMonth, getCreditBtn,
                schedualOfPayment, commonElements.offersTab, commonElements.conditionsTab, commonElements.documentsTab,
                commonElements.commentsTab, commonElements.aboutOrgTab, commonElements.bet, commonElements.sum,
                commonElements.time, commonElements.age, commonElements.beforeApproved);
        headerPage.getMainHeader();
        footerPage.getFooter();
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(footerPage.getFooter());
        Header.checkBreadCrumbs(4);
    }
}
