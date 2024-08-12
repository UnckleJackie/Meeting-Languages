package Vasilyev_JavaForEverybody.Head_11.Listing_02;

public class Demo {
    public static void main(String[] args) {
        MyClass.show(123);
        MyClass.<Integer>show(123);
        MyClass.show(321.0);
        MyClass.<Double>show(321.0);
        MyClass.show('A');
        MyClass.<Character>show('A');
    }
}
