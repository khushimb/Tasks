package com.xworkz.inheritance.internal;

public class Pipe extends Metal{
    public Pipe(){
        System.out.println("Running no arg const pipe");
    }

    @Override
    public void fix(){
        System.out.println("Running fix");
    }
    @Override
    public void breakPipe(){
        System.out.println("Running break pipe");
    }
}
