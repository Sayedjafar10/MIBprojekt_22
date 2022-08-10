package MIBprojekt22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;


/**
 *
 * @author piava
 */
public class Validering {
    
    public static boolean tomRuta (JTextField checkaRuta)
    {
        boolean resultat = false;
        
        if (checkaRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rutan är tom!");
            resultat = true;
        }
        
        return resultat;
    }
    
    public static boolean kollaLosen(JTextField checkaLosen){
        
    boolean resultat = false;

    if(checkaLosen.getText().length() > 8 || checkaLosen.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Lösenordet får max vara 8 tecken!");
        resultat = true;
        checkaLosen.requestFocus();
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
            JOptionPane.showMessageDialog(null, "Skriv in rätt datumformat YYYY-MM-DD");
            checkaDatum.requestFocus();
            return false;
             
        }
        
        return resultat;
}
}