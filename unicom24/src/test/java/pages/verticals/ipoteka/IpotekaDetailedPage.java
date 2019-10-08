package pages.verticals.ipoteka;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.verticals.common.CommonElements;

import java.util.Arrays;
import java.util.List;

public class IpotekaDetailedPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();
    CommonElements commonElements = new CommonElements();

    @FindBy(xpath = "//div[contains(text(), 'Лицезния ЦБ')]")
    private WebElement licenseOfCB;

    @FindBy(xpath = "//span[contains(text(), 'Стоимость недвижимости')]")
    private WebElement priceOfRealty;

    @FindBy(xpath = "//div[./div[./span[contains(text(), 'Стоимость недвижимости')]]]/div[2]/input")
    private WebElement priceOfRealtyInput;

    @FindBy(xpath = "//span[contains(text(), 'Первоначальный взнос')]")
    private WebElement firstDonation;

    @FindBy(xpath = "//div[./div[./span[contains(text(), 'Первоначальный взнос')]]]/div[2]/input")
    private WebElement firstDonationInput;

    @FindBy(xpath = "//span[contains(text(), 'Срок ипотеки')]")
    private WebElement durationOfIpoteka;

    @FindBy(xpath = "//div[./div[./span[contains(text(), 'Срок ипотеки')]]]/div[2]/input")
    private WebElement durationOfIpotekaInput;

    @FindBy(xpath = "//div[@class='font__base-small_grey' and contains(text(), 'Ставка')]")
    private WebElement percent;

    @FindBy(xpath = "//div[@class='font__base-small_grey' and contains(text(), 'Ежемесячный платеж')]")
    private WebElement paymentPerMonth;

    @FindBy(xpath = "//div[@class='font__base-small_grey' and contains(text(), 'Переплата')]")
    private WebElement moreThanNeed;

    @FindBy(xpath = "//div[@class='font__base-small_grey' and contains(text(), 'Общая сумма выплат')]")
    private WebElement commonSum;

    @FindBy(xpath = "//button[./span[contains(text(), 'Получить ипотеку')]]")
    private WebElement getIpotekaBtn;

    @FindBy(xpath = "//a[contains(text(), 'График платежей')]")
    private WebElement schedualOfPayment;

    @FindBy(xpath = "//a[contains(text(), 'Частным клиентам')]")
    private WebElement privateClientsBread;

    @FindBy(xpath = "//li/span[contains(text(), 'Ипотека')]")
    private WebElement privateClientsIpotekaBread;

    public final List<WebElement> elements;
    public final List<WebElement> header;
    private final List<WebElement> footer;

    public IpotekaDetailedPage(){
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, commonElements);
        elements = Arrays.asList(privateClientsBread, privateClientsIpotekaBread ,
                commonElements.bankBlock, commonElements.headerOfBank, commonElements.rating,
                priceOfRealty, licenseOfCB, priceOfRealtyInput, firstDonation, firstDonationInput, durationOfIpoteka,
                durationOfIpotekaInput, percent, paymentPerMonth, commonSum, getIpotekaBtn, schedualOfPayment,
                moreThanNeed, commonElements.offersTab, commonElements.conditionsTab, commonElements.documentsTab,
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
        allElementsAreVisible(elements);
        allElementsAreVisible(header);
        allElementsAreVisible(footer);
        Assert.assertEquals(3, driver.findElements(By.cssSelector("ul.ui-breadcrumbs-list  li")).size());
    }
}