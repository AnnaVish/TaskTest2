package pages.PartnerCabinetPage.Header;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    /*
     *Нижний хэдэр
     */

    @FindBy(xpath = "//a[@href=\"/partners/office/statistics/total\"][contains(text(), 'Отчеты')]")
    public WebElement statisticLink;

    @FindBy(xpath = "//a[@href=\"/partners/office/offers\"][contains(text(), 'Офферы')]")
    public WebElement offersLink;

    @FindBy(xpath = "//a[@href=\"/partners/office/landings\"][contains(text(), 'Лендинги')]")
    public WebElement landingsLink;

    @FindBy(xpath = "//a[@href=\"/partners/office/cross-reports\"][contains(text(), 'Продукты')]")
    public WebElement productsLink;

    @FindBy(xpath = "//a[@href=\"/partners/office/postback\"][contains(text(), 'Постбек')]")
    public WebElement postBacksLink;

    @FindBy(xpath = "//a[@href=\"/partners/office/help/\"][contains(text(), 'Справка')]")
    public WebElement helpLink;

    @FindBy(xpath = "//a[@href=\"/partners/office/settings\"][contains(text(), 'Настройки')]")
    public WebElement settingsLink;

    @FindBy(xpath = "//img[@src=\"/static/dist/partners/office/img/icons/graphx-4e5169fcbf.png\"]")
    public WebElement staticticImg;

    @FindBy(xpath = "//a[contains(@href, 'https://docs.google.com/spreadsheets') and contains(text(), 'Статистика офферов на рынке')]")
    public WebElement statisticTitle;
    /*
     *Нижний хэдэр окончен
     */

    public List<WebElement> getHeaderPartnerCabinetPage() {
        return Arrays.asList(headerContainer, logo, logoTitle, balance,
                getMoney, patentialMoney, moneyOfAllTime, getMoneyForAllTime,
                logOutBtn, ringBtn, statisticLink, offersLink, landingsLink,
                productsLink, postBacksLink, helpLink, settingsLink,
                staticticImg, statisticTitle);
    }
}
