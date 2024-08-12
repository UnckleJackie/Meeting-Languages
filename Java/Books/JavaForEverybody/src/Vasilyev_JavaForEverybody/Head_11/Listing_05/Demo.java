package Vasilyev_JavaForEverybody.Head_11.Listing_05;

public class Demo {
    static <T> void show(T t) {
        System.out.println("[1] " + t);
    }

    static void show(String s) {
        System.out.println("[2] Text " + s);
    }

    static <T, U> void show(T t, U u) {
        System.out.println("[3] " + t + " and " + u);
    }

    static <T> void show(T t, int n) {
        System.out.println("[4] " + t + " and number " + n);
    }

    static void show(int n, char s) {
        System.out.println("[5] Number " + n + " and symbol " + s);
    }

    public static void main(String[] args) {
        show(100);
        show('A');
        show("Alpha");
        show("Bravo", "Charlie");
        show('B', 200.0);
        show("Delta", 300);
        show(400, 'C');
        show(new Character('D'), new Integer(500));
        Demo.<Character, Integer>show('D', 500);
        Demo.<Character>show('D', 500);
    }
}
