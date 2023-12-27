package sda.jdbc.crud;

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
}
