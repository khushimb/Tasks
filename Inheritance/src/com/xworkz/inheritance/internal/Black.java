package com.xworkz.inheritance.internal;

public class Black extends Colour{
    public Black(){
        System.out.println("Running black");
    }

    @Override
    public void select(){
        System.out.println("Running select");
    }
    @Override
    public void rainbow(){
        System.out.println("Running rainbow");
    }
}
