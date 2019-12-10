package pages.BrokerCabinet;

import base.Base;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BrokerCabinet.footer.FooterBrokerCabinetPage;
import pages.BrokerCabinet.header.HeaderBrokerCabinetPage;

import java.util.Arrays;
import java.util.List;

public class BrokerSocialNetworksScoringPage extends Base {

    private final HeaderBrokerCabinetPage header = new HeaderBrokerCabinetPage();
    private final FooterBrokerCabinetPage footer = new FooterBrokerCabinetPage();

    @FindBy (xpath = "//h1[contains(text(), 'Скоринг по социальным сетям')]")
    private WebElement socialNetworksScoringTitle;

    private final List<WebElement>elements;

    public BrokerSocialNetworksScoringPage() {
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, footer);
        elements = Arrays.asList(socialNetworksScoringTitle);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
        allElementsAreVisible(header.getHeader());
        allElementsAreVisible(footer.getFooter());
    }
}
