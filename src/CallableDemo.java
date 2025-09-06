import java.sql.*;

public class CallableDemo {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdatabase", "root", "1234")) {

            CallableStatement cstmt = con.prepareCall("{call addStudent(?, ?)}");
            cstmt.setString(1,"John");
            cstmt.setInt(2, 21);

            cstmt.execute();
            System.out.println("Stored procedure executed.");
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
