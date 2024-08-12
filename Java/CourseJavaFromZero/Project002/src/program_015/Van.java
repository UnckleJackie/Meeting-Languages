package program_015;

public class Van extends Vehicle {
    private boolean dirtOnTheWindscreen;

    public Van(int numberOfGears, String color, boolean dirtOnTheWindscreen) {
        super(numberOfGears, color);
        this.dirtOnTheWindscreen = dirtOnTheWindscreen;
        System.out.println("My van is: " + color + " it has " + numberOfGears +
                " gears and it can + " + breakdownInTheMiddleOfTheRoad(dirtOnTheWindscreen));
    }

    public String breakdownInTheMiddleOfTheRoad(boolean dirtOnTheWindscreen) {
        if (!dirtOnTheWindscreen) {
            return "keepgoing for new";
        } else {
            return "be washed right now";
        }
    }
}
