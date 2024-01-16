package sda.jdbc.crud;

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
     * 3. Execute a query for inserting 2 students. We'll use 'executeUpdate' method. As result, we'll have an integer (representing number of affected rows)
     * 4. Assign this number to a variable
     * 5. Print a message to console and highlight how many rows has been inserted
     * 6. Cleanup environment - close all your resources (statement, connection)
     *
     * Great work! Next you will learn how to remove rows from db tables.
     */
}
