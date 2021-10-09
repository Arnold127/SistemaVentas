package Config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Arnold Bejarano
 */
public class Conexion {

    Connection con;
    String url = "jdbc.,mysql://localhost:3306/bd_ventas";
    String user = "admin";
    String pss = "admin";

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pss);
        } catch (Exception e) {
        }
        return con;
    }

}
