package Vasilyev_JavaForEverybody.Head_11.Listing_09;

public class MyClass<T, U> {
    T value;
    U code;

    void set(T a, U b) {
        value = a;
        code = b;
    }

    void show() {
        System.out.println("[1] " + value);
        System.out.println("[2] " + code);
    }
}
