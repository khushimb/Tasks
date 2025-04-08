package com.xworkz.inheritance.internal;

public class Asia extends Continent{
    public Asia(){
        System.out.println("Running no arg consr asia");
    }

    @Override
    public void map(){
        System.out.println("Running map");
    }
    @Override
    public void population(){
        System.out.println("Running population");
    }
    public void people(){
        System.out.println("Running people");
    }
    public void women(){
        System.out.println("Running women");
    }
    public void men(){
        System.out.println("Running men");
    }


}
