/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas_Akhir;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.*;
import javax.xml.crypto.Data;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import java.awt.*;
/**
 *
 * @author LENOVO
 */
public class gudang extends javax.swing.JFrame {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement statBrng;
    Boolean ada = false;
    DefaultTableModel tabModel;
    ResultSet RsProduk=null;
    /**
     * Creates new form FromBarang
     */
    public gudang() {
        initComponents();
        String [] judul = {"Kode Barang", "Nama Barang", "Satuan", "Jenis Barang", "Harga", "Stok", "Tanggal Masuk"};
        tabModel = new DefaultTableModel(judul,0);
        jTSGudang.setModel(tabModel);
        
        //fungsi Tampil data dan set edit off dijalankan saat aplikasi di run
        tampilData();
        
    
    }
    private void tampilData(){
        int row = tabModel.getRowCount();
        for (int a = 0; a<row; a++){
            tabModel.removeRow(0);
        }
        try{            
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/tugas_akhir", "root", "");
            Statement stt=conn.createStatement();
            tabModel.getDataVector().removeAllElements();
            
            ResultSet RsProduk = stt.executeQuery("SELECT * from gudang ");  
            while(RsProduk.next()){
                Object[] data={
                    RsProduk.getInt("Kode Barang"),
                    RsProduk.getString("NamaBarang"),                    
                    RsProduk.getString("Jenis"),
                    RsProduk.getString("Satuan"),
                    RsProduk.getInt("HargaSatuan"),
                    RsProduk.getInt("Stok"),
                    RsProduk.getDate("TanggalMasuk")         
                };
               tabModel.addRow(data);
            }                
        } catch (SQLException ex) {
        System.err.println(ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jKBarang = new javax.swing.JLabel();
        jTFKBarang = new javax.swing.JTextField();
        jNBarang = new javax.swing.JLabel();
        jTFNBarang = new javax.swing.JTextField();
        jJBarang = new javax.swing.JLabel();
        jCBJBarang = new javax.swing.JComboBox<>();
        jCBSatuan = new javax.swing.JComboBox<>();
        jSatuan = new javax.swing.JLabel();
        jHSatuan = new javax.swing.JLabel();
        jTFHSatuan = new javax.swing.JTextField();
        jSGudang = new javax.swing.JLabel();
        jTFSGudang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSGudang = new javax.swing.JTable();
        jBTBarang = new javax.swing.JButton();
        jBSimpan = new javax.swing.JButton();
        jBEdit = new javax.swing.JButton();
        jBHapus = new javax.swing.JButton();
        jBKeluar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gudang Barang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jLabel1)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 883, -1));

        jKBarang.setText("Kode Barang");
        getContentPane().add(jKBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 92, -1, -1));
        getContentPane().add(jTFKBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 89, 150, -1));

        jNBarang.setText("Nama Barang");
        getContentPane().add(jNBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 126, -1, -1));
        getContentPane().add(jTFNBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 123, 150, -1));

        jJBarang.setText("Jenis Barang");
        getContentPane().add(jJBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 160, -1, -1));

        jCBJBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jCBJBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 157, 150, -1));

        jCBSatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jCBSatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 191, 150, -1));

        jSatuan.setText("Satuan");
        getContentPane().add(jSatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 194, -1, -1));

        jHSatuan.setText("Harga Satuan");
        getContentPane().add(jHSatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 228, -1, -1));
        getContentPane().add(jTFHSatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 225, 150, -1));

        jSGudang.setText("Stok Gudang");
        getContentPane().add(jSGudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 262, -1, -1));
        getContentPane().add(jTFSGudang, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 259, 150, -1));

        jTSGudang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Jenis Barang", "Satuan", "Harga Satuan", "Stok Gudang", "Tanggal Masuk"
            }
        ));
        jScrollPane1.setViewportView(jTSGudang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 402, 883, 368));

        jBTBarang.setText("Tambah Barang");
        getContentPane().add(jBTBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 259, -1, -1));

        jBSimpan.setText("Simpan");
        jBSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jBSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 259, 114, -1));

        jBEdit.setText("Edit");
        getContentPane().add(jBEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 114, -1));

        jBHapus.setText("Hapus");
        getContentPane().add(jBHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 300, 114, -1));

        jBKeluar.setText("Keluar");
        getContentPane().add(jBKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 300, 114, -1));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Stok Gudang");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(423, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(385, 385, 385))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 341, 883, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSimpanActionPerformed
                          

                      
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
            java.util.logging.Logger.getLogger(Contoh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contoh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contoh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contoh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gudang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEdit;
    private javax.swing.JButton jBHapus;
    private javax.swing.JButton jBKeluar;
    private javax.swing.JButton jBSimpan;
    private javax.swing.JButton jBTBarang;
    private javax.swing.JComboBox<String> jCBJBarang;
    private javax.swing.JComboBox<String> jCBSatuan;
    private javax.swing.JLabel jHSatuan;
    private javax.swing.JLabel jJBarang;
    private javax.swing.JLabel jKBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jNBarang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jSGudang;
    private javax.swing.JLabel jSatuan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFHSatuan;
    private javax.swing.JTextField jTFKBarang;
    private javax.swing.JTextField jTFNBarang;
    private javax.swing.JTextField jTFSGudang;
    private javax.swing.JTable jTSGudang;
    // End of variables declaration//GEN-END:variables
}
   

