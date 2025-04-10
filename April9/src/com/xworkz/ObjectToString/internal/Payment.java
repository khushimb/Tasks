package com.xworkz.ObjectToString.internal;

public class Payment {
    private String method;
    private String amount;
    private String status;

    public Payment(String method, String amount, String status) {
        this.method = method;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Method:" + method + " Amount:" + amount + " Status:" + status;
    }

    @Override
    public int hashCode() {
        return 44;
    }
}
