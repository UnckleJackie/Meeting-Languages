package Vasilyev_JavaForEverybody.Head_11.Listing_10;

public class Second<T extends Alpha> {
    T obj;

    Second(T t) {
        obj = t;
    }

    void display() {
        obj.show();
    }
}
