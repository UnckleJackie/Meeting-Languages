package Vasilyev_JavaForEverybody.Head_06.Listing_03;

public class Bravo extends Alpha {
    char symbol;

    void display() {
        System.out.println("Field symblo: " + symbol);
    }

    Bravo() {
        super();
        symbol = 'A';
        display();
    }

    Bravo(int n, char s) {
        super(n);
        symbol = s;
        display();
    }
}
