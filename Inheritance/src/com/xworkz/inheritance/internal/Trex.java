package com.xworkz.inheritance.internal;

public class Trex extends Dinosour{

    public Trex(){
        System.out.println("Running no arg const trex");
    }

    @Override
    public void walk(){
        System.out.println("Running walk");
    }
    @Override
    public void kill(){
        System.out.println("Running kill");
    }
}
