package pages.PartnerCabinetPage.Header;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class HeaderPartnerCabinetPage extends Base {

    /*
     *Верхний хэдэр
     */
    @FindBy(css = ".ui-app-header__dash")
    public WebElement headerContainer;

    @FindBy(css = ".ui-app-header__dash-item.ui-app-header__dash-item_logo")
    public WebElement logo;

    @FindBy(xpath = "//div[contains(text(), 'Кабинет Вебмастеров')]")
    public WebElement logoTitle;

    @FindBy(xpath = "//div[@href=\"/partners/office/statistics/total\"]/div[contains(text(), 'Текущий баланс')]")
    public WebElement balance;

    @FindBy(xpath = "//div[@class='ui-app-header__dash-item ui-app-header__dash-item-w-border ui-app-header__dash-item_hide-s']/div[contains(text(), 'Вывести деньги')]")
    public WebElement getMoney;

    @FindBy(xpath = "//div[@href=\"/partners/office/statistics/total\"]/div[contains(text(), 'Возможный максимальный доход')]")
    public WebElement patentialMoney;

    @FindBy(xpath = "//div[@href=\"/partners/office/statistics/total\"]/div[contains(text(), 'Заработано за все время')]")
    public WebElement moneyOfAllTime;

    @FindBy(xpath = "//div[@href=\"/partners/office/statistics/total\"]/div[contains(text(), 'Выведено за все время')]")
    public WebElement getMoneyForAllTime;

    @FindBy(xpath = "//div[contains(@class,'ui-app-header__dash-item')]/div[contains(text(), 'Выход')]")
    public WebElement logOutBtn;

    @FindBy(xpath = "//div[./img[@src=\"/static/dist/partners/office/img/icons/alert-b1f1245cd7.svg\"]]")
    public WebElement ringBtn;
    /*
     *Верхний хэдэр окончен
     */

    @FindBy(css = "nav a")
    private List<WebElement>downHeader;

    private final List<WebElement>elements;

    public HeaderPartnerCabinetPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(headerContainer, logo, logoTitle, balance,
                getMoney, patentialMoney, moneyOfAllTime, getMoneyForAllTime,
                logOutBtn, ringBtn);
    }

    public void headerIsDisplayed() {
        allElementsAreVisible(elements);
        Assert.assertEquals(10, downHeader.size());
    }

    public List<WebElement> returnDownHeader() {
        return downHeader;
    }

}
