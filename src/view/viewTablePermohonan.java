/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controler.connection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author JUNAN
 */
public class viewTablePermohonan extends javax.swing.JFrame {

    /**
     * Creates new form formPermohonanPengukuran
     */
    public int idPermohonan ;
    
    
    public viewTablePermohonan(int idPermohonans){
        initComponents();
        this.idPermohonan = idPermohonans;
        System.out.print("active user id pemohon " +this.idPermohonan);
         setViewText();
         
    }
    public viewTablePermohonan() {
        initComponents();
         setViewText();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtPermohonan = new javax.swing.JLabel();
        txtPetugas = new javax.swing.JLabel();
        txtKoordinat = new javax.swing.JLabel();
        txtUkuran = new javax.swing.JLabel();
        txtKepemilikan = new javax.swing.JLabel();
        txtLokasi = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JLabel();
        txtNohp = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtNik = new javax.swing.JLabel();
        txtNama = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOk = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPermohonan.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        txtPermohonan.setText("Lorem Ipsum ");
        jPanel2.add(txtPermohonan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 200, 20));

        txtPetugas.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        txtPetugas.setText("Lorem Ipsum ");
        jPanel2.add(txtPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 270, 20));

        txtKoordinat.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        txtKoordinat.setText("Lorem Ipsum ");
        jPanel2.add(txtKoordinat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 270, 20));

        txtUkuran.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        txtUkuran.setText("Lorem Ipsum ");
        jPanel2.add(txtUkuran, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 270, 20));

        txtKepemilikan.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        txtKepemilikan.setText("Lorem Ipsum ");
        jPanel2.add(txtKepemilikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 270, 20));

        txtLokasi.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        txtLokasi.setText("Lorem Ipsum ");
        jPanel2.add(txtLokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 270, 20));

        txtAlamat.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        txtAlamat.setText("Lorem Ipsum ");
        jPanel2.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 250, 20));

        txtNohp.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        txtNohp.setText("Lorem Ipsum ");
        jPanel2.add(txtNohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 250, 20));

        txtEmail.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        txtEmail.setText("Lorem Ipsum ");
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 250, 20));

        txtNik.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        txtNik.setText("Lorem Ipsum ");
        jPanel2.add(txtNik, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 250, 20));

        txtNama.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        txtNama.setText("Lorem Ipsum ");
        jPanel2.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 250, 20));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(97, 188, 109));
        jLabel2.setText("Detail Permohonan");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 280, 30));

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/btnOk.png"))); // NOI18N
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOkMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOkMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnOkMouseReleased(evt);
            }
        });
        jPanel2.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/viewDetailBg.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_btnOkMouseClicked

    private void btnOkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseEntered
        // TODO add your handling code here:
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/btnOkHover.png")));
    }//GEN-LAST:event_btnOkMouseEntered

    private void btnOkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseExited
        // TODO add your handling code here:
         btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/btnOk.png")));
    }//GEN-LAST:event_btnOkMouseExited

    private void btnOkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMousePressed
        // TODO add your handling code here:
         btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/btnOkPress.png")));
    }//GEN-LAST:event_btnOkMousePressed

    private void btnOkMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseReleased
        // TODO add your handling code here:
         btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/btnOk.png")));
    }//GEN-LAST:event_btnOkMouseReleased

    
    
    
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
            java.util.logging.Logger.getLogger(viewTablePermohonan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewTablePermohonan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewTablePermohonan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewTablePermohonan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewTablePermohonan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnOk;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtAlamat;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtKepemilikan;
    private javax.swing.JLabel txtKoordinat;
    private javax.swing.JLabel txtLokasi;
    private javax.swing.JLabel txtNama;
    private javax.swing.JLabel txtNik;
    private javax.swing.JLabel txtNohp;
    private javax.swing.JLabel txtPermohonan;
    private javax.swing.JLabel txtPetugas;
    private javax.swing.JLabel txtUkuran;
    // End of variables declaration//GEN-END:variables

//    private void resetTxtField() {
//        txtNama.setText("");
//        txtNIK.setText("");
//        txtEmail.setText("");
//        txtNohp.setText("");
//        txtAlamat.setText("");
//        txtLokasi.setText("");
//        txtBukti.setText("");
//        txtUkuran.setText("");
//        txtKoordinat.setText("");
//         }
    
    
    java.sql.Connection conn = (Connection)connection.connectionDB();
    private void setViewText() {
         String queryView = "SELECT * FROM `db_bapena`.`tb_permohonan` INNER JOIN `db_bapena`.`tb_petugas` ON (`tb_permohonan`.`id_petugas` = `tb_petugas`.`idPetugas`) INNER JOIN `db_bapena`.`tb_status` ON (`tb_permohonan`.`status` = `tb_status`.`id`) WHERE idPermohonan = '"+idPermohonan+"';";
         try{
             
          
         Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery(queryView);
         if(rs.next()){
            txtNama.setText(rs.getString("nama"));
            txtNik.setText(rs.getString("nik"));
            txtEmail.setText(rs.getString("email"));
            txtNohp.setText(rs.getString("no_telp"));
            txtAlamat.setText(rs.getString("alamat"));
            txtLokasi.setText(rs.getString("lokasi_tnh"));
            txtKepemilikan.setText(rs.getString("bukti_milik"));
            txtUkuran.setText(rs.getString("ukuran_tnh"));
            txtKoordinat.setText(rs.getString("titik_koordinat"));
            txtPetugas.setText(rs.getString("nama_petugas"));
            txtPermohonan.setText(rs.getString("nama_status"));
            
         }
         }
         
        catch(Exception e){
            System.out.println("setViewText eror");
        }
    }
  
}