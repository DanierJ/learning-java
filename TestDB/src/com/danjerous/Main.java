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
           // connection.setAutoCommit(false); // The default is autocommit.

            // Executing a sql statement, we use statement objects.
            Statement statement = connection.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER , email TEXT)";

            statement.execute(sql);

            /// Inserting
            sql = "INSERT INTO contacts (name, phone, email) VALUES ('Joe', 1456, 'joe@f.com')";
          //  statement.execute(sql);

            sql = "INSERT INTO contacts (name, phone, email) VALUES ('Bartolz', 8745, 'bartolz@f.com')";
           // statement.execute(sql);

            sql = "INSERT INTO contacts (name, phone, email) VALUES ('Martha', 1456, 'martha@f.com')";
          //  statement.execute(sql);

            /// Updating

            sql = "UPDATE contacts SET phone = 48741 WHERE name = 'Martha'";
           // statement.execute(sql);

            // Deleting
            sql = "DELETE FROM contacts WHERE name = 'Joe'";
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
