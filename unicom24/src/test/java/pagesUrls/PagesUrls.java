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

    public static String webMasterAuth() {
        return mainPage + "/partners/dashboard/login";
    }

    public static String privateCreditsPageUrl(){
        return mainPage + "/private/kredity?";
    }

    public static String privateCreditsCardPageUrl(){
        return mainPage + "/private/kreditnye-karty?";
    }

    public static String privateAutoCreditsPageUrl(){
        return mainPage + "/private/avtokredity?";
    }

    public static String privateIpotekaPageUrl(){
        return mainPage + "/private/ipoteka?";
    }

    public static String privateMicroCreditsPageUrl(){
        return mainPage + "/private/mikrozajmy?";
    }

    public static String privateRefinancePageUrl(){
        return mainPage + "/private/refinance?";
    }

}
