package pages.BrokerCabinet;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BrokerCabinet.footer.FooterBrokerCabinetPage;
import pages.BrokerCabinet.header.HeaderBrokerCabinetPage;

import java.util.Arrays;
import java.util.List;

/*Что такое "extends Base"?*/
public class BrokerRFZPage extends Base {

    private final HeaderBrokerCabinetPage header = new HeaderBrokerCabinetPage();
    private final FooterBrokerCabinetPage footer = new FooterBrokerCabinetPage();

    @FindBy(xpath = "//h1[contains(text(), 'Рейтинг финансового здоровья')]")
    private WebElement rfzMainTitle;

    @FindBy (xpath = "//div[contains(text(), 'Получите мгновенный отчет по потенциальному заемщику')]")
    private WebElement commentOfRfzMainTitle;

    @FindBy (css = ".ui-financial-health-header_preview-img")
    private WebElement rfzPreview;

    private final List<WebElement>elements;

    public BrokerRFZPage() {
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, footer);
        elements = Arrays.asList(rfzMainTitle, commentOfRfzMainTitle, rfzPreview);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
        allElementsAreVisible(header.getHeader());
        allElementsAreVisible(footer.getFooter());
    }

}
