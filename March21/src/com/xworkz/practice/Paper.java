package com.xworkz.practice;

public class Paper {

    public int price;
    String color;
    private String quality;


    void check(){
        this.price = 100;
        System.out.println("Running Check in paper");
    }
    void open(){
        this.color=color;
        System.out.println("Running open in paper");
    }
    void print(){
        this.quality=quality;
        System.out.println("Running print in paper");
    }
}
