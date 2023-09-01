/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    
     //validation
    
    public boolean validateHomePage(){
        
         String a=txt_bodytemp.getText();
        String b= txt_heartrate.getText();
        String c= txt_bp.getText();
       
        
        
         if(a.equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Body Temperature");
            return false;
        }
        if(b.equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Heart Rate");
            return false;
        }
  
        
        if(c.equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Blood Pressure");
            return false;
        }
        
        return true;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_bodytemp = new javax.swing.JTextField();
        txt_heartrate = new javax.swing.JTextField();
        txt_bp = new javax.swing.JTextField();
        txt_respirate = new javax.swing.JComboBox<>();
        txt_glucose = new javax.swing.JComboBox<>();
        txt_consious = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HEALTH MONITOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 350, 50));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Body Temperature(F)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 240, 60));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Heart Rate");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 190, 50));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Blood Pressure");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 230, 50));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Respiratory rate");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 240, 50));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Glucose Level");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 220, 50));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Consiousness Level");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 230, 50));

        txt_bodytemp.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_bodytemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bodytempActionPerformed(evt);
            }
        });
        jPanel1.add(txt_bodytemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 214, 30));

        txt_heartrate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(txt_heartrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 214, 30));

        txt_bp.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(txt_bp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 214, 30));

        txt_respirate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_respirate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30-60 breath/min", "20-30 breath/min", "10-20 breath/min" }));
        txt_respirate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_respirateActionPerformed(evt);
            }
        });
        jPanel1.add(txt_respirate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 214, 30));

        txt_glucose.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_glucose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<100mg/dL", "<100& >125 mg/dL", ">125 mg/dL" }));
        jPanel1.add(txt_glucose, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 214, 30));

        txt_consious.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_consious.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alert", "Drowsy", "Unconsious" }));
        txt_consious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consiousActionPerformed(evt);
            }
        });
        jPanel1.add(txt_consious, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 214, 30));

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CHECK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 170, 50));

        jButton2.setBackground(new java.awt.Color(153, 0, 153));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 170, 50));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText(" X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 80, 40));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText(" X");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 80, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/500.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1279, 723));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_consiousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consiousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_consiousActionPerformed

    private void txt_respirateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_respirateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_respirateActionPerformed

    private void txt_bodytempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bodytempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bodytempActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(validateHomePage()){
        int a = Functionality.getBodyTemp(txt_bodytemp.getText());
        int b= Functionality.getHeartRate(txt_heartrate.getText());
        int c = Functionality.getBloodPressure(txt_bp.getText());
        int d= Functionality.getRespiratoryRate(txt_respirate.getSelectedItem().toString());
        int e = Functionality.getGlucoseLevel(txt_glucose.getSelectedItem().toString());
        int f= Functionality.getLoC(txt_consious.getSelectedItem().toString());
        
        String result = Functionality.getResult(a, b, c, d, e, f);
        //System.out.println(result);
        
        Insight in = new Insight(result);
        in.setVisible(true);
        
      }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Functionality.alart.clear();
        setVisible(false);
       new HomePage().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_bodytemp;
    private javax.swing.JTextField txt_bp;
    private javax.swing.JComboBox<String> txt_consious;
    private javax.swing.JComboBox<String> txt_glucose;
    private javax.swing.JTextField txt_heartrate;
    private javax.swing.JComboBox<String> txt_respirate;
    // End of variables declaration//GEN-END:variables
}