package sda.jdbc.crud;

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
     *
     *
     *  Great job! You successfully applied CRUD operations on database. But you only used hardcoded and fixed SQL statements.
     *  What if you want to execute parameterized statements?
     *  Maybe PreparedStatement interface can help you to achieve this.
     */
}
