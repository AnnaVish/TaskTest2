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
    @FindBy(css = ".reports-toolbar-navigation-list div")
    protected List<WebElement> navigationBtns;

    //большие лэйблы
    @FindBy(css = ".reports-toolbar-filters label")
    private List<WebElement> labels;


    public TraficPage() {
        PageFactory.initElements(driver, this);
    }

    public void pageIsDisplayed() {
        super.pageIsDisplayed();
        Assert.assertEquals(3, navigationBtns.size());
        Assert.assertEquals(2, periodsInputs.size());
        allElementsAreVisible(navigationBtns);
        allElementsAreVisible(periodsInputs);
        waitForVisibility(showBtn);
    }

    public void selectMainFilter(String nameMainFilter) {
        for (WebElement element : navigationBtns) {
            if (element.getText().equals(nameMainFilter)) {
                waitForVisibility(element);
                element.click();
                break;
            }
        }
    }

}
