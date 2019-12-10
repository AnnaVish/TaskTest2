package pages.AdvCabinet;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.AdvCabinet.Header.HeaderAdvPage;

import java.util.Arrays;
import java.util.List;

public class AdvPage extends Base {

    private final HeaderAdvPage header = new HeaderAdvPage();

    @FindBy(xpath = "//a[contains(text(), 'Отчеты')]")
    private WebElement reportsTab;

    @FindBy(xpath = "//div[contains(text(), 'Заявки')]")
    private WebElement applicationsTitle;

    @FindBy(xpath = "//div[contains(text(), 'Все предложения')]")
    private WebElement offersOptions;

    @FindBy(xpath = "//div[contains(text(), 'Период')]")
    private WebElement periodOptions;

    @FindBy(xpath = "//div[contains(text(), 'Тип кредита')]")
    private WebElement typeOfCredit;

    @FindBy(css = "input.input__field_no-label ")
    private WebElement searchField;

    @FindBy(xpath = "//button[./span[contains(text(), 'Поиск')]]")
    private WebElement searchBtn;

    /*
    *Табы
     */
    @FindBy(xpath = "//a[@href=\"/advertiser_office/requests\"]/a[contains(text(), 'Все заявки')]")
    private WebElement allApplicationsTab;

    @FindBy(xpath = "//a[@href=\"/advertiser_office/requests/new\"]/a[contains(text(), 'Новые')]")
    private WebElement newTab;

    @FindBy(xpath = "//a[@href=\"/advertiser_office/requests/received\"]/a[contains(text(), 'Принятые')]")
    private WebElement takenTab;

    @FindBy(xpath = "//a[@href=\"/advertiser_office/requests/approved\"]/a[contains(text(), 'Одобрено')]")
    private WebElement approvedTab;

    @FindBy(xpath = "//a[@href=\"/advertiser_office/requests/loaned\"]/a[contains(text(), 'Выдано')]")
    private WebElement givenTab;

    @FindBy(xpath = "//a[@href=\"/advertiser_office/requests/declined\"]/a[contains(text(), 'Отказано')]")
    private WebElement deniedTab;

    @FindBy(xpath = "//a[@href=\"/advertiser_office/requests/rejected\"]/a[contains(text(), 'Отклоненные')]")
    private WebElement refusedTab;

    @FindBy(xpath = "//a[@href=\"/advertiser_office/requests/not_relevant\"]/a[contains(text(), 'Неактуальные')]")
    private WebElement notActualTab;
    /*
     *Табы окнчены
     */

    private final List<WebElement>headerAdvPage;
    private final List<WebElement>elements;

    public AdvPage(){
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        headerAdvPage = Arrays.asList(header.logo, header.logoTitle, header.currentMoney, header.giveMoneyBtn,
                header.dropMenu, header.applicationsTab);
        elements = Arrays.asList(applicationsTitle, offersOptions, periodOptions, typeOfCredit, searchField, searchBtn,
                allApplicationsTab, newTab, takenTab, approvedTab, givenTab, deniedTab, refusedTab, notActualTab);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(headerAdvPage);
        allElementsAreVisible(elements);
    }

    public void reportsTabClick() {
        reportsTab.click();
    }

    public void dropMenuClick() {
        waitForVisibility(header.dropMenu);
        header.dropMenu.click();
    }

    public void dropMenuLogOutClick() {
        waitForVisibility(header.dropMenuLogOut);
        header.dropMenuLogOut.click();
    }

}
