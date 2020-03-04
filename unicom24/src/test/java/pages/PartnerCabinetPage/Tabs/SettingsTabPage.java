package pages.PartnerCabinetPage.Tabs;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;

import java.util.Arrays;
import java.util.List;

public class SettingsTabPage extends Base {

    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

    @FindBy(xpath = "//div[contains(text(), 'Настройки')]")
    private WebElement settingsTitle;

    @FindBy(xpath = "//div[./div[contains(text(), 'Демо режим')]]/div[2]/label/span")
    private WebElement demoSwitcher;

    @FindBy(xpath = "//div[./div[contains(text(), 'Новые офферы')]]/div[2]/label/span")
    private WebElement newOfferSwitcher;

    @FindBy(xpath = "//div[./div[contains(text(), 'Изменения офферов')]]/div[2]/label/span")
    private WebElement changeOffersSwitcher;

    @FindBy(xpath = "//div[contains(text(), 'Яндекс.Метрика ID:')]")
    private WebElement yaMeter;

    @FindBy(xpath = "//button[contains(text(), 'Сохранить')]")
    private WebElement saveBtn;

    private final List<WebElement> elements;

    public SettingsTabPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(settingsTitle, demoSwitcher, newOfferSwitcher, changeOffersSwitcher, yaMeter, saveBtn);
    }

    public void pageIsDisplayed() {
        header.headerIsDisplayed();
        allElementsAreVisible(elements);
    }
}
