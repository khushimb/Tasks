package com.xworkz.ObjectToString.internal;

public class Section {
    private String name;
    private String order;
    private String visible;

    public Section(String name, String order, String visible) {
        this.name = name;
        this.order = order;
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Order:" + order + " Visible:" + visible;
    }
}
