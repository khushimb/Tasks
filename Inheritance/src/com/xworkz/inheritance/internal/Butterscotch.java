package com.xworkz.inheritance.internal;

public class Butterscotch extends IceCream {
    public Butterscotch(){
        System.out.println("Running no arg const butter scotch");
    }

    @Override
    public void eat(){
        System.out.println("Running eat");
    }
    @Override
    public void spill(){
        System.out.println("Running spill");
    }
}
