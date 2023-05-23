/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_mnagement_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishikt
 */
public class adminIndex extends javax.swing.JFrame {

    /**
     * Creates new form adminIndex
     */
    public adminIndex() {
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

        newUserLabel = new javax.swing.JLabel();
        createAccountButton = new javax.swing.JButton();
        existingUserLabel = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        label_password = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        Back = new javax.swing.JButton();
        forgotPasswordButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newUserLabel.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        newUserLabel.setText("New User ?");
        getContentPane().add(newUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 175, -1, -1));

        createAccountButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createAccountButton.setText("Click to Create Account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });
        getContentPane().add(createAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 220, -1));

        existingUserLabel.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        existingUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        existingUserLabel.setText("Existing User");
        existingUserLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(existingUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 280, -1));

        label_username.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        label_username.setText("Username");
        getContentPane().add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 220, -1));

        Login.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_mnagement_system/SMALL_login_icon.png"))); // NOI18N
        Login.setText("Login");
        Login.setBorder(null);
        Login.setIconTextGap(6);
        Login.setMargin(new java.awt.Insets(2, 10, 3, 12));
        Login.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 80, 30));

        label_password.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        label_password.setText("Password");
        getContentPane().add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 220, -1));

        Back.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_mnagement_system/Small_back_icon.png"))); // NOI18N
        Back.setText("Back");
        Back.setBorder(null);
        Back.setIconTextGap(6);
        Back.setMargin(new java.awt.Insets(2, 10, 3, 10));
        Back.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 70, 30));

        forgotPasswordButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        forgotPasswordButton.setText("Forgot Password?");
        forgotPasswordButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        forgotPasswordButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        forgotPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(forgotPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 220, 20));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 700, 280));

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setText("Admin Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_mnagement_system/Admin_inded_background.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rms", "root", "123abhi");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from admin_credentials where Username = '"+username+"'");
            if(rs.next())
            {
                String validPass = rs.getString(2);
                if(validPass.equals(password))
                {
                    setVisible(false);
                    new adminHome().setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Password");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Admin username doesn't exists");
            }               
        }
        catch(Exception ee)
        {
            JOptionPane.showMessageDialog(null, ee.toString());
        }
        
    }//GEN-LAST:event_LoginActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new index().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void forgotPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new forgotAdminPassword().setVisible(true);
    }//GEN-LAST:event_forgotPasswordButtonActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new createAdminAccount().setVisible(true);
    }//GEN-LAST:event_createAccountButtonActionPerformed

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
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Login;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JLabel existingUserLabel;
    private javax.swing.JButton forgotPasswordButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_username;
    private javax.swing.JLabel newUserLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
