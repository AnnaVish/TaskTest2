package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Тогда;
import pages.BlogPage;

public class BlogPageStepDefinitions extends Base {
    private final BlogPage blogPage = new BlogPage();

    @Дано("^пользователь находится на странице Блог$")
    public void onBlogPage(){
        blogPage.onBlogPage();
    }

    @Тогда("^отображается страница Блог$")
    public void blogPageIsDisplayed(){
        blogPage.pageIsDisplayed();
    }
}
