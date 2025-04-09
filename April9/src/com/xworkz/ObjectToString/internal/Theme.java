package com.xworkz.ObjectToString.internal;

public class Theme {
    private String name;
    private String mode;
    private String primaryColor;

    public Theme(String name, String mode, String primaryColor) {
        this.name = name;
        this.mode = mode;
        this.primaryColor = primaryColor;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Mode:" + mode + " PrimaryColor:" + primaryColor;
    }
}

