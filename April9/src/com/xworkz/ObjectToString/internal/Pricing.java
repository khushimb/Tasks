package com.xworkz.ObjectToString.internal;

public class Pricing {
    private String plan;
    private String cost;
    private String currency;

    public Pricing(String plan, String cost, String currency) {
        this.plan = plan;
        this.cost = cost;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Plan:" + plan + " Cost:" + cost + " Currency:" + currency;
    }
}

