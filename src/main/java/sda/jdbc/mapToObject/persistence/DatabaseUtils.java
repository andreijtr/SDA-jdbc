package sda.jdbc.mapToObject.persistence;

import java.sql.*;

public class DatabaseUtils {
    private static String DATABASE_HOST = "jdbc:mysql://localhost:3306/sda-jdbc";
    private static String DATABASE_USERNAME = "root";
    private static String DATABASE_PASSWORD = "parola";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DATABASE_HOST, DATABASE_USERNAME, DATABASE_PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Oops! Something went wrong while trying to get a connection " + ex.getMessage());
        }
    }
}
