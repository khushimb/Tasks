package com.xworkz.inheritance.internal;

public class Tata extends Company{
    public void permit(Company company){
        company.place();
        if(company instanceof  Tata){
            Tata tata  = (Tata) company;
            tata.salary();
        }
    }
    public void salary(){
        System.out.println("Running salary in tata");
    }
}
