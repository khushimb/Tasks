package com.xworkz.inheritance.internal;

public class Plant extends Tree{

    public Plant(){
        System.out.println("Running no arg const plant");
    }


@Override
    public void green(){
        System.out.println("Running green");
    }

    @Override
    public void dark(){
        System.out.println("Running dark");
    }
}


