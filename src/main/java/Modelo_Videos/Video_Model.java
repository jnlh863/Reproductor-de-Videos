package Modelo_Videos;

import javax.swing.JLabel;

public class Video_Model extends JLabel {
    
    public int idvideo = 0;
    public String nombre = "";
    public String artista = "";
    public String ubivideo = "";
    public String ubimagen = "";


    /**
     * @return the idvideo
     */
    public int getIdvideo() {
        return idvideo;
    }

    /**
     * @param idvideo the idvideo to set
     */
    public void setIdvideo(int idvideo) {
        this.idvideo = idvideo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @return the ubivideo
     */
    public String getUbivideo() {
        return ubivideo;
    }

    /**
     * @param ubivideo the ubivideo to set
     */
    public void setUbivideo(String ubivideo) {
        this.ubivideo = ubivideo;
    }

    /**
     * @return the ubimagen
     */
    public String getUbimagen() {
        return ubimagen;
    }

    /**
     * @param ubimagen the ubimagen to set
     */
    public void setUbimagen(String ubimagen) {
        this.ubimagen = ubimagen;
    }
    
    
    
    
}
