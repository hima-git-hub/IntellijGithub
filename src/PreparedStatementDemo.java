import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdatabase", "root", "1234")) {

            String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, "Bob");
            pstmt.setInt(2, 20);
            pstmt.setString(1,"Ben");
            pstmt.setInt(2,25);
            pstmt.executeUpdate();

            System.out.println("Record inserted with PreparedStatement.");
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
}

