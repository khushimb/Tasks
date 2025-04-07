package com.xworkz.inheritance.internal;

public class IceFlavour extends Jamun{
    public void eat(Jamun jamun){
        jamun.prepare();
        if(jamun instanceof IceFlavour){
            IceFlavour iceFlavour = (IceFlavour) jamun;
            iceFlavour.melt();
        }
    }
    public void melt(){
        System.out.println("Running melt in ice flavour");
    }
}
