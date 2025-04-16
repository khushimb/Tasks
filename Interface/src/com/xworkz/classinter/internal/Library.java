package com.xworkz.classinter.internal;

public class Library implements Book {


    @Override
    public void read() {
        System.out.println("running read");
    }

    @Override
    public void open() {
        System.out.println("running open");

    }

    @Override
    public void close() {
        System.out.println("running close");

    }
}
