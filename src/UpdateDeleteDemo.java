import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDeleteDemo {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdatabase", "root", "1234");
             Statement stmt = con.createStatement()) {

             //Update record
             String updateSql = "UPDATE students SET age=23 WHERE name='Peter'";
             int updated = stmt.executeUpdate(updateSql);
             System.out.println("" + updated + " record(s) updated");

             //Delete Record
             String deleteSql= "DELETE FROM students WHERE name='Raj'";
             int deleted = stmt.executeUpdate(deleteSql);
             System.out.printf("" + deleted + " record(s) deleted");
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
}
