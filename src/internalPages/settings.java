/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import myapp.loginForm;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Mark
 */
public class settings extends javax.swing.JInternalFrame {

    /**
     * Creates new form settings
     */
    public settings() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
     Color navcolor = new Color(153,153,255);
     Color headcolor = new Color(153,255,255);
      Color bodycolor = new Color(0,153,255);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        reps = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logOut = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        editProf = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(69, 193, 215));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel1.setText("ACCOUNT SETTINGS");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 20, 270, 30);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("ADDRESS: TUNGKOP, MINGLANILLA, CEBU");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 220, 290, 30);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Mark Eliezon");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 90, 20));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(460, 30, 260, 220);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("ACCOUNT: MARK ELIEZON U. ANIñON");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 70, 270, 30);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("POSITION: ADMINISTRATOR");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 110, 210, 30);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("EMAIL: eliezonmcquenn@gmail.com");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(30, 160, 250, 30);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ACCOUNT SETTINGS");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 20, 270, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 290));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setLayout(null);

        reps.setBackground(new java.awt.Color(153, 255, 255));
        reps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                repsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                repsMouseExited(evt);
            }
        });
        reps.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REPORTS");
        reps.add(jLabel6);
        jLabel6.setBounds(30, 140, 140, 19);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/reports-100.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        reps.add(jLabel11);
        jLabel11.setBounds(50, 30, 100, 90);

        jPanel4.add(reps);
        reps.setBounds(280, 60, 190, 170);

        logOut.setBackground(new java.awt.Color(153, 255, 255));
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutMouseExited(evt);
            }
        });
        logOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/logout-100.png"))); // NOI18N
        logOut.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LOGOUT");
        logOut.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, -1));

        jPanel4.add(logOut);
        logOut.setBounds(510, 60, 190, 170);

        editProf.setBackground(new java.awt.Color(153, 255, 255));
        editProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProfMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editProfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editProfMouseExited(evt);
            }
        });
        editProf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("EDIT PROFILE");
        editProf.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 140, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/editProfile-100.png"))); // NOI18N
        editProf.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel4.add(editProf);
        editProf.setBounds(50, 60, 190, 170);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 770, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void repsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repsMouseEntered
        reps.setBackground(navcolor);
    }//GEN-LAST:event_repsMouseEntered

    private void repsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repsMouseExited
        reps.setBackground(headcolor);
    }//GEN-LAST:event_repsMouseExited

    private void logOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseEntered
        logOut.setBackground(navcolor);
    }//GEN-LAST:event_logOutMouseEntered

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
        logOut.setBackground(headcolor);
    }//GEN-LAST:event_logOutMouseExited

    private void editProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfMouseClicked
        
        //this.dispose();
    }//GEN-LAST:event_editProfMouseClicked

    private void editProfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfMouseEntered
        editProf.setBackground(navcolor);

    }//GEN-LAST:event_editProfMouseEntered

    private void editProfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfMouseExited
        editProf.setBackground(headcolor);
    }//GEN-LAST:event_editProfMouseExited

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        loginForm lf = new loginForm();
       lf.setVisible(true);
    }//GEN-LAST:event_logOutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel editProf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel logOut;
    private javax.swing.JPanel reps;
    // End of variables declaration//GEN-END:variables
}
