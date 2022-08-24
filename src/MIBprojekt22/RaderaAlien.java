/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt22;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author amandademir
 */
public class RaderaAlien extends javax.swing.JFrame {

    private InfDB idb;
    
    /**
     * Creates new form RaderaAlien
     */
    public RaderaAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllComboboxAliens();
    }

    private void fyllComboboxAliens(){
    JComboBoxRaderaAlien.removeAllItems();
    String question = "SELECT Namn FROM Alien"; //vi hämtar alla namn från alien tabellen
    
    ArrayList<String> Aliens ;
    try {
    Aliens= idb.fetchColumn(question);
    
    for(String alien: Aliens)
    {
      JComboBoxRaderaAlien.addItem(alien);
    }
    }   catch (InfException ettUndantag) {
            Logger.getLogger(RaderaAlien.class.getName()).log(Level.SEVERE, null, ettUndantag);
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLRubrik = new javax.swing.JLabel();
        JLRaderaAlien = new javax.swing.JLabel();
        JComboBoxRaderaAlien = new javax.swing.JComboBox<>();
        BTNradera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLRubrik.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        JLRubrik.setText("Radera Alien");

        JLRaderaAlien.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        JLRaderaAlien.setText("Radera Alien från systemet");

        JComboBoxRaderaAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Bobbo", "Braxen" }));

        BTNradera.setText("Radera");
        BTNradera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNraderaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JComboBoxRaderaAlien, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLRaderaAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNradera)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JLRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(JLRaderaAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JComboBoxRaderaAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(BTNradera)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNraderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNraderaActionPerformed
        String alienNamn = String.valueOf(JComboBoxRaderaAlien.getSelectedItem().toString());

            
        try {
        String alien = idb.fetchSingle("SELECT Alien_ID FROM Alien WHERE Namn = '"+alienNamn+"'");
        
        {    
        idb.delete("DELETE FROM Alien WHERE Namn = '" + alienNamn + "'");//Här raderar vi den utvalda alien
        JOptionPane.showMessageDialog(null, "Alien med Namnet " + alienNamn + " är bortaget!"); 
        }
        
        } catch (InfException ettUndantag) {
                Logger.getLogger(RaderaAlien.class.getName()).log(Level.SEVERE, null, ettUndantag);
        }    }//GEN-LAST:event_BTNraderaActionPerformed

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
            java.util.logging.Logger.getLogger(RaderaAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaderaAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaderaAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaderaAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new RaderaAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNradera;
    private javax.swing.JComboBox<String> JComboBoxRaderaAlien;
    private javax.swing.JLabel JLRaderaAlien;
    private javax.swing.JLabel JLRubrik;
    // End of variables declaration//GEN-END:variables
}
