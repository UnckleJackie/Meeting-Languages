package Vasilyev_JavaForEverybody.Head_11.Listing_08;

public class Alpha<T, U> implements MyInterface<T> {
    U value;

    public void show(T t) {
        System.out.println(t + ": " + value);
    }
}
