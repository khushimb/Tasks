package com.xworkz.inheritance.internal;

public class Report extends Document{

    public Report(){
        System.out.println("Running no arg const report");
    }

    @Override
    public void edit(){
        System.out.println("Running edit");
    }
    @Override
    public void write(){
        System.out.println("Running write");
    }
}
