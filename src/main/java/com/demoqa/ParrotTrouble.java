package com.demoqa;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean tolking, int hour){
        if(tolking && (hour<7 || hour>20)){
            return true;
        }
        return false;
    }


}
