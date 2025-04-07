package com.xworkz.inheritance.internal;

public class Bulb extends Light {
    public Bulb(){
        System.out.println("Running no arg const Bulb");
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
