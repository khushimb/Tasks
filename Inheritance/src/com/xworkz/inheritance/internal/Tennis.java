package com.xworkz.inheritance.internal;

public class Tennis extends Sports{
    public Tennis(){
        System.out.println("Running no arg const tennis");
    }

    @Override
    public void play(){
        System.out.println("Running play");
    }
    @Override
    public void field(){
        System.out.println("Running field");
    }
}
