package Vasilyev_JavaForEverybody.Head_11.Listing_06;

public class Bravo<T, U> {
    T first;
    U second;

    Bravo(T a, U b) {
        first = a;
        second = b;
    }

    void show() {
        System.out.println("<Bravo " + first + " | " + second + ">");
    }
}
