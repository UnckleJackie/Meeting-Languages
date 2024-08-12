package Vasilyev_JavaForEverybody.Head_06.Listing_04;

public class Bravo extends Alpha {
    private char symbol;

    void show() {
        super.show();
        System.out.println("Field symbol: " + symbol);
    }

    void set(int n, char s) {
        set(n);
        symbol = s;
    }

    Bravo(int n, char s) {
        super(n);
        symbol = s;
    }
}
