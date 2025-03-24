package com.xworkz.practice;

public class Sheet {
    Paper paper = new Paper();

   public void display(){
        paper.price=100;
       System.out.println("Runninng price variable of display method in Sheet class ");
       paper.color="pink";
       System.out.println("Running color variable of display method in Sheet class");
    }
}
