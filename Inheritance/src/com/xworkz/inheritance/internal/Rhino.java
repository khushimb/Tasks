package com.xworkz.inheritance.internal;

public class Rhino extends MythicalCreature{
    public Rhino(){
        System.out.println("Running no arg const rhino");
    }

    @Override
    public void live(){
        System.out.println("Running live");
    }
    @Override
    public void die(){
        System.out.println("Running die");
    }
}
