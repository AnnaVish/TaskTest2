package pages.BrokerCabinet;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BrokerCabinet.footer.FooterBrokerCabinetPage;
import pages.BrokerCabinet.header.HeaderBrokerCabinetPage;

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

    private final List<WebElement>elements;

    public BrokerCabinetPage(){
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, footer);
        elements = Arrays.asList(mainBlock, rightBlock, understandBtn, closeBtn, rfzTitle, getRfz, hotOffersTitle,
                ingriaTPLogo, russianUnionLogo, arbLogo, russianBusiness, blueLogo);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(header.getHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(footer.getFooter());
        int countOfOffers = driver.findElements(By.cssSelector(".ui-card-hot_offers-contect__offer")).size();
        Assert.assertEquals(4, countOfOffers);
    }

    public void catalogOffersLinkClick() {
        waitForVisibility(header.catalogOffersLink);
        header.catalogOffersLink.click();
    }

    public void myClientsClick() {
        waitForVisibility(header.myClientsLink);
        header.myClientsLink.click();
    }

    public void mouseOverAllServicesLink() {
        waitForVisibility(header.allServicesLink);
        mouseOver(header.allServicesLink);
    }

    public void allServicesMenuIsDisplayed() {
        waitForAllAjaxElementIsVisible(header.getSubMenuElements());
    }

    public void mouseOverFinancialRating() {
        mouseOver(header.finRatingOfClientLink);
    }

    public void finRatingSubMenuIsDisplayed() {
        waitForAllAjaxElementIsVisible(header.getFinRatingSubMenu());
    }

    public void mouseOverAuto() {
        mouseOver(header.autoLink);
    }

    public void autoSubMenuIsDisplayed() {
        waitForAjaxElementIsVisible(header.getAutoLink());
    }

    public void mouseOverScoring() {
        mouseOver(header.scoringLink);
    }

    public void scoringMenuIsDisplayed() {
        waitForAllAjaxElementIsVisible(header.getScoringSubMenu());
    }

    public void rfzSubMenuClick() {
        waitForVisibility(header.rfzSubMenu);
        header.rfzSubMenu.click();
    }

    public void myCustomersMouseOver() {
        waitForVisibility(header.myClientsLink);
        mouseOver(header.myClientsLink);
    }

    public void giveMoneyBtnClick() {
        waitForVisibility(header.giveMoneyBtn);
        header.giveMoneyBtn.click();
    }

    public void giveMoneyPanelIsDisplayed() {
        allElementsAreVisible(header.giveMoneyPanel());
    }

    public void giveMoneyPanelIsNotDisplayed() {
        waitForInvisibilityOfAllElements(header.giveMoneyPanel());
    }

    public void dropMenuClick() {
        waitForVisibility(header.dropMenu);
        header.dropMenu.click();
    }

    public void logOutClick() {
        waitForVisibility(header.logoutBtn);
        header.logoutBtn.click();
    }

}
