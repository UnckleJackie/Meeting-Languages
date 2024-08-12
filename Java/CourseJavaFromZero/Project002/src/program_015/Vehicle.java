package program_015;

public class Vehicle {
    private int numberOfGears;
    private String color;

    public Vehicle(int numOfGears, String color) {
        this.numberOfGears = numberOfGears;
        this.color = color;
    }

    public void drive() { System.out.println("Puh - puh - puh"); }
}
