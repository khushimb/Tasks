package com.xworkz.ObjectToString.internal;

public class Box {

    private String color;
    private int counts;
    private char size;

    public Box(String color,int counts,char size){
        this.color=color;
        this.counts=counts;
        this.size=size;

    }

    @Override
    public String toString(){
        return "Color:"+color+"Counts:"+counts+"Size:"+size;
    }
}


