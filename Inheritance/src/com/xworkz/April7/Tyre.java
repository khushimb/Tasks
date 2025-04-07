package com.xworkz.April7;

public class Tyre extends Rubber{


    @Override
    public void expand(){
        System.out.println("expand running in tyre");
    }

    public void compress(){
        System.out.println("Running compress in tyre");
    }
}
