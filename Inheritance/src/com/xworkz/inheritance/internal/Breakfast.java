package com.xworkz.inheritance.internal;

public class Breakfast extends Meal{

    public Breakfast(){
        System.out.println("Running no arg const breakfast");
    }
    @Override
    public void eat(){
        System.out.println("Running eat");
    }
    @Override
    public void cook(){
        System.out.println("Running cook");
    }
}
