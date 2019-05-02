package Config;

import java.sql.*;

public class Conexion {

    Connection con;
    
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatos", "root", "estudiante");
        } catch (Exception e) {
            System.err.println("Conexion Error " + e);
        }
    }

    public Connection getConnection() {
        return con;
    }
     
}
