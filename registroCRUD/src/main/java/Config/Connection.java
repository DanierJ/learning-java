package Config;

import java.sql.*;
import java.sql.SQLException;

public class Connection {
    private java.sql.Connection conn;

    public Connection () {
       try {
           Class.forName("com.mysql.cj.jdbc");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectos_jsp?useUnicode=true&amp;useJDBCCompliantTimezoneShift=true&amp;useLegacyDatetimeCode=false&amp;serverTimezone=UTC", "root", "user123");

       } catch (SQLException e) {
           System.out.println("Error connecting DB: " + e.getMessage());
       } catch (ClassNotFoundException e) {
           System.out.println("Connection not found: " + e.getMessage());
       }
    }
}
