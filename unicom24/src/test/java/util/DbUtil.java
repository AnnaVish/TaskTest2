package util;

import pagesUrls.PagesUrls;

import java.sql.*;

public class DbUtil {
    // переменные для подключения к тестовой БД
    private static final String url = "jdbc:postgresql://" + PagesUrls.base + ":5432/unicom";
    private static final String user = "unicom";
    private static final String password = "unicom";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     * @throws java.sql.SQLException
     */
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    // получение рандомного значения из таблицы основной БД
    public static String getUserIdByPhone() {
        System.out.println(url);
        String phone_number = "9255331980";
        String SQL = "SELECT user_id " +
                "FROM public.accounts_profile " +
                "WHERE phone_number = '" + phone_number + "'";
        String selectedField = "";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()) {
                //Retrieve by column name
                selectedField = rs.getString("user_id");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(selectedField);
        return selectedField;
    }
}
