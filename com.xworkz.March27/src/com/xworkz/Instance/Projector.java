package com.xworkz.Instance;


public class Projector {

    public void display()  {

        Len lens = new Len();
        lens.watch("pink",200);
        System.out.println("................................");

        Lamp lamps = new Lamp();
        lamps.light("Red","ikea");
        System.out.println("................................");

        Port ports = new Port();
        ports.travel("mangalore",10000);
        System.out.println("................................");

        Wire wires = new Wire();
        wires.current("premium","red");
        System.out.println("................................");

        Board boards = new Board();
        boards.write(100,"white board");
        System.out.println("................................");

        Button button = new Button();
        button.buttonUp(5,"blue");
        System.out.println("................................");

        Panel panel = new Panel();
        panel.show("epson",500);
        System.out.println("................................");

        Remote remote = new Remote();
        remote.press(15,"red remote");
        System.out.println("................................");

        Screw screw = new Screw();
        screw.fix(20,"green");
        System.out.println("................................");



    }
}

