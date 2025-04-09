package com.xworkz.ObjectToString.internal;

public class Mode {
    private String name;
    private String status;
    private String type;

    public Mode(String name, String status, String type) {
        this.name = name;
        this.status = status;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Status:" + status + " Type:" + type;
    }
}

