/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainPackage;

/**
 *
 * @author soery
 */
public class formRegister extends javax.swing.JFrame {

    /**
     * Creates new form formLogin
     */
    public formRegister() {
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

        jDialogSuccesRegister = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        words = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        titleUser = new javax.swing.JLabel();
        TitleNama = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        fieldUser = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        titlePass = new javax.swing.JLabel();
        fieldPass = new javax.swing.JPasswordField();
        titleConfirmPass = new javax.swing.JLabel();
        fieldConfirmPass = new javax.swing.JPasswordField();
        BGRegister = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(230, 194, 65));

        title.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Registration Successful!");

        loginButton.setBackground(new java.awt.Color(230, 194, 65));
        loginButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Log in to continue.");
        loginButton.setBorder(null);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        words.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        words.setForeground(new java.awt.Color(255, 255, 255));
        words.setText("Welcome to the system.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(words, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(title)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(words)
                    .addComponent(loginButton))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogSuccesRegisterLayout = new javax.swing.GroupLayout(jDialogSuccesRegister.getContentPane());
        jDialogSuccesRegister.getContentPane().setLayout(jDialogSuccesRegisterLayout);
        jDialogSuccesRegisterLayout.setHorizontalGroup(
            jDialogSuccesRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialogSuccesRegisterLayout.setVerticalGroup(
            jDialogSuccesRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Title.setText("Register Your Future!");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 240, 50));

        titleUser.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        titleUser.setForeground(new java.awt.Color(0, 0, 0));
        titleUser.setText("Username: ");
        jPanel1.add(titleUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 60, -1));

        TitleNama.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TitleNama.setForeground(new java.awt.Color(0, 0, 0));
        TitleNama.setText("Full Name: ");
        jPanel1.add(TitleNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 60, -1));

        fieldName.setBackground(new java.awt.Color(255, 255, 255));
        fieldName.setForeground(new java.awt.Color(0, 0, 0));
        fieldName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        fieldName.setName(""); // NOI18N
        jPanel1.add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 220, -1));

        fieldUser.setBackground(new java.awt.Color(255, 255, 255));
        fieldUser.setForeground(new java.awt.Color(0, 0, 0));
        fieldUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        fieldUser.setName(""); // NOI18N
        jPanel1.add(fieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 220, -1));

        registerButton.setBackground(new java.awt.Color(230, 194, 65));
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        registerButton.setContentAreaFilled(false);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 220, 20));

        titlePass.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        titlePass.setForeground(new java.awt.Color(0, 0, 0));
        titlePass.setText("Password: ");
        jPanel1.add(titlePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 60, -1));

        fieldPass.setBackground(new java.awt.Color(255, 255, 255));
        fieldPass.setForeground(new java.awt.Color(0, 0, 0));
        fieldPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        fieldPass.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(fieldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 220, 20));

        titleConfirmPass.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        titleConfirmPass.setForeground(new java.awt.Color(0, 0, 0));
        titleConfirmPass.setText("Confirm Password: ");
        jPanel1.add(titleConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 100, 20));

        fieldConfirmPass.setBackground(new java.awt.Color(255, 255, 255));
        fieldConfirmPass.setForeground(new java.awt.Color(0, 0, 0));
        fieldConfirmPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        fieldConfirmPass.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(fieldConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 220, 20));

        BGRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        jPanel1.add(BGRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String namaUser = fieldName.getText();
        String idUser = fieldUser.getText();
        String password = new String(fieldPass.getPassword());
    }//GEN-LAST:event_registerButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(formRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGRegister;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel TitleNama;
    private javax.swing.JPasswordField fieldConfirmPass;
    private javax.swing.JTextField fieldName;
    private javax.swing.JPasswordField fieldPass;
    private javax.swing.JTextField fieldUser;
    private javax.swing.JDialog jDialogSuccesRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleConfirmPass;
    private javax.swing.JLabel titlePass;
    private javax.swing.JLabel titleUser;
    private javax.swing.JLabel words;
    // End of variables declaration//GEN-END:variables
}
