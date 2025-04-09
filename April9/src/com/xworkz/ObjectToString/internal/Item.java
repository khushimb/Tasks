package com.xworkz.ObjectToString.internal;

public class Item {
    private String id;
    private String name;
    private String price;

    public Item(String id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID:" + id + " Name:" + name + " Price:" + price;
    }
}

