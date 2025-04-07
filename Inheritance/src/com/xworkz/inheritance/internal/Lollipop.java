package com.xworkz.inheritance.internal;

public class Lollipop extends Candy{
    public Lollipop(){
        System.out.println("Running no arg const lollipop");
    }

    @Override
    public void sip(){
        System.out.println("Running sip");
    }
    @Override
    public void melt(){
        System.out.println("Running melt");
    }

}
