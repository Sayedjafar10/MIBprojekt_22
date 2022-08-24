/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIBprojekt22;


/**
 *
 * @author piava
 */
public class Inloggad {
    private static String anvandareID;
    private static boolean isAdmin;

    public Inloggad (String anvandareID, boolean isAdmin) {
        
        this.anvandareID = anvandareID;
        this.isAdmin = isAdmin;
    }
   
    public static String getInloggadID() {
       return anvandareID;
    }
        
}

