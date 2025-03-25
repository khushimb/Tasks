package com.xworkz.March25;

public class Jail {

    private String name;
    private String location;
    private String jailerName;
    private int totalCells;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name =name;
        System.out.println("Running set name in jail ");
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location) {
        this.location =location;
        System.out.println("Running set location in jail ");

    }

    public String getJailerName(){
        return jailerName;
    }

    public void setJailerName(String jailerName){
        this.jailerName=jailerName;
        System.out.println("Running set jailername in jail ");

    }

    public int getTotalCells(){
        return totalCells;
    }

    public void setTotalCells(int totalCells){
        this.totalCells=totalCells;
        System.out.println("Running set totalcells in jail ");

    }


}
