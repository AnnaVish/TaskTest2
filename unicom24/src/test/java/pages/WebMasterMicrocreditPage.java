package pages;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class WebMasterMicrocreditPage extends Base {

    private String rangeToForm = "//div[@class='range-with-label-range']";
    private String textToForm = "//div[@class='range-with-label-range__range vue-slider vue-slider-ltr']";
    private String valueFieldToForm = "//div[@class='ui-input-new-unit']";
    private String argumentsOfFastCredits = "//div[@class='block-list-item advantages-list-item']";
    private String waysOfFastCredits = "//div[@class='block-list-item ways-list-item']";

    @FindBy(xpath = "//span[contains(text(),'Подберем займ на любые цели')]")
    private WebElement titleTextSpan;

    @FindBy(xpath = "//span[contains(text(),'бесплатно')]")
    private WebElement subTitleTextSpan;

    @FindBy(xpath = "//div[@class='form-offers-small step_1']")
    private WebElement formOffersSmall;

    @FindBy(xpath = "//button[@class='form-btn default medium']")
    private WebElement btnToForm;

    @FindBy(xpath = "//div[contains(text(),'Быстрые и безопасные кредиты')]")
    private WebElement titleFastCredits;

    @FindBy(xpath = "//div[contains(text(), 'Удобные способы получения')]")
    private WebElement titleWays;

    @FindBy(xpath = "//div[@class='top-header pd']")
    private WebElement topHeader;

    @FindBy(xpath = "//div[@class='footer pd']")
    private WebElement footer;

    private final List<WebElement> elements;

    public WebMasterMicrocreditPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(titleTextSpan, subTitleTextSpan, formOffersSmall, btnToForm, titleFastCredits, titleWays, topHeader, footer);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
        int countOfElements = driver.findElements(By.xpath(rangeToForm)).size();
        Assert.assertEquals(2, countOfElements); // два ползунка на странице
        countOfElements = driver.findElements(By.xpath(textToForm)).size();
        Assert.assertEquals(2, countOfElements); // два текста у ползунков
        countOfElements = driver.findElements(By.xpath(valueFieldToForm)).size();
        Assert.assertEquals(2, countOfElements); //два поля где цифры отображаютс у ползунков
        countOfElements = driver.findElements(By.xpath(argumentsOfFastCredits)).size();
        Assert.assertEquals(3, countOfElements); // 3 аргумента
        countOfElements = driver.findElements(By.xpath(waysOfFastCredits)).size();
        Assert.assertEquals(5, countOfElements); // 5 путей получения
    }

    public void onWebMasterMicrocreditPage() {
        driver.get(PagesUrls.webMasterMicrocreditPage());
    }
}
