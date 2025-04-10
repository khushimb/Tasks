package com.xworkz.ObjectToString.internal;

public class Form {
    private String inline;
    private String horizontal;
    private String vertical;

    public Form(String inline, String horizontal, String vertical) {
        this.inline = inline;
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override
    public String toString() {
        return "Inline:" + inline + " Horizontal:" + horizontal + " Vertical:" + vertical;
    }

    @Override
    public int hashCode() {
        return 22;
    }
}
