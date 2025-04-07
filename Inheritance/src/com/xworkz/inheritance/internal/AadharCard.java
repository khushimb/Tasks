package com.xworkz.inheritance.internal;

public class AadharCard extends File{
    public void see(File file){
        file.open();
        if(file instanceof AadharCard){
            AadharCard aadharCard = (AadharCard) file;
            aadharCard.search();
        }
    }
    public void search(){
        System.out.println("Running search in aadhar card");
    }
}
