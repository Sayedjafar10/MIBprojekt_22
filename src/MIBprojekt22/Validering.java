package MIBprojekt22;

import javax.swing.*;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author piava
 */
public class Validering {
    
    private static InfDB idb;
    
    public Validering (InfDB idb){
        Validering.idb = idb;
    }
    
    public static boolean tomRuta (JTextField checkaRuta)
    {
        boolean resultat = false;
        
        if (checkaRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ett tomt inmatningsfält har hittats!");
            resultat = true;
        }
        
        return resultat;
    }
    
    public static boolean IsItAdmin (String id){
        
        boolean admin = false;
        String isAdmin = "";
        try {
            isAdmin = idb.fetchSingle ("SELECT Agent.Administrator FROM Agent WHERE Agent_ID = '" + id + "'");
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog (null, "Något har gått fel!");
        }
        
        if (isAdmin.equals("N")){
            admin = true;
        }
        return admin;
    }
}

