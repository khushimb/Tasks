package com.xworkz.inheritance.internal;

public class AcessController extends Admin{
    public void fetchDetails(Admin admin){
        admin.open();
        if(admin instanceof AcessController){
            AcessController acessController = (AcessController) admin;
            acessController.fetchInfo();

        }
    }

    public void fetchInfo(){
        System.out.println("Running fetch info");
    }
}
