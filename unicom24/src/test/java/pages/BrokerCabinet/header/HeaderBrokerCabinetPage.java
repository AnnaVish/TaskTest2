package pages.BrokerCabinet.header;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
