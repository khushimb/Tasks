package com.xworkz.ObjectToString.internal;
public class List {
    private String ordered;
    private String unordered;
    private String type;

    public List(String ordered, String unordered, String type) {
        this.ordered = ordered;
        this.unordered = unordered;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ordered:" + ordered + " Unordered:" + unordered + " Type:" + type;
    }
}

