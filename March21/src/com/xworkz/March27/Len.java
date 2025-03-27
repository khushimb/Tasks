package com.xworkz.March27;

import javafx.scene.paint.Color;

public class Len {

    private String color;
    private int price;

    public void watch(String color,int price){
        this.color=color;
        this.price=price;
        System.out.println("Running watch in lens :"+color);
        System.out.println("Running watch in lens :"+price);
    }
}
