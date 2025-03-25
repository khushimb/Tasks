package com.xworkz.practice1;

public class Cell {

    Jail jail = new Jail();

    public void useJail(){
        jail.open();
        System.out.println(jail.location="davangere");
    }

    public void showJail(Cell jail){
         if(jail != null){
             System.out.println("jail is not null");
         }
    }


}
