/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Alvinda Akbar
 */
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
public class Daftar_buku extends javax.swing.JFrame {
    
    private int index;
    private String nobuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String jenis;

    public void LoadTable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("NO_BUKU");
        model.addColumn("JUDUL");
        model.addColumn("PENGARANG");
        model.addColumn("PENERBIT");
        model.addColumn("JENIS");
        
         try {
//            int no = 1;
            String sql = "SELECT * FROM daftar_buku";
            java.sql.Connection conn = (Connection)Koneksi.getConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1), 
                res.getString(2), res.getString(3), 
                res.getString(4), res.getString(5),res.getString(6)});
            }
            TblDataBuku.setModel(model);
        } catch (Exception e){
            
        }
    }
    
    public void ClearIsian(){
        TxtNoBuku.setText(null);
        TxtJudul.setText(null);
        TxtPengarang.setText(null);
        TxtPenerbit.setText(null);
        TxtJenis.setText(null);
    }
    
    
    public Daftar_buku() {
        initComponents();
        LoadTable();
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
        jLabel2 = new javax.swing.JLabel();
        TxtNoBuku = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtJudul = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtPenerbit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtPengarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtJenis = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BtnTambah = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        BtnEdit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        BtnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblDataBuku = new javax.swing.JTable();
        BtnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DAFTAR BUKU");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NO BUKU");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("JUDUL");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PENGARANG");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PENERBIT");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("JENIS");

        BtnTambah.setBackground(new java.awt.Color(102, 255, 255));
        BtnTambah.setForeground(new java.awt.Color(0, 0, 0));
        BtnTambah.setText("TAMBAH");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        BtnEdit.setBackground(new java.awt.Color(102, 255, 255));
        BtnEdit.setForeground(new java.awt.Color(0, 0, 0));
        BtnEdit.setText("EDIT");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnDelete.setBackground(new java.awt.Color(102, 255, 255));
        BtnDelete.setForeground(new java.awt.Color(0, 0, 0));
        BtnDelete.setText("HAPUS");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        TblDataBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "NO BUKU", "JUDUL", "PENGARANG", "PENERBIT", "JENIS"
            }
        ));
        TblDataBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblDataBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblDataBuku);

        BtnKembali.setBackground(new java.awt.Color(0, 255, 255));
        BtnKembali.setForeground(new java.awt.Color(0, 0, 0));
        BtnKembali.setText("KEMBALI");
        BtnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNoBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1)
                        .addGap(0, 234, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addGap(113, 113, 113))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnTambah)
                                .addGap(97, 97, 97)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(116, 116, 116)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnEdit)
                                .addGap(101, 101, 101)
                                .addComponent(BtnDelete)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnKembali))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNoBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TxtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TxtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnDelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnTambah)
                            .addComponent(BtnEdit))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnKembali)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        try {
            String sql = "INSERT INTO daftar_buku "
                     + "VALUES (null,'" + TxtNoBuku.getText()+"',"
                    + "'" + TxtJudul.getText()+"','"+TxtPengarang.getText()+"','"
                    +TxtPenerbit.getText()+"','"+TxtJenis.getText()+"')";
           
            java.sql.Connection conn = (Connection)Koneksi.getConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            LoadTable();
            ClearIsian();
            JOptionPane.showMessageDialog(null, "Data berhasil di tambah!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal ditambah!"+e.getMessage());
        }
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        try {
             String sql = "UPDATE daftar_buku SET NO_BUKU =    '" + TxtNoBuku.getText()+
                    "', JUDUL = '" + TxtJudul.getText()+"', PENGARANG = '" +
                    TxtPengarang.getText()+"', PENERBIT = '" +
                    TxtPenerbit.getText()+"',JENIS = '"+TxtJenis.getText()+
                    "'WHERE NO_BUKU = '" + TxtNoBuku.getText()+"'";
             java.sql.Connection conn = (Connection) Koneksi.getConnection();
             java.sql.PreparedStatement pst = conn.prepareStatement(sql);
             pst.execute();
             LoadTable();
             ClearIsian();
             JOptionPane.showMessageDialog(null, "Data berhasil di edit");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Perubahan Data gagal!"+e.getMessage());
    }//GEN-LAST:event_BtnEditActionPerformed

    }
    
    
    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        try {
            String sql = "DELETE FROM daftar_buku WHERE NO_BUKU = '"+TxtNoBuku.getText()+"'";
            java.sql.Connection conn = (Connection) Koneksi.getConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            LoadTable();
            ClearIsian();
            JOptionPane.showMessageDialog(this, "Data berhasil di hapus");
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void TblDataBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblDataBukuMouseClicked
        index = TblDataBuku.getSelectedRow();
        
        nobuku = (String) TblDataBuku.getValueAt(index, 1);
        
        judul = (String) TblDataBuku.getValueAt(index, 2);
        pengarang = (String) TblDataBuku.getValueAt(index, 3);
        penerbit = (String) TblDataBuku.getValueAt(index, 4);
        jenis = (String) TblDataBuku.getValueAt(index, 5);
        
        TxtNoBuku.setText(nobuku);
        TxtJudul.setText(judul);
        TxtPengarang.setText(pengarang);
        TxtPenerbit.setText(penerbit);
        TxtJenis.setText(jenis);
        
    }//GEN-LAST:event_TblDataBukuMouseClicked

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed

        dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Daftar_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar_buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnKembali;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JTable TblDataBuku;
    private javax.swing.JTextField TxtJenis;
    private javax.swing.JTextField TxtJudul;
    private javax.swing.JTextField TxtNoBuku;
    private javax.swing.JTextField TxtPenerbit;
    private javax.swing.JTextField TxtPengarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
