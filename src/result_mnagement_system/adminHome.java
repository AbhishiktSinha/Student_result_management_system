/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_mnagement_system;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishikt
 */
public class adminHome extends javax.swing.JFrame {

    /**
     * Creates new form adminHome
     */
    public adminHome() {
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

        jPanel1 = new javax.swing.JPanel();
        AddNewStudent = new javax.swing.JButton();
        AddResult = new javax.swing.JButton();
        RegisteredStudents = new javax.swing.JButton();
        AllStudentsResults = new javax.swing.JButton();
        updateResultButton = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        rollNumberLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        branchLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        rollNumberField = new javax.swing.JTextField();
        courseComboBox = new javax.swing.JComboBox<>();
        branchComboBox = new javax.swing.JComboBox<>();
        dateComboBox = new javax.swing.JComboBox<>();
        dateOfBirthLabel = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Student");
        setMinimumSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(231, 238, 238));
        jPanel1.setMinimumSize(new java.awt.Dimension(162, 500));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(162, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddNewStudent.setBackground(new java.awt.Color(116, 243, 255));
        AddNewStudent.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        AddNewStudent.setText("Add New Student");
        AddNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewStudentActionPerformed(evt);
            }
        });
        jPanel1.add(AddNewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 25, 154, -1));

        AddResult.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        AddResult.setText("Add Result");
        AddResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddResultActionPerformed(evt);
            }
        });
        jPanel1.add(AddResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 97, 154, -1));

        RegisteredStudents.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        RegisteredStudents.setText("Registered Students");
        RegisteredStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisteredStudentsActionPerformed(evt);
            }
        });
        jPanel1.add(RegisteredStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 172, 154, -1));

        AllStudentsResults.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        AllStudentsResults.setText("All Students Results");
        AllStudentsResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllStudentsResultsActionPerformed(evt);
            }
        });
        jPanel1.add(AllStudentsResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 252, 154, -1));

        updateResultButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        updateResultButton.setText("Update Result");
        updateResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateResultButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateResultButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 150, -1));

        Logout.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_mnagement_system/SMALL_logout_icon.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setMargin(new java.awt.Insets(2, 14, 3, 9));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_mnagement_system/Background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 520));

        nameLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLabel.setText("Name");
        nameLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 43, 75, -1));

        rollNumberLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        rollNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rollNumberLabel.setText("Roll Number");
        rollNumberLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        rollNumberLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(rollNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 116, 75, -1));

        courseLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        courseLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        courseLabel.setText("Course");
        courseLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        courseLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(courseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 335, 75, -1));

        branchLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        branchLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        branchLabel.setText("Branch");
        branchLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        branchLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(branchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 409, 75, -1));
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 38, 200, -1));
        getContentPane().add(rollNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 111, 200, -1));

        courseComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        courseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course", "B. Tech", "M. Tech", "B. Pharma", "B. C. A", "M. C. A", "M. B. A" }));
        courseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(courseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 332, 200, -1));

        branchComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        branchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Branch", "Agricultural Engineering", "Automobile Engineering", "Civil Engineering", "Computer Science Engineering", "Electrical Engineering", "Information Technology", "Mechanical Engineering", "N/A" }));
        branchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(branchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 406, 200, -1));

        dateComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(dateComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 185, 56, 23));

        dateOfBirthLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        dateOfBirthLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateOfBirthLabel.setText("Date of Birth");
        dateOfBirthLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(dateOfBirthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 187, -1, -1));

        monthComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(monthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 185, 61, 23));

        yearComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(yearComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 184, 71, -1));

        saveButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_mnagement_system/SMALL_floppy_save_icon.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        saveButton.setIconTextGap(7);
        saveButton.setMargin(new java.awt.Insets(2, 9, 3, 9));
        saveButton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 460, 110, -1));

        genderLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        genderLabel.setText("Gender");
        genderLabel.setFocusTraversalPolicyProvider(true);
        getContentPane().add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 261, -1, -1));

        genderComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Female", "Male", "Other" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 258, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminHome().setVisible(true);
    }//GEN-LAST:event_AddNewStudentActionPerformed

    private void AllStudentsResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllStudentsResultsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new result().setVisible(true);
    }//GEN-LAST:event_AllStudentsResultsActionPerformed

    private void RegisteredStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisteredStudentsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new registeredStudents().setVisible(true);
    }//GEN-LAST:event_RegisteredStudentsActionPerformed

    private void AddResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addResult().setVisible(true);
    }//GEN-LAST:event_AddResultActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminIndex().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void branchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchComboBoxActionPerformed

    private void courseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseComboBoxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String name = nameField.getText();
        String rollNo = rollNumberField.getText();
        String dateOfBirth = (String)dateComboBox.getSelectedItem() +"/"+ (String)monthComboBox.getSelectedItem() + "/" +(String)yearComboBox.getSelectedItem();
        String gender = (String)genderComboBox.getSelectedItem();
        String course = (String)courseComboBox.getSelectedItem();
        String branch = (String)branchComboBox.getSelectedItem();
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rms", "root", "123abhi");
            
            Statement st = con.createStatement();
            st.executeUpdate("insert into student(name, rollNo, dob, gender, course, branch) values('"+name+"', '"+rollNo+"', '"+dateOfBirth+"', '"+gender+"', '"+course+"', '"+branch+"')");
            
            JOptionPane.showMessageDialog(null, "Data saved succesfully");
            
            setVisible(false);
            new adminHome().setVisible(true);
        }
        catch(Exception ee)
        {
            JOptionPane.showMessageDialog(null, ee.toString());
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void dateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateComboBoxActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBoxActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void updateResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateResultButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new UpdateResult().setVisible(true);
    }//GEN-LAST:event_updateResultButtonActionPerformed

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
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewStudent;
    private javax.swing.JButton AddResult;
    private javax.swing.JButton AllStudentsResults;
    private javax.swing.JButton Logout;
    private javax.swing.JButton RegisteredStudents;
    private javax.swing.JComboBox<String> branchComboBox;
    private javax.swing.JLabel branchLabel;
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JComboBox<String> dateComboBox;
    private javax.swing.JLabel dateOfBirthLabel;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField rollNumberField;
    private javax.swing.JLabel rollNumberLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton updateResultButton;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
