package com.xworkz.ObjectToString.internal;

public class Checkout {

    private String time;
    private int price;
    private String place;

    public Checkout(String time, int price, String place) {
        this.time = time;
        this.price = price;
        this.place = place;

    }

    @Override
    public String toString() {
        return "Time:" + time + "Price:" + price + "Place:" + place;
    }

    @Override
    public int hashCode() {
        return 67;
    }
}