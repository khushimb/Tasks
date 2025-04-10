package com.xworkz.ObjectToString.internal;

public class Tabbar {
    private String style;
    private String items;
    private String position;

    public Tabbar(String style, String items, String position) {
        this.style = style;
        this.items = items;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Style:" + style + " Items:" + items + " Position:" + position;
    }

    @Override
    public int hashCode() {
        return 79;
    }
}

