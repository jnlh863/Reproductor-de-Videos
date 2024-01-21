package IS_y_R_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDAO {
    
    public int guardar(String nombre, String apellidos, String correo, String contraseña){
        int resultado = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
                                                          "root","root");
            PreparedStatement insert = conn.prepareStatement("INSERT INTO usuarios" + 
                "(nombre, apellidos, correo, contraseña)" + "VALUES" +
                "(?,?,?,?)");
            insert.setString(1, nombre);
            insert.setString(2, apellidos);
            insert.setString(3, correo);
            insert.setString(4, contraseña);
            resultado = insert.executeUpdate();
            insert.close();
            
        }catch (Exception ex){
             System.out.println(ex);
        }
        return resultado;
    }
 
    public String buscarUsuarioRegistrado(String contraseña){
        String busqueda_usuario = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb",
                    "root",
                    "root");
            PreparedStatement select =
                    conn.prepareStatement("SELECT * FROM usuarios "
                            + "WHERE contraseña = ?;");
            select.setString(1,contraseña);
            rs = select.executeQuery();
            if(rs.next()){
                busqueda_usuario = "Usuario encontrado";
            }else{
                busqueda_usuario = "Usuario no encontrado";
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());      
        }
        return busqueda_usuario;       
    }
    
    public String buscarNombre(String correo){
        String busqueda_nombre = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb",
                    "root",
                    "root");
            PreparedStatement select =
                    conn.prepareStatement("SELECT * FROM usuarios "
                            + "WHERE correo = ?;");
            select.setString(1,correo);
            rs = select.executeQuery(); 
            if(rs.next()){
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                busqueda_nombre = (nombre + " " + apellidos);
            }    
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());      
        }
        return busqueda_nombre; 
    } 
}
