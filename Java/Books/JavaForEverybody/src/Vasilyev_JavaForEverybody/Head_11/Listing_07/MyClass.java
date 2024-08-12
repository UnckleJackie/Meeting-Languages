package Vasilyev_JavaForEverybody.Head_11.Listing_07;

public class MyClass<T> {
    T value;

    void show() {
        System.out.println("Running checking");
        System.out.println("Field value: " + value);
        System.out.println("Field value: " + value.getClass().getSimpleName());
    }
}
