package com.xworkz.inheritance.internal;

public class India extends Country{
    public India(){
        System.out.println("Running no arg const India");
    }

    @Override
    public void state(){
        System.out.println("Running state");
    }
    @Override
    public void people(){
        System.out.println("Running people");
    }
}
