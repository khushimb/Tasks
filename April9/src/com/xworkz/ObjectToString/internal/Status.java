package com.xworkz.ObjectToString.internal;

public class Status {
    private String code;
    private String message;
    private String type;

    public Status(String code, String message, String type) {
        this.code = code;
        this.message = message;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Code:" + code + " Message:" + message + " Type:" + type;
    }
}

