/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vali
 */
public class ShipView extends javax.swing.JFrame {

    /**
     * Creates new form ShipView
     */
    public ShipView() {
        initComponents();
        Statement stmt;
        logo.setIcon(new ImageIcon("images/logo.png"));
        bg.setIcon(new ImageIcon("images/bg.jpg"));
        try {
            Connection con = Methods.DBConector();
            stmt = (Statement) con.createStatement();
            String query = "Select * from ships";

            PreparedStatement st = con.prepareStatement(query);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                shipCombo.addItem(rs.getString("name"));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 1);
        }
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
        logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        shipCombo = new javax.swing.JComboBox<>();
        okButton = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ship View");

        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon("D:\\Facultate\\NAPA\\images\\logo.png")); // NOI18N
        logo.setText("jLabel2");
        jPanel1.add(logo);
        logo.setBounds(0, 0, 90, 100);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Captain", "Team"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 530, 90);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Ship:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 140, 80, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("View Ship Details");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 90, 160, 22);

        jPanel1.add(shipCombo);
        shipCombo.setBounds(250, 140, 140, 22);

        okButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        jPanel1.add(okButton);
        okButton.setBounds(490, 310, 59, 31);

        bg.setIcon(new javax.swing.ImageIcon("D:\\Facultate\\NAPA\\images\\bg.jpg")); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 580, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        Statement stmt;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        try {
            Connection con = Methods.DBConector();
            stmt = (Statement) con.createStatement();
            String query = "Select * from captains,ships where captains.idc=ships.idc and ships.name=?";

            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, shipCombo.getSelectedItem().toString());
            ResultSet rs = st.executeQuery();

            model.setValueAt(" ", 0, 0);

            while (rs.next()) {
                model.setValueAt(model.getValueAt(0, 0) + " " + rs.getString("firstName") + " " + rs.getString("lastName"), 0, 0);
            }
            String query2 = "Select users.firstName,users.lastName from users,ships,team where users.idu=team.idu and ships.ids=team.ids and ships.name=?";
            PreparedStatement st2 = con.prepareStatement(query2);
            st2.setString(1, shipCombo.getSelectedItem().toString());
            ResultSet rs2 = st2.executeQuery();
            model.setValueAt(" ", 0, 1);
              while (rs2.next()) {
                model.setValueAt(model.getValueAt(0, 1) + " " + rs2.getString("firstName") + " " + rs2.getString("lastName")+" |", 0, 1);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 1);
        }
    }//GEN-LAST:event_okButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ShipView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShipView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShipView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShipView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShipView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox<String> shipCombo;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
