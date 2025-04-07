package com.xworkz.inheritance.internal;

public class ActionMovie extends Movie {
    public ActionMovie(){
        System.out.println("Running no arg const action movie");
    }
    @Override
    public void watch(){
        System.out.println("running watch");
    }
    @Override
    public void stop(){
        System.out.println("running stop");
    }

}
