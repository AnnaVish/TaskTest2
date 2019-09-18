package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class ForSmallAndMediumBusinessesPage extends Base {

    /*
     *Хэдэр
     */
    @FindBy(css = "a.ui-app-header-logo-wrapper ")
    private WebElement logoLink;

    @FindBy(xpath = "//span[contains(text(), 'Частным клиентам')]")
    private WebElement privateCustomersLink;

    @FindBy(xpath = "//span[contains(text(), 'Малому и среднему бизнесу')]")
    private WebElement forBusinessLink;

    @FindBy(xpath = "//span[contains(text(), 'Сервисы')]")
    private WebElement servicesLink;

    @FindBy(xpath = "//span[contains(text(), 'Прочее')]")
    private WebElement othersLink;

    @FindBy(xpath = "//span[contains(text(), 'Банковские гарантии')]")
    private WebElement bankGuaranteesLink;

    @FindBy(xpath = "//span[contains(text(), 'Расчетные счета')]")
    private WebElement settlementAccountLink;

    @FindBy(xpath = "//span[contains(text(), 'Кредиты малому и среднему бизнесу')]")
    private WebElement businessLoansLink;
    /*
     *Хэдэр окончен
     */

    /*
     *Вертикали
     */
    @FindBy(xpath = "//div[contains(text(), 'Банковские гарантии')]")
    private WebElement credits;

    @FindBy(xpath = "//div[contains(text(), 'Рассчетные счета')]")
    private WebElement creditCards;

    @FindBy(xpath = "//div[contains(text(), 'Кредиты малому и среднему бизнесу')]")
    private WebElement autoCredits;
    /*
     *Вертикали окончены
     */

    /*
     *отчеты
     */
    @FindBy(css = ".card-useful-services-rfz .ui-btn ")
    private WebElement financialHealthRatingGetBtn;

    @FindBy(css = ".card-useful-services-fch .ui-btn")
    private WebElement creditReportsGetBtn;
    /*
     *отчеты окончены
     */
    public final List<WebElement> elements;
    public final List<WebElement> header;

    public ForSmallAndMediumBusinessesPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(credits, creditCards, autoCredits, financialHealthRatingGetBtn, creditReportsGetBtn);
        header = Arrays.asList(logoLink, privateCustomersLink, forBusinessLink, othersLink, servicesLink,
                bankGuaranteesLink, settlementAccountLink, businessLoansLink);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(elements);
        allElementsAreVisible(header);
    }
}
