
package com.xworkz.Fest.internal.furniture;

public class CoffeTable extends Furniture {
    public void placeDrinks() {
        super.assemble();
        super.disassemble();
        super.clean();
        super.move();
        super.repair();
        System.out.println("CoffeeTable placing drinks");
    }
}
