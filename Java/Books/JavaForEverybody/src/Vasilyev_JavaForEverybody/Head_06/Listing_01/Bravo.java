package Vasilyev_JavaForEverybody.Head_06.Listing_01;

public class Bravo extends Alpha {
    int value;

    void display() {
        System.out.println("Field value: " + value);
    }

    void sum() {
        System.out.println("Sum: " + (number + value));
    }
}
