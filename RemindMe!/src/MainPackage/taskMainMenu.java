/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainPackage;

/**
 *
 * @author soery
 */
public class taskMainMenu extends javax.swing.JFrame {

    private String currentUser;
    
    public taskMainMenu(String currentUser) {
        this.currentUser = currentUser; // Simpan data user yang login
        initComponents();
    }
    
    public taskMainMenu() {
        initComponents();
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
        sideBar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        reminderButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        fDeadline = new javax.swing.JTextField();
        fTaskName = new javax.swing.JTextField();
        fMatkulName = new javax.swing.JTextField();
        labelDescription = new javax.swing.JLabel();
        labelTugasName = new javax.swing.JLabel();
        labelMatkulName = new javax.swing.JLabel();
        labelDeadline = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDescription = new javax.swing.JTextArea();
        deleteButton1 = new javax.swing.JButton();
        kalenderButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        navBar = new javax.swing.JPanel();
        tanggal = new javax.swing.JLabel();
        userButton = new javax.swing.JButton();
        namaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        dateChooser.setForeground(new java.awt.Color(230, 194, 65));
        dateChooser.setTextRefernce(fDeadline);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        getContentPane().add(sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 0, 390));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reminderButton.setBackground(new java.awt.Color(121, 134, 199));
        reminderButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reminderButton.setForeground(new java.awt.Color(255, 255, 255));
        reminderButton.setText("Set Reminder");
        reminderButton.setBorder(null);
        reminderButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reminderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reminderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(reminderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 120, 30));

        saveButton.setBackground(new java.awt.Color(255, 234, 133));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveButton.setText("Save");
        saveButton.setBorder(null);
        saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 50, 30));

        fDeadline.setBackground(new java.awt.Color(255, 255, 255));
        fDeadline.setText("Masukkan Tanggal");
        fDeadline.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        fDeadline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fDeadlineMouseClicked(evt);
            }
        });
        jPanel1.add(fDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 290, 20));

        fTaskName.setText("Isi Nama Tugas");
        fTaskName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        fTaskName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fTaskNameMouseClicked(evt);
            }
        });
        fTaskName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTaskNameActionPerformed(evt);
            }
        });
        jPanel1.add(fTaskName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 340, 20));

        fMatkulName.setText("Masukkan Nama Mata Kuliah");
        fMatkulName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        fMatkulName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fMatkulNameMouseClicked(evt);
            }
        });
        fMatkulName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fMatkulNameActionPerformed(evt);
            }
        });
        jPanel1.add(fMatkulName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 340, 20));

        labelDescription.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        labelDescription.setText("Deskripsi         : ");
        jPanel1.add(labelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 90, 20));

        labelTugasName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        labelTugasName.setText("Nama Tugas   : ");
        jPanel1.add(labelTugasName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, 20));

        labelMatkulName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        labelMatkulName.setText("Nama Matkul : ");
        jPanel1.add(labelMatkulName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 90, 20));

        labelDeadline.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        labelDeadline.setText("Deadline         : ");
        jPanel1.add(labelDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 80, 20));

        tDescription.setColumns(20);
        tDescription.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tDescription.setRows(5);
        tDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(tDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 340, 180));

        deleteButton1.setBackground(new java.awt.Color(255, 234, 133));
        deleteButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton1.setText("Delete");
        deleteButton1.setBorder(null);
        deleteButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(deleteButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 50, 30));

        kalenderButton.setBackground(new java.awt.Color(121, 134, 199));
        kalenderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalender.png"))); // NOI18N
        kalenderButton.setBorder(null);
        kalenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalenderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(kalenderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 30, 20));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Detail Tugas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 20));

        backButton.setBackground(new java.awt.Color(121, 134, 199));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EditIcon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 690, 390));

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
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 451, Short.MAX_VALUE)
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

        getContentPane().add(navBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kalenderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalenderButtonActionPerformed
        dateChooser.showPopup();
    }//GEN-LAST:event_kalenderButtonActionPerformed

    private void fTaskNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTaskNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTaskNameActionPerformed

    private void fMatkulNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fMatkulNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fMatkulNameActionPerformed

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed
        formProfile profilePage = new formProfile(currentUser);
        profilePage.setVisible(true);
        dispose();
    }//GEN-LAST:event_userButtonActionPerformed

    private void fTaskNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fTaskNameMouseClicked
        fTaskName.setText("");
    }//GEN-LAST:event_fTaskNameMouseClicked

    private void fMatkulNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fMatkulNameMouseClicked
        fMatkulName.setText("");
    }//GEN-LAST:event_fMatkulNameMouseClicked

    private void fDeadlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fDeadlineMouseClicked
        fDeadline.setText("");
    }//GEN-LAST:event_fDeadlineMouseClicked

    private void reminderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reminderButtonActionPerformed
          new setReminder().setVisible(true);
       dispose();
    }//GEN-LAST:event_reminderButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new mainMenu().setVisible(true);
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
            java.util.logging.Logger.getLogger(taskMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(taskMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(taskMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(taskMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new taskMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private com.raven.datechooser.DateChooser dateChooser;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JTextField fDeadline;
    private javax.swing.JTextField fMatkulName;
    private javax.swing.JTextField fTaskName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kalenderButton;
    private javax.swing.JLabel labelDeadline;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelMatkulName;
    private javax.swing.JLabel labelTugasName;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JPanel navBar;
    private javax.swing.JButton reminderButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel sideBar;
    private javax.swing.JTextArea tDescription;
    private javax.swing.JLabel tanggal;
    private javax.swing.JButton userButton;
    // End of variables declaration//GEN-END:variables
}
