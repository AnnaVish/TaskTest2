package pagesUrls;

import java.util.HashMap;
import java.util.Map;

public class PagesUrls {

    public static String mainPage = baseUrl();
    public static String bankListPage = bankList();

    public static String baseUrl() {
//        String base = System.getenv("TESTING_HOST");
        String base = "develop-34.vuaro.ru";
//        String base = "pre-prod.vuaro.ru";
        return "https://" + base;
    }

    public static String authPageUrl() {
        return mainPage + "/login";
    }

    public static String bankList() {
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

    public static String bankirAuth(){ return mainPage + "/advertiser_office/auth"; }

    public static String brokerCabinetUrl() {
        return mainPage + "/b2b_office/";
    }

    public static String privateCreditsPageUrl() {
        return mainPage + "/private/kredity?";
    }

    public static String privateCreditsCardPageUrl() {
        return mainPage + "/private/kreditnye-karty?";
    }

    public static String privateAutoCreditsPageUrl() {
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

    public static String protectionPageUrl(){return mainPage + "/fraud-monitoring";}

    public static String adminRedirectsPage() {
        return mainPage + "/_ad_min_24/mfi/redirect/?q=";
    }

    public static String adminkaLogIn() {
        return mainPage + "/_ad_min_24/login/?next=/_ad_min_24/";
    }

    public static String adminkaTransactions() {
        return mainPage + "/_ad_min_24/wallet/transaction/add/";
    }

    public static String  shopPage() {
        return "http://shop.unicom24.ru/";
    }

    public static String adminkaGetBalanceId(String userEmail) {
        return mainPage + "/_ad_min_24/wallet/balance/?_to_field=id&_popup=1&q=" + userEmail;
    }

    public static String brokerRFZPageUrl() {
        return mainPage + "/b2b_office/financial-health";
    }

    public static String financialHealthRatingPage() {return mainPage + "/services/rejting-finansovogo-zdorovya"; }

    public static String webMasterMicrocreditPage() {return mainPage + "/form-offers-small-webmaster/mikrozajmy?"; } //некая рекламная страница на которую можно попасть только по ссылке

    public static String smsServerLink() {
        String base = System.getenv("TESTING_HOST");
        if (base.equals("develop-34.vuaro.ru")) {
            return "http://pre-prod-local.vuaro.ru:13003/channel/dev_channel/queue";
        } else {
            return "http://" + base + ":13003/channel/dev_channel/queue";
        }
    }

    public static Map<String, String> smsServerLink2() {
//        String base = System.getenv("TESTING_HOST");
        String base = "develop-34.vuaro.ru";
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
//        String base = System.getenv("TESTING_HOST");
        String base = "develop-34.vuaro.ru";
        Map<String, String> emailServer = new HashMap<String, String>();
        if (base.equals("pre-prod.vuaro.ru")) {
            emailServer.put("emailServer1", "http://pre-prod-01.vuaro.ru:1080/");
            emailServer.put("emailServer2", "http://pre-prod-02.vuaro.ru:1080/");
            return emailServer;
        } else {
            emailServer.put("smsServer1", "http://" + base + ":1080");
            return emailServer;
        }
    }
}
