package com.xworkz.ObjectToString.internal;

public class Footer {
    private String simple;
    private String links;
    private String contact;

    public Footer(String simple, String links, String contact) {
        this.simple = simple;
        this.links = links;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Simple:" + simple + " Links:" + links + " Contact:" + contact;
    }

    @Override
    public int hashCode() {
        return 21;

    }
}

