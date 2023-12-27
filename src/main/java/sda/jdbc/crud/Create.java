package sda.jdbc.crud;

import java.sql.*;

public class Create {

    /**
     * Declare 3 constants (private final static) that holds data necessary for database connection:
     *  - db_host: "jdbc:mysql://localhost:3306/sda-jdbc-##"
     *  - db_username
     *  - db_password
     */

    /**
     * Steps to insert rows in DB:
     * 1. Get a Connection object using DriverManager's static method 'getConnection' and variables declared and initialized above
     * 2. From connection obtained, get a Statement object
     * 3. Execute a query for inserting 2 students. As result, we'll have an integer (representing number of affected rows)
     * 4. Assign this number to a variable
     * 5. Print a message to console and highlight how many rows has been inserted
     * 6. Cleanup environment - close all your resources (statement, connection)
     */

    private static String DATABASE_HOST = "jdbc:mysql://localhost:3306/sda-jdbc";
    private static String DATABASE_USERNAME = "root";
    private static String DATABASE_PASSWORD = "parola";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(DATABASE_HOST, DATABASE_USERNAME, DATABASE_PASSWORD);
            Statement statement = connection.createStatement();
            String insertQuery = "insert into students(first_name, last_name, age, created_date) values ('Mircea', 'Radu', 55, current_date()), ('Mircea', 'Radu', 55, current_date())";
            int insertedRows = statement.executeUpdate(insertQuery);

            System.out.println("Number of rows inserted: " + insertedRows);

            statement.close();
            connection.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Oops! Something went wrong while trying to get a connection " + ex.getMessage());
        }
    }
}
