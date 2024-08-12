package program_015;

public class CarFactory {
    public static void main(String[] args) {
        Car carOne = new Car(5, "Green", true);
        carOne.drive();

        Van vanOne = new Van(6, "Orange", false);
        vanOne.drive();

        System.out.println(carOne instanceof Car);
        System.out.println(carOne instanceof Vehicle);
        System.out.println(vanOne instanceof Van);
        System.out.println(vanOne instanceof Vehicle);

        Vehicle carTwo = new Car(5, "white", false);

        Vehicle vanTwo = new Van(6, "yellow", true);

        //System.out.println(carOne instanceof Van);


    }
}
