package com.xworkz.ObjectToString.internal;

public class Widget {
    private String id;
    private String type;
    private String config;

    public Widget(String id, String type, String config) {
        this.id = id;
        this.type = type;
        this.config = config;
    }

    @Override
    public String toString() {
        return "ID:" + id + " Type:" + type + " Config:" + config;
    }
}

