package com.xworkz.inheritance.internal;

public class Shark extends Fish{

    public Shark(){
        System.out.println("Running no arg const shark");
    }

    @Override
    public void swim(){
        System.out.println("Running swim");
    }

    @Override
    public void swim1(){
        System.out.println("Running swim1");
    }
}
