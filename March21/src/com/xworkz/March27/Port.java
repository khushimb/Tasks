package com.xworkz.March27;

public class Port {

    private String location;
    private int price;

    public void travel(String location,int price){
        this.location=location;
        this.price=price;
        System.out.println("Running location in travel method of Port class :"+location);
        System.out.println("Running price in travel method of Port class :"+price);
    }
}
