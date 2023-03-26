package myapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import config.db_configuration;
import java.awt.Color; 
import internalPages.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static myapp.viewPage.displayPane;

import net.proteanit.sql.DbUtils;
/**
 *
 * @author Mark
 */
public class dashBoard extends javax.swing.JFrame {

    /**
     * Creates new form dashBoard
     */
    public dashBoard() {
        initComponents();
    }
    Color navcolor = new Color(69,193,255);
     Color headcolor = new Color(102,102,255);
      Color bodycolor = new Color(153,153,255);
    
      public void fillDOLPHIN() throws SQLException{
        
    db_configuration dbc = new db_configuration();
    ResultSet rs = dbc.getData("SELECT*FROM tbl_resident");
    resident rd = new resident();
    displayPane.add(rd).setVisible(true);
    rd.tbl_res.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        navBar = new javax.swing.JPanel();
        dashPane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        reportsPane = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Settings = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitPane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mmzPane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        navBar.setBackground(new java.awt.Color(69, 193, 215));
        navBar.setLayout(null);

        dashPane.setBackground(new java.awt.Color(69, 193, 255));
        dashPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashPaneMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dashPaneMousePressed(evt);
            }
        });
        dashPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/dashboard-24.png"))); // NOI18N
        jLabel2.setText("    DASHBOARD");
        dashPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 40));

        navBar.add(dashPane);
        dashPane.setBounds(20, 210, 260, 40);

        userPane.setBackground(new java.awt.Color(69, 193, 255));
        userPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userPaneMouseExited(evt);
            }
        });
        userPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/user-24.png"))); // NOI18N
        jLabel1.setText("    USER");
        userPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, 40));

        navBar.add(userPane);
        userPane.setBounds(20, 260, 260, 40);

        reportsPane.setBackground(new java.awt.Color(69, 193, 255));
        reportsPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsPaneMouseExited(evt);
            }
        });
        reportsPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/reports-24.png"))); // NOI18N
        jLabel7.setText("    REPORTS");
        reportsPane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 40));

        navBar.add(reportsPane);
        reportsPane.setBounds(20, 310, 260, 40);

        Settings.setBackground(new java.awt.Color(69, 193, 255));
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingsMouseExited(evt);
            }
        });
        Settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/settings-24.png"))); // NOI18N
        jLabel8.setText("    SETTINGS");
        Settings.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, 40));

        navBar.add(Settings);
        Settings.setBounds(20, 360, 260, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("________");
        navBar.add(jLabel10);
        jLabel10.setBounds(70, 110, 190, 80);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/resident logo.png"))); // NOI18N
        navBar.add(jLabel11);
        jLabel11.setBounds(20, 40, 220, 110);

        jPanel1.add(navBar);
        navBar.setBounds(-20, 0, 280, 630);

        maindesktop.setBackground(new java.awt.Color(0, 153, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/effective-employee-management.jpg"))); // NOI18N
        maindesktop.add(jLabel5);
        jLabel5.setBounds(-150, 0, 890, 560);

        jPanel1.add(maindesktop);
        maindesktop.setBounds(260, 70, 740, 560);

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(170, 30, 830, 40);

        header.setBackground(new java.awt.Color(102, 102, 102));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitPane.setBackground(new java.awt.Color(102, 102, 102));
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

        jLabel3.setFont(new java.awt.Font("Corbel Light", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" x");
        exitPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        header.add(exitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 40, 30));

        mmzPane.setBackground(new java.awt.Color(102, 102, 102));
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("—");
        mmzPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 20, 50));

        header.add(mmzPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 40, 30));

        jPanel1.add(header);
        header.setBounds(260, 0, 740, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashPaneMouseEntered
        dashPane.setBackground(bodycolor);
    }//GEN-LAST:event_dashPaneMouseEntered

    private void dashPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashPaneMouseExited
        dashPane.setBackground(navcolor);
    }//GEN-LAST:event_dashPaneMouseExited

    private void userPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPaneMouseEntered
        userPane.setBackground(bodycolor);
    }//GEN-LAST:event_userPaneMouseEntered

    private void userPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPaneMouseExited
        userPane.setBackground(navcolor);
    }//GEN-LAST:event_userPaneMouseExited

    private void dashPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashPaneMouseClicked
       dashboardPage dbp = new dashboardPage();
       maindesktop.add(dbp).setVisible(true);  
      
       
    }//GEN-LAST:event_dashPaneMouseClicked

    private void userPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPaneMouseClicked
        viewPage vp = new viewPage();
        vp.setVisible(true);
        dashBoard db = new dashBoard();
         resident r = new resident();
        displayPane.add(r).setVisible(true);

           try{
            fillDOLPHIN();
        }catch(SQLException e)
        {
            System.out.println("Error is: "+e);
        }
        
        db.dispose();
        this.dispose();
        
      
    }//GEN-LAST:event_userPaneMouseClicked

    private void reportsPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsPaneMouseClicked
      reportsPage rp = new reportsPage();
      maindesktop.add(rp).setVisible(true);
    }//GEN-LAST:event_reportsPaneMouseClicked

    private void reportsPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsPaneMouseEntered
        reportsPane.setBackground(bodycolor);
    }//GEN-LAST:event_reportsPaneMouseEntered

    private void reportsPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsPaneMouseExited
       reportsPane.setBackground(navcolor);
    }//GEN-LAST:event_reportsPaneMouseExited

    private void SettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseExited
        Settings.setBackground(navcolor);
    }//GEN-LAST:event_SettingsMouseExited

    private void SettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseEntered
        Settings.setBackground(bodycolor);
    }//GEN-LAST:event_SettingsMouseEntered

    private void SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseClicked
        settings set = new settings();
        maindesktop.add(set).setVisible(true);
    }//GEN-LAST:event_SettingsMouseClicked

    private void exitPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPaneMouseEntered
        exitPane.setBackground(new Color(204,0,51));
    }//GEN-LAST:event_exitPaneMouseEntered

    private void exitPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPaneMouseExited
        exitPane.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_exitPaneMouseExited

    private void exitPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPaneMouseClicked
            int a = JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a == JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_exitPaneMouseClicked

    private void mmzPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmzPaneMouseEntered
        mmzPane.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_mmzPaneMouseEntered

    private void mmzPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmzPaneMouseExited
        mmzPane.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_mmzPaneMouseExited

    private void mmzPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmzPaneMouseClicked
         setState(ICONIFIED);
    }//GEN-LAST:event_mmzPaneMouseClicked

    private void dashPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashPaneMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashPaneMousePressed

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
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new dashBoard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel dashPane;
    private javax.swing.JPanel exitPane;
    private javax.swing.JPanel header;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JDesktopPane maindesktop;
    private javax.swing.JPanel mmzPane;
    private javax.swing.JPanel navBar;
    private javax.swing.JPanel reportsPane;
    private javax.swing.JPanel userPane;
    // End of variables declaration//GEN-END:variables
}