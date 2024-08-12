package Seminars.Seminar_01.Program_010;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachineBottleOfWater machine = new VendingMachineBottleOfWater();
        machine.addBottleOfWater(new BottleOfWater("Water1",100, 5));
        machine.addBottleOfWater(new BottleOfWater("Water2", 150, 7.5));
        machine.addBottleOfWater(new BottleOfWater("Water3", 200, 10));
        machine.addBottleOfWater(new BottleOfWater("Water4", 50, 1.5));
        machine.addBottleOfWater(new BottleOfWater("Water5", 25, 0.3));

        System.out.println(machine.getProduct("Water1"));
        printGetProduct(machine);
    }
    public static void printGetProduct(VendingMachine vendingMachine) {
        System.out.println(vendingMachine.getProduct("Crisps"));
    }
}
