package com.xworkz.inheritance.internal;

public class Africa extends Country{
    public void see(Country country){
        country.state();
        if(country instanceof Africa){
            Africa africa = (Africa) country;
            africa.watch();
        }
    }
    public void watch(){
        System.out.println("Running watch in africa");
    }
}
