package com.xworkz.ObjectToString.internal;

public class Text {
    private String content;
    private String font;
    private String color;

    public Text(String content, String font, String color) {
        this.content = content;
        this.font = font;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Content:" + content + " Font:" + font + " Color:" + color;
    }
}

