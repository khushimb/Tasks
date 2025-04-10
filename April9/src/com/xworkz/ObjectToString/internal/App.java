package com.xworkz.ObjectToString.internal;

public class App {

    private String mobile;
    private String desktop;
    private String web;


    public App(String mobile,String desktop,String web){
        this.mobile=mobile;
        this.desktop=desktop;
        this.web=web;

    }

    @Override
    public String toString(){
        return "Mobile:"+mobile+"Desktop:"+desktop+"Web:"+web;
    }

    @Override
    public int hashCode() {
        return 28;
    }
}
