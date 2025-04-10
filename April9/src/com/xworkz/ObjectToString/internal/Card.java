package com.xworkz.ObjectToString.internal;

public class Card {

    private String color;
    private int price;
    private String quality;

    public Card(String color,int price,String quality){
        this.color=color;
        this.price=price;
        this.quality=quality;

    }

    @Override
    public String toString(){
        return "Color:"+color+"Price:"+price+"Quality:"+quality;
    }

    @Override
    public int hashCode() {
        return 56;
    }
}
