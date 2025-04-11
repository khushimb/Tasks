package com.xworkz.ObjectToString.runner;

import com.xworkz.ObjectToString.internal.Tshirt;

public class TshirtRunner {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt("nike",'s',"black");
        Tshirt tshirt1 = new Tshirt("puma",'M',"white");
        Boolean same = tshirt1.equals(tshirt);
        System.out.println("Tshirts are not same : "+same);




    }
}
