package pages.verticals.credits;

import TestContext.TestContext;
import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.Adminka.AdminkaRedirects;
import pages.Adminka.admAuth.AdmAuth;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.verticals.common.CommonElementsForAllVerticals;
import org.junit.Assert;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class CreditsPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();
    CommonElementsForAllVerticals common = new CommonElementsForAllVerticals();
    AdminkaRedirects adminkaRedirects = new AdminkaRedirects();
    AdmAuth admAuth = new AdmAuth();
    //CreditsPage creditsPage = new CreditsPage();

    @FindBy(xpath = "//div[@class='offers-list-new']")
    private WebElement getCreditList;

    @FindBy(css = ".form-offers-small .form-one")
    private WebElement formOffer;


    @FindBy(xpath = "//a[contains(text(), 'Частным клиентам')]")
    private WebElement privateClientsBread;

    @FindBy(xpath = "//li/span[contains(text(), 'Кредиты')]")
    private WebElement privateClientsCreditsBread;

    @FindBy(xpath = "//div[@class='clear_wrapper']/i[contains(text(), 'close')]")
    private WebElement closeModalBtn;

    @FindBy(xpath = "//div/form/button['.colum__close-button--enpop']")
    private WebElement closeFooterModalBtn;

    @FindBy(xpath = "//button[@class='filters-btns__btn filters-btns__reset default medium']")
    private WebElement btnResetToDefault; // Кнопка Сбросить в боди страницы

    @FindBy(xpath = "//div[@class='title']")
    private WebElement bankName;

    public final List<WebElement> elements;

    public CreditsPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, common);
        PageFactory.initElements(driver, adminkaRedirects);
        elements = Arrays.asList(getCreditList, formOffer, common.logo, //common.rating, - отсутствует на странице
                common.title,
                //common.ratePerYear, - тоже отсутствует на странице вообще
                //common.payPerMonth,  - тоже отсутствует на странице вообще
                //common.time,  - тоже отсутствует на странице вообще
                //common.neededPaying, - тоже отсутствует на странице вообще
                //common.license, - тоже отсутствует
                btnResetToDefault,
                privateClientsBread, privateClientsCreditsBread);
        headerPage.getMainHeader();
        footerPage.getFooter();
    }

    public void onCreditsPage() {
        driver.get(PagesUrls.privateCreditsPageUrl());
        TestContext.checkRedirectUrl = PagesUrls.privateCreditsPageUrl();
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(footerPage.getFooter());
        Header.checkBreadCrumbs(3);
        Assert.assertEquals(common.countOffersOnPage.size(), common.btnBankCreditAddToCompare.size());
    }

    public Boolean offersOnPageMore5() {
        return driver.findElements(By.xpath("//div[@class='offer-item-new wrapper']")).size() > 5;
    }

    public void titleOfBankClick() {
        //scrollTo(common.title); // старый код, который не туда кликает
        //common.title.click();
        bankName.click(); // новый код который кликает в первый банк на странице
    }

    public Boolean checkRedirects() {
        js.executeScript("let ifr = document.getElementById('launcher'); ifr.remove();");
        List<WebElement> elements = driver.findElements(By.cssSelector(".offers-list-row .offer-online button"));
        for (int i = 0; i < elements.size(); i++) {
            if (isElementVisible(closeModalBtn)) {
                closeModalBtn.click();
            }
            if (isElementVisible(closeFooterModalBtn)) {
                closeFooterModalBtn.click();
            }
            scrollTo(elements.get(i));
            waitForVisibility(elements.get(i));
            if (i == 0) {
                System.out.println(driver.findElement(By.xpath("(//div[@class='offer-online']/button/../../../../div[2]/div/a)")).getText());
            } else {
                int k = i + 1;
                System.out.println(driver.findElement(By.xpath("(//div[@class='offer-online']/button/../../../../div[2]/div/a)[" + k + "]")).getText());
            }
            getIdOfOffer(elements.get(i));
            elements.get(i).click();
            switchToTheSecondTab();
            for (int j = 0; j < 10; j++) {
                if (driver.getCurrentUrl().contains(PagesUrls.mainPage)) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (driver.getCurrentUrl().contains(PagesUrls.mainPage))
                return false;
            adminkaRedirects.onAdminkaRedirectsPage();
            if (admAuth.isPageDisplayed()) {
                admAuth.pageIsDisplayed();
                admAuth.logIn();
            }
            adminkaRedirects.pageIsDisplayed();
            adminkaRedirects.checkVerticalsRedirect();
            closeTab();
            switchToTheFirstTab();
        }
        return true;
    }

    private void getIdOfOffer(WebElement element) {
        adminkaRedirects.offerId = element.getAttribute("id");
        adminkaRedirects.offerId = adminkaRedirects.offerId.replaceAll("[^0-9]", "");
    }

    public void banksForAddToCompareCreditsClick(String numberOfBanksForAddToCompare) {
        int CountBanks = Integer.parseInt(numberOfBanksForAddToCompare);
        if (CountBanks > common.countOffersOnPage.size()) {
            CountBanks = common.countOffersOnPage.size();}
        for (int i = 0; i < CountBanks; i++)
            common.btnBankCreditAddToCompare.get(i).click();
    }
}
