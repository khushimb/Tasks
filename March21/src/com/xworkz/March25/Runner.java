package com.xworkz.March25;

public class Runner {
    public static void main(String[] args) {
        ChooseJail chooseJail = new ChooseJail();
        chooseJail.open();

        ChooseSatellite chooseSatellite = new ChooseSatellite();
        chooseSatellite.display();

        ChooseId chooseId = new ChooseId();
        chooseId.display();


    }
}
