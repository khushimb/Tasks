package com.xworkz.ObjectToString.internal;

public class Util {
    private String name;
    private String function;
    private String scope;

    public Util(String name, String function, String scope) {
        this.name = name;
        this.function = function;
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Function:" + function + " Scope:" + scope;
    }
}

