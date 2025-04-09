package com.xworkz.ObjectToString.internal;

public class Title {
    private String text;
    private String level;
    private String alignment;

    public Title(String text, String level, String alignment) {
        this.text = text;
        this.level = level;
        this.alignment = alignment;
    }

    @Override
    public String toString() {
        return "Text:" + text + " Level:" + level + " Alignment:" + alignment;
    }
}

