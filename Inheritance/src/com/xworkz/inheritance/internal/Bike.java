package com.xworkz.inheritance.internal;

public class Bike extends Transportation{

    public Bike(){
        System.out.println("Running no arg const bike");
    }

    @Override
    public void car(){
        System.out.println("running car");
    }
    @Override
    public void truck(){
        System.out.println("running truck");
    }
    public void vespa(){
        System.out.println("running vespa");
    }
    public void activa(){
        System.out.println("running activa");
    }
    public void honda(){
        System.out.println("running honda");
    }



}
