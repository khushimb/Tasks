package com.xworkz.ObjectToString.internal;

public class Hook {
    private String before;
    private String after;
    private String error;

    public Hook(String before, String after, String error) {
        this.before = before;
        this.after = after;
        this.error = error;
    }

    @Override
    public String toString() {
        return "Before:" + before + " After:" + after + " Error:" + error;
    }

    @Override
    public int hashCode() {
        return 27;
    }
}

