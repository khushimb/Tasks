package com.xworkz.inheritance.internal;

public class Airplane extends Transport{
    public Airplane(){
        System.out.println("Running no arg const airplane");
    }

    @Override
    public void travel(){
        System.out.println("Running travel");
    }
    @Override
    public void ticket(){
        System.out.println("Running ticket");
    }
    public void purchase(){
        System.out.println("Running purchase");
    }
    public void flyThroughout(){
        System.out.println("Running flythroughout");
    }
    public void fly(){
        System.out.println("Running fly");
    }


}
