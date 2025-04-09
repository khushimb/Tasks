package com.xworkz.ObjectToString.internal;

public class Input {
    private String type;
    private String placeholder;
    private String value;

    public Input(String type, String placeholder, String value) {
        this.type = type;
        this.placeholder = placeholder;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Type:" + type + " Placeholder:" + placeholder + " Value:" + value;
    }
}

