package pages.AdvCabinet.Header;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderAdvPage {

    @FindBy(xpath = "//img[@src=\"/static/dist/advertiser_office/img/logo.f7de1b6.png\"]")
    public WebElement logo;

    @FindBy(xpath = "//a[@href=\"/advertiser_office/\"]/div[contains(text(), 'Кабинет Банков и Рекламодателей')]")
    public WebElement logoTitle;

    @FindBy(xpath = "//div[contains(text(), 'Текущий баланс')]")
    public WebElement currentMoney;

    @FindBy(xpath = "//div[@class='ui-app-header-block']/button/span[contains(text(), 'Пополнить счет')]")
    public WebElement giveMoneyBtn;

    @FindBy(css = ".ui-dropdown-menu__head-name")
    public WebElement dropMenu;

    @FindBy(xpath = "//a[@href=\"/advertiser_office/requests\" and contains(text(), 'Заявки')]")
    public WebElement applicationsTab;
}
