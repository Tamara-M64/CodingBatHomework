package com.demoqa;

public class EveryNth {
    public String everyNth(String str, int n){
        String result = "";
        for (int j = 0; j < str.length(); j = j+n) {
            result = result + str.charAt(j);

        }
        return result;
    }

}
