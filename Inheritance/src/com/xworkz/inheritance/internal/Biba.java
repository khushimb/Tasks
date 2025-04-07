package com.xworkz.inheritance.internal;

public class Biba extends ClothingBrand{
    public Biba(){
        System.out.println("Running no arg const");
    }

    @Override
    public void select(){
        System.out.println("Running select");
    }
    @Override
    public void buy(){
        System.out.println("Running buy");
    }
}
