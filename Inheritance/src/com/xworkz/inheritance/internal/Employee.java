package com.xworkz.inheritance.internal;

public class Employee extends Manager {

    public Employee(){
        System.out.println("Running no arg const employee");
    }

    @Override
    public void check(){
        System.out.println("Running check method in manager");
    }

    @Override
    public void print(){
        System.out.println("Running print method in manager");
    }



}
