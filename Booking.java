import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
public class Booking extends javax.swing.JFrame {
    public Booking() {
        initComponents();
        printing_tic.setEnabled(false);
        setSize(1300,650);
        setVisible(true);
        setTitle("Booking Page");
        setLocation(200,100);
        getContentPane().setBackground(new Color(218,247,166));
        LoadStartplace();
        LoadDestinationplace();
    }
    public void LoadStartplace()
    {
        try{
            ResultSet rs=DBLoader.executeQuery("select startplace from traindetails");
            tstart_place.removeAllItems();
            while(rs.next())
            {
                tstart_place.addItem(rs.getString(1));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void LoadDestinationplace()
    {
        try{
            ResultSet rs=DBLoader.executeQuery("select destinationplace from traindetails");
            tdestination_place.removeAllItems();
            while(rs.next())
            {
                tdestination_place.addItem(rs.getString(1));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void load_search_results(){
        String splace=tstart_place.getSelectedItem().toString();
        String dplace=tdestination_place.getSelectedItem().toString();
        try{
            ResultSet rs=DBLoader.executeQuery("select * from traindetails where startplace='"+splace+"' and destinationplace='"+dplace+"'");
            if(rs.next())
            {
                train_num.setText(rs.getString(1));
                t_name.setText(rs.getString(2));
                t_price.setText(rs.getString(5));
            }
            else{
                JOptionPane.showMessageDialog(this,"Record Not Found");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog2 = new datechooser.beans.DateChooserDialog();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t_date = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        j_tpassenger_num = new javax.swing.JTextField();
        t_name = new javax.swing.JTextField();
        train_num = new javax.swing.JTextField();
        tstart_place = new javax.swing.JComboBox<>();
        tdestination_place = new javax.swing.JComboBox<>();
        t_total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        t_price = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        printing_tic = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TicketArea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        j_num_ticket = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("TRAIN TICKET BOOKING ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 20, 500, 60);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Price");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 360, 180, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Passenger No.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 90, 180, 40);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Start Place");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 150, 180, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Destination Place");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 180, 180, 40);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Train No");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 230, 180, 30);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Train Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 290, 180, 30);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("No. of Tickets");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 480, 200, 30);
        getContentPane().add(t_date);
        t_date.setBounds(230, 410, 220, 40);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setText("Date");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 420, 100, 23);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setText("Total");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 540, 120, 30);
        getContentPane().add(j_tpassenger_num);
        j_tpassenger_num.setBounds(230, 90, 290, 40);
        getContentPane().add(t_name);
        t_name.setBounds(230, 290, 290, 40);
        getContentPane().add(train_num);
        train_num.setBounds(230, 240, 290, 40);

        tstart_place.setBackground(new java.awt.Color(153, 255, 255));
        tstart_place.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getContentPane().add(tstart_place);
        tstart_place.setBounds(230, 140, 290, 40);

        tdestination_place.setBackground(new java.awt.Color(153, 255, 255));
        tdestination_place.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getContentPane().add(tdestination_place);
        tdestination_place.setBounds(230, 190, 290, 40);
        getContentPane().add(t_total);
        t_total.setBounds(230, 540, 210, 40);

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Book Ticket");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(470, 540, 200, 50);
        getContentPane().add(t_price);
        t_price.setBounds(230, 350, 220, 50);

        search_btn.setBackground(new java.awt.Color(153, 255, 255));
        search_btn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        search_btn.setForeground(new java.awt.Color(255, 51, 51));
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_btn);
        search_btn.setBounds(540, 190, 140, 40);

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Back to Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 10, 120, 20);

        printing_tic.setBackground(new java.awt.Color(153, 255, 255));
        printing_tic.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        printing_tic.setForeground(new java.awt.Color(255, 51, 51));
        printing_tic.setText("Print Ticket");
        printing_tic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printing_ticActionPerformed(evt);
            }
        });
        getContentPane().add(printing_tic);
        printing_tic.setBounds(880, 525, 180, 40);

        TicketArea.setColumns(20);
        TicketArea.setRows(5);
        jScrollPane1.setViewportView(TicketArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(720, 120, 500, 390);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 102));
        jLabel11.setText("Press Enter after Entering No. of Tickets");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 510, 320, 17);

        j_num_ticket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j_num_ticketKeyPressed(evt);
            }
        });
        getContentPane().add(j_num_ticket);
        j_num_ticket.setBounds(210, 462, 280, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        load_search_results();
    }//GEN-LAST:event_search_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        int passenger_num=Integer.parseInt(j_tpassenger_num.getText().toString());
        String s_place=tstart_place.getSelectedItem().toString();
        String d_place=tdestination_place.getSelectedItem().toString();
        int train_number=Integer.parseInt(train_num.getText().toString());
        String tname=t_name.getText();
        int price=Integer.parseInt(t_price.getText().toString());
        SimpleDateFormat date_form=new SimpleDateFormat("yyyy-MM-dd");
        String date=date_form.format(t_date.getDate());
        int number_of_tic=Integer.parseInt(j_num_ticket.getText().toString());
        int total=Integer.parseInt(t_total.getText().toString());
        if(passenger_num==0|| price==0|| number_of_tic==0|| total==0)
        {
            JOptionPane.showMessageDialog(this,"Error! Please Fill The Details of Booking Properly" );
        }
        else{
            try 
            {           ResultSet rs = DBLoader.executeQuery("select * from ticketbooking where tno= '"+train_number+"'"); 
                        rs.moveToInsertRow();
                        rs.updateInt("pno",passenger_num);
                        rs.updateString("startplace",s_place);
                        rs.updateString("destinationplace",d_place);
                        rs.updateInt("tno", train_number);
                        rs.updateString("tname",tname);
                        rs.updateInt("price",price);
                        rs.updateString("date",date);
                        rs.updateInt("tickets",number_of_tic);
                        rs.updateInt("total",total);
                        rs.insertRow();
                        JOptionPane.showMessageDialog(this,"Booking Successful");
                        
                        
                        printing_tic.setEnabled(true);
                        
                        TicketArea.setText(" WELCOME PASSENGER \n"
                                + "******************************** \n "
                                + "YOUR PASSENGER NUMBER:"+passenger_num+
                                "\n TRAIN NUMBER:"+train_number
                                +"\n TRAIN NAME:"+tname
                                +"\n Date:"+date
                                +"\n From: "+s_place+" to "+d_place
                                +"\n NUMBER OF TICKETS:"+number_of_tic
                                +"\n AMOUNT PAID: "+total
                                +"\n ------------------------\n"
                                +" THANK YOU FOR USING TICKET BOOKING SYSTEM \n"+
                                 "---------------------------------------------\n"
                                +"  HAPPY JOURNEY :) \n"+
                                " ====================================\n");
                        
                        j_tpassenger_num.setText("");
                        train_num.setText("");
                        t_name.setText("");
                        t_price.setText("");
                        j_num_ticket.setText("");
                        t_total.setText("");
                        
                    }
                    
        
        catch (Exception ex) {
           JOptionPane.showMessageDialog(this, "Duplicate Entry in DataBase. Please Change Passenger Number");
        }
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UserHome obj=new UserHome();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void j_num_ticketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j_num_ticketKeyPressed
       int price,num_of_tics,total;
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            price=Integer.parseInt(t_price.getText());
            num_of_tics=Integer.parseInt(j_num_ticket.getText());
            total=price*num_of_tics;
            t_total.setText(String.valueOf(total));
        }
        
        
    }//GEN-LAST:event_j_num_ticketKeyPressed

    private void printing_ticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printing_ticActionPerformed
        String printdata=TicketArea.getText();
        PrinterJob job=PrinterJob.getPrinterJob();
        boolean doPrint=false;
        boolean doprint=job.printDialog();
              
        if(doPrint)
        {
            try{
                job.print();
                
            }
            catch(PrinterException e){
                System.out.println("Print Failed");
            }
        }
    }//GEN-LAST:event_printing_ticActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TicketArea;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserDialog dateChooserDialog2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField j_num_ticket;
    private javax.swing.JTextField j_tpassenger_num;
    private javax.swing.JButton printing_tic;
    private javax.swing.JButton search_btn;
    private com.toedter.calendar.JDateChooser t_date;
    private javax.swing.JTextField t_name;
    private javax.swing.JTextField t_price;
    private javax.swing.JTextField t_total;
    private javax.swing.JComboBox<String> tdestination_place;
    private javax.swing.JTextField train_num;
    private javax.swing.JComboBox<String> tstart_place;
    // End of variables declaration//GEN-END:variables
}
