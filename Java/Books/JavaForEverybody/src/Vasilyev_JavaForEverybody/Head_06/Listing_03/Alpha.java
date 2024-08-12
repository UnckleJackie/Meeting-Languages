package Vasilyev_JavaForEverybody.Head_06.Listing_03;

public class Alpha {
    int number;

    void show() {
        System.out.println("Field number: " + number);
    }

    Alpha() {
        number = 100;
        show();
    }

    Alpha(int n) {
        number = n;
        show();
    }
}
