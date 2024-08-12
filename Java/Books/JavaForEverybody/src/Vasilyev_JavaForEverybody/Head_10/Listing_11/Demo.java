package Vasilyev_JavaForEverybody.Head_10.Listing_11;

public class Demo {
    public static int[] nums = {1, 2, 3};

    public static void main(String[] args) {
        new MyThread("Alpha");
        new MyThread("Bravo");
        new MyThread("Charlie");
    }
}
