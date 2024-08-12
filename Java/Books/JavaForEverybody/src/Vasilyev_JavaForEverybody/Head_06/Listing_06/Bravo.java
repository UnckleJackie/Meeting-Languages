package Vasilyev_JavaForEverybody.Head_06.Listing_06;

public class Bravo extends Alpha {
    int code;

    void set(int m, int n) {
        super.code = m;
        code = n;
    }

    void show() {
        System.out.println("Alpha: " + super.code);
        System.out.println("Bravo: " + code);
    }
}
