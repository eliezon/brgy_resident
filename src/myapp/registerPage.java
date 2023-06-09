/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Mark
 */
public class registerPage extends javax.swing.JFrame {

    /**
     * Creates new form registerPage
     */
    public registerPage() {
        initComponents();
    }
      Color hover = new Color(239,124,239);
    Color defButton = new Color(124,111,207);
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void buttonBorderAnimation(JPanel panel){
    panel.setBackground(hover);
    panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
    
    }
    
    void buttonDefaultColor(JPanel panel){
    panel.setBackground(defButton);
    panel.setBorder(empty);
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
        fname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bdate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        pword = new javax.swing.JTextField();
        cpass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        regsiter = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        mmzPane = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        exitPane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(69, 193, 215));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(fname);
        fname.setBounds(110, 180, 200, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 180, 80, 30);

        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(lname);
        lname.setBounds(110, 240, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Last Name ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 240, 80, 30);

        bdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdateActionPerformed(evt);
            }
        });
        jPanel1.add(bdate);
        bdate.setBounds(110, 300, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Birthdate");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 300, 80, 30);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REGISTRATION FORM");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 70, 350, 44);

        uname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(uname);
        uname.setBounds(480, 180, 200, 30);

        pword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(pword);
        pword.setBounds(480, 240, 200, 30);

        cpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(cpass);
        cpass.setBounds(480, 300, 200, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Confirm password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(350, 300, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(400, 240, 80, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Username");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(400, 180, 80, 30);

        regsiter.setBackground(new java.awt.Color(124, 111, 207));
        regsiter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regsiterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regsiterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regsiterMouseExited(evt);
            }
        });
        regsiter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGISTER");
        regsiter.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jPanel1.add(regsiter);
        regsiter.setBounds(560, 380, 110, 30);

        mmzPane.setBackground(new java.awt.Color(69, 193, 215));
        mmzPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mmzPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mmzPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mmzPaneMouseExited(evt);
            }
        });
        mmzPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("—");
        mmzPane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 20, 50));

        jPanel1.add(mmzPane);
        mmzPane.setBounds(640, 0, 30, 30);

        exitPane.setBackground(new java.awt.Color(69, 193, 215));
        exitPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitPaneMouseExited(evt);
            }
        });
        exitPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Corbel Light", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  x");
        exitPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(exitPane);
        exitPane.setBounds(670, 0, 30, 30);

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("REGISTRATION FORM");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(170, 70, 350, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/resident logo-50.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 102, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regsiterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regsiterMouseExited
        buttonDefaultColor(regsiter);
    }//GEN-LAST:event_regsiterMouseExited

    private void regsiterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regsiterMouseEntered
        buttonBorderAnimation(regsiter);
    }//GEN-LAST:event_regsiterMouseEntered

    private void regsiterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regsiterMouseClicked
        JOptionPane.showMessageDialog(null, "Registration complete!");
        loginForm lf = new loginForm();
        lf.setVisible(true);
        this.dispose();
   
    }//GEN-LAST:event_regsiterMouseClicked

    private void bdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdateActionPerformed

    private void mmzPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmzPaneMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_mmzPaneMouseClicked

    private void mmzPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmzPaneMouseEntered
        mmzPane.setBackground(new Color(146,199,235));
    }//GEN-LAST:event_mmzPaneMouseEntered

    private void mmzPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmzPaneMouseExited
        mmzPane.setBackground(new Color(69,193,215));
    }//GEN-LAST:event_mmzPaneMouseExited

    private void exitPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPaneMouseClicked
       loginForm lf = new loginForm();
       lf.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_exitPaneMouseClicked

    private void exitPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPaneMouseEntered
        exitPane.setBackground(new Color(204,0,51));
    }//GEN-LAST:event_exitPaneMouseEntered

    private void exitPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPaneMouseExited
        exitPane.setBackground(new Color(69,193,215));
    }//GEN-LAST:event_exitPaneMouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(registerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bdate;
    private javax.swing.JTextField cpass;
    private javax.swing.JPanel exitPane;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JPanel mmzPane;
    private javax.swing.JTextField pword;
    public static javax.swing.JPanel regsiter;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
