package Vasilyev_JavaForEverybody.Head_11.Listing_04;

public class MyClass {
    String name;

    <T> MyClass(T t) {
        name = t.toString();
    }
}
