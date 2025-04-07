package com.xworkz.inheritance.internal;

public class Plastic extends Material{

    public Plastic(){
        System.out.println("Running no arg const plastic");
    }

    @Override
    public void soft(){
        System.out.println("Running soft");
    }
    @Override
    public void hard(){
        System.out.println("Running hard");
    }
}
