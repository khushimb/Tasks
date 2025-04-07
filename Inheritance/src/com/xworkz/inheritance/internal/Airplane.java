package com.xworkz.inheritance.internal;

public class Airplane extends Transport{
    public Airplane(){
        System.out.println("Running no arg const airplane");
    }

    @Override
    public void travel(){
        System.out.println("Running travel");
    }
    @Override
    public void ticket(){
        System.out.println("Running ticket");
    }
}
