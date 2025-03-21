package com.xworkz.tasks1;

public class Virat {
    Brush brush;
    Clip clip;
    Ticket ticket;
    Cricket cricket;

    Virat(Brush brush, Ticket ticket, Cricket cricket) {
        this.brush = brush;
        this.ticket = ticket;
        this.cricket = cricket;
    }

    void play() {
        if (this.cricket != null) {
            System.out.println("Running play in virat");
            this.cricket.watch();
            this.cricket.profit();
        } else {
            System.out.println("Not playing cricket");
        }
    }

    void clean() {
        if (this.brush != null) {
            System.out.println("Running clean in virat");
            this.brush.clean();
            this.brush.scrub();
        } else {
            System.out.println("Not cleaning");
        }
    }
        void relax() {
            if (this.ticket != null) {
                System.out.println("Running clean in virat");
                this.ticket.cost();
                this.ticket.sell();
            } else {
                System.out.println("Not relaxing");
            }
        }
    }


