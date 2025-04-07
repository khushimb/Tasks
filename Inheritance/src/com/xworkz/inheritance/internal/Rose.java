package com.xworkz.inheritance.internal;

public class Rose extends Flower{

    public Rose(){
        System.out.println("Running no arg const Rose");
    }

    @Override
    public void bloom(){
        System.out.println("Running bloom");
    }
    @Override
    public void cute(){
        System.out.println("Running cute");
    }

}
