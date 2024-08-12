package Vasilyev_JavaForEverybody.Head_11.Listing_10;

public class First<T extends U, U> {
    T code;
    U value;

    void set(T a, U b) {
        code = a;
        value = b;
    }

    U get(boolean t) {
        if (t) return code;
        else return value;
    }
}
