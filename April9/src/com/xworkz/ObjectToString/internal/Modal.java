package com.xworkz.ObjectToString.internal;

public class Modal {
    private String header;
    private String body;
    private String footer;

    public Modal(String header, String body, String footer) {
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "Header:" + header + " Body:" + body + " Footer:" + footer;
    }
}

