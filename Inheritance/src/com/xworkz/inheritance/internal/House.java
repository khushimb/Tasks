package com.xworkz.inheritance.internal;

public class House extends Building{

    public House(){
        System.out.println("Running no arg const");
    }

@Override
    public void build(){
        System.out.println("Running build");
    }

    @Override
    public void destroy(){
        System.out.println("Running destroy");
    }


}
