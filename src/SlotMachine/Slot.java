/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlotMachine;

import java.util.Random;

/**
 *
 * @author magnus
 */
public class Slot {
    
    private String face = "Empty";
    private boolean locked = false;

    public Slot() {
        
    }
    
    public String spin() {
        //Apple = 3/6 chance
        //Banana = 2/6 chance
        //Star = 1/6 chance
        
        Random rnd = new Random();
        int randomNum = rnd.nextInt(6) + 1;
        
        switch(randomNum) {
            case 1: return "Apple";
            case 2: return "Apple";
            case 3: return "Apple";
            case 4: return "Banana";
            case 5: return "Banana";
            case 6: return "Star";
        }
        
        return "";
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
    
    
    
}
