package com.xworkz.inheritance.internal;

public class Iphone extends Mobile{
    public Iphone(){
        System.out.println("Running no arg const iphone");
    }

    @Override
    public void operate(){
        System.out.println("Running operate");
    }
    @Override
    public void switchoff(){
        System.out.println("Running switch off");
    }
    public void switchoff1(){
        System.out.println("Running switch off1");
    }
    public void switchoff2(){
        System.out.println("Running switch off2");
    }
    public void switchoff3(){
        System.out.println("Running switch off3");
    }

}
