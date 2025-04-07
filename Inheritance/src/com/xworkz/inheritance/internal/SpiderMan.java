package com.xworkz.inheritance.internal;

public class SpiderMan extends ActionMovie{
    public void jump(ActionMovie actionMovie){
        actionMovie.watch();
        if(actionMovie instanceof SpiderMan){
            SpiderMan spiderMan= (SpiderMan) actionMovie;
            spiderMan.grab();
        }
    }
    public void grab(){
        System.out.println("Running grab in spider man");
    }
}
