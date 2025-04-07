package com.xworkz.inheritance.internal;

public class China extends Asia{
    public void travel(Asia asia){
        asia.population();
        if(asia instanceof China){
            China china = (China) asia;
            china.stop();
        }
    }
    public void stop(){
        System.out.println("Running stop in china");
    }
}
