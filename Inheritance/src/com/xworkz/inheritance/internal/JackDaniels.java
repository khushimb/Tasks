package com.xworkz.inheritance.internal;

public class JackDaniels extends Whisky{
    public JackDaniels(){
        System.out.println("Running no arg const JD");
    }

    @Override
    public void sixty(){
        System.out.println("Running sixty");
    }
    @Override
    public void thirty(){
        System.out.println("Running thirty");
    }
}
