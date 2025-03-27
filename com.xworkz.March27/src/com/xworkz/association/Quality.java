package com.xworkz.association;

public class Quality {

    private String color;
    private int price;

    public Quality(String color,int price){
        this.color=color;
        this.price=price;
        System.out.println("Running quality const");
    }

    public void showQuality(){
        System.out.println("Running method show quality");
    }
}
