package Vasilyev_JavaForEverybody.Head_07.Listing_04;

public class MyClass implements Bravo {
    public int alpha(int n) {
        if (n == 0) return 0;
        else return n + alpha(n - 1);
    }

    public int bravo(int n) {
        if (n == 1 | n == 2) return 1;
        else return bravo(n - 1) + bravo(n - 2);
    }
}
