package pages.BrokerCabinet.header;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class HeaderBrokerCabinetPage extends Base {

    @FindBy(xpath = "//img[@src=\"/static/dist/b2b_office/img/logo.f7de1b6.png\"]")
    public WebElement logo;

    @FindBy(xpath = "//a[@href=\"/b2b_office/\"]/div[contains(text(), 'Кабинет агента')]")
    public WebElement logoTitle;

    @FindBy(xpath = "//div[contains(text(), 'Текущий баланс')]")
    public WebElement currentMoney;

    @FindBy(xpath = "//div[@class='ui-app-header-block']/button/span[contains(text(), 'Пополнить счет')]")
    public WebElement giveMoneyBtn;

    @FindBy(css = ".ui-dropdown-menu__head-name")
    public WebElement dropMenu;

    @FindBy(xpath = "//div[contains(text(), 'Каталог офферов')]")
    public WebElement catalogOffersLink;

    @FindBy(xpath = "//div[contains(text(), 'Мои клиенты')]")
    public WebElement myClientsLink;

    @FindBy(xpath = "//div[contains(text(), 'Все услуги')]")
    public WebElement allServicesLink;

    @FindBy(xpath = "//div[@class='ui-menu']/div[contains(text(), 'Финансовый рейтинг клиента')]")
    public WebElement finRatingOfClientLink;

    @FindBy(xpath = "//div[@class='ui-menu']/div[contains(text(), 'Авто')]")
    public WebElement autoLink;

    @FindBy(xpath = "//div[@class='ui-menu']/div[contains(text(), 'Скоринг')]")
    public WebElement scoringLink;

    public List<WebElement> getHeader() {
        return Arrays.asList(logo, logoTitle, currentMoney, giveMoneyBtn,
                dropMenu, catalogOffersLink, myClientsLink, allServicesLink,
                finRatingOfClientLink, autoLink, scoringLink);
    }

    /*
     * Все услуги меню
     */
    @FindBy(xpath = "//div[contains(@class, 'ui-sub-menu-item-text') and contains(text(), 'Рейтинг финансового здоровья')]")
    public WebElement rfzSubMenu;

    @FindBy(xpath = "//div[contains(@class, 'ui-sub-menu-item-text') and contains(text(), 'Кредитный отчет Unicom24')]")
    public WebElement creditReportUnicom24SubMenu;

    @FindBy(xpath = "//div[contains(@class, 'ui-sub-menu-item-text') and contains(text(), 'Кредитный рейтинг')]")
    public WebElement creditRatingSubMenu;

    @FindBy(xpath = "//div[contains(@class, 'ui-sub-menu-item-text') and contains(text(), 'Кредитный отчет')]")
    public WebElement creditReportSubMenu;

    @FindBy(xpath = "//div[contains(@class, 'ui-sub-menu-item-text') and contains(text(), 'Расширенный кредитный рейтинг')]")
    public WebElement wideCreditRatingSubMenu;

    @FindBy(xpath = "//div[contains(@class, 'ui-sub-menu-item-text') and contains(text(), 'FICO')]")
    public WebElement ficoSubMenu;

    @FindBy(xpath = "//div[contains(@class, 'ui-sub-menu-item-text') and contains(text(), 'Проверка автомобиля')]")
    public WebElement checkAutoSubMenu;

    @FindBy(xpath = "//div[contains(@class, 'ui-sub-menu-item-text') and contains(text(), 'Скоринг по номеру телефона')]")
    public WebElement scoringPhoneNumberSubMenu;

    @FindBy(xpath = "//div[contains(@class, 'ui-sub-menu-item-text') and contains(text(), 'Скоринг по соц. сетям')]")
    public WebElement scoringSocialMediaSubMenu;

    public List<WebElement> getSubMenuElements() {
        return Arrays.asList(rfzSubMenu, creditReportUnicom24SubMenu, creditRatingSubMenu,
                creditReportSubMenu, wideCreditRatingSubMenu, ficoSubMenu, checkAutoSubMenu, scoringPhoneNumberSubMenu,
                scoringSocialMediaSubMenu);
    }
    /*
     * Все услуги меню окончено
     */

    /*
     *Финансовый рейтинг меню
     */
    public List<WebElement> getFinRatingSubMenu() {
        return Arrays.asList(rfzSubMenu, creditReportUnicom24SubMenu, creditRatingSubMenu,
                creditReportSubMenu, wideCreditRatingSubMenu, ficoSubMenu);
    }
    /*
     *Финансовый рейтинг меню окончено
     */

    /*
     * Авто меню
     */
    public WebElement getAutoLink() {
        return autoLink;
    }
    /*
     * Авто меню окончено
     */

    /*
     * Скоринг меню
     */
    public List<WebElement> getScoringSubMenu() {
        return Arrays.asList(scoringPhoneNumberSubMenu, scoringSocialMediaSubMenu);
    }
    /*
     * Скоринг меню окончено
     */
}
