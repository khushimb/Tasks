package com.xworkz.association;

public class Port {

    private Porttype porttype;

    public Port(Porttype porttype){
        this.porttype=porttype;
        System.out.println("Runnning const port");
    }

    public void showPort(){
        this.porttype.showPortType();
        System.out.println("Running method show Port");
    }
}
