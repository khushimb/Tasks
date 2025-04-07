package com.xworkz.inheritance.internal;

public class Cold extends Disease{
    public Cold(){
        System.out.println("Running no arg const cold");
    }

    @Override
    public void takeTablet() {
        System.out.println("Running take tablet");
    }
    @Override
    public void takeSyrup() {
        System.out.println("Running take syrup");
    }
}
