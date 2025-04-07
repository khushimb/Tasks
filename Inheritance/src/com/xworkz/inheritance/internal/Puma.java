package com.xworkz.inheritance.internal;

public class Puma extends Brands{
public Puma(){
    System.out.println("Running no arg const puma");
}

    @Override
    public void buy(){
        System.out.println("running buy");
    }
    @Override
    public void purchase(){
        System.out.println("running purchase");
    }

}

