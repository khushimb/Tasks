package com.xworkz.inheritance.internal;

public class Jeans extends Cloth{
    public void wear(Cloth cloth){
        cloth.wear();
        if(cloth instanceof Jeans){
            Jeans jeans = (Jeans) cloth;
            jeans.torn();
        }
    }
    public void torn(){
        System.out.println("Running torn in jeans");
    }
}
