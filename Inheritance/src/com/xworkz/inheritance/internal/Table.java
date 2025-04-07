package com.xworkz.inheritance.internal;

public class Table extends Wood{
    public void sit(Wood wood){
        wood.openDoor();
        if(wood instanceof Table){
            Table table = (Table) wood;
            table.standUp();
        }
    }
    public void standUp(){
        System.out.println("Running stand up in table");
    }
}
