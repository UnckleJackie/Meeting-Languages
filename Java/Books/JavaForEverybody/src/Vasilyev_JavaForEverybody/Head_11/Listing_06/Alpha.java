package Vasilyev_JavaForEverybody.Head_11.Listing_06;

public class Alpha<T> {
    T value;

    Alpha(T val) {
        value = val;
    }

    void show() {
        System.out.println("<Alpha " + value + ">");
    }
}
