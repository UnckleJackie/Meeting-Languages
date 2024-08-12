package Vasilyev_JavaForEverybody.Head_06.Listing_04;

public class Demo {
    public static void main(String[] args) {
        Alpha A = new Alpha(10);
        A.show();
        A.set(20);
        A.show();
        Bravo B = new Bravo(100, 'B');
        B.show();
        B.set(200, 'Z');
        B.show();
        B.set(300);
        B.show();
    }
}
