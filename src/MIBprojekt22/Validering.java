package MIBprojekt22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author Pia Vargas, Amanda Demir
 * 
 * Valideringsklass
 * 
 */
public class Validering {
    
    private static InfDB idb;

    static boolean kollaLosen(JTextField Txtlosen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Validering (InfDB idb){
        this.idb = idb;
    }
    
    
    //Validering som kontrollerar att varje ruta är ifylld. Ingen tom rutan accepteras.
    public static boolean tomRuta (JTextField checkaRuta)
    {
        boolean resultat = true;
        
        if (checkaRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rutan är tom!");
            resultat = false;
        }
        
        return resultat;
    }
     
    //Validering som kontrollerar att lösenordet är inom en viss gräns.
    public static boolean kollaLosen(String losen){
       boolean resultat = false;
       
       if(losen.length() >= 4 && losen.length() <= 6) {
           resultat = true;
       }
       return resultat;
   }
    
    //Validering som kontrollerar att ett rätt datumformat används.
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
    
    //Validering som kontrollerar att rutan innehåller ett heltal.
    public boolean kollaNummer(String rutacheck){
        boolean svar = true;
        
        try{
            Integer.parseInt(rutacheck);
        } catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Ange ett heltal.");
            svar = false;
        }
        
        return svar;
    }
    
    //Validering som kontrollerar att ett korrekt Agent-namn anges där Agent är aktuellt. 
    public static boolean AgentNamn(JTextField rutaCheck){
        String ruta = rutaCheck.getText();
        if (ruta.startsWith("Agent")) {
            return true;    
            }
        else{
            JOptionPane.showMessageDialog(null, "Vänligen ange ett korrekt Agent-namn.");
             
                return false;
        }
    }
}
