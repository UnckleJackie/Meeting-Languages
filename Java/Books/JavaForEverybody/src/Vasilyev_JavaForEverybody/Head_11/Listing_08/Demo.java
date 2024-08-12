package Vasilyev_JavaForEverybody.Head_11.Listing_08;

public class Demo {
    public static void main(String[] args) {
        Alpha<Character, String> A = new Alpha<>();
        A.value = "Alpha";
        A.show('A');
        Bravo B = new Bravo();
        B.show("Bravo");
    }
}
