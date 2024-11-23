/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainPackage;

import java.sql.ResultSet;
import DatabaseConnection.*;
import Custom.Setting;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soery
 */
public class mainMenu extends javax.swing.JFrame {
    private Timer timer;
    private static String currentUser;
    
    public mainMenu(String currentUser) {
        this.currentUser = currentUser; // Simpan data user yang login
        initComponents();
        tampilkanData();
        
        //Mengganti warna background header 
        tugasTB.getTableHeader().setOpaque(false);
        tugasTB.getTableHeader().setBackground(new Color(255,234,133));
        
        //MEnampilkan waktu
        timer = new Timer(1000,new ActionListener() {
        
                public void actionPerformed(ActionEvent e) {
                showDayDateTime();
            }
        });

        timer.start();
    }
    
    public String currentUser() {
        return currentUser;
    }
    
     private void showDayDateTime(){
        Calendar calendar = Calendar.getInstance();
        Date now = new Date();
        SimpleDateFormat formatHari = new SimpleDateFormat("EEEE", new Locale("in", "ID"));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String hari = formatHari.format(calendar.getTime());
        String dateTime = dateFormat.format(now);
        tanggal.setText(hari+", "+dateTime);
    }
     
    private void pencarian(){
        DefaultTableModel tableTugas = (DefaultTableModel) tugasTB.getModel();
        String search = searchField.getText().trim(); // Ambil input pencarian dan hilangkan spasi ekstra
        try (Connection conn = DBConnection.konek()) {
            // Kosongkan tabel sebelum menambahkan data baru
            int jumlahRow = tugasTB.getRowCount();
            for (int i = 0; i < jumlahRow; i++) {
                tableTugas.removeRow(0);
            }

            // Ambil idPengguna berdasarkan username
            String getID = "SELECT idPengguna FROM pengguna WHERE username = ?";
            PreparedStatement pstmt1 = conn.prepareStatement(getID);
            pstmt1.setString(1, currentUser);
            ResultSet rs1 = pstmt1.executeQuery();

            int userID = -1; // Default jika id tidak ditemukan
            if (rs1.next()) {
                userID = rs1.getInt("idPengguna"); // Ambil nilai idPengguna
            } else {
                JOptionPane.showMessageDialog(this, "ID Pengguna Tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Query untuk pencarian berdasarkan namaTugas atau namaMatkul
            String query = "SELECT namaTugas, deadlineTugas, namaMatkul "
                         + "FROM tugas "
                         + "WHERE idPengguna = ? AND (namaTugas LIKE ? OR namaMatkul LIKE ?)";
            PreparedStatement pstmt2 = conn.prepareStatement(query);

            pstmt2.setInt(1, userID);
            pstmt2.setString(2, "%" + search + "%"); // Tambahkan wildcard % untuk LIKE
            pstmt2.setString(3, "%" + search + "%");

            ResultSet rs2 = pstmt2.executeQuery();

            // Tambahkan data yang ditemukan ke tabel
            int no = 1;
            while (rs2.next()) {
                String[] baris = {
                    String.valueOf(no),              // Nomor urut
                    rs2.getString("namaTugas"),      // Nama Tugas
                    rs2.getString("namaMatkul"),     // Nama Mata Kuliah
                    rs2.getString("deadlineTugas")   // Deadline
                };
                tableTugas.addRow(baris);
                no++;
            }

            // Tampilkan pesan jika tidak ada data ditemukan
            if (no == 1) {
                JOptionPane.showMessageDialog(this, "Tidak ada data yang cocok dengan pencarian.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
        }
    }
    
    private void tampilkanData() {
        DefaultTableModel tableTugas = (DefaultTableModel) tugasTB.getModel();
        try (Connection conn = DBConnection.konek()) {
            int jumlahRow = tugasTB.getRowCount();
            for(int i = 0; i < jumlahRow; i++) {
                tableTugas.removeRow(0);
            }
            
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
                new formLogin().setVisible(true);
                dispose();
                return;
            }
            
            String query = "SELECT namaTugas, deadlineTugas, namaMatkul"
                    + " FROM tugas WHERE idPengguna = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);           
            pstmt.setInt(1, userID);
            ResultSet rs = pstmt.executeQuery();
            
            int no = 1;
            while (rs.next()) {
                String baris[] = {
                    String.valueOf(no),              // Nomor urut
                    rs.getString("namaTugas"),       // Nama Tugas
                    rs.getString("deadlineTugas"),   // Deadline
                    rs.getString("namaMatkul")       // Nama Matkul
                };
                
                tableTugas.addRow(baris);
                no++;
            }
        } catch (SQLException | ClassNotFoundException e) {
            
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

        dateChooser = new com.raven.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        navBar = new javax.swing.JPanel();
        tanggal = new javax.swing.JLabel();
        userButton = new javax.swing.JButton();
        namaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonAddTask = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tugasTB = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        sortButton = new javax.swing.JButton();

        dateChooser.setForeground(new java.awt.Color(230, 194, 65));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(251, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navBar.setBackground(new java.awt.Color(255, 234, 133));

        tanggal.setForeground(new java.awt.Color(102, 102, 102));
        tanggal.setText("Hari, Tanggal dan Waktu");

        userButton.setBackground(new java.awt.Color(121, 134, 199));
        userButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        userButton.setBorder(null);
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });

        namaLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        namaLabel.setText("Nama Lengkap");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Remind Me!");

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(navBarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tanggal))
                    .addGroup(navBarLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                        .addComponent(namaLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navBarLayout.createSequentialGroup()
                        .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaLabel)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(userButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(navBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        buttonAddTask.setBackground(new java.awt.Color(255, 234, 133));
        buttonAddTask.setText("Add Task");
        buttonAddTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddTaskActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAddTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 234, 133));

        tugasTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Tugas", "Deadline", "Nama Matkul"
            }
        ));
        tugasTB.setColumnSelectionAllowed(true);
        tugasTB.setFocusable(false);
        tugasTB.setShowGrid(false);
        tugasTB.setShowHorizontalLines(true);
        tugasTB.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tugasTB);
        tugasTB.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 640, 230));

        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.setText("Search");
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFieldKeyTyped(evt);
            }
        });
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 170, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Daftar Tugas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/daftartugas.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        editButton.setBackground(new java.awt.Color(255, 234, 133));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        sortButton.setBackground(new java.awt.Color(255, 234, 133));
        sortButton.setText("Sort By");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sortButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddTaskActionPerformed
        addTaskPage taskPage = new addTaskPage(currentUser);
        taskPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonAddTaskActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
        searchField.setText("");
    }//GEN-LAST:event_searchFieldMouseClicked

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
       pencarian();
    }//GEN-LAST:event_searchFieldKeyTyped

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed
        Setting menu = new Setting(this, true, this);
        
        Point p = userButton.getLocationOnScreen();
        int x = p.x + userButton.getWidth() - menu.getWidth();
        int y = p.y + userButton.getHeight();
        menu.setLocation(x,y);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_userButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
            new taskMainMenu().setVisible(true);
            dispose(); 
    }//GEN-LAST:event_editButtonActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        
    }//GEN-LAST:event_sortButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                mainMenu mainMenuPage = new mainMenu(currentUser); // Kirim currentUser ke Main Menu
                mainMenuPage.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddTask;
    private com.raven.datechooser.DateChooser dateChooser;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JPanel navBar;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton sortButton;
    private javax.swing.JLabel tanggal;
    private javax.swing.JTable tugasTB;
    private javax.swing.JButton userButton;
    // End of variables declaration//GEN-END:variables
}
