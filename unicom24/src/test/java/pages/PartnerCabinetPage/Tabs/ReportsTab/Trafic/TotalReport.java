package pages.PartnerCabinetPage.Tabs.ReportsTab.Trafic;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Tabs.ReportsTab.ReportsTabPage;

import java.util.Arrays;
import java.util.List;

public class TotalReport extends ReportsTabPage {

    //Вкладки сводный детализированный единый
    @FindBy(css = ".header button")
    protected List<WebElement> navigationBTNs;

    //большие лэйблы
    @FindBy(css = ".reports-toolbar-filters label")
    private List<WebElement> labels;

    //Группировка по Дата Оффер UTM Sub_id внизу навигационной панели
    @FindBy(css = ".group-by button")
    private List<WebElement>groupByBtn;


    public TotalReport() {
        PageFactory.initElements(driver, this);
    }

    public void pageIsDisplayed() {
        super.pageIsDisplayed();
        allElementsAreVisible(navigationBTNs);
        allElementsAreVisible(periodsInputs);
        allElementsAreVisible(groupByBtn);
        waitForVisibility(showBtn);
        Assert.assertEquals(3, navigationBTNs.size());
        Assert.assertEquals(2, periodsInputs.size());
        Assert.assertEquals(4, groupByBtn.size());
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
