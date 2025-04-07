package com.xworkz.inheritance.internal;

public class Fridge extends Appliance{

    public Fridge(){
        System.out.println("Running no arg const fridge");
    }

    @Override
    public void on(){
        System.out.println("Running on");
    }
    @Override
    public void off(){
        System.out.println("Running off");
    }


}
