package com.demoqa;
public class Sleepin {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
