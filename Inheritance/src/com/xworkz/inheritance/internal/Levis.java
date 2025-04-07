package com.xworkz.inheritance.internal;

public class Levis extends TshirtBrand{
    public Levis(){
        System.out.println("Running no arg const levis");
    }

    @Override
    public void wearIt(){
        System.out.println("Running wear it");
    }
    @Override
    public void wearOff(){
        System.out.println("Running wear off");
    }

}
