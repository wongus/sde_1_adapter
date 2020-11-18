package com.hz;

import java.util.ArrayList;

public class Adapter {
    private ArrayList<String> positiveAnswers;

    // Constructor
    public Adapter () {
        this.positiveAnswers = new ArrayList<String>();
    }

    // Fixes compatibility issues between the other classes
    public boolean adapt (String answer) {
        boolean inArray = false;

        // Checks whether or not the string submitted by the user is in the array.
        for (String string : positiveAnswers) {
            if (string.matches(answer)){
                inArray = true;
            }
        }
        return inArray;
    }

    // pass array with the positive answers through
    public void addAnswers(ArrayList<String> newAnswers) {
        this.positiveAnswers.addAll(newAnswers);
    }
}