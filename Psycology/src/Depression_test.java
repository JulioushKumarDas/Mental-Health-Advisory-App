
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
public class Depression_test extends javax.swing.JFrame {

    /**
     * Creates new form Depression_test
     */
    int a;
    public String lname;
    public Depression_test(int a,String lname) {
        initComponents();
        this.a=a;
        this.lname=lname;
    }
  public Depression_test() {
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        r1_1 = new javax.swing.JRadioButton();
        r1_2 = new javax.swing.JRadioButton();
        r1_3 = new javax.swing.JRadioButton();
        r2_1 = new javax.swing.JRadioButton();
        r2_2 = new javax.swing.JRadioButton();
        r2_3 = new javax.swing.JRadioButton();
        r3_1 = new javax.swing.JRadioButton();
        r3_3 = new javax.swing.JRadioButton();
        r3_2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Depression_Test");

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("<html>Little Interest or Pleasure in doing things?<br><br>Not at all<br>Several days<br>Nearly every day.</html>");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("<html>Trouble falling or staying asleep , or sleeping too much?<br><br>Not at all<br>Several days<br>Nearly every day.</html>");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("<html>Trouble concentrating on things, such as reading the newspaper or watching television?<br><br>Not at all<br>Several days<br>Nearly every day.</html>");

        r1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1_1ActionPerformed(evt);
            }
        });

        r1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1_2ActionPerformed(evt);
            }
        });

        r1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1_3ActionPerformed(evt);
            }
        });

        r2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2_1ActionPerformed(evt);
            }
        });

        r2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2_2ActionPerformed(evt);
            }
        });

        r2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2_3ActionPerformed(evt);
            }
        });

        r3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3_1ActionPerformed(evt);
            }
        });

        r3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3_3ActionPerformed(evt);
            }
        });

        r3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3_2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Submit Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(412, 412, 412))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r1_1)
                            .addComponent(r1_2)
                            .addComponent(r1_3)
                            .addComponent(r2_1)
                            .addComponent(r2_3)
                            .addComponent(r3_1)
                            .addComponent(r3_3)
                            .addComponent(r3_2)
                            .addComponent(r2_2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(r1_1)
                        .addGap(3, 3, 3)
                        .addComponent(r1_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1_3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(r2_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r2_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r2_3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r3_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r3_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r3_3))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("<html><center><b>RV College Of  Engineering</b></center><center>Autonomous Institution Affliated to VTU,Belagavi</center><center>Bengaluru,560059</center></html>");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\img1.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Developed By: Julioush Kumar Das, Shreya Shakshi, Aditya Sukhwal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 690, 432, -1));

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
            disease="Low Depression";
        else if(avg>=70 && avg<=90)
            disease="High Depression";
        else if(avg>90)
            disease="High Depression";
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
            java.util.logging.Logger.getLogger(Depression_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Depression_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Depression_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Depression_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Depression_test().setVisible(true);
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
