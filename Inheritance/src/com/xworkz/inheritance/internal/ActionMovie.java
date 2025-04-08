package com.xworkz.inheritance.internal;

public class ActionMovie extends Movie {
    public ActionMovie(){
        System.out.println("Running no arg const action movie");
    }
    @Override
    public void watch(){
        System.out.println("running watch");
    }
    @Override
    public void stop(){
        System.out.println("running stop");
    }

    public void see(){
        System.out.println("running see");
    }

    public void act(){
        System.out.println("running stop");
    }

    public void seen(){
        System.out.println("running seen");
    }


}
