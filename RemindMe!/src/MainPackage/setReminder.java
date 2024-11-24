/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainPackage;

import Custom.Setting;
import DatabaseConnection.DBConnection;
import java.awt.Point;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import java.util.Locale;
import java.text.ParseException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author soery
 */
public class setReminder extends javax.swing.JFrame {

    /**
     * Creates new form setReminder
     */
    private Timer timer;
    private static String currentUser;
    private Date reminderDateTime;
    
    public setReminder(String currentUser) {
        setReminder.currentUser = currentUser; // Simpan data user yang login
        initComponents();
        namaUser();
        startDateTimeUpdater();
    }
    
    private void namaUser(){
        try (Connection conn = DBConnection.konek()) {
            String getID = "SELECT idPengguna, namaPengguna FROM pengguna WHERE username = ?";
            PreparedStatement pstmt1 = conn.prepareStatement(getID);           
            pstmt1.setString(1, currentUser);
            ResultSet rs1 = pstmt1.executeQuery();

            int userID = 0; // Default jika id tidak ditemukan
                String namaLengkap;
                if (rs1.next()) {
                    userID = rs1.getInt("idPengguna"); // Ambil nilai idPengguna
                    namaLengkap = rs1.getString("namaPengguna");
                    namaLabel.setText(namaLengkap);
                } else {
                    JOptionPane.showMessageDialog(null, "ID Pengguna Tidak ditemukan", "ID NOT FOUND", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        }catch (SQLException | ClassNotFoundException e) {
            
        }
    }
    
    private void startDateTimeUpdater() {
        timer = new Timer(1000, e -> {
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss",  new Locale("in", "ID"));
            String currentDateTime = sdf.format(new Date());
            tanggal.setText(currentDateTime); // Update label dengan waktu sekarang

            // Cek apakah waktu pengingat sudah tercapai
            if (reminderDateTime != null && new Date().after(reminderDateTime)) {
                showReminderNotification();
            }
        });
        timer.start(); // Mulai timer
    }
    
    private void showReminderNotification() {
        // Menampilkan notifikasi ketika waktu pengingat tercapai
        JOptionPane.showMessageDialog(this, "Hello... Waktu Pengingat Sudah Tiba!", 
                                      "Pengingat Tugas", JOptionPane.INFORMATION_MESSAGE);
        reminderDateTime = null;  // Set reminderDateTime ke null untuk mencegah notifikasi berulang
    }

    @Override
    public void dispose() {
        if (timer != null) {
            timer.stop();
        }
        super.dispose();
    }
        
    private void saveReminder() {
        try {
            // Ambil input nama tugas, tanggal, dan waktu dari pengguna
            String namaTugas = namaTugasField.getText(); // Masukan nama tugas
            String dateInput = dateField.getText(); // Format input: yyyy-MM-dd
            String timeInput = timeField.getText(); // Format input: HH:mm:ss

            // Validasi input
            if (dateInput.isEmpty() || timeInput.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tanggal dan waktu tidak boleh kosong.");
                return;
            }

            // Validasi format tanggal dan waktu
            SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            dateTimeFormat.setLenient(false);

            String reminderDatetimeString = dateInput + " " + timeInput;
            reminderDateTime = dateTimeFormat.parse(reminderDatetimeString); // Parsing String ke Date

            Date currentDate = new Date(); // Dapatkan waktu sekarang
            if (reminderDateTime.before(currentDate)) {
                JOptionPane.showMessageDialog(this, "Waktu sudah Terlewat!", "Invalid Time", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Simpan ke database
            Connection conn = DBConnection.konek(); // Panggil koneksi dari DBConnection
            
            String getID = "SELECT idPengguna, namaPengguna FROM pengguna WHERE username = ?";
            PreparedStatement pstmt1 = conn.prepareStatement(getID);           
            pstmt1.setString(1, currentUser);
            ResultSet rs1 = pstmt1.executeQuery();
            
            String getIDT = "SELECT IdTugas FROM tugas WHERE namaTugas = ?";
            PreparedStatement pstmtID = conn.prepareStatement(getIDT);
            pstmtID.setString(1, namaTugas);
            ResultSet rsID = pstmtID.executeQuery();
            
            int tugasID = -1;
            if(rsID.next()){
                tugasID = rsID.getInt("IdTugas");
            }else{
                JOptionPane.showMessageDialog(this, "ID Tugas Tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            String sql = "INSERT INTO pengingat (IdTugas, dateTime) "
                    + "VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, tugasID); // Masukkan namaTugas
            pstmt.setString(2, reminderDatetimeString); // Masukkan reminder_datetime sebagai String
            int rsRm = pstmt.executeUpdate();
            
            if (rsRm > 0) {
                JOptionPane.showMessageDialog(this, "Pengingat berhasil disimpan!");
            }

            // Tutup koneksi
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
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

        kalenderButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        dateTitle2 = new javax.swing.JLabel();
        timeTitle = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        timeField = new javax.swing.JTextField();
        setButton = new javax.swing.JButton();
        navBar = new javax.swing.JPanel();
        tanggal = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        namaTugasTitle = new javax.swing.JLabel();
        namaTugasField = new javax.swing.JTextField();

        kalenderButton.setBackground(new java.awt.Color(153, 153, 153));
        kalenderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalender.png"))); // NOI18N
        kalenderButton.setBorder(null);
        kalenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalenderButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        dateTitle2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        dateTitle2.setText("Date: ");

        timeTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        timeTitle.setText("Time: ");

        dateField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        timeField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        timeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeFieldActionPerformed(evt);
            }
        });

        setButton.setBackground(new java.awt.Color(255, 234, 133));
        setButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        setButton.setText("Set");
        setButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setButtonActionPerformed(evt);
            }
        });

        navBar.setBackground(new java.awt.Color(255, 234, 133));

        tanggal.setForeground(new java.awt.Color(102, 102, 102));
        tanggal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        namaLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        namaLabel.setText("Nama Lengkap");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Remind Me!");

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navBarLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(namaLabel))
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(navBarLayout.createSequentialGroup()
                        .addComponent(namaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Set Reminder");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reminder.png"))); // NOI18N

        backButton.setBackground(new java.awt.Color(121, 134, 199));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        namaTugasTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        namaTugasTitle.setText("Tugas:");

        namaTugasField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(backButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(dateTitle2)
                                        .addComponent(timeTitle))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(namaTugasTitle)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaTugasField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(setButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(timeField)
                                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 275, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(navBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTugasTitle)
                    .addComponent(namaTugasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTitle2)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeTitle)
                    .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setButton)
                .addGap(64, 64, 64)
                .addComponent(backButton)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeFieldActionPerformed

    private void setButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setButtonActionPerformed
        saveReminder();
    }//GEN-LAST:event_setButtonActionPerformed

    private void kalenderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalenderButtonActionPerformed
        //dateChooser.showPopup();
    }//GEN-LAST:event_kalenderButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       mainMenu mainMenuPage = new mainMenu(currentUser); // Kirim currentUser ke Main Menu
       mainMenuPage.setVisible(true);
       dispose(); 
    }//GEN-LAST:event_backButtonActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(setReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setReminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setReminder setReminderPage = new setReminder(currentUser); // Kirim currentUser ke Main Menu
                setReminderPage.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateTitle2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kalenderButton;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaTugasField;
    private javax.swing.JLabel namaTugasTitle;
    private javax.swing.JPanel navBar;
    private javax.swing.JButton setButton;
    private javax.swing.JLabel tanggal;
    private javax.swing.JTextField timeField;
    private javax.swing.JLabel timeTitle;
    // End of variables declaration//GEN-END:variables
}
