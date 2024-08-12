package Vasilyev_JavaForEverybody.Head_06.Listing_10;

public class Demo {
    public static void main(String[] args) {
        Alpha A = new Alpha();
        Bravo B = new Bravo();
        Charlie C = new Charlie();
        Alpha R;
        R = A;
        R.show();
        R = B;
        R.show();
        R = C;
        R.show();
    }
}
