package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection connection;

    public DBConnection() {
       try {
           Class.forName("com.mysql.cj.jdbc");
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectos_jsp?useUnicode=true&amp;useJDBCCompliantTimezoneShift=true&amp;useLegacyDatetimeCode=false&amp;serverTimezone=UTC", "root", "user123");

       } catch (SQLException e) {
           System.out.println("Error connecting DB: " + e.getMessage());
       } catch (ClassNotFoundException e) {
           System.out.println("DBConnection not found: " + e.getMessage());
       }
    }

    public Connection getConnection() {
        return connection;
    }
}
