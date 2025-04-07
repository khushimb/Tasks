package com.xworkz.inheritance.internal;

public class Snapchat extends Camera{
    public Snapchat(){
        System.out.println("Running no arg const snapchat");
    }

    @Override
    public void click(){
        System.out.println("Running click");
    }
    @Override
    public void filter(){
        System.out.println("Running filter");
    }
}
