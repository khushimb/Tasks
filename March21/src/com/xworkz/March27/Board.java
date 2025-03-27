package com.xworkz.March27;

public class Board {

    private int price;
    private String color;

    public void write(int price, String color) {
        this.price = price;
        this.color = color;
        System.out.println("Running price in method write in class in Board :" + price);
        System.out.println("Running color in method write in class in Board :" + color);

    }
}
