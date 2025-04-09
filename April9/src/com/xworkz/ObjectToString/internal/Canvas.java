package com.xworkz.ObjectToString.internal;

public class Canvas {

    private String color;
    private int price;
    private String quality;

    public Canvas(String color,int price,String quality){
        this.color=color;
        this.price=price;
        this.quality=quality;

    }

    @Override
    public String toString(){
        return "Color:"+color+"Price:"+price+"Quality:"+quality;
    }
}

