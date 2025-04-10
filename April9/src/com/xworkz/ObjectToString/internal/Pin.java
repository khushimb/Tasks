package com.xworkz.ObjectToString.internal;

public class Pin {
    private String code;
    private String type;
    private String status;

    public Pin(String code, String type, String status) {
        this.code = code;
        this.type = type;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Code:" + code + " Type:" + type + " Status:" + status;
    }

    @Override
    public int hashCode() {
        return 45;
    }
}

