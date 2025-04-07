package com.xworkz.inheritance.internal;

public class Sky extends Beautiful{
    public Sky(){
        System.out.println("Running no arg const Sky");
    }

    @Override
    public void fall(){
        System.out.println("Running fall");
    }
    @Override
    public void rain(){
        System.out.println("Running rain");
    }
}
