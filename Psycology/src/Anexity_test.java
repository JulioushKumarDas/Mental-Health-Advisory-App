
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Anexity_test extends javax.swing.JFrame {

    /**
     * Creates new form Anexity_test
     */
    int a;
    String lname;
    public Anexity_test(int a,String lname) {
        initComponents();
        this.a=a;
        this.lname=lname;
    }
     public Anexity_test() {
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

        q1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        r1_1 = new javax.swing.JRadioButton();
        r1_2 = new javax.swing.JRadioButton();
        r1_3 = new javax.swing.JRadioButton();
        r2_1 = new javax.swing.JRadioButton();
        r2_2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        r2_3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        r3_1 = new javax.swing.JRadioButton();
        r3_2 = new javax.swing.JRadioButton();
        r3_3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q1.setBackground(new java.awt.Color(48, 124, 92));
        q1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("<html> Do you experience intense anxiety or worry and find it difficult to control?<br><br> Never<br>Sometimes<br>Very Often.</html>");
        q1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 590, 130));

        r1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1_1ActionPerformed(evt);
            }
        });
        q1.add(r1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        r1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1_2ActionPerformed(evt);
            }
        });
        q1.add(r1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        r1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1_3ActionPerformed(evt);
            }
        });
        q1.add(r1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        r2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2_1ActionPerformed(evt);
            }
        });
        q1.add(r2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        r2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2_2ActionPerformed(evt);
            }
        });
        q1.add(r2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel2.setBackground(new java.awt.Color(81, 155, 69));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("<html>Does worry or anxiety interfere with your sleep or ability to concentrate?<br><br>Never<br>Sometimes<br>Very Often.</html>");
        q1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 610, 110));

        r2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2_3ActionPerformed(evt);
            }
        });
        q1.add(r2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("<html>Do you experience repetitive and persistent thoughts that are upsetting and unwanted?<br><br>Never<br>Sometimes<br>Very Often</html>");
        q1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 780, 130));

        r3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3_1ActionPerformed(evt);
            }
        });
        q1.add(r3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        r3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3_2ActionPerformed(evt);
            }
        });
        q1.add(r3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        r3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3_3ActionPerformed(evt);
            }
        });
        q1.add(r3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Anxiety_Test");
        q1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 170, 50));
        q1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        q1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 210, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Submit Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        q1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 180, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        q1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 170, -1));

        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1065, 597));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\img1.jpg")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("<html><center><b>RV College Of  Engineering</b></center><center>Autonomous Institution Affliated to VTU,Belagavi</center><center>Bengaluru,560059</center></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1065, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Developed By: Julioush Kumar Das, Shreya Shakshi, Aditya Sukhwal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 710, 432, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          r1_1.setSelected(false);
      r1_2.setSelected(false);
      r1_3.setSelected(false);
     
      r2_1.setSelected(false);
      r2_2.setSelected(false);
      r2_3.setSelected(false);
 
      r3_1.setSelected(false);
      r3_2.setSelected(false);
      r3_3.setSelected(false);
       int avg=(b1+b2+b3)/3;
        System.out.println(avg);
        String disease = null;
        if(avg>=50 && avg<=70)
            disease="Low Anxiety";
        else if(avg>=70 && avg<=90)
            disease="High Anxiety";
        else if(avg>90)
            disease="High Anxiety";
        else if(avg<50)
            disease="Normal";
        try{
          Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psycology1?useSSL=false","root","admin123");
            Statement stmt=conn.createStatement();
             PreparedStatement smt=conn.prepareStatement("update form1 set disease=? where u_name=?");  
                smt.setString(1,disease);
                 smt.setString(2,lname);//1 specifies the first parameter in the query  
                  System.out.println(a);
                  int i=smt.executeUpdate();  
                  }catch (SQLException e){
        System.out.println("Error"+ e.getMessage());
                  } catch (ClassNotFoundException ex) {
            Logger.getLogger(Complete_test.class.getName()).log(Level.SEVERE, null, ex);
        }
     Test_result ts=new Test_result(a,lname);
        ts.setVisible(true);
        this.setVisible(false);
      
 
               
    }//GEN-LAST:event_jButton1ActionPerformed
int b1;
    private void r1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1_1ActionPerformed
        // TODO add your handling code here:
         r1_2.setSelected(false);
        r1_3.setSelected(false);
      
     
      b1=25;
    }//GEN-LAST:event_r1_1ActionPerformed

    private void r1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1_2ActionPerformed
        // TODO add your handling code here:
          r1_1.setSelected(false);
        r1_3.setSelected(false);
      
     
      b1=50;
    }//GEN-LAST:event_r1_2ActionPerformed

    private void r1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1_3ActionPerformed
        // TODO add your handling code here:
          r1_2.setSelected(false);
        r1_1.setSelected(false);
      
     
      b1=75;
    }//GEN-LAST:event_r1_3ActionPerformed
int b2;
    private void r2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2_1ActionPerformed
        // TODO add your handling code here:
         r2_2.setSelected(false);
        r2_3.setSelected(false);
      
     
      b2=25;
    }//GEN-LAST:event_r2_1ActionPerformed

    private void r2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2_2ActionPerformed
        // TODO add your handling code here:
         r2_1.setSelected(false);
        r2_3.setSelected(false);
      
     
      b2=50;
    }//GEN-LAST:event_r2_2ActionPerformed

    private void r2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2_3ActionPerformed
        // TODO add your handling code here:
         r2_2.setSelected(false);
        r2_1.setSelected(false);
      
     
      b2=75;
    }//GEN-LAST:event_r2_3ActionPerformed
int b3;
    private void r3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3_1ActionPerformed
        // TODO add your handling code here:
         r3_2.setSelected(false);
        r3_3.setSelected(false);
      
     
      b3=25;
    }//GEN-LAST:event_r3_1ActionPerformed

    private void r3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3_2ActionPerformed
        // TODO add your handling code here:
         r3_1.setSelected(false);
        r3_3.setSelected(false);
      
     
      b3=50;
    }//GEN-LAST:event_r3_2ActionPerformed

    private void r3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3_3ActionPerformed
        // TODO add your handling code here:
         r3_2.setSelected(false);
        r3_1.setSelected(false);
      
     
      b3=75;
    }//GEN-LAST:event_r3_3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           home h =new home();
           h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Anexity_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anexity_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anexity_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anexity_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anexity_test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel q1;
    private javax.swing.JRadioButton r1_1;
    private javax.swing.JRadioButton r1_2;
    private javax.swing.JRadioButton r1_3;
    private javax.swing.JRadioButton r2_1;
    private javax.swing.JRadioButton r2_2;
    private javax.swing.JRadioButton r2_3;
    private javax.swing.JRadioButton r3_1;
    private javax.swing.JRadioButton r3_2;
    private javax.swing.JRadioButton r3_3;
    // End of variables declaration//GEN-END:variables
}
