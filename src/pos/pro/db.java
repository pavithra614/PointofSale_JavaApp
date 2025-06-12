package pos.pro;

import java.sql.Connection;
import java.sql.DriverManager; // You missed this import
import java.sql.SQLException;

public class db {

    public static Connection mycon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Updated driver class name
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos", "root", "");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
            return null;
        }
    }

}
 