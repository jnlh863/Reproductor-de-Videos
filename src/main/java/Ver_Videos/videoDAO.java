/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ver_Videos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trobl
 */
public class videoDAO {

    public int id_v ;
    public String nombre = "";
    public String artista = "";
    public String rtIma = "";
    public String rtVd = "";
    

    private final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    private final String DB_USER = "root";
    private final String DB_PWD = "root";
    ArrayList<videoDAO> lstVideo = new ArrayList<>();

    

    

    public List<videoDAO> consultarVideoBD() {
        

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            
            PreparedStatement select = conn.prepareStatement("SELECT * FROM videos ORDER BY nombre ASC;");

            ResultSet rs = select.executeQuery();

            while (rs.next()) {
                videoDAO pq = new videoDAO();
                pq.id_v = rs.getInt("idvideos");
                pq.nombre = rs.getString("nombre");
                pq.artista = rs.getString("artista");
                pq.rtIma = rs.getString("ubimagen");
                pq.rtVd = rs.getString("ubivideo");
                
                
                
                
                

                lstVideo.add(pq);
                
                
            
            
        }
            
            

            /*insert.executeUpdate();*/
        } catch (Exception ex) {
            System.out.println();
        }
        
        
        
        
        return lstVideo;
    }

}
