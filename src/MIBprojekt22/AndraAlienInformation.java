/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt22;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author piava, AmandaDemir
 */
public class AndraAlienInformation extends javax.swing.JFrame {

    private InfDB idb; 
    /**
     * Creates new form AndraAlienInformation
     */
    public AndraAlienInformation(InfDB idb) {
        initComponents();
        this.idb = idb;
        JComboBoxPlats.addItem("");
        JComboBoxPlats.addItem("Borås");
        JComboBoxPlats.addItem("Örebro");
        JComboBoxPlats.addItem("Västerås");
        JComboBoxPlats.addItem("Vilhemina");
        JComboBoxRas.addItem("");
        JComboBoxRas.addItem("Worm");
        JComboBoxRas.addItem("Squid");
        JComboBoxRas.addItem("Boglodite");
        fyllComboboxAlien();
        fyllComboboxAnsvarigAgent();
        fyllComboboxRas();
    }

   private void fyllComboboxAlien(){ 
    JComboBoxAlien.removeAllItems(); // Här tar vi bort värden i comboboxen
    String question = "SELECT Namn FROM Alien"; //Här hämtar vi namn från alien tabellen genom en SQL fråga
    
    ArrayList<String> Aliens ;
    try {
    Aliens = idb.fetchColumn(question);
    
    for(String alien: Aliens)
    {
      JComboBoxAlien.addItem(alien); //Här ska vi kunna lägga till en alien i arraylistan
    }
    }   catch (InfException ettUndantag) { //Här fångas systemet upp ifall problem skulle ske
            Logger.getLogger(AndraAlienInformation.class.getName()).log(Level.SEVERE, null, ettUndantag);
        }
    } 
    private void fyllComboboxAnsvarigAgent(){
    JComboBoxAgent.removeAllItems(); 
    JComboBoxAgent.addItem(""); 
    
    
    String question = "SELECT Namn FROM Agent WHERE Administrator='N'";
    ArrayList<String> agenter ;
    
    try {
        agenter = idb.fetchColumn(question);
        
        for(String agent: agenter)
        {
            JComboBoxAgent.addItem(agent);
        }
    } catch (InfException ettUndantag) {
            Logger.getLogger(AndraAlienInformation.class.getName()).log(Level.SEVERE, null, ettUndantag);
        }// Hindrar programmet från att kracha om try inte fungerar
}
   
