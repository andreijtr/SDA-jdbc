package sda.jdbc.crud;

import java.sql.*;

public class Update {

    /**
     * Declare 3 constants (private final static) that holds data necessary for database connection:
     *  - db_host: "jdbc:mysql://localhost:3306/sda-jdbc-##"
     *  - db_username
     *  - db_password
     */


    /**
     * Steps to update row in DB:
     * 1. Get a Connection object using DriverManager's static method 'getConnection' and variables declared and initialized above
     * 2. From connection obtained, get a Statement object that we'll use for all database interactions
     * 3. Execute a query for selecting a student with specific id (ex. id = 1) and print data to console
     * 4. Using the same statement object, execute another query to update this student first_name
     * 4.1 For update, we'll use 'executeUpdate' method that returns an integer which represent number of effected rows
     * 4.2 Print a message to console and highlight how many rows has been updated
     * 5. Now execute the same select query and check if the result is different from the first try
     * 6. Cleanup environment - close all your resources (result sets, statement, connection)
     */

    private static String DATABASE_HOST = "jdbc:mysql://localhost:3306/sda-jdbc";
    private static String DATABASE_USERNAME = "root";
    private static String DATABASE_PASSWORD = "parola";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(DATABASE_HOST, DATABASE_USERNAME, DATABASE_PASSWORD);
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from students where id = 1");
            while(rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                System.out.println("Student: id = " + id + " first name = " + firstName);
            }

            int updatedRows = statement.executeUpdate("update students set first_name = 'Banel' where id = 1");
            System.out.println("Number of rows updated: " + updatedRows);

            ResultSet updatedRs = statement.executeQuery("select * from students where id = 1");
            while(updatedRs.next()) {
                int id = updatedRs.getInt("id");
                String firstName = updatedRs.getString("first_name");
                System.out.println("Student: id = " + id + " first name = " + firstName);
            }

            statement.close();
            rs.close();
            updatedRs.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Oops! Something went wrong while trying to get a connection " + ex.getMessage());
        }
    }
}
