package com.xworkz.ObjectToString.internal;

public class Image {
    private String src;
    private String alt;
    private String format;

    public Image(String src, String alt, String format) {
        this.src = src;
        this.alt = alt;
        this.format = format;
    }

    @Override
    public String toString() {
        return "Src:" + src + " Alt:" + alt + " Format:" + format;
    }

    @Override
    public int hashCode() {
        return 28;
    }
}

