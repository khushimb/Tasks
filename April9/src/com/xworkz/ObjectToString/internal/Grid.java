package com.xworkz.ObjectToString.internal;

public class Grid {
    private String column;
    private String row;
    private String gap;

    public Grid(String column, String row, String gap) {
        this.column = column;
        this.row = row;
        this.gap = gap;
    }

    @Override
    public String toString() {
        return "Column:" + column + " Row:" + row + " Gap:" + gap;
    }
}

