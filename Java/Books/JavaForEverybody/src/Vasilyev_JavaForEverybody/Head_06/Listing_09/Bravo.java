package Vasilyev_JavaForEverybody.Head_06.Listing_09;

public class Bravo extends Alpha {
    int num;

    void set(char s, int n) {
        symb = s;
        num = n;
    }

    void show() {
        System.out.println("Class Bravo");
        System.out.println("Symbol: " + symb);
        System.out.println("Number: " + num);
    }
}
