package pages.verticals.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonElements {

    @FindBy(css = ".container .wrapper-vertical")
    public WebElement bankBlock;

    @FindBy(css = ".wrapper-vertical .header")
    public WebElement headerOfBank;

    @FindBy(css = ".header-reviews .rating-stars")
    public WebElement rating;

    @FindBy(xpath = "//a[contains(text(), 'Предложения')]")
    public WebElement offersTab;

    @FindBy(xpath = "//a[contains(text(), 'Условия')]")
    public WebElement conditionsTab;

    @FindBy(xpath = "//a[contains(text(), 'Документы')]")
    public WebElement documentsTab;

    @FindBy(xpath = "//a[contains(text(), 'Отзывы')]")
    public WebElement commentsTab;

    @FindBy(xpath = "//a[contains(text(), 'Об организации')]")
    public WebElement aboutOrgTab;

    @FindBy(xpath = "//div[@class='offer-full-info-wrapper']/div/div[contains(text(), 'Ставка')]")
    public WebElement bet;

    @FindBy(xpath = "//div[@class='offer-full-info-wrapper']/div/div[contains(text(), 'Сумма кредита')]")
    public WebElement sum;

    @FindBy(xpath = "//div[@class='offer-full-info-wrapper']/div/div[contains(text(), 'Срок')]")
    public WebElement time;

    @FindBy(xpath = "//div[@class='offer-full-info-wrapper']/div/div[contains(text(), 'Возраст заемщика')]")
    public WebElement age;

    @FindBy(xpath = "//div[@class='offer-full-info-wrapper']/div/div[contains(text(), 'Предварительное решение')]")
    public WebElement beforeApproved;
}
