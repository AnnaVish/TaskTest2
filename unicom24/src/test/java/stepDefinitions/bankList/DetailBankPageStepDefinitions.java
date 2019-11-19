package stepDefinitions.bankList;

import cucumber.api.java.ru.Дано;
import pages.banki.DetailBankPage;

public class DetailBankPageStepDefinitions {

    private final DetailBankPage detailBankPage = new DetailBankPage();

    @Дано("^отображается страница банка с предложениями$")
    public void detailPageIsDisplayed() {
        detailBankPage.pageIsDisplayed();
    }

    @Дано("^пользователь кликает на отзывы$")
    public void userClickFeedback() {
        detailBankPage.clickFeedBack();
    }

    @Дано("^отображаются отзывы$")
    public void feedBackAreDisplayed() {
        detailBankPage.checkCountOfFeedBack();
    }
}
