package com.xworkz.inheritance.internal;

public class Rangerover extends LuxuryCar{
    public Rangerover(){
        System.out.println("Running no arg const Range rover");
    }

    @Override
    public void drive(){
        System.out.println("Running drive");
    }
    @Override
    public void park(){
        System.out.println("Running park");
    }
}
