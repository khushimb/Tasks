package com.xworkz.ObjectToString.internal;

public class Invoice {
    private String number;
    private String date;
    private String total;

    public Invoice(String number, String date, String total) {
        this.number = number;
        this.date = date;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Number:" + number + " Date:" + date + " Total:" + total;
    }
}

