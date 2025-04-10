package com.xworkz.ObjectToString.internal;

public class Tab {
    private String name;
    private String id;
    private String active;

    public Tab(String name, String id, String active) {
        this.name = name;
        this.id = id;
        this.active = active;
    }

    @Override
    public String toString() {
        return "Name:" + name + " ID:" + id + " Active:" + active;
    }

    @Override
    public int hashCode() {
        return 76;
    }
}

