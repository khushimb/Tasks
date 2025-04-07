package com.xworkz.inheritance.internal;

public class Shiva extends God{
    public Shiva(){
        System.out.println("Running no arg const shiva");
    }

    @Override
    public void pray(){
        System.out.println("running pray");
    }
   @Override
   public void patience(){
        System.out.println("running patience");
    }

}
