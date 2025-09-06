import java.sql.*;

public class InsertDemo {
    public static void main(String[] args){
        try(Connection con = DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/testdatabase", "root", "1234");
            Statement stmt = con.createStatement()) {

            String sql = "INSERT INTO students (name,age) VALUES ('Alice',22),('John', 21),('Peter',23),('Raj',22)";
            int rows = stmt.executeUpdate(sql);
            System.out.println(" " + rows + "record(s) inserted.");
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
