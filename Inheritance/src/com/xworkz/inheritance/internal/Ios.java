package com.xworkz.inheritance.internal;

public class Ios extends Iphone{
    public void use(Iphone iphone){
        iphone.switchoff();
        if(iphone instanceof Ios){
            Ios ios = (Ios) iphone;
            ios.apply();
        }
    }
    public void apply(){
        System.out.println("Running apply in ios");
    }
}
