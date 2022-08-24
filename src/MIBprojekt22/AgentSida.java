/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt22;

import oru.inf.InfDB;

/**
 *
 * @author piava
 */
public class AgentSida extends javax.swing.JFrame {
  
    private static InfDB idb;

    public AgentSida(InfDB idb) {
        initComponents();
        this.idb = idb;
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBrubrik = new java.awt.Label();
        BTNredigeraAlien = new java.awt.Button();
        BTNandralosenord = new java.awt.Button();
        BTNsokOmrodeschef = new java.awt.Button();
        BTNregutrustn = new java.awt.Button();
        BTNadminhant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBrubrik.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        LBrubrik.setText("Meny");

        BTNredigeraAlien.setBackground(new java.awt.Color(255, 255, 255));
        BTNredigeraAlien.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNredigeraAlien.setLabel("Redigera alien");
        BTNredigeraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNredigeraAlienActionPerformed(evt);
            }
        });

        BTNandralosenord.setBackground(new java.awt.Color(255, 255, 255));
        BTNandralosenord.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNandralosenord.setLabel("Ändra lösenord");
        BTNandralosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNandralosenordActionPerformed(evt);
            }
        });

        BTNsokOmrodeschef.setBackground(new java.awt.Color(255, 255, 255));
        BTNsokOmrodeschef.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNsokOmrodeschef.setLabel("Sök områdeschef");
        BTNsokOmrodeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsokOmrodeschefActionPerformed(evt);
            }
        });

        BTNregutrustn.setBackground(new java.awt.Color(255, 255, 255));
        BTNregutrustn.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNregutrustn.setLabel("Registrera utrustning");
        BTNregutrustn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNregutrustnActionPerformed(evt);
            }
        });

        BTNadminhant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNadminhant.setText("Hantering som Admin");
        BTNadminhant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNadminhantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBrubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTNredigeraAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNregutrustn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNandralosenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNsokOmrodeschef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNadminhant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBrubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(BTNandralosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNregutrustn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNsokOmrodeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNredigeraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNadminhant, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNandralosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNandralosenordActionPerformed
        new AndraLosenAgent (idb).setVisible(true);
    }//GEN-LAST:event_BTNandralosenordActionPerformed

    private void BTNregutrustnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNregutrustnActionPerformed
        new NyregistreraUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_BTNregutrustnActionPerformed

    private void BTNadminhantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNadminhantActionPerformed
        new AdminSida(idb).setVisible(true);
    }//GEN-LAST:event_BTNadminhantActionPerformed

    private void BTNsokOmrodeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsokOmrodeschefActionPerformed
        new HittaOmradeschef(idb).setVisible(true);
    }//GEN-LAST:event_BTNsokOmrodeschefActionPerformed

    private void BTNredigeraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNredigeraAlienActionPerformed
        new RedigeraAlien(idb).setVisible(true);
    }//GEN-LAST:event_BTNredigeraAlienActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNadminhant;
    private java.awt.Button BTNandralosenord;
    private java.awt.Button BTNredigeraAlien;
    private java.awt.Button BTNregutrustn;
    private java.awt.Button BTNsokOmrodeschef;
    private java.awt.Label LBrubrik;
    // End of variables declaration//GEN-END:variables
}
