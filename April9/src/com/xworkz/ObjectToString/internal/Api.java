package com.xworkz.ObjectToString.internal;

public class Api {

    private String rest;
    private String graph;
    private String soap;

    public Api(String rest,String graph,String soap){
        this.rest=rest;
        this.graph=graph;
        this.soap=soap;

    }

    @Override
    public String toString(){
        return "Rest:"+rest+"Graph:"+graph+"Soap:"+soap;
    }

}
