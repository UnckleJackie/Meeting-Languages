package program_015;

public class Car extends Vehicle {
    private boolean navigation;

    public Car(int numberOfGears, String color, boolean navigation) {
        super(numberOfGears, color);
        this.navigation = navigation;
        System.out.println("My car is: " + color + " it has " +
                numberOfGears + " gears and it can " + switchNavigation(navigation));
    }

    public String switchNavigation(boolean navigation) {
        if (!navigation) {
            return "turn on the navigation";
        } else {
            return "turn off the navigation";
        }
    }
}
