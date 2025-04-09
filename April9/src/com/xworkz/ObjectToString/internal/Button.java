package com.xworkz.ObjectToString.internal;

public class Button {

    private String primary;
    private String secondary;
    private String danger;

    public Button(String primary,String secondary,String danger){
        this.primary=primary;
        this.secondary=secondary;
        this.danger=danger;

    }

    @Override
    public String toString(){
        return "Primary:"+primary+"Secondary:"+secondary+"Danger:"+danger;
    }
}

