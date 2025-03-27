package com.xworkz.association;

import java.util.Date;

public class Warranty {
    private String startDate;
    private String endDate;

    public Warranty(String startDate,String endDate){
        this.startDate=startDate;
        this.endDate=endDate;
        System.out.println("Running warranty const ");
    }


    public void showwarranty(){
        System.out.println("Running show warranty method");
    }



}
