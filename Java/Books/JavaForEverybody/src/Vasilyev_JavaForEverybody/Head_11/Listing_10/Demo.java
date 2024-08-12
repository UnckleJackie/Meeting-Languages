package Vasilyev_JavaForEverybody.Head_11.Listing_10;

public class Demo {
    public static void main(String[] args) {
        First<Bravo, Alpha> A = new First<>();
        A.set(new Bravo("Bravo"), new Alpha("Alpha"));
        A.get(false).show();
        A.get(true).show();
        Second<Charlie> B = new Second<>(new Charlie("Charlie"));
        B.display();
    }
}
