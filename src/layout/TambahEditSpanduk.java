package layout;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TambahEditSpanduk extends javax.swing.JFrame {
    
    int status = 0;
    private final int sedang_tambah = 0;
    private final int sedang_ubah = 1;
    /**
     * Creates new form TambahEditSpanduk
     */
    public TambahEditSpanduk() {
        initComponents();
        status = 0;
        // Mendapatkan ukuran layar
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Menghitung posisi x dan y agar frame muncul di tengah layar
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        // Menetapkan lokasi frame
        setLocation(x, y);
        // Mengatur operasi penutupan default
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
    public TambahEditSpanduk(Spanduk spanduk){
        initComponents();
        status = 1;
        tfKD.setText(spanduk.getKdspanduk());
        cbbJS.setSelectedItem(spanduk.getJnsspanduk());
        tfBS.setText(spanduk.getBhnspanduk());
        String Hpermspanduk = Double.toString(spanduk.getHpermspanduk());
        tfHPM.setText(Hpermspanduk);
//      tfHPM.setText(spanduk.getHpermspanduk());
        taPMK.setText(spanduk.getPmkspanduk());
        tfKD.setEditable(false);
    }
   
    public void ResetInput() {
        tfKD.requestFocus();
        tfKD.setText("");
        cbbJS.setSelectedItem("-pilih-");
        tfBS.setText("");
        tfHPM.setText("");
        taPMK.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAksi = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        cbbJS = new javax.swing.JComboBox<>();
        lbl2 = new javax.swing.JLabel();
        tfBS = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        tfHPM = new javax.swing.JTextField();
        lbl4 = new javax.swing.JLabel();
        scrollpaneTA = new javax.swing.JScrollPane();
        taPMK = new javax.swing.JTextArea();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfKD = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlAksi.setBackground(new java.awt.Color(0, 204, 204));
        pnlAksi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Tambah dan Edit Spanduk", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lbl1.setText("Jenis Spanduk");

        cbbJS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih-", "Flexy China", "Flexy Korea", "Flexy Jerman", "Albatros", "Easy Banner", "Banner Cloth", "PVC Banner", "Kain TC", "Kain Poly" }));
        cbbJS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbJSItemStateChanged(evt);
            }
        });

        lbl2.setText("Bahan Spanduk");

        tfBS.setEditable(false);
        tfBS.setBackground(new java.awt.Color(255, 255, 255));

        lbl3.setText("Harga Per Meter");

        tfHPM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfHPMKeyTyped(evt);
            }
        });

        lbl4.setText("Pemakaian");

        taPMK.setColumns(20);
        taPMK.setRows(5);
        scrollpaneTA.setViewportView(taPMK);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel1.setText("Kode Spanduk");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAksiLayout = new javax.swing.GroupLayout(pnlAksi);
        pnlAksi.setLayout(pnlAksiLayout);
        pnlAksiLayout.setHorizontalGroup(
            pnlAksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAksiLayout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(btnBatal))
                    .addGroup(pnlAksiLayout.createSequentialGroup()
                        .addGroup(pnlAksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1)
                            .addComponent(lbl2)
                            .addComponent(lbl4)
                            .addComponent(lbl3)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(pnlAksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfBS)
                            .addComponent(tfHPM)
                            .addComponent(cbbJS, 0, 174, Short.MAX_VALUE)
                            .addComponent(scrollpaneTA, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tfKD))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAksiLayout.setVerticalGroup(
            pnlAksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAksiLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pnlAksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbJS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpaneTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4))
                .addGap(27, 27, 27)
                .addGroup(pnlAksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnBatal)
                    .addComponent(btnReset))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        /* baris kode di bawah untuk mengambil data yg telah diinput pada berbagai komponen
           yang ada di frame TambahEditSpanduk.java, dan kemudian menyimpannya sementara ke dalam
           komponen JTable yaitu tblSpanduk yang ada pada frame TampilSpanduk.java, jika kita menekan klik Simpan
        */
        String kdspanduk = tfKD.getText();
        String jnsspanduk = cbbJS.getSelectedItem().toString();
        String bhnspanduk = tfBS.getText();
        double hpermspanduk = Double.parseDouble(tfHPM.getText());
        String pmkspanduk = taPMK.getText();
        
        if (status == 0){
            TampilSpanduk.spanduklist.add(new Spanduk(kdspanduk, jnsspanduk, bhnspanduk, hpermspanduk, pmkspanduk));
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!");
        } else {
            int listdata = 0;
            for (Spanduk sp: TampilSpanduk.spanduklist){
                if (sp.getKdspanduk() == tfKD.getText()) {
                    listdata = TampilSpanduk.spanduklist.indexOf(sp);
                    break;
                }
            } 
            JOptionPane.showMessageDialog(null, "Data Yang Diubah Berhasil Disimpan!");
            TampilSpanduk.spanduklist.set(listdata, new Spanduk(kdspanduk, jnsspanduk, bhnspanduk, hpermspanduk, pmkspanduk));   
        }
        dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void cbbJSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbJSItemStateChanged
        String Pilihan = cbbJS.getSelectedItem().toString();
        /*di bawah ini merupakan logika switch dimana jika kita sudah pilih Jenis Spanduk
          yang ada di Combo Box, maka secara otomatis Text Field Bahan Spanduk akan ikut terisi juga
        */
        switch (Pilihan) {
        case "Flexy China":
            tfBS.setText("Direct");
            break;
        case "Flexy Korea":
            tfBS.setText("Direct");
            break;
        case "Flexy Jerman":
            tfBS.setText("Press");
            break;
        case "Albatros":
            tfBS.setText("Press");
            break;
        case "Easy Banner":
            tfBS.setText("Direct");
            break;
        case "Banner Cloth":
            tfBS.setText("Satin");
            break;
        case "PVC Banner":
            tfBS.setText("Direct");
            break;
        case "Kain TC":
            tfBS.setText("TC");
            break;
        case "Kain Poly":
            tfBS.setText("Satin");
            break;
        default:
            tfBS.setText("");
            break;
    }
    }//GEN-LAST:event_cbbJSItemStateChanged

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        ResetInput(); // memanggil method untuk mengosongkan data yang sedang diisi
        dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tfHPMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHPMKeyTyped
        // validasi untuk Text Field Harga Per Meter dimana hanya boleh menginputkan data berupa angka saja
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))
                )) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Masukkan Hanya Angka 0-9!");
            evt.consume();
        }
    }//GEN-LAST:event_tfHPMKeyTyped

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        ResetInput(); // memanggil method untuk mengosongkan data yang sedang diisi
        tfKD.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(TambahEditSpanduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahEditSpanduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahEditSpanduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahEditSpanduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahEditSpanduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbbJS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JPanel pnlAksi;
    private javax.swing.JScrollPane scrollpaneTA;
    private javax.swing.JTextArea taPMK;
    private javax.swing.JTextField tfBS;
    private javax.swing.JTextField tfHPM;
    private javax.swing.JTextField tfKD;
    // End of variables declaration//GEN-END:variables
}
