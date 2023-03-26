/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import config.db_configuration;
import internalPages.bolinao;
import internalPages.resident;
import java.awt.BasicStroke;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import static internalPages.resident.tbl_res;
import static myapp.updatePage.male;
import static myapp.updatePage.female;
import static myapp.updatePage.cb_status;
import static myapp.updatePage.cb_purok;


/**
 *
 * @author Mark
 */
public class viewPage extends javax.swing.JFrame {

    /**
     * Creates new form viewPage
     */
    public viewPage() {
        initComponents();
        search.setBackground(new Color(30,30,30,30));
    }
     Color navcolor = new Color(69,193,255);
     Color headcolor = new Color(102,102,255);
      Color bodycolor = new Color(153,153,255);

         Color hover = new Color(0,153,255);
    Color defButton = new Color(69,193,255);
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void buttonBorderAnimation(JPanel panel){
    panel.setBackground(hover);
    panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
    
    }
     public void displayData(){
       
        try{
       
            db_configuration dbc = new db_configuration();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_resident");
            tbl_res.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
        }
    }
   
    
    void buttonDefaultColor(JPanel panel){
    panel.setBackground(defButton);
    panel.setBorder(empty);
    }
     public void fillRESIDENT() throws SQLException{
        
    db_configuration dbc = new db_configuration();
    ResultSet rs = dbc.getData("SELECT*FROM tbl_resident");
    resident rd = new resident();
    displayPane.add(rd).setVisible(true);
    resident.tbl_res.setModel(DbUtils.resultSetToTableModel(rs));
    }
      public void fillBOLINAO() throws SQLException{
        
    db_configuration dbc = new db_configuration();
    ResultSet rs = dbc.getData("SELECT*FROM tbl_resident1");
    bolinao bl = new bolinao();
    displayPane.add(bl).setVisible(true);
    bolinao.tbl_bol.setModel(DbUtils.resultSetToTableModel(rs));
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
        navBar = new javax.swing.JPanel();
        dolphinPane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        displayPane = new javax.swing.JDesktopPane();
        jLabel13 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitPane = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        mmzPane = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        add = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        ser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navBar.setBackground(new java.awt.Color(69, 193, 215));
        navBar.setLayout(null);

        dolphinPane.setBackground(new java.awt.Color(69, 193, 255));
        dolphinPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dolphinPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dolphinPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dolphinPaneMouseExited(evt);
            }
        });
        dolphinPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("RESIDENTS");
        dolphinPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 40));

        navBar.add(dolphinPane);
        dolphinPane.setBounds(0, 180, 260, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("VIEW RESIDENT");
        navBar.add(jLabel11);
        jLabel11.setBounds(20, 70, 220, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("____________________");
        navBar.add(jLabel12);
        jLabel12.setBounds(20, 80, 220, 40);

        jPanel3.setBackground(new java.awt.Color(69, 193, 215));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" ←");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        navBar.add(jPanel3);
        jPanel3.setBounds(0, 0, 50, 40);

        jPanel1.add(navBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 690));

        displayPane.setBackground(new java.awt.Color(0, 153, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/effective-employee-management.jpg"))); // NOI18N
        displayPane.add(jLabel13);
        jLabel13.setBounds(-4, -5, 840, 640);

        jPanel1.add(displayPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 830, 630));

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

        jLabel8.setFont(new java.awt.Font("Corbel Light", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" x");
        exitPane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        header.add(exitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 40, 30));

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("—");
        mmzPane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 20, 50));

        header.add(mmzPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("BARANGAY RESIDENT INFORMATION SYSTEM");
        header.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 30));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 830, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(290, 60, 0, 2);

        add.setBackground(new java.awt.Color(69, 193, 255));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("ADD");
        add.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 30, 30));

        jPanel2.add(add);
        add.setBounds(20, 0, 90, 40);

        update.setBackground(new java.awt.Color(69, 193, 255));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("UPDATE");
        update.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 30));

        jPanel2.add(update);
        update.setBounds(120, 0, 90, 40);

        delete.setBackground(new java.awt.Color(69, 193, 255));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("DELETE");
        delete.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 30));

        jPanel2.add(delete);
        delete.setBounds(220, 0, 90, 40);

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-update-left-rotation-24.png"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -6, -1, 40));

        jPanel2.add(jPanel4);
        jPanel4.setBounds(770, 0, 40, 30);

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search);
        search.setBounds(350, 0, 220, 30);

        ser.setText("SEARCH");
        jPanel2.add(ser);
        ser.setBounds(580, 0, 90, 30);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 830, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dolphinPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dolphinPaneMouseClicked
        resident r = new resident();
        displayPane.add(r).setVisible(true);
     
           try{
            fillRESIDENT();
        }catch(SQLException e)
        {
            System.out.println("Error is: "+e);
        }
       
    }//GEN-LAST:event_dolphinPaneMouseClicked

    private void dolphinPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dolphinPaneMouseEntered
        dolphinPane.setBackground(bodycolor);
    }//GEN-LAST:event_dolphinPaneMouseEntered

    private void dolphinPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dolphinPaneMouseExited
        dolphinPane.setBackground(navcolor);
    }//GEN-LAST:event_dolphinPaneMouseExited

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
        exitPane.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_exitPaneMouseExited

    private void mmzPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmzPaneMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_mmzPaneMouseClicked

    private void mmzPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmzPaneMouseEntered
        mmzPane.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_mmzPaneMouseEntered

    private void mmzPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmzPaneMouseExited
        mmzPane.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_mmzPaneMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(new Color(0,153,255));
        buttonBorderAnimation(add);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(new Color(69,193,255));
        buttonDefaultColor(add);
    }//GEN-LAST:event_addMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
           update.setBackground(new Color(0,153,255));
        buttonBorderAnimation(update);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
           update.setBackground(new Color(69,193,255));
        buttonDefaultColor(update);
    }//GEN-LAST:event_updateMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
          delete.setBackground(new Color(0,153,255));
        buttonBorderAnimation(delete);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
           delete.setBackground(new Color(69,193,255));
        buttonDefaultColor(delete);
    }//GEN-LAST:event_deleteMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        addResident art = new addResident();
        art.setVisible(true);
       // this.dispose();
        
    }//GEN-LAST:event_addMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
          
        int rowindex = tbl_res.getSelectedRow();
       if(rowindex < 0){
          JOptionPane.showMessageDialog(null, "Please select a data first!");
       }else{
        updatePage up = new updatePage();
        up.setVisible(true);
           TableModel model = tbl_res.getModel();
       updatePage.ID.setText(""+model.getValueAt(rowindex, 0));
        updatePage.NAME.setText(""+model.getValueAt(rowindex, 1));
         updatePage.BDATE.setText(""+model.getValueAt(rowindex, 2));
         String cb = model.getValueAt(rowindex, 3).toString();
        if(cb.contains("Single")){
        cb_status.setSelectedIndex(1);
        }else if(cb.contains("Married")){
        cb_status.setSelectedIndex(2);
        }else if(cb.contains("Widow")){
        cb_status.setSelectedIndex(3);
        }else{
        cb_status.setSelectedIndex(4);
        }
         
          String rb = model.getValueAt(rowindex, 4).toString();
          switch(rb){
              case "Male":
                  updatePage.male.setSelected(true);
                  break;
              default:
                  updatePage.female.setSelected(true);
                  break;
          }
           
            updatePage.CHILDREN.setText(""+model.getValueAt(rowindex, 5));
             updatePage.CONTACT.setText(""+model.getValueAt(rowindex, 6));
              String p = model.getValueAt(rowindex, 7).toString();
         if(p.contains("Dolphin")){
         cb_purok.setSelectedIndex(1);
         }else if(p.contains("Bolinao")){
         cb_purok.setSelectedIndex(2);
         }else if(p.contains("Mamsa")){
         cb_purok.setSelectedIndex(3);
         }else if(p.contains("Tangigue")){
         cb_purok.setSelectedIndex(4);
         }else if(p.contains("Tulingan")){
         cb_purok.setSelectedIndex(5);
         }else{
         cb_purok.setSelectedIndex(6);
         }
       
       }
       
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
       
         int rowIndex = tbl_res.getSelectedRow();
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select a data first!");
       }else{
            TableModel model = tbl_res.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
                    if(a==JOptionPane.YES_OPTION){  
                            db_configuration dbc = new db_configuration();
                            dbc.deleteData(Integer.parseInt(id));
                            displayData();
                            
                    }    
       }
    }//GEN-LAST:event_deleteMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
       this.dispose();
        dashBoard dbp = new dashBoard();
        dbp.setVisible(true);
        
        
       
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
    
       resident res = new resident();
        displayPane.add(res).setVisible(true);
  
           try{
            fillRESIDENT();
        }catch(SQLException e)
        {
            System.out.println("Error is: "+e);
        }
    }//GEN-LAST:event_jPanel4MouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new viewPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JPanel delete;
    public static javax.swing.JDesktopPane displayPane;
    private javax.swing.JPanel dolphinPane;
    private javax.swing.JPanel exitPane;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mmzPane;
    private javax.swing.JPanel navBar;
    private javax.swing.JTextField search;
    private javax.swing.JButton ser;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}