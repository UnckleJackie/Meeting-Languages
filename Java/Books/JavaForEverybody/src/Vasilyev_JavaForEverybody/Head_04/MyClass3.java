package Vasilyev_JavaForEverybody.Head_04;

public class MyClass3 {
    private int number;

    private int reverse() {
        int n = number;
        int res = 0;
        do {
            res = res * 10 + (n % 10);
            n /= 10;
        } while (n > 0);
        return res;
    }

    public void show() {
        System.out.println("Initial number: " + number);
        System.out.println("Reversed number: " + reverse());
    }

    public void set(int n) {
        number = n;
    }
}
