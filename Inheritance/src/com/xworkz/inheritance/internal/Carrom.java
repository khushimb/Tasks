package com.xworkz.inheritance.internal;

public class Carrom extends Games{
    public Carrom(){
        System.out.println("Running no arg const carrom");
    }

    @Override
    public void play(){
        System.out.println("Running play");
    }
    @Override
    public void turn(){
        System.out.println("Running turn");
    }
}
