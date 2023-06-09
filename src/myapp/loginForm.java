package myapp;


import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mark
 */
public class loginForm extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public loginForm() {
        initComponents();
        username.setBackground(new Color(0,0,0,0));
          password.setBackground(new Color(0,0,0,0));
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
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        cancel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitPane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mmzPane = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(154, 54, 152));
        jPanel1.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/bglogo.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, -20, 380, 530);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 470));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(0, 153, 255));
        username.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setToolTipText("");
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 310, 60));

        cancel.setBackground(new java.awt.Color(115, 99, 212));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CANCEL");
        cancel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, 30));

        login.setBackground(new java.awt.Color(124, 111, 207));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");
        login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 80, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("New User? Click Here to Register ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 250, 20));

        error.setForeground(new java.awt.Color(153, 0, 51));
        jPanel2.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 290, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 310, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-eye-24.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, 40));

        password.setBackground(new java.awt.Color(0, 153, 255));
        password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 310, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/logo (1).png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 140));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 330, 440));

        header.setBackground(new java.awt.Color(0, 153, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitPane.setBackground(new java.awt.Color(0, 153, 255));
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
        jLabel4.setText(" x");
        exitPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        header.add(exitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 40, 30));

        mmzPane.setBackground(new java.awt.Color(0, 153, 255));
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("—");
        mmzPane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 20, 50));

        header.add(mmzPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 40, 30));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        buttonBorderAnimation(cancel);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
       buttonDefaultColor(cancel);  
    }//GEN-LAST:event_cancelMouseExited

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
         buttonBorderAnimation(login);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
          buttonDefaultColor(login);
    }//GEN-LAST:event_loginMouseExited

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
     
        /*String user = username.getText();
        String pass = password.getText();
        
        if(user.equals("admin") && pass.equals("adminadmin")){
            dashBoard db = new dashBoard();
            db.setVisible(true);
            this.dispose();
        }else{
              error.setText("The username or password you entered is incorrect!");
              //JOptionPane.showMessageDialog(null, "LOGIN FAILED");
       
        }*/ dashBoard db = new dashBoard();
            db.setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_loginMouseClicked

    private void exitPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPaneMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a == JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_exitPaneMouseClicked

    private void exitPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPaneMouseEntered
        exitPane.setBackground(new Color(204,0,51));
    }//GEN-LAST:event_exitPaneMouseEntered

    private void exitPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPaneMouseExited
        exitPane.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_exitPaneMouseExited

    private void mmzPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmzPaneMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_mmzPaneMouseClicked

    private void mmzPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmzPaneMouseEntered
        mmzPane.setBackground(new Color(146,199,235));
    }//GEN-LAST:event_mmzPaneMouseEntered

    private void mmzPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmzPaneMouseExited
        mmzPane.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_mmzPaneMouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
 
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
     // password.setText("");
        jLabel8.setText(password.getText());
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel8.setText("");
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       registerPage rp = new registerPage();
       rp.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancel;
    public static javax.swing.JLabel error;
    private javax.swing.JPanel exitPane;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel login;
    private javax.swing.JPanel mmzPane;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
