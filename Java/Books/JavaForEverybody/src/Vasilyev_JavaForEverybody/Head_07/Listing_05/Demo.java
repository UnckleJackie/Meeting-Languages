package Vasilyev_JavaForEverybody.Head_07.Listing_05;

public class Demo {
    public static void main(String[] args) {
        Alpha A = new Alpha() {
            int number;
            public void set(int n) {
                number = n;
            }
            public int get() {
                return number;
            }
        };
        A.set(123);
        System.out.println("Field: " + A.get());
    }
}
