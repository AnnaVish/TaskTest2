package pages.Reg;

import TestContext.TestContext;
import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.commonElementsForAllPages.UserData;

import java.util.Arrays;
import java.util.List;

public class ActivationPage extends Base {

    private Header headerPage = new Header();
    private Footer footerPage = new Footer();

    @FindBy(xpath = "//label[./div[contains(text(), 'Начните писать и выбирать из списка (Город)')]]/div[2]/input")
    private WebElement cityField;

    @FindBy(xpath = "//label[./div[contains(text(), 'Фамилия')]]/div[2]/input")
    private WebElement surenameField;

    @FindBy(xpath = "//label[./div[contains(text(), 'Имя')]]/div[2]/input")
    private WebElement nameField;

    @FindBy(xpath = "//label[./div[contains(text(), 'Отчество')]]/div[2]/input")
    private WebElement lastNameField;

    @FindBy(xpath = "//label[./div[contains(text(), 'Серия и номер паспорта')]]/div[2]/input")
    private WebElement serialNumberPassportField;

    @FindBy(xpath = "//label[./div[contains(text(), 'Дата выдачи паспорта')]]/div[2]/input")
    private WebElement dateOfPassportField;

    @FindBy(xpath = "//label[./div[contains(text(), 'Дата рождения')]]/div[2]/input")
    private WebElement birthDayField;

    @FindBy(xpath = "//label[./div[contains(text(), 'Email')]]/div[2]/input")
    private WebElement emailField;

    @FindBy(xpath = "//button[./span[contains(text(), 'Активировать')]]")
    private WebElement activateBtn;

    @FindBy(xpath = "//li[./span[contains(text(), 'Челябинская область, г. Верхний Уфалей')]]")
    private WebElement ufa;

    private final List<WebElement> elements;

    public ActivationPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        headerPage.getMainHeader();
        footerPage.getFooter();
        elements = Arrays.asList(cityField, surenameField, nameField, lastNameField, serialNumberPassportField,
                birthDayField, dateOfPassportField, emailField, activateBtn);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(footerPage.getFooter());
        String phoneInHeader = driver.findElement(By.cssSelector(".ui-dropdown-rating-block div.ui-dropdown-rating-label")).getText();
        Assert.assertEquals(TestContext.correctPhone, phoneInHeader);
    }

    public void typeCity() {
        typeIntoField(UserData.city, cityField);
        waitForAjaxElementIsVisible(ufa);
        ufa.click();
    }

    public void typeNames() {
        typeIntoField(UserData.names, surenameField);
        typeIntoField(UserData.names, nameField);
        typeIntoField(UserData.names, lastNameField);
    }

    public void typePassport() {
        typeIntoField(TestContext.correctPhone, serialNumberPassportField);
        typeIntoField(UserData.dateOfPasport, dateOfPassportField);
    }

    public void typeBirth() {
        typeIntoField(UserData.birthDay, birthDayField);
    }

    public void typeEmail() {
        typeIntoField(UserData.correctEmail, emailField);
    }

    public void activateBtnClick() {
        activateBtn.click();
    }

    public void messageAboutSendedEmailIsDisplayed() {
        waitForAjaxElementIsVisible(By.xpath("//div[contains(text(), 'На указанную почту отправлено письмо с ссылкой для активации личного кабинета, проверьте почту')]"));
        waitForAjaxElementIsVisible(By.cssSelector(".ui-notification-close"));
    }
}
