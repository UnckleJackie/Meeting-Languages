package Vasilyev_JavaForEverybody.Head_06.Listing_09;

public class Demo {
    public static void main(String[] args) {
        Alpha A;
        Bravo B = new Bravo();
        A = B;
        B.set('B', 100);
        B.show();
        A.set('A');
        A.show();
    }
}
