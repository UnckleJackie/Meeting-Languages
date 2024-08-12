package Vasilyev_JavaForEverybody.Head_06.Listing_05;

public class Bravo extends Alpha {
    char symbol;

    void show() {
        System.out.println("Class Bravo");
        System.out.println("Field number: " + number);
        System.out.println("Field symbol: " + symbol);
    }

    void set() {
        number = 200;
        symbol = 'B';
    }
}
