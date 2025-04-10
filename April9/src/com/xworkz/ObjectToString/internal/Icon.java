package com.xworkz.ObjectToString.internal;

public class Icon {
    private String name;
    private String size;
    private String color;

    public Icon(String name, String size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Size:" + size + " Color:" + color;
    }

    @Override
    public int hashCode() {
        return 27;
    }
}

