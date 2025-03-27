package com.xworkz.association;

import com.xworkz.Button;

public class Projector {
    public static void main(String[] args) {
        Warranty warranty = new Warranty("ssw","ws");
        Lamp lamp=new Lamp(warranty);
        lamp.showlamp();
        System.out.println(".........................................");

        Quality quality = new Quality("pink",600);
        Wire wire = new Wire(quality);
        wire.showWire();
        System.out.println(".........................................");

        Capacitor capacitor = new Capacitor("1000","100volts");
        Board board = new Board(capacitor);
        board.showCapacitor();
        System.out.println(".............................................");

        Battery battery = new Battery("very high",20);
        Remote remote = new Remote(battery);
        remote.showRemote();
        System.out.println(".............................................");

        Porttype porttype = new Porttype("mysore","afternooon");
        Port port = new Port(porttype);
        porttype.showPortType();
        System.out.println(".............................................");

        Material material = new Material("blue","epson");
        Button button = new Button(material);
        material.showMaterial();
        System.out.println("...............................................");




    }
}
