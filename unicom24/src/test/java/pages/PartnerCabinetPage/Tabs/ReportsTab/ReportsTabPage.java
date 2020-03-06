package pages.PartnerCabinetPage.Tabs.ReportsTab;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;
import pages.PartnerCabinetPage.Tabs.ReportsTab.Trafic.TraficPage;

import java.util.Arrays;
import java.util.List;

public class ReportsTabPage extends Base {

    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

    @FindBy(css = ".reports-heading-navigation div")
    private List<WebElement> reportTabs;

    //Серая кнопка Очистить
    @FindBy(xpath = "//div[contains(text(), 'Очистить')]")
    protected WebElement clearBtn;

    //зеленая кнопка показать
    @FindBy(xpath = "//div[contains(text(), 'Показать')]")
    protected WebElement showBtn;

    //даты с по
    @FindBy(css = ".reports-toolbar-dates-input-wrapper input")
    protected List<WebElement> periodsInputs;


    public ReportsTabPage() {
        PageFactory.initElements(driver, this);
    }

    public void pageIsDisplayed() {
        header.headerIsDisplayed();
        Assert.assertEquals(5, reportTabs.size());
    }


}
