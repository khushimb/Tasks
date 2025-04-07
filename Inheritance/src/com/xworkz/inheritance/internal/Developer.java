package com.xworkz.inheritance.internal;

public class Developer extends Java{
    public void coder(Java java){
        java.lines();
        if(java instanceof Developer){
            Developer developer = (Developer) java;
            developer.program();
        }
    }
    public void program(){
        System.out.println("Running program in developer");
    }
}
