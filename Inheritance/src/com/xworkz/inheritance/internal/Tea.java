package com.xworkz.inheritance.internal;

public class Tea extends Drink{

    public Tea(){
        System.out.println("Running no arg const tea");
    }

    @Override
    public void drinkTea(){
        System.out.println("Running drink tea");
    }
    @Override
    public void spillTea(){
        System.out.println("Running spill tea");
    }
}
