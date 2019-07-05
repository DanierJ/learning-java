package com.danjerous;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\Danier Javid\\Desktop\\Courses\\java-masterclass\\TestDB\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        // First you need to add the driver to the project.

        // Then we create the db.
        try {

            // Connection connection = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db"); // If it's located in the D disk
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
           // connection.setAutoCommit(false); // The default is autocommit.

            // Executing a sql statement, we use statement objects.
            Statement statement = connection.createStatement();

            String sql = "DROP TABLE  IF EXISTS " + TABLE_CONTACTS;
            statement.execute(sql);

             sql = "CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS + "(" + COLUMN_NAME +  " TEXT," + COLUMN_PHONE + " INTEGER," + COLUMN_EMAIL + " TEXT)";
            statement.execute(sql);

            /// Inserting


            insertContact(statement, "dan", 123, "dan@f.com");
            insertContact(statement, "Joe", 123, "joe@f.com");
            insertContact(statement, "barls", 123, "barls@f.com");
            insertContact(statement, "martha", 123, "martha@f.com");


            /// Updating

            sql = "UPDATE "+ TABLE_CONTACTS + " SET " + COLUMN_PHONE + "= 48741 WHERE " + COLUMN_NAME + " = 'Martha'";
            statement.execute(sql);

            // Deleting
            sql = "DELETE FROM " + TABLE_CONTACTS + " WHERE  "+ COLUMN_NAME +  " = 'Joe'";
            statement.execute(sql);

            // Querying

            sql = "SELECT * FROM " + TABLE_CONTACTS;

         //   statement.execute(sql);
          //  ResultSet results = statement.getResultSet();

            // Easier way to execute and get the result set.

            ResultSet results = statement.executeQuery(sql);

            while (results.next()) {
                System.out.println("Contact info: " + results.getString("name") + " | " + results.getInt("phone") + " | " + results.getString("email"));
            }

            results.close();

            statement.close(); // close this first.
            connection.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }

    }


    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException{
        String sql = sql = "INSERT INTO " + TABLE_CONTACTS +  "(" + COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + ") VALUES ('" + name + "',"  + phone + ",'" + email + "')";

        System.out.println(sql);

        statement.execute(sql);
    }
}
