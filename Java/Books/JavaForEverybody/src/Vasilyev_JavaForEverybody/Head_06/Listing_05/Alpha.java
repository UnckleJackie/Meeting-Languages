package Vasilyev_JavaForEverybody.Head_06.Listing_05;

public class Alpha {
    int number;

    Alpha() {
        set();
    }

    void show() {
        System.out.println("Class Alpha");
        System.out.println("Field number: " + number);
    }

    void set() {
        number = 100;
    }

    void display() {
        show();
    }
}
