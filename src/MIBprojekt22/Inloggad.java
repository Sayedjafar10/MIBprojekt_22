/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIBprojekt22;

import oru.inf.InfDB;


/**
 *
 * @author piava
 */
public class Inloggad {
    private static String anvandareID;
    private static boolean IsItAdmin;

    public Inloggad (String anvandarID, boolean IsItAdmin) {
        
        this.anvandareID = anvandarID;
        this.IsItAdmin = IsItAdmin;
    }
   
    public static String getInloggadID() {
       return anvandareID;
    }
        
}

