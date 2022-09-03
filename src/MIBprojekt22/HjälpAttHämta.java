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
 * @author piava
 */
public class HjälpAttHämta {
    private InfDB idb;
    
    public HjälpAttHämta (InfDB idb){
        this.idb = idb;
    }
    
    public String getAgentId(String agentNamn) {
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
    
}
