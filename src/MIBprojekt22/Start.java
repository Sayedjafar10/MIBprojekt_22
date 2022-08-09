package MIBprojekt22;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * @author piava
 */

public class Start {
        
        private static InfDB idb;
        
        public static void main (String[] args) throws InfException {
            
            try {
                idb = new InfDB ("mibdb", "3306", "mibdba", "mibkey");
            
            } catch (InfException ettUndantag) {
               JOptionPane.showMessageDialog(null, "Något har gått fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }       
            
            new LoggaIn(idb).setVisible(true);
            }
        }



