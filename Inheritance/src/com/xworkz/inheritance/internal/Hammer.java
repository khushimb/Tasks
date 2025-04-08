package com.xworkz.inheritance.internal;

public class Hammer extends Tool{

    public Hammer(){
        System.out.println("Running no arg const hammer");
    }


@Override
    public void screw(){
        System.out.println("Running screw");
    }

    @Override
    public void open(){
        System.out.println("Running open");
    }
    public void open1(){
        System.out.println("Running open1");
    }
    public void open2(){
        System.out.println("Running open2");
    }
    public void open3(){
        System.out.println("Running open3");
    }

}
