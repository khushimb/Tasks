package com.xworkz.tasks1;

public class Runner {
    public static void main(String[] args) {
        RCB rcb = new RCB();
        Shop shop = new Shop();
        shop.buy(rcb);

        Pink pink = new Pink();
        Pillow pillow = new Pillow();
        pillow.sleep(pink);

        Movie movie = new Movie();
        Theatre theatre = new Theatre();
        movie.kgf(theatre);
    }
    }

