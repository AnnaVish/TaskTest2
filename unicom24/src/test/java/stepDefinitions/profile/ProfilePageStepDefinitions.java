package stepDefinitions.profile;

import base.Base;
import cucumber.api.java.ru.Тогда;
import cucumber.api.java.ru.Когда;
import pages.profile.ProfilePage;
import pages.profile.PersonalDataProfilePage;
import pages.profile.SubscriptionsProfilePage;
import pages.profile.CommonVerticalsForProfilePages;

public class ProfilePageStepDefinitions extends Base {
    private final ProfilePage profilePage = new ProfilePage();
    private final PersonalDataProfilePage personalDataProfilePage = new PersonalDataProfilePage();
    private final SubscriptionsProfilePage subscriptionsProfilePage = new SubscriptionsProfilePage();
    private final CommonVerticalsForProfilePages commonVerticalsForProfilePages = new CommonVerticalsForProfilePages();

    @Тогда ("^отображается главная страница Профиля$")
    public void profilePageIsDisplayed() {
        profilePage.pageIsDisplayed();
    }

    @Когда("^пользователь кликает по вкладке \"([^\"]*)\" в профиле")
    public void removeBanksCreditsRemoveFromCompare(String nameVerticalPage) {
        commonVerticalsForProfilePages.verticalPageClick(nameVerticalPage);
    }

    @Тогда("^отображается личные данные на странице Профиль")
    public void personalDataProfilePage(){
       personalDataProfilePage.pageIsDisplayed();
    }

    @Тогда("^отображается страница Подписки в профиле")
    public void subscriptionsProfilePage(){
        subscriptionsProfilePage.pageIsDisplayed();
    }
}
