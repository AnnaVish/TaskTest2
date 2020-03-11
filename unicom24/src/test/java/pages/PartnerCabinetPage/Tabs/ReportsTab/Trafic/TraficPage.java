package pages.PartnerCabinetPage.Tabs.ReportsTab.Trafic;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Tabs.ReportsTab.ReportsTabPage;

import java.util.Arrays;
import java.util.List;

public class TraficPage extends ReportsTabPage {

    //Вкладки сводный детализированный единый
    @FindBy(xpath = "//div[@class='ds-button-group']//button")
    protected List<WebElement> navigationBTNs;

    //большие лэйблы
    @FindBy(css = ".reports-toolbar-filters label")
    private List<WebElement> labels;


    public TraficPage() {
        PageFactory.initElements(driver, this);
    }

    public void pageIsDisplayed() {
        super.pageIsDisplayed();
        allElementsAreVisible(navigationBTNs); // чтоб не падал
        allElementsAreVisible(periodsInputs); // тож чтоб не падал
        Assert.assertEquals(7, navigationBTNs.size()); // изменил на 7, так как нижние кнопки тоже надо считать
        Assert.assertEquals(2, periodsInputs.size());
        allElementsAreVisible(navigationBTNs);
        allElementsAreVisible(periodsInputs);
        waitForVisibility(showBtn);
    }

    public void selectMainFilter(String nameMainFilter) {
        for (WebElement element : navigationBTNs) {
            if (element.getText().equals(nameMainFilter)) {
                waitForVisibility(element);
                element.click();
                break;
            }
        }
    }

}
