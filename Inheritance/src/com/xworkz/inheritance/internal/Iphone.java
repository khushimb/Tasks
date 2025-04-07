package com.xworkz.inheritance.internal;

public class Iphone extends Mobile{
    public Iphone(){
        System.out.println("Running no arg const iphone");
    }

    @Override
    public void operate(){
        System.out.println("Running operate");
    }
    @Override
    public void switchoff(){
        System.out.println("Running switch off");
    }
}