    private void fyllComboboxRas(){
        JComboBoxRas.removeAllItems();
    String question = "SELECT * FROM Ras";
    
    ArrayList<String> Raser ;
    try {
    Raser = idb.fetchColumn(question);
    
    for(String Ras : Raser)
    {
      JComboBoxRas.addItem(Ras);
    }
    }   catch (InfException ettUndantag) {
            Logger.getLogger(AndraAlienInformation.class.getName()).log(Level.SEVERE, null, ettUndantag);
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

        JLRubrik = new java.awt.Label();
        JLAlien = new java.awt.Label();
        jJLNyttNamn = new java.awt.Label();
        JLNyttTelnr = new java.awt.Label();
        JLNyttAlienID = new java.awt.Label();
        JLNyAgent = new java.awt.Label();
        JLNyttLosen = new java.awt.Label();
        JLNyRas = new java.awt.Label();
        JComboBoxAlien = new javax.swing.JComboBox<>();
        JComboBoxPlats = new javax.swing.JComboBox<>();
        JComboBoxAgent = new javax.swing.JComboBox<>();
        JComboBoxRas = new javax.swing.JComboBox<>();
        TxtAlienID = new javax.swing.JTextField();
        TxtNyttNamn = new javax.swing.JTextField();
        TxtNyttLosen = new javax.swing.JTextField();
        TxtNyttTelnr = new javax.swing.JTextField();
        BtnAndra = new javax.swing.JButton();
        JLPlats = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLRubrik.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        JLRubrik.setText("Ändra information på Alien");

        JLAlien.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        JLAlien.setText("Välj Alien");

        jJLNyttNamn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jJLNyttNamn.setText("Nytt namn");

        JLNyttTelnr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        JLNyttTelnr.setText("Nytt tel.nmr");

        JLNyttAlienID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        JLNyttAlienID.setText("Nytt AlienID");

        JLNyAgent.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        JLNyAgent.setText("Ny ansvarig Agent");

        JLNyttLosen.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        JLNyttLosen.setText("Nytt lösenord");

        JLNyRas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        JLNyRas.setText("Ny ras");

        JComboBoxAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Bobbo", "Braxen" }));

        JComboBoxPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Borås", "Västerås", "Örebro", "Vilhelmina" }));

        JComboBoxAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4" }));

        JComboBoxRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Worm", "Squid", "Bogolite" }));

        BtnAndra.setText("Ändra");
        BtnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAndraActionPerformed(evt);
            }
        });

        JLPlats.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        JLPlats.setText("Ny Plats");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNyttTelnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLPlats))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JComboBoxPlats, 0, 107, Short.MAX_VALUE)
                            .addComponent(TxtNyttLosen)
                            .addComponent(TxtNyttTelnr)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNyAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNyRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JComboBoxAgent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JComboBoxRas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNyttAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jJLNyttNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JComboBoxAlien, 0, 107, Short.MAX_VALUE)
                            .addComponent(TxtAlienID)
                            .addComponent(TxtNyttNamn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAndra)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JComboBoxAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNyttAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jJLNyttNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNyttNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNyttTelnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNyttTelnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComboBoxPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLPlats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNyAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JComboBoxAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNyRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JComboBoxRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(BtnAndra)
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAndraActionPerformed
        // TODO add your handling code here:
        String alien = JComboBoxAlien.getSelectedItem().toString();
        String namn = String.valueOf(TxtNyttNamn.getText());
        String telnr = String.valueOf(TxtNyttTelnr.getText());
        String plats = JComboBoxPlats.getSelectedItem().toString();
        String agent= JComboBoxAgent.getSelectedItem().toString();
        String ras= JComboBoxRas.getSelectedItem().toString();
        String alienID = "";
        String losen = "";
        
        try {
            
            alienID = idb.fetchSingle("SELECT Alien_ID FROM Alien WHERE Namn ='"+alien+"'");
            
            if(namn.equals("")) //Här använder vi en if else sats, om inte if gäller så sker else satsen
            {  
                System.out.println("Namn har inte förnyats!");
            }
            else 
            {
                idb.update("UPDATE Alien SET Namn='"+namn+"' WHERE Alien_ID='"+alienID+"'");
                JOptionPane.showMessageDialog(null, "Namn har förnyats till "+namn+"!");
            }    
               
            if(telnr.equals("")) //Här använder vi en if else sats
            {  
                System.out.println("Telefonnumret har ej förnyats");
            }
            
            else 
            {
             idb.update("UPDATE Alien SET Telefon='"+telnr+"' WHERE Alien_ID='"+alienID+"'");
              JOptionPane.showMessageDialog(null, "Telefonnummer har förnyats till "+telnr+"!");
            }
        
            if(plats.equals("")) //Här använder vi en if else sats
            {
                System.out.println("Plats har inte förnyats!");  
            } 
            else 
            {
                String Plats = idb.fetchSingle("SELECT Plats_ID FROM Plats WHERE Benamning='"+plats+"'");
                idb.update("UPDATE Alien SET Plats='"+plats+"' WHERE Alien_ID='"+alienID+"'");
                JOptionPane.showMessageDialog(null, "Plats har förnyats till "+plats+"!");
            }
            
            if(agent.equals("")) //Här använder vi en if else sats
            {
                System.out.println("Agent har inte förnyats!");  
            } 
            else 
            {
                String Agent = idb.fetchSingle("SELECT Agent_ID FROM Agent WHERE Namn='"+agent+"'");
                idb.update("UPDATE Alien SET Ansvarig_Agent='"+agent+"' WHERE Alien_ID='"+alienID+"'");
                JOptionPane.showMessageDialog(null, "Agent har förnyats till "+agent+"!");
            }
            
            if(ras.equals("")) //Här använder vi en if else sats
            {
                System.out.println("Ras har inte förnyats!");  
            } 
            
            if(ras.equals("Squid"))
            {
                idb.insert("INSERT INTO Squid VALUES("+alienID+")");// Vi lägger in squid som ras med inskrivna alienID
                idb.delete("DELETE FROM Boglodite WHERE Alien_ID="+alienID+"");//Här tar vi bort kopplingen mellan boglodite och inskriva alienID
                idb.delete("DELETE FROM Worm WHERE Alien_ID="+alienID+"");//Här tar vi bort kopplingen mellan worm och det inskriva alienID
                JOptionPane.showMessageDialog(null, "Ras har förnyats till "+ras+"!");//Här är ett meddelande
            }
            
            if(ras.equals("Boglodite"))
            {
                idb.insert("INSERT INTO Boglodite VALUES("+alienID+")");//Här lägger vi in boglodite som ras till alienID 
                idb.delete("DELETE FROM Squid WHERE Alien_ID="+alienID+"");//Här tar vi bort squid som val som ras till alienID
                idb.delete("DELETE FROM Worm WHERE Alien_ID="+alienID+"");//Här tar vi bort worm som val som ras till alienID eftersom ras ska equal boglodite
                JOptionPane.showMessageDialog(null, "Ras har förnyats "+ras+"!");
            }
            
            if(ras.equals("Worm"))
            {
                idb.insert("INSERT INTO Worm VALUES("+alienID+")");//Samma sak här, vi lägger in worm som value till alienID
                idb.delete("DELETE FROM Boglodite WHERE Alien_ID="+alienID+"");//Här tar vi bort boglodite
                idb.delete("DELETE FROM Squid WHERE Alien_ID="+alienID+"");//Här tar vi bort squid eftersom ras ska equal worm
                JOptionPane.showMessageDialog(null, "Ras har förnyats till "+ras+"!");
            }
                   
        } catch (InfException ettUndantag) { //
            Logger.getLogger(AndraAlienInformation.class.getName()).log(Level.SEVERE, null, ettUndantag);
        } 
            

    }//GEN-LAST:event_BtnAndraActionPerformed

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
            java.util.logging.Logger.getLogger(AndraAlienInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraAlienInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraAlienInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraAlienInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraAlienInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAndra;
    private javax.swing.JComboBox<String> JComboBoxAgent;
    private javax.swing.JComboBox<String> JComboBoxAlien;
    private javax.swing.JComboBox<String> JComboBoxPlats;
    private javax.swing.JComboBox<String> JComboBoxRas;
    private java.awt.Label JLAlien;
    private java.awt.Label JLNyAgent;
    private java.awt.Label JLNyRas;
    private java.awt.Label JLNyttAlienID;
    private java.awt.Label JLNyttLosen;
    private java.awt.Label JLNyttTelnr;
    private javax.swing.JLabel JLPlats;
    private java.awt.Label JLRubrik;
    private javax.swing.JTextField TxtAlienID;
    private javax.swing.JTextField TxtNyttLosen;
    private javax.swing.JTextField TxtNyttNamn;
    private javax.swing.JTextField TxtNyttTelnr;
    private java.awt.Label jJLNyttNamn;
    // End of variables declaration//GEN-END:variables
}
