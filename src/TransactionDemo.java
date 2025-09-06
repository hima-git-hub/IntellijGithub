import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionDemo {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdatabase", "root", "1234")) {

           con.setAutoCommit(false); // start transaction

           Statement stmt = con.createStatement();
           stmt.executeUpdate("INSERT INTO students (name, age) VALUES ('Amal', 22),('Ruwan',20)");
           stmt.executeUpdate("UPDATE students SET age=22 WHERE name='Alice'");

           con.commit(); //commit transaction
           System.out.println("Transaction Committed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

