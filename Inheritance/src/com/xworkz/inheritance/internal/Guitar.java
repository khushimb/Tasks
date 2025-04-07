package com.xworkz.inheritance.internal;

public class Guitar extends Instrument{
    public Guitar(){
        System.out.println("Running no arg const guitar");
    }

    @Override
    public void play(){
        System.out.println("Running play");
    }
    @Override
    public void stop(){
        System.out.println("Running stop");
    }
}
