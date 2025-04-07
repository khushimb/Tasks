package com.xworkz.inheritance.internal;

public class USPolo extends Tshirt{
    public void wear(Tshirt tshirt){
        tshirt.wear();
        if(tshirt instanceof USPolo){
            USPolo usPolo = (USPolo) tshirt;
            usPolo.clean();
        }
    }
    public void clean(){
        System.out.println("Running clean in uspolo");
    }
}
