package com.xworkz.ObjectToString.internal;

public class Container {

    private char size ;
    private int price;
    private String brand;

    public Container(char size, int price, String brand) {
        this.size = size;
        this.price = price;
        this.brand = brand;

    }

    @Override
    public String toString() {
        return "Size:" + size + "Price:" + price + "Brand:" + brand;
    }

    @Override
    public int hashCode() {
        return 37;
    }
}
