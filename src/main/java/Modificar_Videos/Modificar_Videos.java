package Modificar_Videos;

import Registro_Videos.RegisterVideos;
import java.awt.Color;


public class Modificar_Videos extends javax.swing.JFrame {


    public Modificar_Videos() {
        initComponents();
        /*Pone la ventana en medio de la pantalla*/
        this.getContentPane().setBackground(Color.getHSBColor(200/255.0f, 1.0f, 1.0f - (250/100.0f)));
        this.setLocationRelativeTo(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnModN = new javax.swing.JButton();
        btnModArt = new javax.swing.JButton();
        btnModUbiV = new javax.swing.JButton();
        btnModUbiImg = new javax.swing.JButton();
        btnModTODO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar datos del video");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione que datos modificar:");

        btnModN.setText("Modificar Nombre");
        btnModN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModNActionPerformed(evt);
            }
        });

        btnModArt.setText("Modificar nombre del artista");
        btnModArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModArtActionPerformed(evt);
            }
        });

        btnModUbiV.setText("Modificar ubicación del video");
        btnModUbiV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModUbiVActionPerformed(evt);
            }
        });

        btnModUbiImg.setText("Modificar ubicación de la imagen");
        btnModUbiImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModUbiImgActionPerformed(evt);
            }
        });

        btnModTODO.setText("Modificar todo");
        btnModTODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModTODOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModTODO, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModUbiImg, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModUbiV, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModArt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModN, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnRegresar))
                .addGap(27, 27, 27)
                .addComponent(btnModN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModArt)
                .addGap(12, 12, 12)
                .addComponent(btnModUbiV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModUbiImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModTODO)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModNActionPerformed
        
        ModNombre ventana = new ModNombre();
        ventana.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnModNActionPerformed

    private void btnModArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModArtActionPerformed
        
        ModArtista ventana = new ModArtista();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModArtActionPerformed

    private void btnModUbiVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModUbiVActionPerformed
        
        ModUbiV ventana = new ModUbiV();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModUbiVActionPerformed

    private void btnModUbiImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModUbiImgActionPerformed
        
        ModUbImg ventana = new ModUbImg();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModUbiImgActionPerformed

    private void btnModTODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModTODOActionPerformed
        
        ModTODO ventana = new ModTODO();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModTODOActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        RegisterVideos ventana = new RegisterVideos();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar_Videos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_Videos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_Videos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_Videos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_Videos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModArt;
    private javax.swing.JButton btnModN;
    private javax.swing.JButton btnModTODO;
    private javax.swing.JButton btnModUbiImg;
    private javax.swing.JButton btnModUbiV;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}