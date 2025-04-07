package com.xworkz.inheritance.internal;

public class Legoset extends Toys{
    public Legoset(){
        System.out.println("Running no arg const legoset ");
    }

    @Override
    public void play(){
        System.out.println("Running play");
    }
    @Override
    public void build(){
        System.out.println("Running build");
    }



}
