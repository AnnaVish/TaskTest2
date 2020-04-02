package pages.partnerCabinetPage.Tabs;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.partnerCabinetPage.Header.HeaderPartnerCabinetPage;

import java.util.Arrays;
import java.util.List;

public class ReferenceTabPage extends Base {

    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

    @FindBy(xpath = "//div[contains(text(), 'Справка')]")
    private WebElement referenceTitle;

    @FindBy(xpath = "//div[@class='content']")
    private WebElement documentsContainer;

    @FindBy(xpath = "//div[contains(text(), 'Информация для разработчиков')]")
    private WebElement forDevelopersTitle;

    @FindBy(xpath = "//a[contains(text(), 'API')]")
    private WebElement apiTitle;

    @FindBy(xpath = "//a[contains(text(), 'Универсальное')]")
    private WebElement universalLink;

    @FindBy(xpath = "//a[contains(text(), 'Единый оффер')]")
    private WebElement uniounOfferLink;

    @FindBy(xpath = "//a[contains(text(), 'Документы')]")
    private WebElement documentsLink;

    private final List<WebElement> elements;

    public ReferenceTabPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, header);
        elements = Arrays.asList(referenceTitle, documentsContainer, forDevelopersTitle, apiTitle,
                universalLink, uniounOfferLink, documentsLink);
    }

    public void pageIsDisplayed() {
        header.headerIsDisplayed();
        allElementsAreVisible(elements);
    }
}
