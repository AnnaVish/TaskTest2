package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class CreditReportsPage extends Base {

    @FindBy(xpath = "//div[contains(text(), 'Полная кредитная история')]")
    private WebElement historyTitle;

    @FindBy(xpath = "//span[contains(text(), 'Получить отчет')]")
    private WebElement getReportBtn;

    public final List<WebElement> elements;

    public CreditReportsPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(historyTitle, getReportBtn);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
    }
}
