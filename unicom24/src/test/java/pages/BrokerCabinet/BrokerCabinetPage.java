package pages.BrokerCabinet;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BrokerCabinet.footer.FooterBrokerCabinetPage;
import pages.BrokerCabinet.header.HeaderBrokerCabinetPage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class BrokerCabinetPage extends Base {

    private final HeaderBrokerCabinetPage header = new HeaderBrokerCabinetPage();
    private final FooterBrokerCabinetPage footer = new FooterBrokerCabinetPage();

    @FindBy(css = ".ui-absent-block")
    private WebElement mainBlock;

    @FindBy(css = ".ui-tabs-table-online-wrapper")
    private WebElement rightBlock;

    @FindBy(xpath = "//button[./span[contains(text(), 'Спасибо, я ознакомился')]]")
    private WebElement understandBtn;

    @FindBy(css = ".ui-absent-block-close")
    private WebElement closeBtn;

    @FindBy(xpath = "//div[contains(text(), 'Рейтинг финансового здоровья')]")
    private WebElement rfzTitle;

    @FindBy(xpath = "//button[./span[contains(text(), 'Получить')]]")
    private WebElement getRfz;

    @FindBy(xpath = "//div[@class='yellow-block']/div/div/div[contains(text(), 'Горячие офферы')]")
    private WebElement hotOffersTitle;

    @FindBy(xpath = "//div[@class='grey-block']/div/div/div/div/img[@src=\"/static/dist/b2b_office/img/part1.e8fb163.png\"]")
    private WebElement ingriaTPLogo;

    @FindBy(xpath = "//div[@class='grey-block']/div/div/div/div/img[@src=\"/static/dist/b2b_office/img/part2.27757bf.png\"]")
    private WebElement russianUnionLogo;

    @FindBy(xpath = "//div[@class='grey-block']/div/div/div/div/img[@src=\"/static/dist/b2b_office/img/part3.962e0a8.png\"]")
    private WebElement arbLogo;

    @FindBy(xpath = "//div[@class='grey-block']/div/div/div/div/img[@src=\"/static/dist/b2b_office/img/part4.a1a6e52.png\"]")
    private WebElement russianBusiness;

    @FindBy(xpath = "//div[@class='grey-block']/div/div/div/div/img[@src=\"/static/dist/b2b_office/img/part5.9534336.png\"]")
    private WebElement blueLogo;

    private final List<WebElement>headerBrokerCabinetPage;
    private final List<WebElement>elements;
    private final List<WebElement>footerBrokerCabinetPage;

    public BrokerCabinetPage(){
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, footer);
        headerBrokerCabinetPage = Arrays.asList(header.logo, header.logoTitle, header.currentMoney, header.giveMoneyBtn,
                header.dropMenu, header.catalogOffersLink, header.myClientsLink, header.allServicesLink,
                header.finRatingOfClientLink, header.autoLink, header.scoringLink);
        elements = Arrays.asList(mainBlock, rightBlock, understandBtn, closeBtn, rfzTitle, getRfz, hotOffersTitle,
                ingriaTPLogo, russianUnionLogo, arbLogo, russianBusiness, blueLogo);
        footerBrokerCabinetPage = Arrays.asList(footer.footerContainer, footer.footerTitle, footer.rfzLink,
                footer.creditRatingLink, footer.creditReportLink, footer.bigCreditRatingLink, footer.ficioLink,
                footer.middleSideOfFooterTitle, footer.scoringTelephoneNumberLink, footer.scoringSocialMediaLink,
                footer.rightSideOfFooterTitle, footer.checkAutoLink, footer.supportTitle, footer.supportLink,
                footer.footerIcons, footer.copyRight, footer.doneBy, footer.dataProtectedBy);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(headerBrokerCabinetPage);
        allElementsAreVisible(elements);
        allElementsAreVisible(footerBrokerCabinetPage);
        int countOfOffers = driver.findElements(By.cssSelector(".ui-card-hot_offers-contect__offer")).size();
        Assert.assertEquals(4, countOfOffers);
    }
}
