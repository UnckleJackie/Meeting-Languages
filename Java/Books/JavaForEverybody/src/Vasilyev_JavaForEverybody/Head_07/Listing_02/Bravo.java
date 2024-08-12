package Vasilyev_JavaForEverybody.Head_07.Listing_02;

public class Bravo implements Calculator {
    public int calc(int n) {
        if (n < 1) return 1;
        else return n * calc(n - 1);
    }
}
