package com.xworkz.inheritance.internal;

public class Java extends ProgrammingLang{
    public Java(){
        System.out.println("Running no arg const ");
    }

    @Override
    public void code(){
        System.out.println("Running code");
    }
    @Override
    public void lines(){
        System.out.println("Running lines");
    }

}
