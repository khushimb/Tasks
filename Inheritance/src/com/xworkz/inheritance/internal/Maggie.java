package com.xworkz.inheritance.internal;

public class Maggie extends Bad{
    public Maggie(){
        System.out.println("Running no arg const Maggie");
    }

    @Override
    public void cook(){
        System.out.println("Running cook");
    }
    @Override
    public void twomin(){
        System.out.println("Running twomin");
    }
}
