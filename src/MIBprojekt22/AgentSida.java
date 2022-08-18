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
        label2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBrubrik.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        LBrubrik.setText("Meny");

        BTNredigeraAlien.setBackground(new java.awt.Color(255, 255, 255));
        BTNredigeraAlien.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNredigeraAlien.setLabel("Redigera alien");

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

        BTNregutrustn.setBackground(new java.awt.Color(255, 255, 255));
        BTNregutrustn.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        BTNregutrustn.setLabel("Registrera utrustning");
        BTNregutrustn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNregutrustnActionPerformed(evt);
            }
        });

        label2.setText("Inloggad som agent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBrubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNredigeraAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNregutrustn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNandralosenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNsokOmrodeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBrubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(BTNandralosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNregutrustn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNsokOmrodeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNredigeraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNandralosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNandralosenordActionPerformed
        new AndraLosenAgent (idb).setVisible(true);
    }//GEN-LAST:event_BTNandralosenordActionPerformed

    private void BTNregutrustnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNregutrustnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNregutrustnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BTNandralosenord;
    private java.awt.Button BTNredigeraAlien;
    private java.awt.Button BTNregutrustn;
    private java.awt.Button BTNsokOmrodeschef;
    private java.awt.Label LBrubrik;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
