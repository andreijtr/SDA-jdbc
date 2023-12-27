package sda.jdbc.crud;

import java.sql.*;

public class Delete {

    /**
     * Declare 3 constants (private final static) that holds data necessary for database connection:
     *  - db_host: "jdbc:mysql://localhost:3306/sda-jdbc-##"
     *  - db_username
     *  - db_password
     */


    /**
     * Steps to delete a row in DB:
     * 1. Get a Connection object using DriverManager's static method 'getConnection' and variables declared and initialized above
     * 2. From connection obtained, get a Statement object
     * 3. For deleting a row from table, we'll use 'executeUpdate' method that returns an integer which represent number of affected rows
     * 4. Print a message to console and highlight how many rows has been updated
     * 5. Cleanup environment - close all your resources (statement, connection)
     */

    private static String DATABASE_HOST = "jdbc:mysql://localhost:3306/sda-jdbc";
    private static String DATABASE_USERNAME = "root";
    private static String DATABASE_PASSWORD = "parola";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(DATABASE_HOST, DATABASE_USERNAME, DATABASE_PASSWORD);
            Statement statement = connection.createStatement();
            int deletedRows = statement.executeUpdate("delete from students where id = 6");
            System.out.println("Number of rows deleted: " + deletedRows);

            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Oops! Something went wrong while trying to get a connection " + ex.getMessage());
        }
    }
}
