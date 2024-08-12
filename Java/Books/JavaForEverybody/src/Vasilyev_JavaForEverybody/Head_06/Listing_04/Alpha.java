package Vasilyev_JavaForEverybody.Head_06.Listing_04;

public class Alpha {
    private int number;

    void show() {
        System.out.println("Field number: " + number);
    }

    void set(int n) {
        number = n;
    }

    Alpha(int n) {
        set(n);
    }
}
