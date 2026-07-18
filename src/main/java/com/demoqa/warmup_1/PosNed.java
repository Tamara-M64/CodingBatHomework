package com.demoqa.warmup_1;

public class PosNed {
    public boolean posNeg ( int a, int b, boolean negative){
        if (negative){
            return (a <0 && b < 0);
        }else {
            return (a <0 && b > 0) || (a > 0 && b < 0);
        }
    }

}
