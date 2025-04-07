package com.xworkz.inheritance.internal;

public class OperatingSys extends Software{

    public OperatingSys(){
        System.out.println("Running no arg const os");
    }

    @Override
    public void run(){
        System.out.println("Running run");
    }
    @Override
    public void stop(){
        System.out.println("Running stop");
    }
}
