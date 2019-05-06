/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TampilanMenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Laboran extends javax.swing.JFrame {
private void tampilkandata(){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("NID LABORAN");
        x.addColumn("NAMA");
        x.addColumn("KODE LAB");
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/labkom_itera1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from laboran";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString("id_laboran"),rset.getString("nama_laboran"),rset.getString("kode_lab")});
            }
            tblasprak.setModel(x);
        }catch(SQLException ex){
          
        }
    }
     private void tampilkandata(String kolom){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("NID LABORAN");
        x.addColumn("NAMA");
        x.addColumn("KODE LAB");
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/labkom_itera1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from laboran order by "+kolom+" asc";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString(1),rset.getString(2),rset.getString(3)});
            }
            tblasprak.setModel(x);
        }catch(SQLException ex){
            
        }
    }
     
     private void tampilkancari(String kolom){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("NID LABORAN");
        x.addColumn("NAMA");
        x.addColumn("KODE LAB");
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/labkom_itera1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from laboran where id_laboran like '%"+kolom+"%' or "+
                    "nama_laboran like '%"+kolom+"%' or kode_lab like '%"+kolom+"%'";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString(1),rset.getString(2),rset.getString(3)});
            }
            tblasprak.setModel(x);
        }catch(SQLException ex){
            TFPESAN.setText("gagal cari");
            ex.printStackTrace();
        }
    }

    /**
     * Creates new form Laboran
     */
    public Laboran() {
        initComponents();
        tampilkandata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnkembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFCARI = new javax.swing.JTextField();
        BTNCARI = new javax.swing.JButton();
        BTNBATAL = new javax.swing.JButton();
        TFPESAN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmburut = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblasprak = new javax.swing.JTable();
        btnubah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnkembali.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnkembali.setText("KEMBALI");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel1.setText("DATA LABORAN LAB KOMPUTER ITERA");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel2.setText("CARI JADWAL");

        TFCARI.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        TFCARI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCARIActionPerformed(evt);
            }
        });

        BTNCARI.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        BTNCARI.setText("CARI");
        BTNCARI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCARIActionPerformed(evt);
            }
        });

        BTNBATAL.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        BTNBATAL.setText("BATAL");
        BTNBATAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBATALActionPerformed(evt);
            }
        });

        TFPESAN.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        TFPESAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPESANActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel3.setText("URUTKAN JADWAL");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel4.setText("BERDASARKAN");

        cmburut.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        cmburut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID LABORAN", "NAMA", "KODE LAB", " ", " " }));
        cmburut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmburutActionPerformed(evt);
            }
        });

        tblasprak.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        tblasprak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID LABORAN", "NAMA", "KODE LAB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblasprak);

        btnubah.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnubah.setText("UBAH DATA");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(375, 375, 375))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(jLabel2)
                            .addGap(244, 244, 244)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(TFCARI, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(66, 66, 66)
                            .addComponent(jLabel4)
                            .addGap(28, 28, 28)
                            .addComponent(cmburut, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(133, 133, 133)
                            .addComponent(btnubah, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(BTNCARI)
                            .addGap(123, 123, 123)
                            .addComponent(BTNBATAL))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(TFPESAN, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(btnkembali)
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 95, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TFCARI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(cmburut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnubah))
                    .addGap(15, 15, 15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BTNCARI)
                        .addComponent(BTNBATAL))
                    .addGap(16, 16, 16)
                    .addComponent(TFPESAN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(68, 68, 68)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        MenuUtama x = new MenuUtama();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void BTNCARIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCARIActionPerformed
        String kolom=TFCARI.getText();
        tampilkancari(kolom);
    }//GEN-LAST:event_BTNCARIActionPerformed

    private void BTNBATALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBATALActionPerformed
        TFCARI.setText(null);
    }//GEN-LAST:event_BTNBATALActionPerformed

    private void cmburutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmburutActionPerformed
        String kolom;

        if (cmburut.getSelectedItem()=="ID LABORAN"){
            tampilkandata("id_laboran");
        }
        else if (cmburut.getSelectedItem()=="NAMA"){
            tampilkandata("nama_laboran");
        }
        else if (cmburut.getSelectedItem()=="KODE LAB"){
            tampilkandata("kode_lab");
        }
    }//GEN-LAST:event_cmburutActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        MenuLaboran x = new MenuLaboran();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnubahActionPerformed

    private void TFCARIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCARIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCARIActionPerformed

    private void TFPESANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPESANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPESANActionPerformed

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
            java.util.logging.Logger.getLogger(Laboran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laboran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBATAL;
    private javax.swing.JButton BTNCARI;
    private javax.swing.JTextField TFCARI;
    private javax.swing.JTextField TFPESAN;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnubah;
    private javax.swing.JComboBox cmburut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblasprak;
    // End of variables declaration//GEN-END:variables
}
