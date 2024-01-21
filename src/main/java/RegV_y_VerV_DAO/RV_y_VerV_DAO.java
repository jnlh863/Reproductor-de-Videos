package RegV_y_VerV_DAO;

import Modelo_Videos.Video_Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RV_y_VerV_DAO {
     public List<Video_Model> videos = new ArrayList<Video_Model>();
    public int guardar(String nombre, String artista, String ubivideo, String ubimagen){
        int resultado = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
                                                          "root","root");
            PreparedStatement insert = conn.prepareStatement("INSERT INTO videos" + 
                "(nombre, artista, ubivideo, ubimagen)" + "VALUES" +
                "(?,?,?,?)");
            insert.setString(1, nombre);
            insert.setString(2, artista);
            insert.setString(3, ubivideo);
            insert.setString(4, ubimagen);
            //insert.executeUpdate();
            resultado = insert.executeUpdate();
            insert.close();
            
        }catch (Exception ex){
             System.out.println(ex);
        }
        return resultado;
    }
   
    public int modificarnombre(String nombrea,String nombren){
        int resultado = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
                                                          "root","root");
            PreparedStatement update = conn.prepareStatement("UPDATE videos SET nombre = ?" + " WHERE nombre = ?;");
            update.setString(1,nombren);
            update.setString(2,nombrea);
         
            resultado = update.executeUpdate();
            update.close();
            
        }catch (Exception ex){
             System.out.println(ex);
        }
        return resultado;
    }
    
    public int modificarartista(String artistan,String artistaa){
        int resultado = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
                                                          "root","root");
            PreparedStatement update = conn.prepareStatement("UPDATE videos " + 
                                                             "SET artista = ? " + "WHERE artista = ?;");
            update.setString(1,artistan);
            update.setString(2,artistaa);
         
            resultado = update.executeUpdate();
            update.close();
            
        }catch (Exception ex){
             System.out.println(ex);
        }
        return resultado;
    }
    
    public int modificarubivideo(String ubivideon,String ubivideoa){
        int resultado = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
                                                          "root","root");
            PreparedStatement update = conn.prepareStatement("UPDATE videos " + 
                                                             "SET ubivideo = ? " + "WHERE ubivideo = ?;");
            update.setString(1,ubivideon);
            update.setString(2,ubivideoa);
         
            resultado = update.executeUpdate();
            update.close();
            
        }catch (Exception ex){
             System.out.println(ex);
        }
        return resultado;
    }
    
    public int modificarubimagen(String ubimagenn,String ubimagena){
        int resultado = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
                                                          "root","root");
            PreparedStatement update = conn.prepareStatement("UPDATE videos " + 
                                                             "SET ubimagen = ? " + "WHERE ubimagen = ?;");
            update.setString(1,ubimagenn);
            update.setString(2,ubimagena);
         
            resultado = update.executeUpdate();
            update.close();
            
        }catch (Exception ex){
             System.out.println(ex);
        }
        return resultado;
    }
    
    public int modificarTodo(Integer id, String nombren, String artistan, String ubivideon, String ubimagenn){
        int resultado = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
                                                          "root","root");
            PreparedStatement update = conn.prepareStatement("UPDATE videos " + 
                                                             "SET nombre = ?, artista = ?, ubivideo = ?, ubimagen = ?" 
                                                             + "WHERE idvideos = ?;");
            update.setString(1,nombren);
            update.setString(2,artistan);
            update.setString(3,ubivideon);
            update.setString(4,ubimagenn);
            update.setInt(5,id);
         
            resultado = update.executeUpdate();
            update.close();
            
        }catch (Exception ex){
             System.out.println(ex);
        }
        return resultado;
    }
    
    public String buscarvideo(Integer id){
        String busqueda_video = null;
        Integer rs;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb",
                    "root",
                    "root");
            PreparedStatement delete =
                    conn.prepareStatement("DELETE FROM videos " 
                            + "WHERE idvideos = ?;");
            delete.setInt(1,id);
            rs = delete.executeUpdate();
            if(rs > 0){
                busqueda_video = "Video eliminado";
            }else{
                busqueda_video = "Video no eliminado";
            }
 
        }catch(Exception ex){
            System.out.println(ex.getMessage());      
        }
        return busqueda_video;       
    } 
   
    
    public List<Video_Model> buscar_datos_vidios(){       
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb",
                    "root",
                    "root");
            PreparedStatement select =
                    conn.prepareStatement("SELECT * FROM videos WHERE idvideos >= 0;");
            rs = select.executeQuery();
            while (rs.next()) {
                Video_Model bdv = new Video_Model();
                bdv.setIdvideo(rs.getInt("idvideos"));
                bdv.setNombre(rs.getString("nombre"));
                bdv.setArtista(rs.getString("artista"));
                bdv.setUbivideo(rs.getString("ubivideo"));
                bdv.setUbimagen(rs.getString("ubimagen"));
                videos.add(bdv);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());      
        }
        return videos;       
    }
}
