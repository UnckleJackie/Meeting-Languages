package Vasilyev_JavaForEverybody.Head_07.Listing_02;

public class Demo {
    public static void main(String[] args) {
        Calculator R;
        R = new Alpha();
        System.out.println("5!! = " + R.calc(5));
        R = new Bravo();
        System.out.println("5! = " + R.calc(5));
    }
}
