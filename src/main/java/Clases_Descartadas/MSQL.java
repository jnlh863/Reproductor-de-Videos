package Clases_Descartadas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MSQL {
    public static ConexionBD conexion = new ConexionBD();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
 
    
    public int guardar(String nombre, String apellidos, String correo, String contraseña){
        
        int resultado = 0;
        Connection conexion = null;
        
        String sentencia_guardar = ("INSERT INTO usuarios" + 
                "(nombre, apellidos, correo, contraseña)" + "VALUES" +
                "(?,?,?,?)");
        
        try{
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, correo);
            sentencia_preparada.setString(4, contraseña);
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            conexion.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return resultado;
    }
    
    public String buscarNombre(String correo){
        String busqueda_nombre = null;
        Connection conexion = null;
        
        try{
            conexion = ConexionBD.conectar();
            String sentencia_buscar = ("SELECT * FROM usuarios "
                    + "WHERE correo = ?");
            sentencia_preparada.setString(1,correo);
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                String nombre = resultado.getString("nombre");
                String apellidos = resultado.getString("apellidos");
                busqueda_nombre = (nombre + " " + apellidos);
            }    
        }catch(Exception ex){
            System.out.println(ex.getMessage()); 
        }
        return busqueda_nombre;
    }
    
    public String buscarUsuarioRegistrado (String contraseña){
        String busqueda_usuario = null;
        Connection conexion = null;
        
        try{
            conexion = ConexionBD.conectar();
            String sentencia_buscar_usuario = ("SELECT * FROM usuarios "
                    + "WHERE contraseña = ?");
            sentencia_preparada.setString(1,contraseña);
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                busqueda_usuario = "Usuario encontrado";
            }else{
                busqueda_usuario = "Usuario no encontrado";
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage()); 
        }
        return busqueda_usuario;
    }
}
