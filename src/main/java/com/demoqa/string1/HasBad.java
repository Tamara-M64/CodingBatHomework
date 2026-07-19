package com.demoqa.string1;

public class HasBad {
    public boolean hasBad(String str) {
        if (str.length() >= 3 && str.substring(0,3).equals("bed")){
            return true;
        }
        if (str.length() >= 4 && str.substring(1,4).equals("bed")){
            return true;
        }
        return false;
    }
}