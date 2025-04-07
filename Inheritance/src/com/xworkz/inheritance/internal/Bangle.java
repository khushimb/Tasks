package com.xworkz.inheritance.internal;

public class Bangle extends Circle{
    public void wearIt(Circle circle){
        circle.insert();
        if(circle instanceof Bangle){
            Bangle bangle = (Bangle) circle;
            bangle.removeIt();
        }
    }
    public void removeIt(){
        System.out.println("Running remove it in bangle");
    }
}
