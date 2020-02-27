package api;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import pages.Auth.AuthPage;
import pagesUrls.PagesUrls;

import java.io.IOException;

public class AdminBalance {

    public static void runClass() throws IOException {
        auth();
    }

    public static void auth() throws IOException {
        Connection connection = HttpConnection.connect(PagesUrls.adminkaLogIn())
                .ignoreHttpErrors(true)
                .userAgent("Chrome/4.0.249.0 Safari/532.5");
        Connection.Response response = connection.execute();
        String token = response.parse().select("input[name='csrfmiddlewaretoken']").attr("value");

        Connection logInConnection = connection.url(PagesUrls.adminkaLogIn())
                .cookies(response.cookies())
                .header("Referer", PagesUrls.adminkaLogIn())
                .header("{'Cookie'", "f'csrftoken={r.cookies[" + token + "]}'}")
                .ignoreHttpErrors(true)
                .data("csrfmiddlewaretoken", token)
                .data("username", AuthPage.login)
                .data("password", AuthPage.password)
                .data("next", "/_ad_min_24/")
                .method(Connection.Method.POST)
                .followRedirects(true);

        Connection.Response responseToGetId = logInConnection.url(PagesUrls.adminkaGetBalanceId(AuthPage.login)).execute();
        String balanceId = responseToGetId.parse().select(".field-id a").text();

        Connection.Response response4 = logInConnection.url(PagesUrls.adminkaTransactions()).execute();
        String token1 = response.parse().select("input[name='csrfmiddlewaretoken']").attr("value");
//
//        Connection connection3 = connection.url(PagesUrls.adminkaTransactions())


//        Document tt2 = response3.parse();
//        System.out.println(tt2);
    }

}