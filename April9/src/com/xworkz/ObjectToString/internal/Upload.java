package com.xworkz.ObjectToString.internal;

public class Upload {
    private String filename;
    private String size;
    private String status;

    public Upload(String filename, String size, String status) {
        this.filename = filename;
        this.size = size;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Filename:" + filename + " Size:" + size + " Status:" + status;
    }
}

