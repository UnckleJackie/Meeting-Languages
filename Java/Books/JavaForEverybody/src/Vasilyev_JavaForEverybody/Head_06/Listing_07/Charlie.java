package Vasilyev_JavaForEverybody.Head_06.Listing_07;

public class Charlie extends Bravo {
    int charlie;

    Charlie(int a, int b, int c) {
        super(a, b);
        charlie = c;
        System.out.println("Field charlie: " + charlie);
    }
}
