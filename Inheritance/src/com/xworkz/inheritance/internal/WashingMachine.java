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
    public void dry1(){
        System.out.println("ruuning dry1");
    }
    public void dry2(){
        System.out.println("ruuning dry2");
    }
    public void dry3(){
        System.out.println("ruuning dry3");
    }


}
