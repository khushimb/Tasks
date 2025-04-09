package com.xworkz.ObjectToString.internal;

public class Step {
    private String number;
    private String label;
    private String completed;

    public Step(String number, String label, String completed) {
        this.number = number;
        this.label = label;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Number:" + number + " Label:" + label + " Completed:" + completed;
    }
}

