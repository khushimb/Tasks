package com.xworkz.inheritance.internal;

public class VelvateenRabbit extends Books{
    public void read(Books books){
        books.read();
        if(books instanceof VelvateenRabbit){
            VelvateenRabbit velvateenRabbit = (VelvateenRabbit) books;
            velvateenRabbit.finishReading();
        }
    }
    public void finishReading(){
        System.out.println("Running finish reading in velvateen rabbit");
    }
}
