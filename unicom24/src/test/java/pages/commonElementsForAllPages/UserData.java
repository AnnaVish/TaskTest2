package pages.commonElementsForAllPages;

public class UserData {

    public static String incorrectPhoneNumber = "1111111111";
    public static String unRegisteredUserPhone = "9111111114";
    public static String correctPhoneNumber = generatePhoneNumber();
    public static String phoneForChangePassword = "9960180967";
    public static String incorrectMail = "Test@tt";
    public static String unregisteredEmail = "Test@tt.mm";
    public static String correctEmail = "a.s.san.17.8.939@yandex.ru";
    public static String newCorrectPassword = "Aa123456";
    public static String names = "Test";
    public static String nameRU = "Тест";
    public static String dateOfPasport = "01112014";
    public static String passportNumber = "1454-564654";
    public static String birthDay = "12121990";
    public static String city = "Верхний Уфалей";
    public static String commentText = "Текст для заполнения поля отзыва " + generateRandomInt();

    private static int generateRandomInt() {
        double randomPhone = (int) (Math.random() * ((999999999 - 900000000) + 1) + 900000000);
        return (int) randomPhone;
    }

    private static String generatePhoneNumber() {
        return "9" + generateRandomInt();
    }

    public static String getFormatNumber() {
        return "7" + correctPhoneNumber;
    }

    public static String getFormatNumberPhoneForChangePassword() {
        return "7" + phoneForChangePassword;
    }

    public static String getPhoneForRegistration() {
        return "7" + phoneForChangePassword;
    }
}
