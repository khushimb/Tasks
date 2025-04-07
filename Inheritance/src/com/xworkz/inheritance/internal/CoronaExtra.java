package com.xworkz.inheritance.internal;

public class CoronaExtra extends Beer{
    public CoronaExtra(){
        System.out.println("Running no arg const corona extra");
    }

    @Override
    public void drink(){
        System.out.println("running drink");
    }
    @Override
    public void chug(){
        System.out.println("running chug");
    }
}
