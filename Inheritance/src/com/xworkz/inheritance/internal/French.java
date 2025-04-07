package com.xworkz.inheritance.internal;

public class French extends Language{
    public void learn(Language language){
        language.write();
        if(language instanceof French){
            French french = (French) language;
            french.write();
        }
    }
    public void write(){
        System.out.println("Running write in french");
    }
}
