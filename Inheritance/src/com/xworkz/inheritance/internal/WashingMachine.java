package com.xworkz.inheritance.internal;

public class WashingMachine extends Machine{
    public WashingMachine(){
        System.out.println("Running no arg const washing machine");
    }

    @Override
    public void wash(){
        System.out.println("ruuning wash");
    }
    @Override
    public void dry(){
        System.out.println("ruuning dry");
    }

}
