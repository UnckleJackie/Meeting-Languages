package Vasilyev_JavaForEverybody.Head_05.Listing_03;

public class MyClass {
    int number;
    char symbol;
    void show() {
        System.out.println("Number: " + number);
        System.out.println("Symbol: " + symbol);
    }
    MyClass() {
        number = 100;
        symbol = 'A';
        show();
    }
}
