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
    public void serve(){
        System.out.println("Running serve");
    }
    public void decor(){
        System.out.println("Running decor");
    }
    public void prepare(){
        System.out.println("Running prepare");
    }

}
