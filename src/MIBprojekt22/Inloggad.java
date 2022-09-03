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
    private static String anvandarID;

    public Inloggad (String anvandarID) {
        this.anvandarID = anvandarID;
    }
   
    public static String getInloggadID() {
       return anvandarID;
    }
        
}

