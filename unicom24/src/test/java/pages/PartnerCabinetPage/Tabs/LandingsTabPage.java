package pages.PartnerCabinetPage.Tabs;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;

import java.util.Arrays;
import java.util.List;

public class LandingsTabPage extends Base {

    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

    @FindBy(xpath = "//div[contains(text(), 'Лендинги')]")
    private WebElement landingsTitle;

    @FindBy(xpath = "//div[./div[contains(text(), 'Динамический лендинг')]]/div[2]/div[2]/div/div/div[contains(text(), 'Подключение')]")
    private WebElement dynamicLandingConnectTab;

    @FindBy(xpath = "//div[./div[contains(text(), 'Динамический лендинг')]]/div[2]/div[2]/div/div/div[contains(text(), 'Описание')]")
    private WebElement dynamicLandingDescriptionTab;

    @FindBy(xpath = "//div[./div[contains(text(), 'Динамический лендинг')]]/div[2]/div[2]/div/div/div[contains(text(), 'Настройка')]")
    private WebElement dynamicLandingSettingsTab;

    @FindBy(xpath = "//div[./div[contains(text(), 'Рейтинг Финансового Здоровья')]]/div[2]/div[2]/div/div/div[contains(text(), 'Подключение')]")
    private WebElement rfzConnectTab;

    @FindBy(xpath = "//div[./div[contains(text(), 'Рейтинг Финансового Здоровья')]]/div[2]/div[2]/div/div/div[contains(text(), 'Описание')]")
    private WebElement rfzDescriptionTab;

    @FindBy(xpath = "//div[./div[contains(text(), 'mfi_iframe_v101')]]/div[2]/div[2]/div/div/div[contains(text(), 'Подключение')]")
    private WebElement mfiConnectTab;

    @FindBy(xpath = "//div[./div[contains(text(), 'mfi_iframe_v101')]]/div[2]/div[2]/div/div/div[contains(text(), 'Описание')]")
    private WebElement mfiDescriptionTab;

    private final List<WebElement> elements;
    private final List<WebElement> headerPartnerCabinetPage;

    public LandingsTabPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, header);
        elements = Arrays.asList(landingsTitle, dynamicLandingConnectTab, dynamicLandingDescriptionTab,
                dynamicLandingSettingsTab, rfzConnectTab, rfzDescriptionTab, mfiConnectTab, mfiDescriptionTab);
        headerPartnerCabinetPage = Arrays.asList(header.headerContainer, header.logo, header.logoTitle, header.balance,
                header.getMoney, header.patentialMoney, header.moneyOfAllTime, header.getMoneyForAllTime,
                header.logOutBtn, header.ringBtn, header.statisticLinck, header.offersLink, header.lendingsLink,
                header.productsLink, header.postBacksLick, header.helpLink, header.settingsLink,
                header.staticticImg, header.statisticTitle);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
        allElementsAreVisible(headerPartnerCabinetPage);
    }
}
