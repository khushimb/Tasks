package com.xworkz.ObjectToString.internal;

public class Quote {
    private String text;
    private String author;
    private String category;

    public Quote(String text, String author, String category) {
        this.text = text;
        this.author = author;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Text:" + text + " Author:" + author + " Category:" + category;
    }

    @Override
    public int hashCode() {
        return 44;
    }
}

