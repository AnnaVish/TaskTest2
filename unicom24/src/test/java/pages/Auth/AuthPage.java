package pages.Auth;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;

import java.util.Arrays;
import java.util.List;

public class AuthPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();

    public static String login = "glushkova.es@unicom24.ru";
    public static String password = "usertest1";

    @FindBy(className = "ui-authorization-form")
    private WebElement authForm;

    @FindBy(xpath = "//div[contains(text(), 'Войти')]")
    private WebElement entranceLink;

    @FindBy(xpath = "//div[contains(text(), 'Регистрация')]")
    private WebElement registrationTab;
    
    @FindBy(name = "emanresu_htua")
    private WebElement mailOrTelField;

    @FindBy(name = "drowssap_htua")
    private WebElement passwordField;

    @FindBy(className = "ui-authorization-ui-button-container")
    private WebElement entranceBtn;

    @FindBy(xpath = "//div[contains(text(), 'Зарегистрироваться')]")
    private WebElement registrationLink;

    @FindBy(xpath = "//div[contains(text(), 'Забыли пароль')]")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//div[contains(text(), 'Авторизация через портал Госуслуг')]")
    private WebElement authGosUslugiLink;

    private final List<WebElement>elements;
    public final List<WebElement> header;
    private final List<WebElement> footer;

    public AuthPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        header = Arrays.asList(headerPage.logoLink, headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink,
                headerPage.creditsHeaderLink, headerPage.creditCardsHeaderLink, headerPage.autoCreditsHeaderLink,
                headerPage.ipotekaHeaderLink, headerPage.refinanceHeaderLink);
        elements = Arrays.asList(authForm, entranceLink, registrationTab, mailOrTelField, passwordField,
                entranceBtn, registrationLink, forgotPasswordLink, authGosUslugiLink);
        footer = Arrays.asList(footerPage.footerContainer, footerPage.footerLeftSide, footerPage.appleAndGoogle,
                footerPage.footerSeoText, footerPage.becomePartnerLink, footerPage.becomeAgentLink, footerPage.cabinetOfBroker,
                footerPage.cabinetOfBank, footerPage.cabinetOfWebmaster, footerPage.oldCabinetOfBroker,
                footerPage.copyright, footerPage.copyrightText, footerPage.becomeAgentDown, footerPage.becomePartnerDown,
                footerPage.personalData, footerPage.mail, footerPage.map, footerPage.adress);
    }

    public void authPageIsDisplayed() {
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footer);
    }

    public void loginFill(){
        typeIntoField(login, mailOrTelField);
    }

    public void passwordFill(){
        typeIntoField(password, passwordField);
    }

    public void entranceBtnClick(){
        entranceBtn.click();
    }
}
