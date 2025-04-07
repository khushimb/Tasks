package com.xworkz.inheritance.internal;

public class Oxygen extends Element{

    public Oxygen(){
        System.out.println("Running no arg const oxygen");
    }

    @Override
    public void method1(){
        System.out.println("Running method1");
    }
    @Override
    public void method2(){
        System.out.println("Running method2");
    }
}
