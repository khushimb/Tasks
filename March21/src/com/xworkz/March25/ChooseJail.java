package com.xworkz.March25;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import javax.naming.Name;

public class ChooseJail {

    public void open(){
        Jail jail = new Jail();
        System.out.println(jail.getName());
        jail.setName("aryan");
        System.out.println(jail.getLocation());
        jail.setLocation("banglore");
        System.out.println(jail.getJailerName());
        jail.setJailerName("abhi");
        System.out.println(jail.getTotalCells());
        jail.setTotalCells(56);

    }
}
