package com.xworkz.inheritance.internal;

public class Mango extends Flavour{
    public Mango(){
        System.out.println("Running no arg const mango");
    }

    @Override
    public void eat(){
        System.out.println("Running eat");
    }
    @Override
    public void melt(){
        System.out.println("Running melt");
    }
}
