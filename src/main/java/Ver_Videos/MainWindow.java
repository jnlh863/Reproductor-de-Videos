/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ver_Videos;

import IS_y_R.Frm_sistema;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

/**
 *
 * @author BD-16
 */
public class MainWindow extends javax.swing.JFrame {
    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;
    
    public String url = "";
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        this.getContentPane().setBackground(Color.getHSBColor(200/255.0f, 1.0f, 1.0f - (250/100.0f)));
        this.setLocationRelativeTo(null); 
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        pnlVLC.setLayout(new BorderLayout());
        pnlVLC.add(mediaPlayerComponent, BorderLayout.CENTER);
        initPanels();
    }

    public void initPanels() {
        
        java.awt.GridLayout songsPanelLayout = new java.awt.GridLayout(62, 1);
        
        pnlVideos.setLayout(songsPanelLayout);
        
        videoDAO vd = new videoDAO();

        for (videoDAO v : vd.consultarVideoBD()) {
            JPanel songPanel1 = new JPanel();
            
            JLabelVideo lblSongImage = new JLabelVideo();
            JLabel lblSongName = new JLabel();
            JLabel lblSongArtist = new JLabel();
            lblSongName.setText("Nombre Canción :"+ v.nombre);
            lblSongArtist.setText("Nombre Artista :" + v.artista);
            songPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

 

            lblSongImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

 

            lblSongName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

 

            lblSongArtist.setBorder(javax.swing.BorderFactory.createEtchedBorder());

 

            javax.swing.GroupLayout songPanel1Layout = new javax.swing.GroupLayout(songPanel1);
            songPanel1.setLayout(songPanel1Layout);
            songPanel1Layout.setHorizontalGroup(
                    songPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(songPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblSongImage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(songPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSongName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSongArtist, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                                    .addContainerGap())
            );
            songPanel1Layout.setVerticalGroup(
                    songPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(songPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(songPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(songPanel1Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(lblSongName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblSongArtist, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE))
                                            .addComponent(lblSongImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
                    
            );
            
            initImages(lblSongImage, v.rtIma
                    , v.rtVd
                    , 70, 60);
            lblSongImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagenMouseClicked(evt, v.rtVd);
            }
        });
            pnlVideos.add(songPanel1);
        }
    } 

 

    private void lblImagenMouseClicked(java.awt.event.MouseEvent evt, String urlVideo) {                                        
        mediaPlayerComponent.mediaPlayer().media().startPaused(urlVideo); 
        url=urlVideo;
        mediaPlayerComponent.mediaPlayer().controls().play();
    } 
    
    public void initImages(JLabelVideo lbl, String urlImage, String urlVideo, int width, int height){
        lbl.setIcon(new ImageIcon(
                new ImageIcon(getClass().getResource(urlImage))
                              .getImage()
                              .getScaledInstance(width, 
                                                 height,  
                                                 java.awt.Image.SCALE_SMOOTH
                              )
                        )
                    );
        lbl.setUrlVideo(urlVideo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVLC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlVideos = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btPlay = new javax.swing.JButton();
        btPausa = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlVLC.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlVLCLayout = new javax.swing.GroupLayout(pnlVLC);
        pnlVLC.setLayout(pnlVLCLayout);
        pnlVLCLayout.setHorizontalGroup(
            pnlVLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        pnlVLCLayout.setVerticalGroup(
            pnlVLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlVideos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pnlVideosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout pnlVideosLayout = new javax.swing.GroupLayout(pnlVideos);
        pnlVideos.setLayout(pnlVideosLayout);
        pnlVideosLayout.setHorizontalGroup(
            pnlVideosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        pnlVideosLayout.setVerticalGroup(
            pnlVideosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnlVideos);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btPlay.setText("Resume");
        btPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlayActionPerformed(evt);
            }
        });

        btPausa.setText("Stop");
        btPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPausaActionPerformed(evt);
            }
        });

        jMenu1.setText("Catálogos");

        jMenuItem1.setText("Registro de Usuarios");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Registro de Videos");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Videos");

        jMenuItem3.setText("Ver Videos");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlVLC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(pnlVLC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlVideosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pnlVideosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlVideosAncestorAdded

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        Frm_sistema ventana = new Frm_sistema();
        mediaPlayerComponent.mediaPlayer().media().startPaused(url);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlayActionPerformed
        // TODO add your handling code here:
        mediaPlayerComponent.mediaPlayer().controls().play();
    }//GEN-LAST:event_btPlayActionPerformed

    private void btPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPausaActionPerformed
        // TODO add your handling code here:
        mediaPlayerComponent.mediaPlayer().media().startPaused(url);
        
    }//GEN-LAST:event_btPausaActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPausa;
    private javax.swing.JButton btPlay;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlVLC;
    private javax.swing.JPanel pnlVideos;
    // End of variables declaration//GEN-END:variables
}
