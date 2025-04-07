package com.xworkz.inheritance.internal;

public class User extends Admin{

    public User(){
        System.out.println("Running no arg const user");
    }

    @Override
    public void open(){
        System.out.println("Running open");
    }
    @Override
    public void close(){
        System.out.println("Running close");
    }
}
