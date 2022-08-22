package MIBprojekt22;

import oru.inf.InfDB;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author piava
 */
public class AndraLosenAlien extends javax.swing.JFrame {

    private static InfDB idb;
    
    public AndraLosenAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBnewpass = new javax.swing.JLabel();
        LBconfirmpass = new javax.swing.JLabel();
        BTNupdate = new javax.swing.JButton();
        LBrubrik = new javax.swing.JLabel();
        TXTnewpass = new javax.swing.JTextField();
        TXTconpass = new javax.swing.JTextField();
        LBfelaktig = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBnewpass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LBnewpass.setText("Nytt lösenord:");

        LBconfirmpass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LBconfirmpass.setText("Bekräfta lösenord:");

        BTNupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNupdate.setText("Uppdatera");
        BTNupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNupdateActionPerformed(evt);
            }
        });

        LBrubrik.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        LBrubrik.setText("Ändra lösenord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(LBrubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BTNupdate)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LBconfirmpass, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(LBnewpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTnewpass, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(TXTconpass)))
                            .addComponent(LBfelaktig, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LBrubrik)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBnewpass)
                    .addComponent(TXTnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBconfirmpass)
                    .addComponent(TXTconpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(BTNupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(LBfelaktig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNupdateActionPerformed
        LBfelaktig.setText("");
        String nyttLos = TXTnewpass.getText();
        String bekLos = TXTconpass.getText();
        
        if (!Validering.kollaLosen(nyttLos)){
            LBfelaktig.setText("Lösenordet får vara max 8 tecken!");
        } else if (!nyttLos.equals (bekLos)){
            LBfelaktig.setText ("De inskrivna lösenorden stämmer inte överens.");
        } else {
            try {
                idb.update("UPDATE Alien SET Losenord = '" + nyttLos + "' WHERE Alien_ID = " + Inloggad.getInloggadID());
                LBfelaktig.setText("Lösenordet har uppdaterats.");
            } catch (InfException ettUndantag) {
                JOptionPane.showMessageDialog (null, "Något gick fel!");
            }
        }
    }//GEN-LAST:event_BTNupdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNupdate;
    private javax.swing.JLabel LBconfirmpass;
    private java.awt.Label LBfelaktig;
    private javax.swing.JLabel LBnewpass;
    private javax.swing.JLabel LBrubrik;
    private javax.swing.JTextField TXTconpass;
    private javax.swing.JTextField TXTnewpass;
    // End of variables declaration//GEN-END:variables
}