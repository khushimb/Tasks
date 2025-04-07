package com.xworkz.inheritance.internal;

public class OffShoulder extends Dress{
    public void style(Dress dress){
        dress.wear();
        if(dress instanceof OffShoulder){
            OffShoulder offShoulder = (OffShoulder) dress;
            offShoulder.fashion();
        }
    }
    public void fashion(){
        System.out.println("Running fashion in offshoulder");
    }
}
