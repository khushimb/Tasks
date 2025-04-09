package com.xworkz.ObjectToString.internal;

public class ToolBar {
    private String items;
    private String position;
    private String background;

    public ToolBar(String items, String position, String background) {
        this.items = items;
        this.position = position;
        this.background = background;
    }

    @Override
    public String toString() {
        return "Items:" + items + " Position:" + position + " Background:" + background;
    }
}

