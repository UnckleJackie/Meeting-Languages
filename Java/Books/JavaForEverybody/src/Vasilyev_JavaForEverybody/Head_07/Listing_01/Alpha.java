package Vasilyev_JavaForEverybody.Head_07.Listing_01;

public interface Alpha {
    int NUMBER = 5;

    void set(int n);

    String get();

    default void show() {
        System.out.println("Result: " + get());
    }
}
