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
public class MenuLaboran extends javax.swing.JFrame {
private void tampilkandata(){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("ID LABORAN");
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
                x.addRow(new Object[] {rset.getString(1),rset.getString(2),rset.getString(3)});
            }
            tbllaboran.setModel(x);
        }catch(SQLException ex){
            
        }
    }
    /**
     * Creates new form MenuLaboran
     */
    public MenuLaboran() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        tfnama = new javax.swing.JTextField();
        tfkode = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbllaboran = new javax.swing.JTable();
        btnupdate = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        tfpesan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("ID LABORAN");

        jLabel2.setText("KODE LAB");

        jLabel3.setText("NAMA");

        tfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidActionPerformed(evt);
            }
        });

        tfnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnamaActionPerformed(evt);
            }
        });

        tfkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfkodeActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbllaboran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID LABORAN", "NAMA ", "KODE LAB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbllaboran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbllaboranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbllaboran);

        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("MODIFIKASI DATA LABORAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(386, 386, 386)
                            .addComponent(jLabel5))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnadd)
                                        .addComponent(btndelete))))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfkode, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(173, 173, 173)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnupdate)
                                        .addComponent(jButton2))))
                            .addGap(65, 65, 65)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(tfpesan, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel1)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel3)
                            .addGap(24, 24, 24)
                            .addComponent(jLabel2)
                            .addGap(92, 92, 92)
                            .addComponent(btnadd)
                            .addGap(44, 44, 44)
                            .addComponent(btndelete))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(92, 92, 92)
                            .addComponent(btnupdate)
                            .addGap(44, 44, 44)
                            .addComponent(jButton2))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(45, 45, 45)
                    .addComponent(tfpesan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidActionPerformed

    private void tfnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnamaActionPerformed

    private void tfkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfkodeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Laboran x = new Laboran();
        x.setVisible(true); //menampilkan form yang dituju
        this.setVisible(false); //menghilangkan form saat ini
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbllaboranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbllaboranMouseClicked
        DefaultTableModel model = (DefaultTableModel) tbllaboran.getModel();
        tfid.setText(model.getValueAt(tbllaboran.getSelectedRow(), 0).toString());
        tfnama.setText(model.getValueAt(tbllaboran.getSelectedRow(), 1).toString());
        tfkode.setText(model.getValueAt(tbllaboran.getSelectedRow(), 2).toString());
        
    }//GEN-LAST:event_tbllaboranMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbllaboran.getModel();
        try(
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/labkom_itera1",
                "root",
                "");
            Statement stmt = conn.createStatement();
        ){
            String update = "update laboran set id_laboran='"+tfid.getText()+"',nama_laboran='"+tfnama.getText()+"',kode_lab='"+tfkode.getText()+
                    "' where id_laboran='"+model.getValueAt(tbllaboran.getSelectedRow(), 0).toString()+"'";
            stmt.executeUpdate(update);
            tfpesan.setText("update data berhasil");
            tampilkandata();
        }catch (SQLException ex) {
            tfpesan.setText("gagal update data");
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try(
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/labkom_itera1",
                "root",
                "");
            Statement stmt = conn.createStatement();
        ){
            String insert = "insert into laboran values ('"+tfid.getText()+"','"+tfnama.getText()+"','"+tfkode.getText()+"')";
            stmt.executeUpdate(insert);
            tfpesan.setText("tambah data berhasil");
            tampilkandata();

        } catch (SQLException ex) {
            tfpesan.setText("gagal tambah data");
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try(
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/labkom_itera1",
                "root",
                "");
            Statement stmt = conn.createStatement();
        ){
            String delete = "delete from laboran where id_laboran = '"+tfid.getText()+"'";
            stmt.executeUpdate(delete);
            tfpesan.setText("hapus data berhasil");
            tampilkandata();
        }catch (SQLException ex) {
            tfpesan.setText("gagal hapus data");
        }
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuLaboran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuLaboran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuLaboran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuLaboran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLaboran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbllaboran;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfkode;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfpesan;
    // End of variables declaration//GEN-END:variables
}
