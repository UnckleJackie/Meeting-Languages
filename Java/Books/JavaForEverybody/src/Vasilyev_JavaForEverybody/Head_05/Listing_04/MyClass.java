package Vasilyev_JavaForEverybody.Head_05.Listing_04;

public class MyClass {
    int number;
    char symbol;
    void show() {
        System.out.println("Number: " + number);
        System.out.println("Symbol: " + symbol);
    }
    MyClass(int n, char s) {
        System.out.println("Object creating");
        number = n;
        symbol = s;
    }
    MyClass() {
        this(100, 'A');
        System.out.println("Object is created");
    }
    MyClass(int n) {
        this(n, 'B');
    }
    MyClass(char s) {
        System.out.println("New object");
        number = 300;
        symbol = s;
    }
}
