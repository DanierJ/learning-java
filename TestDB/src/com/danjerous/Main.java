package com.danjerous;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        // First you need to add the driver to the project.

        // Then we create the db.
        try {

            // Connection connection = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db"); // If it's located in the D disk
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Danier Javid\\Desktop\\Courses\\java-masterclass\\TestDB\\testjava.db");

            // Executing a sql statement, we use statement objects.
            Statement statement = connection.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER , email TEXT)";

            statement.execute(sql);

            /// Inserting
            sql = "INSERT INTO contacts (name, phone, email) VALUES ('Danier', 123, 'dan@f.com')";
            statement.execute(sql);

            statement.close(); // close this first.
            connection.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        /*// Then we create the db.
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Danier Javid\\Desktop\\Courses\\java-masterclass\\TestDB\\testjava.db"); Statement statement = connection.createStatement()) {
           // Connection connection = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db"); // If it's located in the D disk
             // If it's located in the D disk

            // Executing a sql statement, we use statement objects.

            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER , email TEXT)");

            /// Automatically closes the connection.



        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }*/

    }
}
