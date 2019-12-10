package pages.BrokerCabinet;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BrokerCabinet.footer.FooterBrokerCabinetPage;
import pages.BrokerCabinet.header.HeaderBrokerCabinetPage;

import java.util.Arrays;
import java.util.List;

public class BrokerCreditRatingPage extends Base {

    private final HeaderBrokerCabinetPage header = new HeaderBrokerCabinetPage();
    private final FooterBrokerCabinetPage footer = new FooterBrokerCabinetPage();

    @FindBy (xpath = "//h1[contains(text(), 'Кредитный рейтинг')]")
    private WebElement creditRatingMainTitle;

    @FindBy (css = ".ui-credit-rating-header_preview-img")
    private WebElement creditRatingPreview;

    private final List<WebElement>elements;

    public BrokerCreditRatingPage() {
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, footer);
        elements = Arrays.asList(creditRatingMainTitle, creditRatingPreview);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
        allElementsAreVisible(header.getHeader());
        allElementsAreVisible(footer.getFooter());
    }

}
