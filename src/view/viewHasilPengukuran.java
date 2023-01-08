/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controler.connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JUNAN
 */
public class viewHasilPengukuran extends javax.swing.JFrame {

    /**
     * Creates new form formPermohonanPengukuran
     */
    public int idPermohonan;
    
    
    public viewHasilPengukuran(int permohonanId){
        initComponents();
        this.idPermohonan = permohonanId;
        System.out.print("active user id pemohon " +this.idPermohonan);
         setViewText();
         
    }
    public viewHasilPengukuran() {
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

        jPanel1 = new javax.swing.JPanel();
        txtPenggunaan = new javax.swing.JLabel();
        txtNib = new javax.swing.JLabel();
        txtNamaPetugas = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JLabel();
        txtKoordinat = new javax.swing.JLabel();
        txtLuas = new javax.swing.JLabel();
        txtNamaPemohon = new javax.swing.JLabel();
        btnOk = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPenggunaan.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txtPenggunaan.setForeground(new java.awt.Color(0, 0, 0));
        txtPenggunaan.setText("Lorem Ipsum");
        jPanel1.add(txtPenggunaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        txtNib.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txtNib.setForeground(new java.awt.Color(0, 0, 0));
        txtNib.setText("Lorem Ipsum");
        jPanel1.add(txtNib, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        txtNamaPetugas.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txtNamaPetugas.setForeground(new java.awt.Color(0, 0, 0));
        txtNamaPetugas.setText("Lorem Ipsum");
        jPanel1.add(txtNamaPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, -1, -1));

        txtTanggal.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txtTanggal.setForeground(new java.awt.Color(0, 0, 0));
        txtTanggal.setText("Lorem Ipsum");
        jPanel1.add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        txtKoordinat.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txtKoordinat.setForeground(new java.awt.Color(0, 0, 0));
        txtKoordinat.setText("Lorem Ipsum");
        jPanel1.add(txtKoordinat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        txtLuas.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txtLuas.setForeground(new java.awt.Color(0, 0, 0));
        txtLuas.setText("Lorem Ipsum");
        jPanel1.add(txtLuas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        txtNamaPemohon.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        txtNamaPemohon.setForeground(new java.awt.Color(0, 0, 0));
        txtNamaPemohon.setText("Lorem Ipsum");
        jPanel1.add(txtNamaPemohon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

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
        jPanel1.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/templateSuratUkur.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseReleased
        // TODO add your handling code here:
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/btnOk.png")));
    }//GEN-LAST:event_btnOkMouseReleased

    private void btnOkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMousePressed
        // TODO add your handling code here:
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/btnOkPress.png")));
    }//GEN-LAST:event_btnOkMousePressed

    private void btnOkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseExited
        // TODO add your handling code here:
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/btnOk.png")));
    }//GEN-LAST:event_btnOkMouseExited

    private void btnOkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseEntered
        // TODO add your handling code here:
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("img/btnOkHover.png")));
    }//GEN-LAST:event_btnOkMouseEntered

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_btnOkMouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(viewHasilPengukuran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewHasilPengukuran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewHasilPengukuran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewHasilPengukuran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewHasilPengukuran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtKoordinat;
    private javax.swing.JLabel txtLuas;
    private javax.swing.JLabel txtNamaPemohon;
    private javax.swing.JLabel txtNamaPetugas;
    private javax.swing.JLabel txtNib;
    private javax.swing.JLabel txtPenggunaan;
    private javax.swing.JLabel txtTanggal;
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
         
         
           try{
             
//          String getIdPermohonan = "SELECT * FROM tb_permohonan WHERE idPermohonan = '"+idPermohonan+"';";
         
//         ResultSet permohonan = st.executeQuery(getIdPermohonan);
//         
//         if(permohonan.next()){
//           idForm = permohonan.getInt("idPermohonan");
//           
//           
            Statement st = conn.createStatement();           
            String viewAllPengukuran = "SELECT `tb_permohonan`.`titik_koordinat`,`tb_hasil_ukur`.`nib`, `tb_hasil_ukur`.`keadaan_tnh`, `tb_hasil_ukur`.`penggunaan`, `tb_hasil_ukur`.`tgl_pengukuran`, `tb_hasil_ukur`.`luas_tnh`, `tb_petugas`.`nama_petugas`, `tb_permohonan`.`nama` FROM `db_bapena`.`tb_hasil_ukur` INNER JOIN `db_bapena`.`tb_permohonan` ON (`tb_hasil_ukur`.`idPermohonan` = `tb_permohonan`.`idPermohonan`) INNER JOIN `db_bapena`.`tb_petugas` ON (`tb_hasil_ukur`.`idPetugas` = `tb_petugas`.`idPetugas`) AND (`tb_permohonan`.`id_petugas` = `tb_petugas`.`idPetugas`) WHERE `tb_permohonan`.`idPermohonan` = '"+idPermohonan+"';";
            ResultSet hasilUkur = st.executeQuery(viewAllPengukuran);
             if(hasilUkur.next()){
               
           txtNamaPemohon.setText(hasilUkur.getString("nama"));
           txtNamaPetugas.setText(hasilUkur.getString("nama_petugas"));
           txtNib.setText(hasilUkur.getString("nib"));
            txtLuas.setText(hasilUkur.getString("luas_tnh"));
            txtTanggal.setText(hasilUkur.getDate("tgl_pengukuran").toString());
            txtKoordinat.setText(hasilUkur.getString("titik_koordinat"));
            txtPenggunaan.setText(hasilUkur.getString("penggunaan"));
           }
         
         }
         
        catch(SQLException e){
            System.out.println("setViewText eror");
        }
    }
  
}