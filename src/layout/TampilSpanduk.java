package layout;

import java.sql.Blob;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TampilSpanduk extends javax.swing.JFrame {
    
    Spanduk spanduk;

    public static ArrayList<Spanduk> spanduklist = new ArrayList<Spanduk>();
    String header[] = new String[]{"Kode Spanduk, Jenis Spanduk", "Bahan Spanduk", "Harga Per Meter", "Pemakaian"};
    
    int row, col;
    /**
     * Creates new form TampilSpanduk
     */
    public TampilSpanduk() {
        initComponents();
        this.setLocationRelativeTo(null);
       // spanduklist = new ArrayList<>();
       // dtmspd = new DefaultTableModel(header,0);
       // tblSpanduk.setModel(dtmspd);
        isi();
        RefreshData("");
        
    }
    
    public void isi(){
        // memberikan data spanduk sebagai contoh isi data dari tabel
        spanduklist.add(new Spanduk("SPD01K","Flexy China" , "Direct", 65000, "Indoor" ));
    }
    
    public void TampilDataSpanduk(String cari) {
        ArrayList<Spanduk> listdata = new ArrayList<Spanduk>();
        if (cari.equals("")){
            listdata = spanduklist;
        } else {
            for (Spanduk spanduk:spanduklist){
                if(spanduk.getJnsspanduk().toLowerCase().contains(cari.toLowerCase())){
                    listdata.add(spanduk);
                }
            }
        }
        DefaultTableModel  dtmspd = (DefaultTableModel) tblSpanduk.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listdata.size(); i++) {
            row[0] = listdata.get(i).getKdspanduk();
            row[1] = listdata.get(i).getJnsspanduk();
            row[2] = listdata.get(i).getBhnspanduk();
            row[3] = listdata.get(i).getHpermspanduk();
            row[4] = listdata.get(i).getPmkspanduk();
            dtmspd.addRow(row);
        }
    }
   
    
    public final void RefreshData(String cari) {
        DefaultTableModel  dtmspd = (DefaultTableModel) tblSpanduk.getModel();
        dtmspd.setRowCount(0);
        TampilDataSpanduk(cari);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAksi1 = new javax.swing.JPanel();
        btnTambah = new javax.swing.JButton();
        tfCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        scrollpaneTabel = new javax.swing.JScrollPane();
        tblSpanduk = new javax.swing.JTable();
        pnlAksi2 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Inventaris Barang");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnlAksi1.setBackground(new java.awt.Color(0, 153, 153));
        pnlAksi1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnTambah.setBackground(new java.awt.Color(255, 255, 0));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAksi1Layout = new javax.swing.GroupLayout(pnlAksi1);
        pnlAksi1.setLayout(pnlAksi1Layout);
        pnlAksi1Layout.setHorizontalGroup(
            pnlAksi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAksi1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTambah)
                .addGap(18, 18, 18)
                .addComponent(tfCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari)
                .addContainerGap())
        );
        pnlAksi1Layout.setVerticalGroup(
            pnlAksi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAksi1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlAksi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTambah)
                    .addGroup(pnlAksi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCari)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblSpanduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Spanduk", "Jenis Spanduk", "Bahan Spanduk", "Harga Per Meter", "Pemakaian"
            }
        ));
        scrollpaneTabel.setViewportView(tblSpanduk);

        pnlAksi2.setBackground(new java.awt.Color(0, 153, 153));
        pnlAksi2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnEdit.setBackground(new java.awt.Color(255, 255, 153));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAksi2Layout = new javax.swing.GroupLayout(pnlAksi2);
        pnlAksi2.setLayout(pnlAksi2Layout);
        pnlAksi2Layout.setHorizontalGroup(
            pnlAksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAksi2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKeluar)
                .addContainerGap())
        );
        pnlAksi2Layout.setVerticalGroup(
            pnlAksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAksi2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnKeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAksi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollpaneTabel, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
            .addComponent(pnlAksi2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAksi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpaneTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAksi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // tombol tambah jika kita tekan akan menuju ke frame TambahEditSpanduk
        TambahEditSpanduk TESpanduk = new TambahEditSpanduk();
        TESpanduk.setVisible(true); // memanggil frame TambahEditSpanduk
    }//GEN-LAST:event_btnTambahActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        RefreshData("");
    }//GEN-LAST:event_formWindowActivated

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(this, 
                "Yakin Ingin Keluar","Exit",JOptionPane.YES_NO_OPTION) 
                == JOptionPane.YES_NO_OPTION)
        {
               System.exit(0);
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // tombol hapus beserta validasi dari data yang ingin dihapus dari tabel
        DefaultTableModel  dtmspd = (DefaultTableModel) tblSpanduk.getModel();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Hapus Data Ini", "Hapus", dialogButton);
        if (dialogResult == 0) {
            dtmspd.removeRow(row);
            spanduklist.remove(row);
            dtmspd.setRowCount(0);
            for (int i = 0; i < spanduklist.size(); i++) {
                Object[] objs = {spanduklist.get(i).kdspanduk, spanduklist.get(i).jnsspanduk, spanduklist.get(i).bhnspanduk,
                                 spanduklist.get(i).hpermspanduk, spanduklist.get(i).pmkspanduk};
                dtmspd.addRow(objs);
                }
            }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        RefreshData(tfCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // ketika menekan tombol edit maka data spanduk pada tabel akan di bawa ke frame TambahEditSpanduk untuk di edit
        int i = tblSpanduk.getSelectedRow();
        if(i>=0) {
            TableModel dtmspd = tblSpanduk.getModel();
            spanduk = new Spanduk();
            spanduk.setKdspanduk(dtmspd.getValueAt(i, 0).toString());
            spanduk.setJnsspanduk(dtmspd.getValueAt(i, 1).toString());
            spanduk.setBhnspanduk(dtmspd.getValueAt(i, 2).toString());
            double Hpermspanduk = Double.parseDouble(dtmspd.getValueAt(i, 3).toString());
            spanduk.setHpermspanduk(Hpermspanduk);
            spanduk.setPmkspanduk(dtmspd.getValueAt(i, 4).toString());
            
            TambahEditSpanduk tambahEditSpanduk = new TambahEditSpanduk(spanduk);
            tambahEditSpanduk.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Pilih Data yang Ingin Diubah");
        }
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(TampilSpanduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilSpanduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilSpanduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilSpanduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilSpanduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTambah;
    private javax.swing.JPanel pnlAksi1;
    private javax.swing.JPanel pnlAksi2;
    private javax.swing.JScrollPane scrollpaneTabel;
    private javax.swing.JTable tblSpanduk;
    private javax.swing.JTextField tfCari;
    // End of variables declaration//GEN-END:variables
}
