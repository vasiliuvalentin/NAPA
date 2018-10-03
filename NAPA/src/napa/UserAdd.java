/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Vali
 */
public class UserAdd extends javax.swing.JFrame {
    Methods methods = new Methods();
    /**
     * Creates new form UserAdd
     */
    public UserAdd() {
        initComponents();
      logo.setIcon(new ImageIcon("images/logo.png"));
        bg.setIcon(new ImageIcon("images/bg.jpg"));
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstText = new javax.swing.JTextField();
        lastText = new javax.swing.JTextField();
        adrText = new javax.swing.JTextField();
        telText = new javax.swing.JTextField();
        idText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        postText = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add User");
        setResizable(false);

        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon("D:\\Facultate\\NAPA\\images\\logo.png")); // NOI18N
        logo.setText("jLabel1");
        jPanel1.add(logo);
        logo.setBounds(0, 0, 90, 86);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FirstName:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 130, 80, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LastName:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 160, 80, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 190, 61, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telephone:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 220, 80, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID NUMBER:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 250, 88, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADD NEW USER");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 100, 140, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Post:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 280, 50, 17);
        jPanel1.add(firstText);
        firstText.setBounds(160, 130, 90, 22);
        jPanel1.add(lastText);
        lastText.setBounds(160, 160, 90, 22);
        jPanel1.add(adrText);
        adrText.setBounds(160, 190, 90, 22);

        telText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telTextKeyTyped(evt);
            }
        });
        jPanel1.add(telText);
        telText.setBounds(160, 220, 90, 22);

        idText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idTextKeyTyped(evt);
            }
        });
        jPanel1.add(idText);
        idText.setBounds(160, 250, 90, 22);

        addButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton);
        addButton.setBounds(200, 350, 79, 31);
        jPanel1.add(postText);
        postText.setBounds(160, 280, 90, 22);

        bg.setIcon(new javax.swing.ImageIcon("D:\\Facultate\\NAPA\\images\\bg.jpg")); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 320, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
         Statement stmt = null;
         boolean ok;
        try {
            Connection con = Methods.DBConector();
            stmt = (Statement) con.createStatement();
            if (firstText.getText().length()==0 || lastText.getText().length()==0 || adrText.getText().length() == 0 
                    || telText.getText().length() == 0 || idText.getText().length()==0 || postText.getText().length() == 0 ) {
                JOptionPane.showMessageDialog(null, "All fields are required!", "Error", 1);
                ok = false;
            } else {
                ok = true;
            }
            
           
            if (ok == true) {
                PreparedStatement ps = con.prepareStatement("insert into  users(firstName,lastName,address,telephone,idNumber,post) values (?,?,?,?,?,?)");
                
                ps.setString(1,firstText.getText() );
                ps.setString(2, lastText.getText());
                ps.setString(3, adrText.getText());
                ps.setString(4, telText.getText());
                ps.setLong(5, Long.parseLong(idText.getText()));
                ps.setString(6, postText.getText());
               
                int i = ps.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "The user was entered into the database!","Succes",1);
                    firstText.setText("");
                   lastText.setText("");
                   adrText.setText("");
                   telText.setText("");
                   idText.setText("");
                   postText.setText("");
                   
                    
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 1);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void telTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telTextKeyTyped
        // TODO add your handling code here:
         methods.check(evt);
        if(telText.getText().length()>9)
            evt.consume();
        
    }//GEN-LAST:event_telTextKeyTyped

    private void idTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextKeyTyped
        // TODO add your handling code here:
         methods.check(evt);
        if(idText.getText().length()>12)
            evt.consume();
        
    }//GEN-LAST:event_idTextKeyTyped

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
            java.util.logging.Logger.getLogger(UserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField adrText;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField firstText;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastText;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField postText;
    private javax.swing.JTextField telText;
    // End of variables declaration//GEN-END:variables
}