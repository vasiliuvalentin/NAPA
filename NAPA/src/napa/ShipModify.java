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

/**
 *
 * @author Vali
 */
public class ShipModify extends javax.swing.JFrame {

    boolean ship, captain;

    /**
     * Creates new form ShipModify
     */
    public ShipModify() {
        initComponents();
        logo.setIcon(new ImageIcon("images/logo.png"));
        bg.setIcon(new ImageIcon("images/bg.jpg"));
        shipLabel.setVisible(false);
        captainLabel.setVisible(false);
        shipCombo.setVisible(false);
        captainCombo.setVisible(false);
        ship = true;

        Statement stmt;
        try {
            Connection con = Methods.DBConector();
            stmt = (Statement) con.createStatement();
            String query = "Select * from ships";
            String query2 = "Select * from captains where idc not in ( select idc from ships);";
            PreparedStatement st = con.prepareStatement(query);
            PreparedStatement st2 = con.prepareStatement(query2);
            ResultSet rs = st.executeQuery();
            ResultSet rs2 = st2.executeQuery();

            while (rs.next()) {
                shipCombo2.addItem(rs.getString("name"));
                shipCombo.addItem(rs.getString("name"));
            }
            while (rs2.next()) {
                captainCombo.addItem(rs2.getString("firstName") + " " + rs2.getString("lastName"));
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
        jLabel2 = new javax.swing.JLabel();
        modifyCombo = new javax.swing.JComboBox<>();
        byLabel = new javax.swing.JLabel();
        byCombo = new javax.swing.JComboBox<>();
        newText = new javax.swing.JTextField();
        shipLabel = new javax.swing.JLabel();
        captainLabel = new javax.swing.JLabel();
        shipCombo = new javax.swing.JComboBox<>();
        captainCombo = new javax.swing.JComboBox<>();
        newLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        shipCombo2 = new javax.swing.JComboBox<>();
        shipLabel2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ship Update");
        setResizable(false);

        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon("D:\\Facultate\\NAPA\\images\\logo.png")); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(0, 0, 90, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modify:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 140, 60, 17);

        modifyCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ship", "Captain" }));
        modifyCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modifyComboItemStateChanged(evt);
            }
        });
        jPanel1.add(modifyCombo);
        modifyCombo.setBounds(110, 140, 90, 22);

        byLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        byLabel.setForeground(new java.awt.Color(255, 255, 255));
        byLabel.setText("By:");
        jPanel1.add(byLabel);
        byLabel.setBounds(20, 210, 50, 22);

        byCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Description" }));
        jPanel1.add(byCombo);
        byCombo.setBounds(110, 210, 90, 22);
        jPanel1.add(newText);
        newText.setBounds(110, 240, 90, 22);

        shipLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        shipLabel.setForeground(new java.awt.Color(255, 255, 255));
        shipLabel.setText("Ship:");
        jPanel1.add(shipLabel);
        shipLabel.setBounds(250, 140, 50, 17);

        captainLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        captainLabel.setForeground(new java.awt.Color(255, 255, 255));
        captainLabel.setText("Captain:");
        jPanel1.add(captainLabel);
        captainLabel.setBounds(250, 180, 60, 17);

        jPanel1.add(shipCombo);
        shipCombo.setBounds(320, 140, 120, 22);

        jPanel1.add(captainCombo);
        captainCombo.setBounds(320, 180, 120, 22);

        newLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newLabel.setForeground(new java.awt.Color(255, 255, 255));
        newLabel.setText("New Value:");
        jPanel1.add(newLabel);
        newLabel.setBounds(20, 240, 78, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 300, 79, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SHIP MODIFY");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 80, 130, 22);

        jPanel1.add(shipCombo2);
        shipCombo2.setBounds(110, 180, 90, 22);

        shipLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        shipLabel2.setForeground(new java.awt.Color(255, 255, 255));
        shipLabel2.setText("Ship:");
        jPanel1.add(shipLabel2);
        shipLabel2.setBounds(20, 180, 35, 17);

        bg.setIcon(new javax.swing.ImageIcon("D:\\Facultate\\NAPA\\images\\bg.jpg")); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 470, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void modifyComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modifyComboItemStateChanged
        // TODO add your handling code here:
        if (modifyCombo.getSelectedItem().toString().equals("Captain")) {
            byLabel.setVisible(false);
            byCombo.setVisible(false);
            newLabel.setVisible(false);
            newText.setVisible(false);
            shipCombo2.setVisible(false);
            shipLabel2.setVisible(false);
            captainLabel.setVisible(true);
            captainCombo.setVisible(true);
            shipLabel.setVisible(true);
            shipCombo.setVisible(true);

            captain = true;
            ship = false;

        } else {
            byLabel.setVisible(true);
            byCombo.setVisible(true);
            newLabel.setVisible(true);
            newText.setVisible(true);
            shipCombo2.setVisible(true);
            shipLabel2.setVisible(true);
            captainLabel.setVisible(false);
            captainCombo.setVisible(false);
            shipLabel.setVisible(false);
            shipCombo.setVisible(false);
            ship = true;
            captain = false;
        }
    }//GEN-LAST:event_modifyComboItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (ship == true) {
            Statement stmt;
            String query = null;
            int ids = 0;

            try {
                Connection con = Methods.DBConector();
                stmt = (Statement) con.createStatement();
                String query2 = "Select ids from ships where name=?";

                PreparedStatement st2 = con.prepareStatement(query2);
                st2.setString(1, shipCombo2.getSelectedItem().toString());
                ResultSet rs = st2.executeQuery();

                while (rs.next()) {
                    ids = Integer.parseInt(rs.getString(1));

                }
                switch (byCombo.getSelectedItem().toString()) {
                    case "Name":
                        query = "UPDATE ships SET name=? where ids=?";
                        break;
                    case "Description":
                        query = "UPDATE captains SET description=? where ids=?";
                        break;

                }
                PreparedStatement st = con.prepareStatement(query);
                st.setString(1, newText.getText());
                st.setInt(2, ids);

                int i = st.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Updated data!", "Succes", 1);
                    this.dispose();
                    ShipModify ship = new ShipModify();
                    ship.setVisible(true);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 1);
            }
        }
        if (captain == true) {
            Statement stmt;
           
            int idc = 0, ids = 0;
            try {
                Connection con = Methods.DBConector();
                stmt = (Statement) con.createStatement();

                String query = "Select idc from captains where firstName=? and lastName=?";
                String selectedName = captainCombo.getSelectedItem().toString();
                String name[] = selectedName.split(" ");
                PreparedStatement st = con.prepareStatement(query);
                st.setString(1, name[0]);
                st.setString(2, name[1]);
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    idc = Integer.parseInt(rs.getString(1));

                }

                String query2 = "Select ids from ships where name=?";

                PreparedStatement st2 = con.prepareStatement(query2);
                st2.setString(1, shipCombo.getSelectedItem().toString());

                ResultSet rs2 = st2.executeQuery();
                while (rs2.next()) {
                    ids = Integer.parseInt(rs2.getString(1));

                }

                PreparedStatement ps2 = con.prepareStatement("update ships set idc=? where ids=?");
                ps2.setInt(1, idc);
                ps2.setInt(2, ids);
                int i = ps2.executeUpdate();
                if (i > 0) {

                    JOptionPane.showMessageDialog(null, "Updated data!", "Succes", 1);
                    this.dispose();
                    ShipModify ship = new ShipModify();
                    ship.setVisible(true);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 1);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ShipModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShipModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShipModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShipModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShipModify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JComboBox<String> byCombo;
    private javax.swing.JLabel byLabel;
    private javax.swing.JComboBox<String> captainCombo;
    private javax.swing.JLabel captainLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> modifyCombo;
    private javax.swing.JLabel newLabel;
    private javax.swing.JTextField newText;
    private javax.swing.JComboBox<String> shipCombo;
    private javax.swing.JComboBox<String> shipCombo2;
    private javax.swing.JLabel shipLabel;
    private javax.swing.JLabel shipLabel2;
    // End of variables declaration//GEN-END:variables
}