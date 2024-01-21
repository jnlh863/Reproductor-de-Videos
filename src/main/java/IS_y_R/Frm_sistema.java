package IS_y_R;

//import java.time.LocalTime;
import Modelo_Videos.Video_Model;
import RegV_y_VerV_DAO.RV_y_VerV_DAO;
import Registro_Videos.RegisterVideos;
import Ver_Videos.MainWindow;
//import Ver_Videos.VerVidios;
import java.util.*;
import java.util.Date;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

public class Frm_sistema extends javax.swing.JFrame implements Runnable{
    String[] columnas = {"ID Video", "Nombre", "Artista", "Ubicación video", "Ubicación img"};
    DefaultTableModel tm = new DefaultTableModel(columnas, 0);
    
    public int min ;
    public int max ;
    
    String hora,minutos,segundos,day;
    Thread hilo;
    
    public Frm_sistema() {
        initComponents();
        //LocalTime horaActual = LocalTime.now();
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
        //LbHora.setText(new Date());
        /*Pone la ventana en medio de la pantalla*/
        this.getContentPane().setBackground(Color.getHSBColor(200/255.0f, 1.0f, 1.0f - (250/100.0f)));
        this.setLocationRelativeTo(null); 
        tblVideosAgregados.setModel(tm);
        initTable();
        
        // clima
        
        URL url;
        HttpURLConnection con = null;
        StringBuilder responseContent = new StringBuilder();
        BufferedReader reader;
        String line;
        try {
            url = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/1day/234446"
                    + "?apikey=WpjAFrWxkYDDWvmBd0y03iwNeCabr4AJ&"
                    + "language=es-mx&"
                    + "details=false&"
                    + "metric=false");
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);

            int status = con.getResponseCode();

            if (status >= 300) {
                reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
                parse(responseContent.toString());
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(Frm_sistema.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frm_sistema.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.disconnect();
        }

    
        
    }
    
public void parse(String responseBody) {
        Float minima = new JSONObject(responseBody)
                .getJSONArray("DailyForecasts")
                .getJSONObject(0)
                .getJSONObject("Temperature")
                .getJSONObject("Minimum")
                .getFloat("Value");
        //min = minima;
        min = (int)Math.round(((minima-32)/1.8) * 100) / 100;
        
        Float maxima = new JSONObject(responseBody)
                .getJSONArray("DailyForecasts")
                .getJSONObject(0)
                .getJSONObject("Temperature")
                .getJSONObject("Maximum")
                .getFloat("Value");
        //max = maxima;
        max = (int)Math.round(((maxima-32)/1.8) * 100) / 100;
        
        lblmax.setText("Minima          " + min +"º");
        lblmin.setText("Maxima        " + max+"º");
    }

    private void initTable(){
        RV_y_VerV_DAO c = new RV_y_VerV_DAO();
        List<Video_Model> vidios = c.buscar_datos_vidios();
        for(Video_Model v : vidios){
            Object[] o = {v.idvideo, v.nombre, 
                v.artista, v.ubivideo, v.ubimagen};
            tm.addRow(o);
        }
        tblVideosAgregados.setModel(tm);
    }
    
    
    
    
    public void hora(){
        Calendar calendario = new GregorianCalendar();
        Date horaActual = new Date();
        calendario.setTime(horaActual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    public void run(){
        //WHILE
        Thread current = Thread.currentThread();
        DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, ");
 
        String date = dateFormat.format(new Date());
        while(current==hilo){
            hora();
            //LbHora.setText(hora+ ":"+minutos+":"+segundos);
            LbHora.setText(date + " " + hora+ ":"+minutos+":"+segundos);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        LbHora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVideosAgregados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblmax = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        OpcCatálogos = new javax.swing.JMenu();
        RegisterU = new javax.swing.JMenuItem();
        RegisterV = new javax.swing.JMenuItem();
        OpcVideos = new javax.swing.JMenu();
        Vervidios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        LbHora.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        LbHora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel1.setFont(new java.awt.Font("Forte", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Bienvenido");

        btnCerrar.setText("Cerrar Sesión");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        tblVideosAgregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tblVideosAgregados);

        jLabel2.setFont(new java.awt.Font("Forte", 1, 18)); // NOI18N
        jLabel2.setText("Videos agregados por usted:");

        lblmax.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Forte", 1, 18)); // NOI18N
        jLabel4.setText("Temperatura");

        lblmin.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N

        OpcCatálogos.setText("Catalogo");
        OpcCatálogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcCatálogosMouseClicked(evt);
            }
        });
        OpcCatálogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcCatálogosActionPerformed(evt);
            }
        });

        RegisterU.setText("Registro de Usuarios");
        RegisterU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterUMouseClicked(evt);
            }
        });
        RegisterU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterUActionPerformed(evt);
            }
        });
        OpcCatálogos.add(RegisterU);

        RegisterV.setText("Registro de Videos");
        RegisterV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterVActionPerformed(evt);
            }
        });
        OpcCatálogos.add(RegisterV);

        jMenuBar1.add(OpcCatálogos);

        OpcVideos.setText("Videos");
        OpcVideos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcVideosActionPerformed(evt);
            }
        });

        Vervidios.setText("Ver videos");
        Vervidios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VervidiosActionPerformed(evt);
            }
        });
        OpcVideos.add(Vervidios);

        jMenuBar1.add(OpcVideos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(72, 72, 72))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmax, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmin, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(90, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnCerrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblmin)
                        .addGap(18, 18, 18)
                        .addComponent(lblmax))
                    .addComponent(LbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpcCatálogosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcCatálogosMouseClicked
        
    }//GEN-LAST:event_OpcCatálogosMouseClicked

    private void RegisterUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterUMouseClicked

        
    }//GEN-LAST:event_RegisterUMouseClicked

    private void RegisterUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterUActionPerformed

        Frm_sign_up_2 ventana = new Frm_sign_up_2();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegisterUActionPerformed

    private void OpcCatálogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcCatálogosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcCatálogosActionPerformed

    private void RegisterVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterVActionPerformed
        RegisterVideos ventana = new RegisterVideos();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegisterVActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Frm_menu ventana = new Frm_menu();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void OpcVideosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcVideosActionPerformed
        
    }//GEN-LAST:event_OpcVideosActionPerformed

    private void VervidiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VervidiosActionPerformed
        MainWindow ventana = new MainWindow();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VervidiosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and disOpcCatálogoshe form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbHora;
    private javax.swing.JMenu OpcCatálogos;
    private javax.swing.JMenu OpcVideos;
    private javax.swing.JMenuItem RegisterU;
    private javax.swing.JMenuItem RegisterV;
    private javax.swing.JMenuItem Vervidios;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblmax;
    private javax.swing.JLabel lblmin;
    private javax.swing.JTable tblVideosAgregados;
    // End of variables declaration//GEN-END:variables
}
