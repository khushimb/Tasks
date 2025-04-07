package com.xworkz.inheritance.internal;

public class Pot extends Thing{
    public Pot(){
        System.out.println("Running no arg const Pot");
    }

    @Override
    public void sow(){
        System.out.println("Running sow");
    }
    @Override
    public void reap(){
        System.out.println("Running reap");
    }
}
