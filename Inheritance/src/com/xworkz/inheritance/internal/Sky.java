package com.xworkz.inheritance.internal;

public class Sky extends Beautiful{
    public Sky(){
        System.out.println("Running no arg const Sky");
    }

    @Override
    public void fall(){
        System.out.println("Running fall");
    }
    @Override
    public void rain(){
        System.out.println("Running rain");
    }
    public void rain1(){
        System.out.println("Running rain1");
    }
    public void rain2(){
        System.out.println("Running rain2");
    }
    public void rain3(){
        System.out.println("Running rain3");
    }

}
