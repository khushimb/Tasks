package com.xworkz.ObjectToString.internal;

public class Calender {

    private String year;
    private String day;
    private String month;

    public Calender(String year,String day,String month){
        this.year=year;
        this.day=day;
        this.month=month;

    }

    @Override
    public String toString(){
        return "Year:"+year+"Day:"+day+"Month:"+month;
    }
}


