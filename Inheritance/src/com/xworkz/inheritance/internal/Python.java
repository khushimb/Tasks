package com.xworkz.inheritance.internal;

public class Python extends Language{

    public Python(){
        System.out.println("Running no arg const Python");
    }

    @Override
    public void study(){
        System.out.println("Running study");
    }
    @Override
    public void write(){
        System.out.println("Running write");
    }
}
