package com.xworkz.inheritance.internal;

public class Ice extends Mango{
    public void melt(Mango mango){
        mango.melt();
        if(mango instanceof Ice){
            Ice ice = (Ice) mango;
            ice.taste();
        }
    }
    public void taste(){
        System.out.println("Running taste in ice");
    }
}
