package com.xworkz.practice1;

public class Runner {
    public static void main(String[] args) {
        Cell cell = new Cell();
        cell.useJail();

        Cell cell1 = new Cell();
        cell.showJail(cell1);

        House house = new House();
        house.method();

        House house1 = new House();
        house.see(house1);
    }
}
