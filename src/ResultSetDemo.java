import java.sql.*;

public class ResultSetDemo {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/testdatabase", "root", "1234");
             Statement stmt = con.createStatement(
                 ResultSet.TYPE_SCROLL_INSENSITIVE,
                 ResultSet.CONCUR_UPDATABLE)) {

             ResultSet rs = stmt.executeQuery("SELECT * FROM students");

             rs.afterLast(); //move cursur to end
             while(rs.previous()) {//iterate backwards
                 System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
             }
        } catch (Exception e) {
             e.printStackTrace();
    }
}
}
