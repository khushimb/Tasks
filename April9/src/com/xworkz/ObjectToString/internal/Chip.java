package com.xworkz.ObjectToString.internal;

public class Chip {

    private String color;
    private int price;
    private String brand;

    public Chip(String color, int price, String brand) {
        this.color = color;
        this.price = price;
        this.brand = brand;

    }

    @Override
    public String toString() {
        return "Color:" + color + "Price:" + price + "Brand:" + brand;
    }

    @Override
    public int hashCode() {
        return 40;
    }
}
