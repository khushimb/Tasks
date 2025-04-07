package com.xworkz.inheritance.internal;

public class Chrome extends Browser{
    public Chrome(){
        System.out.println("Running no arg const chrome");
    }

    @Override
    public void search(){
        System.out.println("running search");
    }
    @Override
    public void edit(){
        System.out.println("running edit");
    }
}
