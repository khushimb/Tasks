package com.xworkz.inheritance.internal;

public class Teddy extends  Toy {

    public Teddy(){
        System.out.println("running no arg const teddy");
    }

    @Override
    public void play(){
        System.out.println("Running play");
    }
    @Override
    public void cut(){
        System.out.println("Running cut");
    }


}
