package com.xworkz.inheritance.internal;

public class Coach extends Brand{
    public void luxury(Brand brand) {
        brand.sell();
        if (brand instanceof Coach) {
            Coach coach = (Coach) brand;
            coach.resell();
        }
    }
    public void resell(){
        System.out.println("Running resell in coach");
    }
}
