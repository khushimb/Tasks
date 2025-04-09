package com.xworkz.ObjectToString.internal;

public class Menu {
    private String title;
    private String items;
    private String type;

    public Menu(String title, String items, String type) {
        this.title = title;
        this.items = items;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Title:" + title + " Items:" + items + " Type:" + type;
    }
}
