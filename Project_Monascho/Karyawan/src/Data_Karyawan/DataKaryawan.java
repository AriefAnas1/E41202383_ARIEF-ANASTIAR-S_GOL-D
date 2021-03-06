package Data_Karyawan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author firda
 */
public class DataKaryawan extends javax.swing.JFrame {
 dbKaryawan koneksi = new dbKaryawan();

    private DefaultTableModel model;
    
    private void autonumber(){
        try{
            Connection c = dbKaryawan.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM karyawan ORDER BY ID_Karyawan DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()){
                String ID_Karyawan = r.getString("ID_Karyawan").substring(3);
                String KAR = "" + (Integer.parseInt(ID_Karyawan) + 1);
                String Nol = "";
                
                if(KAR.length()==1){
                    Nol = "00";
                }else if(KAR.length()==2){
                    Nol = "0";
                }else if(KAR.length()==3){
                    Nol = "";
                }
                
                txtKaryawan.setText("KAR" + Nol + KAR);
                
            }else{
                txtKaryawan.setText("KAR001");
            }
            r.close();
            s.close();
        }catch(Exception e){
            System.out.println("autonumber error");
        }
    }
    
    public void clear(){
        txtNama.setText("");
        txtAlamat.setText("");
        txtTelepon.setText("");
        txtTTL.setText("");
    }
    
    public void loadData(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            Connection c = dbKaryawan.getKoneksi();
            Statement s = c.createStatement();
            
            String sql = "SELECT * FROM karyawan";
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                Object[] o = new Object[6];
                o [0] = r.getString("ID_Karyawan");
                o [1] = r.getString("Nama");
                o [2] = r.getString("Alamat");
                o [3] = r.getString("Telepon");
                o [4] = r.getString("Jenis_Kelamin");
                o [5] = r.getString("TTL");
                
                model.addRow(o);
            }
            r.close();
            s.close();
        }catch(SQLException e){
            System.out.println("terjadi kesalahan");
        }
    }

    /**
     * Creates new form Monascho
     */
    public DataKaryawan() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        txtKaryawan.setEnabled(false);
        
        model = new DefaultTableModel();
        
        tblKaryawan.setModel(model);
        
        model.addColumn("ID_Karyawan");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("Telepon");
        model.addColumn("Jenis_Kelamin");
        model.addColumn("TTL");
        
        loadData();
        autonumber();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKaryawan = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelepon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        txtTTL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbKelamin = new javax.swing.JComboBox();
        txtKaryawan = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnUtama = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(102, 102, 255));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MONASCHO ADMIN MANAGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1596, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 140));

        jPanel4.setBackground(new java.awt.Color(51, 0, 153));
        jPanel4.setForeground(new java.awt.Color(51, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KELOMPOK 1 @2021");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1600, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 860, 1610, 40));

        jPanel10.setBackground(new java.awt.Color(51, 0, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATA KARYAWAN");
        jLabel4.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 140, 1420, 80));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblKaryawan.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_Karyawan", "Nama", "Alamat", "Telepon", "Jenis_Kelamin"
                , "TTL"    }
        ));
        tblKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKaryawan);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 820, 330));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ID_Karyawan");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 130, 40));

        txtCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCariKeyTyped(evt);
            }
        });
        jPanel2.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 730, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nama");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 130, 40));

        txtNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 370, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Jenis_Kelamin");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 130, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Telepon");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 40));

        txtTelepon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 370, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Alamat");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 130, 40));

        txtAlamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 370, 40));

        txtTTL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtTTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 370, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("TTL");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 130, 40));

        cmbKelamin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbKelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...Pilih...", "Laki-Laki", "Perempuan", " " }));
        jPanel2.add(cmbKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 130, 40));

        txtKaryawan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 370, 40));

        btnCari.setBackground(new java.awt.Color(51, 0, 153));
        btnCari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("CARI");
        jPanel2.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 100, 80, 40));

        btnHapus.setBackground(new java.awt.Color(51, 0, 153));
        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel2.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 90, 70));

        btnEdit.setBackground(new java.awt.Color(51, 0, 153));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("UPDATE");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel2.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, 90, 70));

        btnBatal.setBackground(new java.awt.Color(51, 0, 153));
        btnBatal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel2.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 530, 90, 70));

        btnSimpan.setBackground(new java.awt.Color(51, 0, 153));
        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel2.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 530, 90, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1600, 640));

        btnKembali.setBackground(new java.awt.Color(51, 0, 153));
        btnKembali.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("KEMBALI");
        btnKembali.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 140, 90, 80));

        btnUtama.setBackground(new java.awt.Color(51, 0, 153));
        btnUtama.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUtama.setForeground(new java.awt.Color(255, 255, 255));
        btnUtama.setText("UTAMA");
        btnUtama.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtamaActionPerformed(evt);
            }
        });
        getContentPane().add(btnUtama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 90, 80));

        setSize(new java.awt.Dimension(1618, 947));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUtamaActionPerformed

    private void tblKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKaryawanMouseClicked
        btnSimpan.setEnabled(false);
        int i = tblKaryawan.getSelectedRow();
        if (i == -1){
            return;
        }
        
        String ID_Karyawan = (String)model.getValueAt(i, 0);
        txtKaryawan.setText(ID_Karyawan);
        String Nama = (String)model.getValueAt(i, 1);
        txtNama.setText(Nama);
        String Alamat = (String)model.getValueAt(i, 2);
        txtAlamat.setText(Alamat);
        String Telepon = (String)model.getValueAt(i, 3);
        txtTelepon.setText(Telepon);
        String Jenis_Kelamin = (String)model.getValueAt(i, 4);
        cmbKelamin.setSelectedItem(Jenis_Kelamin);
        String TTL = (String)model.getValueAt(i, 5);
        txtTTL.setText(TTL);
    }//GEN-LAST:event_tblKaryawanMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String ID_Karyawan = txtKaryawan.getText();
        String Nama = txtNama.getText();
        String Alamat = txtAlamat.getText();
        String Telepon = txtTelepon.getText();
        String Jenis_Kelamin = (String)cmbKelamin.getSelectedItem();
        String TTL = txtTTL.getText();
        
        try  {
            if(txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Tidak boleh kosong");
            }else{
            Connection c = dbKaryawan.getKoneksi();
            String sql = "INSERT INTO karyawan VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, ID_Karyawan);
            p.setString(2, Nama);
            p.setString(3, Alamat);
            p.setString(4, Telepon);
            p.setString(5, Jenis_Kelamin);
            p.setString(6, TTL);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
            }
        }catch(SQLException e) {
            System.out.println("Terjadi Kesalahan");
        }finally{
            loadData();
            autonumber();
            clear();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int i = tblKaryawan.getSelectedRow();
        if(i == -1){
            return;
        }
        String ID_Karyawan = (String)model.getValueAt(i, 0);
        String Nama = txtNama.getText();
        String Alamat = txtAlamat.getText();
        String Telepon = txtTelepon.getText();
        String Jenis_Kelamin = (String)cmbKelamin.getSelectedItem();
        String TTL = txtTTL.getText();
        
        try{
            Connection c = dbKaryawan.getKoneksi();
            String sql = "UPDATE karyawan SET Nama = ?, Alamat = ?, Telepon = ?, Jenis_Kelamin = ?, TTL = ? WHERE ID_Karyawan = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, Nama);
            p.setString(2, Alamat);
            p.setString(3, Telepon);
            p.setString(4, Jenis_Kelamin);
            p.setString(5, TTL);
            p.setString(6, ID_Karyawan);
            
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Terubah");
            btnSimpan.setEnabled(true);
            clear();
        }catch(SQLException e){
            System.out.println("Update Error");
        }finally{
            loadData();
            autonumber();
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
         int i = tblKaryawan.getSelectedRow();
        if(i == -1){
            return;
        }
        
        String ID_Karyawan = (String)model.getValueAt(i, 0);
        
        int question = JOptionPane.showConfirmDialog(null, "Yakin Data Akan Dihapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(question == JOptionPane.OK_OPTION){
            try{
                Connection c = dbKaryawan.getKoneksi();
                String sql = "DELETE FROM karyawan WHERE ID_Karyawan = ?";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, ID_Karyawan);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Data Terhapus");
            }catch(SQLException e){
                System.out.println("Terjadi Kesalahan");
            }finally{
                loadData();
                autonumber();
                clear();
            }
        }
        if(question == JOptionPane.CANCEL_OPTION){
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        clear();
        loadData();
        btnSimpan.setEnabled(true);
        autonumber();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyTyped
        // TODO add your handling code here:
        DefaultTableModel tabel = new DefaultTableModel();
        
        tabel.addColumn("ID_Karyawan");
        tabel.addColumn("Nama");
        tabel.addColumn("Alamat");
        tabel.addColumn("Telepon");
        tabel.addColumn("Jenis_Kelamin");
        tabel.addColumn("TTL");
        
        try{
            Connection c = dbKaryawan.getKoneksi();
            String sql = "Select * from karyawan where nama like '%" + txtCari.getText() + "%'";
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                });
            }
            tblKaryawan.setModel(tabel);
            loadData();
        }catch(Exception e){
           System.out.println("Cari Data Error");
        }finally{
        }
    }//GEN-LAST:event_txtCariKeyTyped

   
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
            java.util.logging.Logger.getLogger(DataKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new DataKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUtama;
    private javax.swing.JComboBox cmbKelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKaryawan;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKaryawan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTTL;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables
}
