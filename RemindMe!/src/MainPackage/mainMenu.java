/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainPackage;

/**
 *
 * @author soery
 */
public class mainMenu extends javax.swing.JFrame {

    /**
     * Creates new form formLogin
     */
    public mainMenu() {
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
        jPanel2 = new javax.swing.JPanel();
        buttonAddTask = new javax.swing.JButton();
        exampleTaskList = new javax.swing.JButton();
        exampleTaskList2 = new javax.swing.JButton();
        sortingButton = new javax.swing.JButton();
        navBar = new javax.swing.JPanel();
        userButton = new javax.swing.JButton();
        boldButton = new javax.swing.JButton();
        kalenderButton = new javax.swing.JButton();
        italicButton = new javax.swing.JButton();
        underlineButton = new javax.swing.JButton();
        strikeoutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        fieldDeadline = new javax.swing.JTextField();
        fieldTaskName = new javax.swing.JTextField();
        fieldMatkulName = new javax.swing.JTextField();
        labelDescription = new javax.swing.JLabel();
        labelTugasName = new javax.swing.JLabel();
        labelMatkulName = new javax.swing.JLabel();
        labelDeadline = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescription = new javax.swing.JTextArea();

        dateChooser.setForeground(new java.awt.Color(230, 194, 65));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBar.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        buttonAddTask.setBackground(new java.awt.Color(230, 194, 65));
        buttonAddTask.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        buttonAddTask.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddTask.setText("Add New Task");

        exampleTaskList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        exampleTaskList.setForeground(new java.awt.Color(230, 194, 65));
        exampleTaskList.setText("PBO Task");
        exampleTaskList.setBorder(null);

        exampleTaskList2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        exampleTaskList2.setForeground(new java.awt.Color(230, 194, 65));
        exampleTaskList2.setText("UAS Project Database");
        exampleTaskList2.setBorder(null);

        sortingButton.setBackground(new java.awt.Color(230, 194, 65));
        sortingButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sortingButton.setForeground(new java.awt.Color(255, 255, 255));
        sortingButton.setText("Sort By...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(exampleTaskList2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(buttonAddTask, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exampleTaskList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sortingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAddTask)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exampleTaskList, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exampleTaskList2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(sortingButton)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 350));

        navBar.setBackground(new java.awt.Color(153, 153, 153));

        userButton.setBackground(new java.awt.Color(153, 153, 153));
        userButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        userButton.setBorder(null);
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });

        boldButton.setBackground(new java.awt.Color(153, 153, 153));
        boldButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bold.png"))); // NOI18N
        boldButton.setBorder(null);
        boldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldButtonActionPerformed(evt);
            }
        });

        kalenderButton.setBackground(new java.awt.Color(153, 153, 153));
        kalenderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kalender.png"))); // NOI18N
        kalenderButton.setBorder(null);
        kalenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kalenderButtonActionPerformed(evt);
            }
        });

        italicButton.setBackground(new java.awt.Color(153, 153, 153));
        italicButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/italic.png"))); // NOI18N
        italicButton.setBorder(null);
        italicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italicButtonActionPerformed(evt);
            }
        });

        underlineButton.setBackground(new java.awt.Color(153, 153, 153));
        underlineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/underline.png"))); // NOI18N
        underlineButton.setBorder(null);
        underlineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                underlineButtonActionPerformed(evt);
            }
        });

        strikeoutButton.setBackground(new java.awt.Color(153, 153, 153));
        strikeoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/strikeout.png"))); // NOI18N
        strikeoutButton.setBorder(null);
        strikeoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strikeoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kalenderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
                .addComponent(strikeoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(underlineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(italicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(boldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(italicButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(underlineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(strikeoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(kalenderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(navBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 40));

        jPanel1.setBackground(new java.awt.Color(230, 194, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteButton.setBackground(new java.awt.Color(230, 194, 65));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 50, 30));

        saveButton.setBackground(new java.awt.Color(230, 194, 65));
        saveButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("save");
        saveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 50, 30));

        fieldDeadline.setBackground(new java.awt.Color(230, 194, 65));
        fieldDeadline.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fieldDeadline.setForeground(new java.awt.Color(255, 255, 255));
        fieldDeadline.setText("2024-11-25");
        fieldDeadline.setBorder(null);
        jPanel1.add(fieldDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 340, 20));

        fieldTaskName.setBackground(new java.awt.Color(230, 194, 65));
        fieldTaskName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fieldTaskName.setForeground(new java.awt.Color(255, 255, 255));
        fieldTaskName.setText("PBO Task");
        fieldTaskName.setBorder(null);
        jPanel1.add(fieldTaskName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 340, 20));

        fieldMatkulName.setBackground(new java.awt.Color(230, 194, 65));
        fieldMatkulName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fieldMatkulName.setForeground(new java.awt.Color(255, 255, 255));
        fieldMatkulName.setText("Pemrograman Beroriantasi Objek");
        fieldMatkulName.setBorder(null);
        jPanel1.add(fieldMatkulName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 340, 20));

        labelDescription.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelDescription.setForeground(new java.awt.Color(255, 255, 255));
        labelDescription.setText("Deskripsi: ");
        jPanel1.add(labelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 20));

        labelTugasName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelTugasName.setForeground(new java.awt.Color(255, 255, 255));
        labelTugasName.setText("Nama Tugas: ");
        jPanel1.add(labelTugasName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        labelMatkulName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelMatkulName.setForeground(new java.awt.Color(255, 255, 255));
        labelMatkulName.setText("Nama Matkul: ");
        jPanel1.add(labelMatkulName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 20));

        labelDeadline.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelDeadline.setForeground(new java.awt.Color(255, 255, 255));
        labelDeadline.setText("Deadline: ");
        jPanel1.add(labelDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 20));

        textAreaDescription.setBackground(new java.awt.Color(230, 194, 65));
        textAreaDescription.setColumns(20);
        textAreaDescription.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textAreaDescription.setForeground(new java.awt.Color(255, 255, 255));
        textAreaDescription.setRows(5);
        textAreaDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(textAreaDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 340, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 450, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldButtonActionPerformed
        dateChooser.showPopup();
    }//GEN-LAST:event_boldButtonActionPerformed

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userButtonActionPerformed

    private void kalenderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalenderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kalenderButtonActionPerformed

    private void italicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italicButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_italicButtonActionPerformed

    private void underlineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_underlineButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_underlineButtonActionPerformed

    private void strikeoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strikeoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_strikeoutButtonActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boldButton;
    private javax.swing.JButton buttonAddTask;
    private com.raven.datechooser.DateChooser dateChooser;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exampleTaskList;
    private javax.swing.JButton exampleTaskList2;
    private javax.swing.JTextField fieldDeadline;
    private javax.swing.JTextField fieldMatkulName;
    private javax.swing.JTextField fieldTaskName;
    private javax.swing.JButton italicButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kalenderButton;
    private javax.swing.JLabel labelDeadline;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelMatkulName;
    private javax.swing.JLabel labelTugasName;
    private javax.swing.JPanel navBar;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel sideBar;
    private javax.swing.JButton sortingButton;
    private javax.swing.JButton strikeoutButton;
    private javax.swing.JTextArea textAreaDescription;
    private javax.swing.JButton underlineButton;
    private javax.swing.JButton userButton;
    // End of variables declaration//GEN-END:variables
}