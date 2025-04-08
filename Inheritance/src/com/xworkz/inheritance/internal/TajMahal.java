package com.xworkz.inheritance.internal;

public class TajMahal extends Monument{
    public TajMahal(){
        System.out.println("Running no arg const tajmahal");
    }

    @Override
    public void build(){
        System.out.println("Running build");
    }
    @Override
    public void destroy(){
        System.out.println("Running destroy");
    }
    public void destroy1(){
        System.out.println("Running destroy1");
    }
    public void destroy2(){
        System.out.println("Running destroy2");
    }
    public void destroy3(){
        System.out.println("Running destroy3");
    }


}
