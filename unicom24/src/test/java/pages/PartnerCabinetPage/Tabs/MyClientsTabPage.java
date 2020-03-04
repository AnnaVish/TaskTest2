package pages.PartnerCabinetPage.Tabs;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;

import java.util.Arrays;
import java.util.List;

public class MyClientsTabPage extends Base {
    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

    @FindBy(xpath = "//div[contains(text(), 'Мои клиенты')]")
    private WebElement myClientsTitle;

    @FindBy(css = ".ui-clients-controls-wrapper")
    private WebElement panelWithTabs;

    @FindBy(xpath = "//div[@class='ui-clients-table-wrapper ng-scope']")
    private WebElement listOfTab;

    @FindBy(xpath = "//div[@class='ui-offers-header-input']/input")
    private WebElement inputFieldTab;

    @FindBys(
            @FindBy(css = ".ui-clients-controls-button")
    )
    private List<WebElement> buttonsTabs;

    private final List<WebElement> elements;

    public MyClientsTabPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, header);
        elements = Arrays.asList(myClientsTitle, panelWithTabs, listOfTab, inputFieldTab);
    }

    public void pageIsDisplayed() {
        header.headerIsDisplayed();
        allElementsAreVisible(elements);
        Assert.assertEquals(buttonsTabs.size(),6);
    }
}
