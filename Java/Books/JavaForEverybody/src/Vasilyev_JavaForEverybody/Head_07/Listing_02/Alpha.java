package Vasilyev_JavaForEverybody.Head_07.Listing_02;

public class Alpha implements Calculator {
    public int calc(int n) {
        if (n == 1 | n == 2) return n;
        else return n * calc(n - 2);
    }
}
