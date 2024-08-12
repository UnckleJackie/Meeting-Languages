package Vasilyev_JavaForEverybody.Head_05.Listing_02;

public class MyClass {
    private int number;
    private char symbol;
    void set(int n) {
        number = n;
    }
    void set(char s) {
        symbol = s;
    }
    void set(int n, char s) {
        set(n);
        set(s);
    }
    void show() {
        System.out.println("Object fields");
        System.out.println("Number: " + number);
        System.out.println("Symbol: " + symbol);
    }
}
