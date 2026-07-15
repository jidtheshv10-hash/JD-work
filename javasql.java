import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class javasql {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "9360999205&$$";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected Successfully!");
            con.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
}   