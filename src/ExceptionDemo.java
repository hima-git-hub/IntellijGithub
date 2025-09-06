import java.sql.*;

public class ExceptionDemo {public static void main(String[] args) {
    try (Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/wrongdb", "root", "password")) {
        System.out.println("Connected!");
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
        System.out.println("Code: " + e.getErrorCode());
        System.out.println("State: " + e.getSQLState());
    }
}
}
