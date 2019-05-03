package Config;

import java.sql.*;

public class Conexion {

    Connection con;
    
    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatos", "root", "123456");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "123456");
        } catch (Exception e) {
            System.err.println("Conexion Error " + e);
        }
    }

    public Connection getConnection() {
        return con;
    }
     
}
