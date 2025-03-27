package com.xworkz.association;

public class Remote {

    private Battery battery;

    public Remote(Battery battery){
        this.battery=new Battery("high",10);
        System.out.println("Running const remote");
    }

    public void showRemote(){
        this.battery.showBaterry();
    }
}
