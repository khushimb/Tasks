package com.xworkz.ObjectToString.internal;

public class Gallery {
    private String grid;
    private String list;
    private String carousel;

    public Gallery(String grid, String list, String carousel) {
        this.grid = grid;
        this.list = list;
        this.carousel = carousel;
    }

    @Override
    public String toString() {
        return "Grid:" + grid + " List:" + list + " Carousel:" + carousel;
    }

    @Override
    public int hashCode() {
        return 23;
    }
}

