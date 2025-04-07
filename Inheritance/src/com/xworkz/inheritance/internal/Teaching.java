package com.xworkz.inheritance.internal;

public class Teaching extends Profession{

    public Teaching(){
        System.out.println("Running no arg const teaching");
    }

    @Override
    public void teach(){
        System.out.println("Running teach");
    }
    @Override
    public void beat(){
        System.out.println("Running beat");
    }
}
