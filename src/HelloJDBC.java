import java.sql.*;

public class HelloJDBC {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdatabase", "root", "1234");
            System.out.println("Connection Successful!");

            con.close();

        } catch(Exception e){
            e.printStackTrace();

        }
    }
}