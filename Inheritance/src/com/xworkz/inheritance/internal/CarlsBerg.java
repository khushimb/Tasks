package com.xworkz.inheritance.internal;

public class CarlsBerg extends TastyBeer{
    public CarlsBerg(){
        System.out.println("running no arg const carlsberg");
    }

    @Override
    public void chug(){
        System.out.println("Running chug");
    }
    @Override
    public void drunk(){
        System.out.println("Running drunk");
    }
}
