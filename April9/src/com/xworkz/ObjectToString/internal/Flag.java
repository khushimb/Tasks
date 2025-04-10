package com.xworkz.ObjectToString.internal;

public class Flag {
    private String isNew;
    private String popular;
    private String hot;

    public Flag(String isNew, String popular, String hot) {
        this.isNew = isNew;
        this.popular = popular;
        this.hot = hot;
    }

    @Override
    public String toString() {
        return "New:" + isNew + " Popular:" + popular + " Hot:" + hot;
    }

    @Override
    public int hashCode() {
        return 56;
    }
}
