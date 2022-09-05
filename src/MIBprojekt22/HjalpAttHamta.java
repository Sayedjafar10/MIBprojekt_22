/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIBprojekt22;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Pia Vargas, Amanda Demir
 * 
 * En klass som hjälper att hämta primärnycklar som ett hjälpmedel.
 */
public class HjalpAttHamta {
    private InfDB idb;
    
    public HjalpAttHamta (InfDB idb){
        this.idb = idb;
    }
    
    //Hämtar AgentID
    public String getAgentId(String agentNamn) {
        String idAgent = "";
        try {

            String fraga = "SELECT Agent_ID FROM Agent WHERE Namn = '" + agentNamn + "'";
            idAgent = idb.fetchSingle(fraga);

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel med uppkopplingen till databasen");
            System.out.println(ettUndantag.getMessage());
        }
        return idAgent;

    }
    
    //Hämtar AlienID
    public String getAlienId(String Namn) {
        String alienId = "";
        try {
            String fraga = "SELECT Alien_ID FROM alien WHERE Namn = '" + Namn + "'";
            alienId = idb.fetchSingle(fraga);
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Gick inte att hämta alien id");
        }
        return alienId;
    }
}
