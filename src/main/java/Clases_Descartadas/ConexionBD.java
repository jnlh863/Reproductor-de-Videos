package Clases_Descartadas;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionBD {

    public static String url = "jdbc:mysql://localhost:3306/mydb";
    public static String usuario = "root";
    public static String contraseña = "root";
    public static String clase = "com.mysql.cj.jdbc.Driver";

    public static Connection conectar() {
        Connection conexion = null;

        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion establecida");
        } catch (Exception ex) {

            System.out.println(ex);
        }
        return conexion;
    }
}
