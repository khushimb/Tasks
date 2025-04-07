package com.xworkz.inheritance.internal;

public class Brown extends DressColor{
    public Brown(){
        System.out.println("Running no arg const brown");
    }
    @Override
    public void paint(){
        System.out.println("Running paint");
    }
    @Override
    public void wash(){
        System.out.println("Running wash");
    }
}
