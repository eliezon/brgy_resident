/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import myapp.addResident;
import myapp.updatePage;
import myapp.viewPage;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import myapp.dashBoard;


/**
 *
 * @author Mark
 */
public class dashboardPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form dashboardPage
     */
    public dashboardPage() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    Color navcolor = new Color(153,153,255);
    Color headcolor = new Color(153,255,255);
    Color bodycolor = new Color(69,193,215);
    
    
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
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        viewresident = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        updateresident = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addresident = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(69, 193, 215));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("BARANGAY RESIDENT INFORMATION SYSTEM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 510, 20);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BARANGAY RESIDENT INFORMATION SYSTEM");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 19, 510, 31);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Tungkop, Minglanilla, Cebu");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 210, 40);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tungkop, Minglanilla, Cebu");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 40, 210, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 260));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setLayout(null);

        viewresident.setBackground(new java.awt.Color(153, 255, 255));
        viewresident.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewresidentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewresidentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewresidentMouseExited(evt);
            }
        });
        viewresident.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MANAGE USER");
        viewresident.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/manage-r100.png"))); // NOI18N
        viewresident.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel4.add(viewresident);
        viewresident.setBounds(50, 150, 180, 170);

        updateresident.setBackground(new java.awt.Color(153, 255, 255));
        updateresident.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateresidentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateresidentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateresidentMouseExited(evt);
            }
        });
        updateresident.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SETTINGS");
        updateresident.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/settings-100.png"))); // NOI18N
        updateresident.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 100));

        jPanel4.add(updateresident);
        updateresident.setBounds(510, 150, 180, 170);

        addresident.setBackground(new java.awt.Color(153, 255, 255));
        addresident.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addresidentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addresidentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addresidentMouseExited(evt);
            }
        });
        addresident.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REPORTS");
        addresident.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/reports-100.png"))); // NOI18N
        addresident.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 90));

        jPanel4.add(addresident);
        addresident.setBounds(280, 150, 180, 170);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 750, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewresidentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewresidentMouseClicked
       // JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
       // mainFrame.dispose();
     
    }//GEN-LAST:event_viewresidentMouseClicked

    private void viewresidentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewresidentMouseEntered
        viewresident.setBackground(navcolor);
    }//GEN-LAST:event_viewresidentMouseEntered

    private void viewresidentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewresidentMouseExited
        viewresident.setBackground(headcolor);
    }//GEN-LAST:event_viewresidentMouseExited

    private void addresidentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addresidentMouseClicked
    
    }//GEN-LAST:event_addresidentMouseClicked

    private void addresidentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addresidentMouseEntered
        addresident.setBackground(navcolor);
    }//GEN-LAST:event_addresidentMouseEntered

    private void addresidentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addresidentMouseExited
        addresident.setBackground(headcolor);
    }//GEN-LAST:event_addresidentMouseExited

    private void updateresidentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateresidentMouseClicked
       
    }//GEN-LAST:event_updateresidentMouseClicked

    private void updateresidentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateresidentMouseEntered
        updateresident.setBackground(navcolor);
    }//GEN-LAST:event_updateresidentMouseEntered

    private void updateresidentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateresidentMouseExited
        updateresident.setBackground(headcolor);
    }//GEN-LAST:event_updateresidentMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addresident;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel updateresident;
    public static javax.swing.JPanel viewresident;
    // End of variables declaration//GEN-END:variables
}
