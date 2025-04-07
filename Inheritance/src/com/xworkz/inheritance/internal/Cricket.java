package com.xworkz.inheritance.internal;

public class Cricket extends Sport{

    public Cricket(){
        System.out.println("Running no arg const cricket");
    }

    @Override
    public void bat(){
        System.out.println("Running bat");
    }
    @Override
    public void ball(){
        System.out.println("Running ball");
    }
}
