package com.demoqa.string1;

public class Right2 {
    public String right2(String str){
        String firstTwo = str.substring(str.length()-2);
        String rest = str.substring(0, str.length()-2);
        return firstTwo + rest;
    }

}
