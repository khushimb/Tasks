package com.xworkz.inheritance.internal;

public class Winter extends Season{

    public Winter(){
        System.out.println("Running no arg const winter");
    }

    @Override
    public void fall(){
        System.out.println("Running fall");
    }
    @Override
    public void spring(){
        System.out.println("Running spring");
    }
}
