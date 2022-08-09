package MIBprojekt22;

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
            JOptionPane.showMessageDialog(null, "Ett tomt inmatningsfält har hittats!");
            resultat = true;
        }
        
        return resultat;
    }
}