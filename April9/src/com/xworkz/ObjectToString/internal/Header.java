package com.xworkz.ObjectToString.internal;

public class Header {
    private String logo;
    private String nav;
    private String search;

    public Header(String logo, String nav, String search) {
        this.logo = logo;
        this.nav = nav;
        this.search = search;
    }

    @Override
    public String toString() {
        return "Logo:" + logo + " Nav:" + nav + " Search:" + search;
    }

    @Override
    public int hashCode() {
        return 25;
    }
}

