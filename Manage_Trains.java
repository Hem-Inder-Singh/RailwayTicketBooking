import java.awt.Color;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Manage_Trains extends javax.swing.JFrame {
    int train_number;
    
    public Manage_Trains() {
        initComponents();
        ImageIcon Logo = new ImageIcon("src/design_pics/railway1.jpeg");

        iconlogo.setIcon(Logo);
        setSize(1100,600);
        setTitle("Manage Trains");
        setLocation(300,200);
        change_btn.setEnabled(false);
        setVisible(true); 
        getContentPane().setBackground(new Color(218,247,166));
        Train_details();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edit_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        train_num = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        start_place = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        destination_place = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        price_ticket = new javax.swing.JTextField();
        add_train_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        change_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        iconlogo = new javax.swing.JLabel();
        train_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        edit_btn.setBackground(new java.awt.Color(153, 255, 255));
        edit_btn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(255, 0, 51));
        edit_btn.setText("Edit");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(edit_btn);
        edit_btn.setBounds(310, 470, 110, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train no", "Train Name", "Start Place", "Destination Place", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(460, 40, 580, 402);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Train Number:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 220, 140, 30);
        getContentPane().add(train_num);
        train_num.setBounds(160, 220, 240, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Train Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 260, 130, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Start Place:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 310, 110, 40);
        getContentPane().add(start_place);
        start_place.setBounds(160, 310, 240, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Destination:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 380, 120, 30);
        getContentPane().add(destination_place);
        destination_place.setBounds(160, 360, 240, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Price:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 420, 70, 22);
        getContentPane().add(price_ticket);
        price_ticket.setBounds(160, 410, 240, 40);

        add_train_btn.setBackground(new java.awt.Color(153, 255, 255));
        add_train_btn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        add_train_btn.setForeground(new java.awt.Color(255, 0, 51));
        add_train_btn.setText("Add Train");
        add_train_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_train_btnActionPerformed(evt);
            }
        });
        getContentPane().add(add_train_btn);
        add_train_btn.setBounds(10, 470, 140, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Manage Trains");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 120, 230, 40);

        change_btn.setBackground(new java.awt.Color(153, 255, 255));
        change_btn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        change_btn.setForeground(new java.awt.Color(255, 0, 51));
        change_btn.setText("Change");
        change_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_btnActionPerformed(evt);
            }
        });
        getContentPane().add(change_btn);
        change_btn.setBounds(170, 470, 120, 40);

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 51));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(550, 450, 110, 50);

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Back to home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 0, 110, 25);

        iconlogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(iconlogo);
        iconlogo.setBounds(10, 30, 160, 180);
        getContentPane().add(train_name);
        train_name.setBounds(160, 260, 240, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_train_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_train_btnActionPerformed
        int train_number=Integer.parseInt(train_num.getText().toString());
        String tname=train_name.getText().toString();
        String s_place=start_place.getText().toString();
        String d_place=destination_place.getText().toString();
        int price=Integer.parseInt(price_ticket.getText().toString());
        
        try {
            ResultSet rs = DBLoader.executeQuery("select * from traindetails where tno= '"+train_number+"' and tname ='"+tname+"'" );
            if(rs.next())
            {
                    JOptionPane.showMessageDialog(this,"Exists already");
                }
            else{
                    rs.moveToInsertRow();
                    rs.updateInt("tno", train_number);
                    rs.updateString("tname",tname);
                    rs.updateString("startplace",s_place);
                    rs.updateString("destinationplace",d_place);
                    rs.updateInt("tprice", price);
                    rs.insertRow();
                    JOptionPane.showMessageDialog(this,"Success");
                    repaint();
                }}
        catch (Exception ex) {
           ex.printStackTrace();
        }
    }//GEN-LAST:event_add_train_btnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d=(DefaultTableModel)jTable1.getModel();
        int selectIndex=jTable1.getSelectedRow();
        train_num.setText(d.getValueAt(selectIndex, 0).toString());
        train_name.setText(d.getValueAt(selectIndex, 1).toString());
        start_place.setText(d.getValueAt(selectIndex, 2).toString());
        destination_place.setText(d.getValueAt(selectIndex, 3).toString());
        price_ticket.setText(d.getValueAt(selectIndex, 4).toString());
        add_train_btn.setEnabled(false);
         train_num.setEnabled(false);
         train_name.setEnabled(false);
         start_place.setEnabled(false);
         destination_place.setEnabled(false);
         price_ticket.setEnabled(false);
         
         change_btn.setVisible(false);
         change_btn.setEnabled(false);
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        
        train_number=Integer.parseInt(train_num.getText());
        String tname=train_name.getText().toString();
        String s_place=start_place.getText().toString();
        String d_place=destination_place.getText().toString();
        int price=Integer.parseInt(price_ticket.getText().toString());
        
        try {
            ResultSet rs = DBLoader.executeQuery("select * from traindetails where tno= '"+train_number+"' and tname ='"+tname+"'" );
            if(rs.next())
            {
                    train_num.setEnabled(true);
                    
                    train_name.setEnabled(true);
                    start_place.setEnabled(true);
                    destination_place.setEnabled(true);
                    price_ticket.setEnabled(true);
                    edit_btn.setEnabled(false);                   
                    JOptionPane.showMessageDialog(this, "Edit Enabled");
                    change_btn.setVisible(true);
                    change_btn.setEnabled(true);
                }
            }
        catch (Exception ex) {
           ex.printStackTrace();
        }
    }//GEN-LAST:event_edit_btnActionPerformed

    private void change_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_btnActionPerformed
        
                    int tr_num=Integer.parseInt(train_num.getText());
                    String tr_name=train_name.getText();
                    String sr_place=start_place.getText();
                    String dst_place=destination_place.getText();
                    int tprice=Integer.parseInt(price_ticket.getText());
                     if(tr_name.isEmpty()|| sr_place.isEmpty()||dst_place.isEmpty())
                    {
                        JOptionPane.showMessageDialog(this, "Error, First Select then click edit then Change");
                    }
        try {
           
            ResultSet rs=DBLoader.executeQuery("select * from traindetails where tno="+train_number);
            if(rs.next())
            {
                    rs.moveToInsertRow();
                    rs.updateInt("tno", tr_num);
                    rs.updateString("tname",tr_name);
                    rs.updateString("startplace",sr_place);
                    rs.updateString("destinationplace",dst_place);
                    rs.updateInt("tprice", tprice);
                    rs.insertRow();
                    JOptionPane.showMessageDialog(this,"Updated");
                    Train_details();
            }
            else{
                JOptionPane.showMessageDialog(this,"Error Occured while Updating");
            }
        } catch (Exception ex) {
            Logger.getLogger(Manage_Trains.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_change_btnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a row !");
        } else {
            int ans = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete ?", "Delete Confirmation !", JOptionPane.YES_NO_OPTION);

            if (ans == JOptionPane.YES_OPTION) {
                try {
                    
                    int tno = Integer.parseInt(train_num.getText());
                    
                    ResultSet rs = DBLoader.executeQuery("select * from traindetails where tno='" +tno+ "'");
                    try {
                        if (rs.next()) {
                            rs.deleteRow();
               
                            JOptionPane.showMessageDialog(rootPane, "Train deleted !");
                            Train_details();
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(Manage_Trains.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Trains.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Trains.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Trains.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Trains().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_train_btn;
    private javax.swing.JButton change_btn;
    private javax.swing.JTextField destination_place;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel iconlogo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField price_ticket;
    private javax.swing.JTextField start_place;
    private javax.swing.JTextField train_name;
    private javax.swing.JTextField train_num;
    // End of variables declaration//GEN-END:variables
public void Train_details(){
        try {
            ResultSet rs=DBLoader.executeQuery("select * from traindetails");
            ResultSetMetaData rsd=rs.getMetaData();
            int c;
            c=rsd.getColumnCount();
            DefaultTableModel d=(DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
            while(rs.next())
            {
                Vector v=new Vector();
                for(int i=0;i<=c;i++)
                {
                    v.add(rs.getString("tno"));
                    v.add(rs.getString("tname"));
                    v.add(rs.getString("startplace"));
                    v.add(rs.getString("destinationplace"));
                    v.add(rs.getString("tprice"));
                }
                d.addRow(v);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();}
}

    
}

