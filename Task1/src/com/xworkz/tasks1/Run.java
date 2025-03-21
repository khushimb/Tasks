package com.xworkz.tasks1;

public class Run {

    public static void main(String[] args){

        Clip clip1 = new Clip("pink");
        Clip clip2 = new Clip("blue");
        Clip clip3 = new Clip("red");
        Clip clip4 = new Clip("black");
        Clip clip5 = new Clip("purple");

        Clip[] clip ={clip1,clip2,clip3,clip4,clip5};
        Pushpa pushpa = new Pushpa();
        pushpa.useClip(clip);
        System.out.println("----------------------------");

        Ticket ticket = new Ticket(TicketTypes.CONFIRM, 600.00);
        Cricket cricket = new Cricket(ticket);
        cricket.watch();
        cricket.profit();
        System.out.println("----------------------------");


        Brush brush = new Brush(Color.BLUE);
        Virat virat = new Virat(brush, ticket, cricket);
        virat.play();
        virat.clean();
        virat.relax();
        System.out.println("----------------------------");









    }


}
