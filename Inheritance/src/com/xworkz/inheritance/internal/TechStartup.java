package com.xworkz.inheritance.internal;

public class TechStartup extends Company{
    public TechStartup(){
        System.out.println("Running no arg const tech start up");
    }

    @Override
    public void place(){
        System.out.println("Running place");
    }
    @Override
    public void campus(){
        System.out.println("Running campus");
    }
}
