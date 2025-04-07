package com.xworkz.inheritance.internal;

public class Sodium extends Element{
    public void explode(Element element){
        element.method2();
        if(element instanceof Sodium){
            Sodium sodium = (Sodium) element;
            sodium.apply();
        }
    }
    public void apply(){
        System.out.println("running apply in sodium");
    }
}
