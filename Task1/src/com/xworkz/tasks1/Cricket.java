package com.xworkz.tasks1;

public class Cricket {
    Ticket ticket;

    public Cricket(Ticket ticket){
        this.ticket=ticket;
    }
    void watch() {
        if (this.ticket != null) {
            this.ticket.cost();
            System.out.println("Running watch method in class Cricket");
        } else {
            System.out.println("No tickets to buy");
        }
    }
        void profit(){
            if(this.ticket != null) {
                this.ticket.sell();
                System.out.println("Running watch method in class Cricket");
            }
            else{
                System.out.println("No profits in Selling ");
            }
    }
}
