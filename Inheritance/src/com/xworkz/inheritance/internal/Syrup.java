package com.xworkz.inheritance.internal;

public class Syrup extends Apple{
    public void cough(Apple apple){
        apple.eat();
        if(apple instanceof Syrup){
            Syrup syrup = (Syrup)apple;
            syrup.taste();
        }
    }
    public void taste(){
        System.out.println("Running taste in syrup");
    }
}
