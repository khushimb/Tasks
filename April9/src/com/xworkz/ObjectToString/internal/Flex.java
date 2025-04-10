package com.xworkz.ObjectToString.internal;

public class Flex {
    private String row;
    private String col;
    private String wrap;

    public Flex(String row, String col, String wrap) {
        this.row = row;
        this.col = col;
        this.wrap = wrap;
    }

    @Override
    public String toString() {
        return "Row:" + row + " Col:" + col + " Wrap:" + wrap;
    }

    @Override
    public int hashCode() {
        return 29;

    }
}
