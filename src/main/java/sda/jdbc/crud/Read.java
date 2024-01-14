package sda.jdbc.crud;

public class Read {

    /**
     * Declare 3 constants (private final static) that holds data necessary for database connection:
     *  - db_host: "jdbc:mysql://localhost:3306/sda-jdbc-##"
     *  - db_username
     *  - db_password
     */

    /**
     * Steps to read from DB:
     * 1. Get a Connection object using DriverManager's static method 'getConnection' and variables declared and initialized above
     * 2. From connection obtained, get a Statement object using static method 'createStatement'
     * 3. On statement object, execute a query for selecting all students. As result, we'll have a ResultSet instance
     * 4. On resultSet instance, use a 'while' command to move the cursor forward one row
     * 5. In 'while' block, on resultSet object, use appropriate methods (ex. getInt, getString etc.) to extract data and assign these data to variables. Use column names as methods parameter
     * 6. Now your variables holds data from database. Print this data to console.
     * 7. Cleanup environment - close all your resources (resultSet, statement, connection)
     *
     *
     * Great job! You successfully fetch data from database using Java.
     * What about 'executeUpdate' method on Statement interface?
     */
}
