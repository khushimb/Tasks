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
    public void open(){
        System.out.println("running open");
    }
    public void close(){
        System.out.println("running close");
    }
    public void decorate(){
        System.out.println("running decorate");
    }

}
