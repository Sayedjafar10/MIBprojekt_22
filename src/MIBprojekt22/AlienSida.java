/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt22;

import oru.inf.InfDB;

/**
 *
 * @author Pia Vargas, Amanda Demir
 * 
 * Klassen innehåller knappar som leder dig till nya fönster med olika funktioner du har 
 * som en inloggad alien.
 */
public class AlienSida extends javax.swing.JFrame {
    
    private static InfDB idb;
    
    public AlienSida(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBrubrik = new java.awt.Label();
        BTNandralosen = new java.awt.Button();
        BTNminomradeschef = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBrubrik.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        LBrubrik.setText("Meny");

        BTNandralosen.setBackground(new java.awt.Color(255, 255, 255));
        BTNandralosen.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNandralosen.setLabel("Ändra lösenord");
        BTNandralosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNandralosenActionPerformed(evt);
            }
        });

        BTNminomradeschef.setBackground(new java.awt.Color(255, 255, 255));
        BTNminomradeschef.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNminomradeschef.setLabel("Min områdeschef");
        BTNminomradeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNminomradeschefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBrubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTNminomradeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNandralosen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBrubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BTNandralosen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNminomradeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNandralosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNandralosenActionPerformed
        //Denna knapp leder dig till ett nytt fönster där du kan ändra lösenord.
        new AndraLosenAlien(idb).setVisible(true);
    }//GEN-LAST:event_BTNandralosenActionPerformed

    private void BTNminomradeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNminomradeschefActionPerformed
        //Denna knapp leder dig till ett nytt fönster där du får upp den inloggades Aliens områdeschef.
        new HittaAliensOmradeschef(idb).setVisible(true);
    }//GEN-LAST:event_BTNminomradeschefActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BTNandralosen;
    private java.awt.Button BTNminomradeschef;
    private java.awt.Label LBrubrik;
    // End of variables declaration//GEN-END:variables
}
