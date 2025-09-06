import java.sql.*;

public class CreateTableDemo {
    public static void main(String[] args){
        try(Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdatabase", "root", "1234");
            Statement stmt = con.createStatement()) {

            String sql = "CREATE TABLE students(" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(50)," +
                "age INT)";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
