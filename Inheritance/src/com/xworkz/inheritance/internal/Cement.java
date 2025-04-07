package com.xworkz.inheritance.internal;

public class Cement extends BuildingMaterial {
    public Cement(){
        System.out.println("Running no arg const ");
    }

    @Override
    public void build(){
        System.out.println("Running build");
    }
    @Override
    public void breakIt(){
        System.out.println("Running break It");
    }

}
