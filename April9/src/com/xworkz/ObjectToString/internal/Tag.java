package com.xworkz.ObjectToString.internal;

public class Tag {
    private String name;
    private String color;
    private String icon;

    public Tag(String name, String color, String icon) {
        this.name = name;
        this.color = color;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Color:" + color + " Icon:" + icon;
    }

    @Override
    public int hashCode() {
        return 54;
    }
}

