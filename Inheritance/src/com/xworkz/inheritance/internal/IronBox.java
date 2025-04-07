package com.xworkz.inheritance.internal;

public class IronBox extends Appliance{
    public void iron(Appliance appliance){
        appliance.on();
        if(appliance instanceof IronBox){
            IronBox ironBox = (IronBox) appliance;
            ironBox.dry();
        }
    }
    public void dry(){
        System.out.println("Running dry in iron box");
    }
}
