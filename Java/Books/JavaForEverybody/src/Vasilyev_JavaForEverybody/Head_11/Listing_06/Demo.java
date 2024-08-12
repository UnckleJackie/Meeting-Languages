package Vasilyev_JavaForEverybody.Head_11.Listing_06;

public class Demo {
    public static void main(String[] args) {
        Alpha<Integer> A1 = new Alpha<Integer>(123);
        Alpha<String> A2 = new Alpha<>("Green");
        Bravo<Integer, String> B1;
        B1 = new Bravo<Integer, String>(321, "Blue");
        Bravo<Character, Character> B2 = new Bravo<>('B', 'C');
        A1.show();
        A2.show();
        B1.show();
        B2.show();
    }
}
