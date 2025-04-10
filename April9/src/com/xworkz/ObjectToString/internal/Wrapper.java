package com.xworkz.ObjectToString.internal;

public class Wrapper {
    private String className;
    private String width;
    private String height;

    public Wrapper(String className, String width, String height) {
        this.className = className;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "ClassName:" + className + " Width:" + width + " Height:" + height;
    }

    @Override
    public int hashCode() {
        return 101;
    }
}

