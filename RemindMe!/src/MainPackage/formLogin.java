/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainPackage;

/**
 *
 * @author soery
 */
public class formLogin extends javax.swing.JFrame {

    /**
     * Creates new form formLogin
     */
    public formLogin() {
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

        jDialogLoginFailed = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        Opss = new javax.swing.JLabel();
        reason = new javax.swing.JLabel();
        retryButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();
        registButton = new javax.swing.JButton();
        words = new javax.swing.JLabel();
        titleUser = new javax.swing.JLabel();
        fieldUser = new javax.swing.JTextField();
        titlePass = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        BGLogin = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(230, 194, 65));

        Opss.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Opss.setForeground(new java.awt.Color(255, 255, 255));
        Opss.setText("Oops!...");

        reason.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        reason.setForeground(new java.awt.Color(255, 255, 255));
        reason.setText("There was an error during login. Please check your username and password.");

        retryButton.setBackground(new java.awt.Color(230, 194, 65));
        retryButton.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        retryButton.setForeground(new java.awt.Color(255, 255, 255));
        retryButton.setText("Retry");
        retryButton.setBorder(null);
        retryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(reason))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Opss))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(retryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Opss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reason)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retryButton)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogLoginFailedLayout = new javax.swing.GroupLayout(jDialogLoginFailed.getContentPane());
        jDialogLoginFailed.getContentPane().setLayout(jDialogLoginFailedLayout);
        jDialogLoginFailedLayout.setHorizontalGroup(
            jDialogLoginFailedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialogLoginFailedLayout.setVerticalGroup(
            jDialogLoginFailedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Times New Roman", 1, 37)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Title.setText("Remind Me!");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 210, 50));

        slogan.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        slogan.setForeground(new java.awt.Color(255, 51, 0));
        slogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slogan.setText("\"Stay on Track, Never Miss a Task!\"");
        jPanel1.add(slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 220, 20));

        registButton.setBackground(new java.awt.Color(230, 194, 65));
        registButton.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        registButton.setForeground(new java.awt.Color(255, 0, 0));
        registButton.setText("Sign Up Here!");
        registButton.setBorder(null);
        registButton.setContentAreaFilled(false);
        registButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 100, 20));

        words.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        words.setForeground(new java.awt.Color(255, 255, 255));
        words.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        words.setText("No Account Yet?");
        jPanel1.add(words, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 220, 20));

        titleUser.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        titleUser.setForeground(new java.awt.Color(255, 255, 255));
        titleUser.setText("Username: ");
        jPanel1.add(titleUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 60, -1));

        fieldUser.setBackground(new java.awt.Color(230, 194, 65));
        fieldUser.setForeground(new java.awt.Color(255, 255, 255));
        fieldUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        fieldUser.setName(""); // NOI18N
        jPanel1.add(fieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 200, -1));

        titlePass.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        titlePass.setForeground(new java.awt.Color(255, 255, 255));
        titlePass.setText("Password: ");
        jPanel1.add(titlePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 60, -1));

        fieldPassword.setBackground(new java.awt.Color(230, 194, 65));
        fieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        fieldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 200, 20));

        loginButton.setBackground(new java.awt.Color(230, 194, 65));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        loginButton.setContentAreaFilled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 200, 20));

        BGLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        jPanel1.add(BGLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retryButtonActionPerformed

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
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLogin;
    private javax.swing.JLabel Opss;
    private javax.swing.JLabel Title;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldUser;
    private javax.swing.JDialog jDialogLoginFailed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel reason;
    private javax.swing.JButton registButton;
    private javax.swing.JButton retryButton;
    private javax.swing.JLabel slogan;
    private javax.swing.JLabel titlePass;
    private javax.swing.JLabel titleUser;
    private javax.swing.JLabel words;
    // End of variables declaration//GEN-END:variables
}
