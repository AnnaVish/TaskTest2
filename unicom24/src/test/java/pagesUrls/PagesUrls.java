package pagesUrls;

public class PagesUrls {

    public static String base = System.getenv("TESTING_HOST");
    public static String mainPage = baseUrl();
    public static String bankListPage = bankList();

    public static String baseUrl() {
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
        return mainPage + "/partners/office/auth";
    }

    public static String webMasterPage() {
        return mainPage + "/partners/office/";
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

    public static String blogPageUrl(){
        return mainPage + "/articles";
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

    public static String aboutFullCreditHistoryPage() {
        return mainPage + "/services/polnaya-kreditnaya-istoriya";
    }

    public static String brokerRFZPageUrl() {
        return mainPage + "/b2b_office/financial-health";
    }

    public static String financialHealthRatingPage() {return mainPage + "/services/rejting-finansovogo-zdorovya"; }

    public static String personalSelectionCreditPage() {return mainPage + "/form-offers-small-full/kredity"; }

    public static String webMasterMicrocreditPage() {return mainPage + "/form-offers-small-webmaster/mikrozajmy?"; } //некая рекламная страница на которую можно попасть только по ссылке
}
