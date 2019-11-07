package pages.PartnerCabinetPage.Tabs;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;

import java.util.Arrays;
import java.util.List;

public class ReferenceTabPage extends Base {

    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

    @FindBy(xpath = "//div[contains(text(), 'Справка')]")
    private WebElement referenceTitle;

    @FindBy(css = ".ui-help-container-content")
    private WebElement documentsContainer;

    @FindBy(css = "div.ui-help-container-images-item")
    private WebElement document;

    @FindBy(xpath = "//div[contains(text(), 'Информация для разработчиков')]")
    private WebElement forDevelopersTitle;

    @FindBy(xpath = "//div[contains(text(), 'API')]")
    private WebElement apiTitle;

    @FindBy(xpath = "//div[contains(text(), 'Универсальное')]")
    private WebElement universalLink;

    @FindBy(xpath = "//div[contains(text(), 'Единый оффер')]")
    private WebElement uniounOfferLink;

    @FindBy(xpath = "//div[contains(text(), 'Документы')]")
    private WebElement documentsLink;

    private final List<WebElement> elements;
    private final List<WebElement> headerPartnerCabinetPage;

    public ReferenceTabPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, header);
        elements = Arrays.asList(referenceTitle, documentsContainer, document, forDevelopersTitle, apiTitle,
                universalLink, uniounOfferLink, documentsLink);
        headerPartnerCabinetPage = Arrays.asList(header.headerContainer, header.logo, header.logoTitle, header.balance,
                header.getMoney, header.patentialMoney, header.moneyOfAllTime, header.getMoneyForAllTime,
                header.logOutBtn, header.ringBtn, header.statisticLink, header.offersLink, header.landingsLink,
                header.productsLink, header.postBacksLink, header.helpLink, header.settingsLink,
                header.staticticImg, header.statisticTitle);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
        allElementsAreVisible(headerPartnerCabinetPage);
    }
}
