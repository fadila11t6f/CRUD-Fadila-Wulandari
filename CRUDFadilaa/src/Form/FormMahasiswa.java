package Form;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormMahasiswa extends javax.swing.JFrame {

    private Connection conn;
    
    public FormMahasiswa() {
        initComponents();
        conn = Koneksi.getConnection();
        getData(); 
        nonAktifButton();
        aktifButton();
    }

    
  private void getData() {
      DefaultTableModel model =(DefaultTableModel) tbl_Data.getModel();
      model.setRowCount(0);
      
      try {
          String sql = "select * From mahasiswa";
          try (PreparedStatement st = conn.prepareStatement(sql)) {
              ResultSet rs = st.executeQuery();
              
              while(rs.next()){
                  int id         = rs.getInt("id");
                  String nama    = rs.getString("nama");
                  String telepon = rs.getString("telepon");
                  String alamat  = rs.getString("alamat");
                  
                  Object[] rowData = {id,nama,telepon,alamat};
                  model.addRow(rowData);
              }
              
              rs.close();
          }
      }catch (Exception e) {
          Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE,null,e);
      }
    }
  
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Data = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        t_Nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t_Telepon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t_Alamat = new javax.swing.JTextField();
        t_Cari = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_perbarui = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_Data.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        tbl_Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "Telepon", "Alamat"
            }
        ));
        tbl_Data.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_Data.setRowHeight(30);
        tbl_Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Data);

        jLabel1.setText("Nama");

        jLabel2.setText("Telepon");

        jLabel3.setText("Alamat");

        t_Alamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_AlamatKeyReleased(evt);
            }
        });

        t_Cari.setText("Pencarian");
        t_Cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_CariMouseClicked(evt);
            }
        });
        t_Cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_CariKeyTyped(evt);
            }
        });

        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_perbarui.setText("PERBARUI");
        btn_perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perbaruiActionPerformed(evt);
            }
        });

        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(t_Nama, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(t_Telepon)
                            .addComponent(t_Alamat))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t_Cari, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_perbarui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapus)
                        .addGap(263, 263, 263))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(t_Cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_Telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_tambah)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_hapus)
                        .addComponent(btn_batal)
                        .addComponent(btn_perbarui)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
       String Nama = t_Nama.getText();
       String Telepon = t_Telepon.getText();
       String Alamat = t_Alamat.getText();
       
       if(Nama.isEmpty() || Telepon.isEmpty() || Alamat.isEmpty()){
           JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
           return;
       }
       
       try {
           String sql = "INSERT INTO mahasiswa (nama,telepon,alamat) VALUES (?,?,?)";
           PreparedStatement st = conn.prepareStatement(sql);
               st.setString(1, Nama);
               st.setString(2, Telepon);
               st.setString(3, Alamat);
               
               int rowInserted = st.executeUpdate();
               if(rowInserted > 0){
                   JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                   resetForm();
                   getData();
               }
               
               st.close();
            }catch (Exception e) {
          Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE,null,e);
       }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_perbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perbaruiActionPerformed
        int selectedRow = tbl_Data.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "pilih baris yang akan diperbarui");
            return;
        }
        
        String id = tbl_Data.getValueAt(selectedRow, 0).toString();
        String Nama = t_Nama.getText();
        String Telepon = t_Telepon.getText();
        String Alamat = t_Alamat.getText();
        
        if(Nama.isEmpty() || Telepon.isEmpty() || Alamat.isEmpty()){
           JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
           return;
           
        }
        
        try {
               String sql = "UPDATE mahasiswa SET Nama=?, Telepon=?, Alamat=? WHERE id=?";
               PreparedStatement st = conn.prepareStatement(sql);
               st.setString(1, Nama);
               st.setString(2, Telepon);
               st.setString(3, Alamat);
               st.setString(4, id);
               
               int rowUpdated = st.executeUpdate();
               if(rowUpdated > 0){
                   JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                   resetForm();
                   getData();
               }
               
               st.close(); 
        } catch (Exception e) { 
            Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btn_perbaruiActionPerformed

        
       
    private void tbl_DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DataMouseClicked
        int selectedRow = tbl_Data.getSelectedRow();
        if(selectedRow != -1){
            String Nama = tbl_Data.getValueAt(selectedRow, 1).toString();
            String Telepon = tbl_Data.getValueAt(selectedRow, 2).toString();
            String Alamat = tbl_Data.getValueAt(selectedRow, 3).toString();
            
            t_Nama.setText(Nama);
            t_Telepon.setText(Telepon);
            t_Alamat.setText(Alamat);
        }
        
        btn_perbarui.setEnabled(true);
        btn_tambah.setEnabled(false);
        btn_hapus.setEnabled(true);
    }//GEN-LAST:event_tbl_DataMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        resetForm();
        aktifButton();
        nonAktifButton();
        
    }//GEN-LAST:event_btn_batalActionPerformed

    private void t_AlamatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_AlamatKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t_AlamatKeyReleased

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int selectedRow = tbl_Data.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "pilih baris yang akan diperbarui");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data ini ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            String id = tbl_Data.getValueAt(selectedRow, 0).toString();
            
            try {
              String sql = "DELETE FROM mahasiswa WHERE id=?";
              PreparedStatement st = conn.prepareStatement(sql);
              st.setString(1, id);
              
              int rowDelete = st.executeUpdate();
              if(rowDelete > 0){
                  JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
              }
              st.close();
              
            } catch (Exception e) {
                 Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        
        resetForm();
        getData();
        aktifButton();
        nonAktifButton();
        
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void t_CariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_CariKeyTyped
    DefaultTableModel model =(DefaultTableModel) tbl_Data.getModel();
      model.setRowCount(0);
      
      String cari = t_Cari.getText();
      
      try {
          String sql = "select * From mahasiswa WHERE nama LIKE ? OR telepon LIKE ? OR alamat LIKE ?";
          PreparedStatement st = conn.prepareStatement(sql); 
              st.setString(1, "%" + cari + "%");
              st.setString(2, "%" + cari + "%");
              st.setString(3, "%" + cari + "%");
          
          ResultSet rs = st.executeQuery();
              
              while(rs.next()){
                  int id         = rs.getInt("id");
                  String nama    = rs.getString("nama");
                  String telepon = rs.getString("telepon");
                  String alamat  = rs.getString("alamat");
                  
                  Object[] rowData = {id,nama,telepon,alamat};
                  model.addRow(rowData);
              }
              
              rs.close();
              st.close();
      } catch (Exception e) {
          Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE,null,e);
      }
    }//GEN-LAST:event_t_CariKeyTyped

    private void t_CariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_CariMouseClicked
        t_Cari.setText("");
    }//GEN-LAST:event_t_CariMouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_perbarui;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_Alamat;
    private javax.swing.JTextField t_Cari;
    private javax.swing.JTextField t_Nama;
    private javax.swing.JTextField t_Telepon;
    private javax.swing.JTable tbl_Data;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        t_Nama.setText(""); 
        t_Telepon.setText(""); 
        t_Alamat.setText(""); 
    }

    private void nonAktifButton() {
        btn_perbarui.setEnabled(false);
        btn_hapus.setEnabled(false);
    }

    private void aktifButton() {
        btn_tambah.setEnabled(true);
        btn_batal.setEnabled(true);
    }

    
    
}
