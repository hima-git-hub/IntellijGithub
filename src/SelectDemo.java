import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/testdatabase", "root", "1234");
           Statement stmt = con.createStatement()) {

           ResultSet rs = stmt.executeQuery("SELECT * FROM students");
           while (rs.next()) {
               int id = rs.getInt("id");
               String name = rs.getString("name");
               int age = rs.getInt("age");
               System.out.println(id + " | " + name + " | " + age);

           }
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
