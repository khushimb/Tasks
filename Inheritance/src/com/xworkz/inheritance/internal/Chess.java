package com.xworkz.inheritance.internal;

public class Chess extends Game{

    public Chess(){
        System.out.println("Running no arg const chess");
    }

    @Override
    public void lose(){
        System.out.println("Running lose");
    }
    @Override
    public void win(){
        System.out.println("Running win");
    }


}
