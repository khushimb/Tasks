package com.xworkz.inheritance.internal;

public class Firewall extends Security{
    public Firewall(){
        System.out.println("Running no arg const Firewall");
    }

    @Override
    public void wall(){
        System.out.println("Running wall");
    }
    @Override
    public void layer(){
        System.out.println("Running layer");
    }


}
