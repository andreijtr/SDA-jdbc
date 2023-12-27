package sda.jdbc.preparedStatement;

import java.sql.*;

public class UpdateWithPreparedStatement {

    /**
     * Declare 3 constants (private final static) that holds data necessary for database connection:
     *  - db_host: "jdbc:mysql://localhost:3306/sda-jdbc-##"
     *  - db_username
     *  - db_password
     */

    /**
     * Steps to use PreparedStatement:
     * 1. Get a Connection object using DriverManager's static method 'getConnection' and variables declared and initialized above
     * 2. From connection obtained, get a PreparedStatement object using method 'preparedStatement'
     * 2.1 In sql query, replace hardcoded values with "?", that marks an expected parameter
     * 3. On preparedStatement object set appropriate values for each expected parameter - "?" (ex. setInt, setString etc.)
     * 4. After setting all parameters, call on prepared statement method 'executeQuery' for select or 'executeUpdate' for update, delete, insert
     *
     * Do above steps for:
     * - reading a row from table with a specific id and print rows data
     * - updating the same row
     * - reading again the same row and check for differences
     *
     * Cleanup environment - close all your resources (result sets, statement, connection)
     */

    private static String DATABASE_HOST = "jdbc:mysql://localhost:3306/sda-jdbc";
    private static String DATABASE_USERNAME = "root";
    private static String DATABASE_PASSWORD = "parola";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(DATABASE_HOST, DATABASE_USERNAME, DATABASE_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM students where id = ?");
            preparedStatement.setInt(1, 1);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                System.out.println("Student: id = " + id + " first name = " + firstName);
            }

            PreparedStatement updateStmt = connection.prepareStatement("update students set first_name = ? where id = ?");
            updateStmt.setString(1, "Ronaldo");
            updateStmt.setInt(2, 1);
            int insertedRows = updateStmt.executeUpdate();

            System.out.println("Number of rows updated: " + insertedRows);

            ResultSet updatedRs = preparedStatement.executeQuery();
            while(updatedRs.next()) {
                int id = updatedRs.getInt("id");
                String firstName = updatedRs.getString("first_name");
                System.out.println("Student: id = " + id + " first name = " + firstName);
            }

            updatedRs.close();
            rs.close();
            preparedStatement.close();
            updateStmt.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Oops! Something went wrong while trying to get a connection " + ex.getMessage());
        }
    }
}
