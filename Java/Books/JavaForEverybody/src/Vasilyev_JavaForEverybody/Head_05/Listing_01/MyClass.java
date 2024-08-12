package Vasilyev_JavaForEverybody.Head_05.Listing_01;

public class MyClass {
    private int first;
    private int second;
    void set(int a, int b) {
        first = a;
        second = b;
    }
    void set(int n) {
        first = n;
        second = n;
    }
    void set() {
        first = 100;
        second = 200;
    }
    void show() {
        System.out.println("Field first: " + first);
        System.out.println("Field second: " + second);
    }
    void show(boolean t) {
        if (t) {
            System.out.println("Field first: " + first);
        } else {
            System.out.println("Field second: " + second);
        }
    }
}
