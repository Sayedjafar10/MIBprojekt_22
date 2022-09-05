/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt22;

import oru.inf.InfDB;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author Pia Vargas, Amanda Demir
 */

public class AndraLosenAgent extends javax.swing.JFrame {
    
    private static InfDB idb;
    private HjalpAttHamta konv;
    
    public AndraLosenAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.konv = new HjalpAttHamta(idb);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBnewpass = new javax.swing.JLabel();
        LBconfirmpass = new javax.swing.JLabel();
        BTNupdate = new javax.swing.JButton();
        LBrubrik = new javax.swing.JLabel();
        LBfelaktig = new java.awt.Label();
        TXTnewpass = new javax.swing.JTextField();
        TXTconpass = new javax.swing.JTextField();

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
        LBrubrik.setText("Byt lösenord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LBrubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNupdate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LBconfirmpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LBnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTnewpass)
                            .addComponent(TXTconpass, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                    .addComponent(LBfelaktig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LBrubrik)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBnewpass)
                    .addComponent(TXTnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBconfirmpass)
                    .addComponent(TXTconpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(BTNupdate)
                .addGap(18, 18, 18)
                .addComponent(LBfelaktig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metod från klassen "HjalpAttHamta" som ska returna AgentID.
    private String getAgentId(String agentNamn) {
        String idAgent = "";
        try {
            String fraga = "SELECT Agent_ID FROM Agent WHERE Namn = '" + agentNamn + "'";
            idAgent = idb.fetchSingle(fraga);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel med uppkopplingen till databasen");
            System.out.println(e.getMessage());
        }
        return idAgent;

    }
    
     //Metoden tar in värden från de två textfälten och kontrollerar att de nya lösenorden stämmer överens.
    //I If-satsen kontrolleras lösenorden med en validering som kollar att det nya lösenordet är inom ett visst antal tecken.
    private void BTNupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNupdateActionPerformed
        LBfelaktig.setText("");
        String losenord1 = TXTnewpass.getText();
        String losenord2 = TXTconpass.getText();
        String idAgent = "";
        getAgentId(idAgent);
        
        if (!Validering.kollaLosen(losenord1)){
            LBfelaktig.setText("Lösenordet får vara max 6 tecken!");
        } else if (!losenord1.equals (losenord2)){
            LBfelaktig.setText ("De inskrivna lösenorden stämmer inte överens.");
        } else {
            try {
                idb.update("UPDATE Agent SET Losenord = '" + losenord1 + "' WHERE Agent_ID = " + idAgent + "'");
                LBfelaktig.setText("Lösenordet har uppdaterats!");
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
