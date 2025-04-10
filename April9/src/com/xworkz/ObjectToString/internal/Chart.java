package com.xworkz.ObjectToString.internal;

public class Chart {

    private int size;
    private int price;
    private String type;

    public Chart(int size,int price,String type){
        this.size=size;
        this.price=price;
        this.type=type;

    }

    @Override
    public String toString(){
        return "Size:"+size+"Price:"+price+"Type:"+type;
    }

    @Override
    public int hashCode() {
        return 30;
    }
}
