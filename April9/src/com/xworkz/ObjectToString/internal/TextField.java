package com.xworkz.ObjectToString.internal;

public class TextField {
    private String placeholder;
    private String value;
    private String type;

    public TextField(String placeholder, String value, String type) {
        this.placeholder = placeholder;
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Placeholder:" + placeholder + " Value:" + value + " Type:" + type;
    }
}

