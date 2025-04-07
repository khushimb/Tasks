package com.xworkz.inheritance.internal;

public class Website extends Chrome{
    public void search(Chrome chrome){
        chrome.search();
        if(chrome instanceof Website){
            Website website = (Website) chrome;
            website.find();
        }
    }
    public void find(){
        System.out.println("Running find in website");
    }
}
