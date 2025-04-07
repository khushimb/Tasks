package com.xworkz.inheritance.internal;

public class Novel extends Book{
    public Novel(){
        System.out.println("Running no arg const novel");
    }

    public void open(){
        System.out.println("Running open");
    }
    public void read(){
        System.out.println("Running read");
    }
}
