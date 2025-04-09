package com.xworkz.ObjectToString.internal;

public class Switch {
    private String state;
    private String label;
    private String type;

    public Switch(String state, String label, String type) {
        this.state = state;
        this.label = label;
        this.type = type;
    }

    @Override
    public String toString() {
        return "State:" + state + " Label:" + label + " Type:" + type;
    }
}

