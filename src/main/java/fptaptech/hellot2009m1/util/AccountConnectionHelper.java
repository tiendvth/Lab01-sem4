package fptaptech.hellot2009m1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccountConnectionHelper {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/lab2";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "";
    ;
    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
