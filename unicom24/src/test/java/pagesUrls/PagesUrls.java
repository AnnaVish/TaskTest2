package pagesUrls;

public class PagesUrls {

    public static String mainPage = baseUrl();
    public static String bankListPage = bankList();

    public static String baseUrl(){
        String base = System.getenv("TESTING_HOST");
        return "https://" + base;
    }

    public static String bankList(){
        return mainPage + "/banki";
    }

    public static String becomePartnerPage() {
        return mainPage + "/become-partner";
    }
}
