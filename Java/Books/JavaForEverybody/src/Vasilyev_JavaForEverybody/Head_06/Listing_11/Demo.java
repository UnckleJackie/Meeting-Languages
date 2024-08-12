package Vasilyev_JavaForEverybody.Head_06.Listing_11;

public class Demo {
    public static void main(String[] args) {
        Bravo B = new Bravo();
        B.first();
        B.second();
        Alpha A;
        A = B;
        A.first();
        A.second();
    }
}
