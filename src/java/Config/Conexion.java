package Config;
import java.sql.*;
public class Conexion {
    Connection con;
    
    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/personas",
                    "root",
                    "123456");
        } catch (Exception e) {
            System.out.println("Pkg: Config. Conexion: " + e);
        }
    }

    public Connection getConnnection() {
        return con;
    }
}
