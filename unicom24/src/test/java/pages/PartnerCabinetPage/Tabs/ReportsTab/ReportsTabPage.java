package pages.PartnerCabinetPage.Tabs.ReportsTab;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;
import java.util.List;

public class ReportsTabPage extends Base {

    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

    @FindBy(xpath = "//div[@class='navigation']/div[@class='ds-button-wrapper']")
    private List<WebElement> reportTabs;

    //Серая кнопка Очистить
    @FindBy(xpath = "//div[contains(text(), 'Очистить')]")
    protected WebElement clearBtn;

    //зеленая кнопка показать
    @FindBy(xpath = "//button[contains(text(), 'Показать')]")
    protected WebElement showBtn;

    //даты с по
    @FindBy(xpath = "//div[@class='vdp-datepicker']//input")
    protected List<WebElement> periodsInputs;


    public ReportsTabPage() {
        PageFactory.initElements(driver, this);
    }

    public void pageIsDisplayed() {
        header.headerIsDisplayed();
        waitForCountOfAjaxElementsEqualTo(By.xpath("//div[@class='navigation']/div[@class='ds-button-wrapper']"), 5);
        Assert.assertEquals(5, reportTabs.size());
    }

    public void selectTypeReports(String tabName){
        for (WebElement element : reportTabs) {
            if (element.getText().equals(tabName)) {
                waitForVisibility(element);
                element.click();
                break;
            }
        }
    }

}
