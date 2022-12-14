
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class User_change_pass extends javax.swing.JFrame {

    
    public User_change_pass() {
        initComponents();
        setVisible(true);
        setSize(600,500);
        setTitle("Change Password");
        setLocation(500,400);
        getContentPane().setBackground(new Color(218,247,166));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jnew_pass = new javax.swing.JPasswordField();
        jconpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        j_oldpass = new javax.swing.JPasswordField();
        jsubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Email:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 70, 110, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Old Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 130, 150, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(11, 190, 160, 30);
        getContentPane().add(jemail);
        jemail.setBounds(190, 70, 330, 40);
        getContentPane().add(jnew_pass);
        jnew_pass.setBounds(210, 180, 310, 40);
        getContentPane().add(jconpass);
        jconpass.setBounds(210, 240, 310, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 240, 210, 40);
        getContentPane().add(j_oldpass);
        j_oldpass.setBounds(210, 130, 310, 40);

        jsubmit.setBackground(new java.awt.Color(153, 255, 255));
        jsubmit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jsubmit.setForeground(new java.awt.Color(255, 0, 51));
        jsubmit.setText("Submit");
        jsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jsubmit);
        jsubmit.setBounds(150, 320, 150, 50);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("<- Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 20, 73, 23);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Change Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 16, 220, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsubmitActionPerformed
        // TODO add your handling code here:
        String email=jemail.getText().toString();
        String oldpass=j_oldpass.getText().toString();
        String newpass=jnew_pass.getText().toString();
        String confirmpass=jconpass.getText().toString();
        if(email.isEmpty()||oldpass.isEmpty()||newpass.isEmpty()||confirmpass.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "All Fields Are Required");
        }
        else if(newpass.equals(confirmpass))
        {
            try {
                ResultSet rs=DBLoader.executeQuery("select * from admin where email ='"+email+"' and password ='"+oldpass+"'");
                if(rs.next())
                {
                    rs.moveToCurrentRow();
                    rs.updateString("password",newpass);
                    rs.updateRow();
                    JOptionPane.showMessageDialog(this, "Password Reset Done Successfully");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Old Password");
                }
            } 
            catch (Exception ex) {
               ex.printStackTrace();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Failed");
        }
    }//GEN-LAST:event_jsubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserHome obj=new UserHome();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(User_change_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_change_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_change_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_change_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new User_change_pass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField j_oldpass;
    private javax.swing.JPasswordField jconpass;
    private javax.swing.JTextField jemail;
    private javax.swing.JPasswordField jnew_pass;
    private javax.swing.JButton jsubmit;
    // End of variables declaration//GEN-END:variables
}
