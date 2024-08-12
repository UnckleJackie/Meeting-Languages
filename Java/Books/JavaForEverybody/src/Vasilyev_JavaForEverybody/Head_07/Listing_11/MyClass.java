package Vasilyev_JavaForEverybody.Head_07.Listing_11;

public class MyClass {
    int code;

    void set(int n) {
        code = n;
    }

    void display() {
        System.out.println("Field: " + code);
    }

    static void show(String t) {
        System.out.println("MyClass: " + t);
    }
}
