package MIBprojekt22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author piava, AmandaDemir
 */
public class Validering {
    
    private static InfDB idb;

    static boolean kollaLosen(JTextField Txtlosen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Validering (InfDB idb){
        this.idb = idb;
    }
    
    public static boolean tomRuta (JTextField checkaRuta)
    {
        boolean resultat = false;
        
        if (checkaRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rutan är tom!");
            resultat = true;
        }
        
        return resultat;
    }
    
    public static boolean IsItAdmin (String id){
        
        boolean admin = false;
        String isAdmin = "";
        try {
            isAdmin = idb.fetchSingle("SELECT Agent.Administrator FROM Agent WHERE Agent_ID = '" + id + "'");
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog (null, "Något har gått fel!");
        }
        
        if (isAdmin.equals("N")){
            admin = true;
        }
        return admin;
    }

    public static boolean kollaLosen(String losen){
        
    boolean resultat = false;

    if(losen.length() >= 8 && losen.length() <= 9) {
        JOptionPane.showMessageDialog(null, "Lösenordet får max vara 8 tecken!");
        resultat = true;
    }
    return resultat;
    }
    
    public static boolean kollaDatum(JTextField checkaDatum) {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
         boolean resultat = false;
         String date = checkaDatum.getText();
        try {
           
           dateFormat.parse(date);
           resultat = true;
           
           
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Rätt datumformat krävs YYYY-MM-DD");
            checkaDatum.requestFocus();
            return false;
             
        }
        
        return resultat;
}
    public static boolean tomText(JTextField checkaRutan){
        boolean resultat = false;
        
        String ruta = checkaRutan.getText();
        if(ruta.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Fyll i rutan.");
            resultat = true;
            checkaRutan.requestFocus(); 
        }
        
        return resultat;
}
}
