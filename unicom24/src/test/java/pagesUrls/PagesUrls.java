package pagesUrls;

import java.util.HashMap;
import java.util.Map;

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

    public static String brokerAuth() {
        return mainPage + "/b2b_office/auth/login";
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

    public static String privateRefinancePageUrl() {
        return mainPage + "/private/refinance?";
    }

    public static String adminRedirectsPage() {
        return mainPage + "/_ad_min_24/mfi/redirect/?q=";
    }

    public static String brokerRFZPageUrl() {
        return mainPage + "/b2b_office/financial-health";
    }

    public static String smsServerLink() {
        String base = System.getenv("TESTING_HOST");
        if (base.equals("pre-prod.vuaro.ru")) {
            return "http://pre-prod-local.vuaro.ru:13003/channel/dev_channel/queue";
        } else {
            return "http://" + base + ":13003/channel/dev_channel/queue";
        }
    }

    public static Map<String, String> smsServerLink2() {
        String base = System.getenv("TESTING_HOST");
        Map<String, String> smsServer = new HashMap<String, String>();
        if (base.equals("pre-prod.vuaro.ru")) {
            smsServer.put("smsServer1", "http://pre-prod-local.vuaro.ru:13003/channel/dev_channel/queue");
            smsServer.put("smsServer2", "http://pre-prod-02.vuaro.ru:13003/channel/dev_channel/queue");
            return smsServer;
        } else {
            smsServer.put("smsServer1", "http://" + base + ":13003/channel/dev_channel/queue");
            return smsServer;
        }
    }

    public static Map<String, String> emailServerLink() {
        String base = System.getenv("TESTING_HOST");
        Map<String, String> smsServer = new HashMap<String, String>();
        if (base.equals("pre-prod.vuaro.ru")) {
            smsServer.put("emailServer1", "http://pre-prod-01.vuaro.ru:1080/");
            smsServer.put("emailServer2", "http://pre-prod-02.vuaro.ru:1080/");
            return smsServer;
        } else {
            smsServer.put("smsServer1", "http://" + base + ":13003/channel/dev_channel/queue");
            return smsServer;
        }
    }
}
