package Block_01;

public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the loop beginning");
        while (x < 4) {
            System.out.println("Inside the loop");
            System.out.println("Value of x is: " + x);
            x = x + 1;
        }
        System.out.println("After the loop ending");
    }
}
