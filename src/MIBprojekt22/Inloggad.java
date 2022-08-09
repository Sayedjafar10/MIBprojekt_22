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
    private InfDB idb;
    private static String valdAnvandare;
    private static String anvandare;
    private static String losenord;
    private boolean loggedAcc;
    
    
    public Inloggad (InfDB idb, String vald, String userID, String password){
            this.idb = idb;
            this.valdAnvandare = vald;
            this.anvandare = userID;
            this.losenord = password;
            this.loggedAcc = false;
            loginUser();
    }
     
    private void loginUser(){
        switch (valdAnvandare){
            case "Agent":
                loginAgent();
                break;
            case "Alien":
                loginAlien();
                break;
        }
        
        
    
        
    }
            
        
            
            
    
    
    
          
    
    
}
}
