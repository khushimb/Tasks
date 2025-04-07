package com.xworkz.inheritance.internal;

public class Student extends Person{

    public Student(){
        System.out.println("Running no arg const student");
    }

    @Override
    public void dance(){
        System.out.println("Running dance");
    }

    @Override
    public void walk(){
        System.out.println("Running walk");
    }

}
