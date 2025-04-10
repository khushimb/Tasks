package com.xworkz.ObjectToString.internal;

public class Label {
    private String text;
    private String color;
    private String size;

    public Label(String text, String color, String size) {
        this.text = text;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Text:" + text + " Color:" + color + " Size:" + size;
    }

    @Override
    public int hashCode() {
        return 32;
    }
}

