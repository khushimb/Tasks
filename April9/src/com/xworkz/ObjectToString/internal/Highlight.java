package com.xworkz.ObjectToString.internal;

public class Highlight {
    private String primary;
    private String secondary;
    private String accent;

    public Highlight(String primary, String secondary, String accent) {
        this.primary = primary;
        this.secondary = secondary;
        this.accent = accent;
    }

    @Override
    public String toString() {
        return "Primary:" + primary + " Secondary:" + secondary + " Accent:" + accent;
    }

    @Override
    public int hashCode() {
        return 26;
    }
}

