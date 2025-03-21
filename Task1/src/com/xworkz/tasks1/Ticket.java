package com.xworkz.tasks1;

public class Ticket {
    TicketTypes ticketTypes;
    double cost;

    public Ticket(TicketTypes ticketTypes,double cost){
        this.ticketTypes=ticketTypes;
        this.cost=cost;
    }
    void cost(){
        System.out.println("Running method cost in class ticket");
    }
    void buy(){
        System.out.println("Running method buy in class ticket");
    }
    void sell(){
        System.out.println("Running method sell in class ticket");
    }
}
