package sda.jdbc.preparedStatement;

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
     *
     *
     * Great job! You just wrote code that can be used to fetch any student from db by their id. Remember, avoid hardcoding sql queries!
     * What about structuring our code to make it reusable and respect Single Responsibility principle?
     */
}
