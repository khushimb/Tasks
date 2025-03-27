package com.xworkz.association;

import java.util.StringTokenizer;

public class Porttype {

    private String location;
    private String time;

    public Porttype(String location, String time){
        this.location=location;
        this.time=time;
        System.out.println("Running const porttype");
    }

    public void showPortType(){
        System.out.println("Running method Show Port Type");
    }
}
