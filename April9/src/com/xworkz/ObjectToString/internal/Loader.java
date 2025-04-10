package com.xworkz.ObjectToString.internal;

public class Loader {
    private String type;
    private String duration;
    private String color;

    public Loader(String type, String duration, String color) {
        this.type = type;
        this.duration = duration;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Type:" + type + " Duration:" + duration + " Color:" + color;
    }

    @Override
    public int hashCode() {
        return 35;
    }
}

