package com.xworkz.ObjectToString.internal;

public class Banner {

    private String info;
    private int price;
    private int size;


    public Banner(String info,int price,int size){
        this.info=info;
        this.price=price;
        this.size=size;

    }

    @Override
    public String toString(){
        return "Info:"+info+"Price:"+price+"Size:"+size;
    }

    @Override
    public int hashCode() {
        return 67;
    }
}


