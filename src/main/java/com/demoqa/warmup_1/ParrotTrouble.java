package com.demoqa.warmup_1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean tolking, int hour){
        if(tolking && (hour<7 || hour>20)){
            return true;
        }
        return false;
    }


}
