package com.xworkz.ObjectToString.internal;

public class CheckBox {

    private int size;
    private int price;
    private String ticked;

    public CheckBox(int size, int price, String ticked) {
        this.size = size;
        this.price = price;
        this.ticked = ticked;

    }

    @Override
    public String toString() {
        return "Size:" + size + "Price:" + price + "ticked:" + ticked;
    }

    @Override
    public int hashCode() {
        return 82;
    }
}
