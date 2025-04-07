package com.xworkz.inheritance.internal;

public class HardDisk extends Storage{

    public HardDisk(){
        System.out.println("Running no arg const hard disk");
    }

    @Override
    public void store(){
        System.out.println("Running store");
    }
    @Override
    public void delete(){
        System.out.println("Running delete");
    }


}
