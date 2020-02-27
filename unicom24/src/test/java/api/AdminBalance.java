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

        Connection connection2 = connection.url(PagesUrls.adminkaLogIn())
                .cookies(response.cookies())
                .header("Referer", "f'" + PagesUrls.adminkaLogIn())
                .header("{'Cookie'", "f'csrftoken={r.cookies[" + token + "]}'}")
                .ignoreHttpErrors(true)
                .data("csrfmiddlewaretoken", token)
                .data("username", AuthPage.login)
                .data("password", AuthPage.password)
                .data("next", "/_ad_min_24/")
                .method(Connection.Method.POST)
                .followRedirects(true);

        Connection.Response response2 = connection2.execute();
        Document tt2 = response2.parse();
        System.out.println(tt2);
    }
}